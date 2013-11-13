module lang::derric::NameRel

import lang::derric::FileFormat;
import String;

alias ID = set[loc];

alias Edge = tuple[ID use, ID def];
alias Edges = map[ID use, ID def];
alias NameGraph = tuple[set[ID] V, Edges E, map[ID v, str name] N];

ID getID(str x) = originsOnly(x);

NameGraph resolveNames(FileFormat frm) {
  structs = collectStructs(frm);
  inh = inheritance(frm, structs);
  structs = enrichByInheritance(structs, inh);
  e = resolveInheritance(frm, structs)
    + resolveSequence(frm, structs)
    + resolveFields(frm, structs);
  v = e.use + e.def;
  n = getAllNames(frm);
  return <v, e, n>;
}

map[ID, str] getAllNames(FileFormat frm) {
  m = ();
  visit (frm) {
    case term(x, _): m[getID(x)] = x;
    case term(x, sup, _): { m[getID(x)] = x; m[getID(sup)] = sup; }
    case Field f: m[getID(f.name)] = f.name;
    case ref(str x): m[getID(x)] = x; 
    case ref(str q, str x): { m[getID(q)] = q; m[getID(x)] = x; } 
    case field(str x): m[getID(x)] = x; 
    case field(str q, str x): { m[getID(q)] = q; m[getID(x)] = x; } 
  }
  return m;
}



rel[str, ID, str, ID] collectStructs(FileFormat frm)
  = { <t.name, getID(t.name), f.name, getID(f.name)> | 
       /Term t := frm, /Field f := t };

rel[str, ID, str, ID] enrichByInheritance(rel[str, ID, str, ID] structs, rel[ID,ID] inh) {
  // a struct x that inherits from struct y
  added = { <x, xId, f, fId> | <x, xId, _, _> <- structs, super <- (inh+)[xId],
            <_, super, f, fId> <- structs };
  return structs + added;
}

rel[ID, ID] inheritance(FileFormat f, rel[str, ID, str, ID] structs)
  = { <sub, sup> | /term(x, y, _) := f,
       <x, sub, _, _> <- structs, <y, sup, _, _> <- structs };
       


Edges resolveInheritance(FileFormat f, rel[str, ID, str, ID] structs) 
  = ( getID(super): decl | /term(x, super, _) := f,
       <super, ID decl, _, _> <- structs );

Edges resolveSequence(FileFormat f, rel[str, ID, str, ID] structs)
  = ( getID(x): decl | /term(x) := f.sequence,
         <x, ID decl, _, _> <- structs  );
  
  
Edges resolveFields(FileFormat frm, rel[str, ID, str, ID] structs) {
   Edges resolveField(str struct, Field f) 
     = ( getID(x): decl | /field(str x) := f, 
            <struct, _, x, ID decl> <- structs )
     + ( getID(x): decl | /field(str qualified, str x) := f, 
            <qualified, _, x, ID decl> <- structs )
     + ( getID(qualified): decl | /field(str qualified, str x) := f, 
            <qualified, ID decl, _, _> <- structs )
            
     // unfortunate duplication...
     + ( getID(x): decl | /ref(str x) := f, 
            <struct, _, x, ID decl> <- structs )
     + ( getID(x): decl | /ref(str qualified, str x) := f, 
            <qualified, _, x, ID decl> <- structs )
     + ( getID(qualified): decl | /ref(str qualified, str x) := f, 
            <qualified, ID decl, _, _> <- structs );

   return ( () | it + resolveField(t.name, f) | Term t <- frm.terms, Field f <- t.fields);
} 
  