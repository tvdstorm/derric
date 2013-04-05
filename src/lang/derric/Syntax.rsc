@license{
   Copyright 2011-2012 Netherlands Forensic Institute and
                       Centrum Wiskunde & Informatica

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
}

module lang::derric::Syntax

start syntax FileFormat 
  = @Foldable format: "format" Id name 
      "extension" Id+ extensions 
      Qualifiers defaults
      Sequence sequence 
      Structures terms;

syntax Symbol 
  = anyOf: "(" Symbol+ ")"
  | seq: "[" Symbol* "]"
  | right not: "!" Symbol
  > iter: Symbol "*"
  | optional: Symbol "?"
  | term: Id
  ;

syntax Qualifier 
  = unit: "unit" Id name
  | sign: "sign" Bool present
  | endian: "endian" Id name
  | strings: "strings" Id type
  | \type: "size" Expression count
  ;

syntax Structure
   = @Foldable term: Id name "{" Field* fields "}"
   | @Foldable term: Id name "=" Id super "{" Field* fields "}"
   ;
   
syntax Field 
  = field: Id name ":" 
        Modifier* modifiers 
        Qualifier* qualifiers 
        {Expression ","}* specifications ";"
  | Id name 
        Modifier* modifiers 
        Qualifier* qualifiers 
        ContentSpecifier specifier ";"
  | Id name ":" "{" Field* fields "}"
  ;

syntax ContentSpecifier 
  = ContentSpecifierId "(" { ContentModifier "," }* ")"
  ;

syntax ContentModifier 
  = Id "=" { Specification "+" }+
  ;

syntax Specification 
  = string: String // normalize to const(int/str)
  | number: Number
  | field: Id name
  | field: Id struct "." Id name;

 
syntax FieldSpecifier = ValueListSpecifier FormatSpecifier*
                      | FormatSpecifier+;

syntax ValueListSpecifier = ValueModifier* { Expression "," }+
                          | ValueModifier* ContentSpecifier;

syntax Modifier 
  = required:  /* required */ 
  | expected: "expected"
  // TODO: normalize to terminator 
  | terminatedBefore: "terminatedBefore" 
  | terminatedBy: "terminatedBy";




syntax Bool
  = "true"
  | "false"
  ;

syntax Qualifiers = @Foldable Qualifier*;
syntax Structures = @Foldable "structures" Structure*;
syntax Sequence = @Foldable "sequence" Symbol*;



lexical ContentSpecifierId = @category="Todo" Id;
lexical ExpressionId = @category="Identifier" Id id;
lexical Number = @category="Constant" hex: [0][xX][a-f A-F 0-9]+ !>> [a-f A-F 0-9]
              |  @category="Constant" bin: [0][bB][0-1]+ !>> [0-1]
              |  @category="Constant" oct: [0][oO][0-7]+ !>> [0-7]
              |  @category="Constant" dec: [0-9]+ !>> [0-9];
lexical String = @category="Constant" "\"" ![\"]*  "\"";
lexical Comment = @category="Comment" "/*" CommentChar* "*/";
lexical CommentChar = ![*] | [*] !>> [/];




syntax Expression = number: Number
                  | string: String
                  | ref: ExpressionId
                  | ExtRef: ExpressionId "." ExpressionId
                  | Bracket: "(" Expression ")"
                  | LocalCall: BuiltIn "(" ExpressionId ")"
                  | GlobalCall: BuiltIn "(" ExpressionId "." ExpressionId ")"
                  | negate: "-" Expression
                  | not: "!" Expression 
                  > left pow: Expression "^" Expression
                  > left ( times: Expression "*" Expression
                         | divide: Expression "/" Expression)
                  > left ( add: Expression "+" Expression
                         | minus: Expression "-" Expression)
                  > non-assoc range: Expression ".." Expression
                  > left or: Expression "|" Expression;

syntax BuiltIn = "lengthOf" | "offset";

layout LAYOUTLIST = LAYOUT* !>> [\t-\n \r \ ];
lexical LAYOUT = whitespace: [\t-\n \r \ ] | Comment;

keyword DerricKeywords =
   "format"
 | "extension"
 | "sequence"
 | "structures"
 | "unit" | "sign" | "endian" | "strings" | "type"
 | "big" | "little" | "true" | "false" | "byte" | "bit" | "ascii" | "utf8" | "integer" | "float" | "string"
 | "size"
 | "expected" | "terminatedBefore" | "terminatedBy"
 | "lengthOf" | "offset";

lexical Id = ([a-z A-Z _] !<< [a-z A-Z _][a-z A-Z 0-9 _]* !>> [a-z A-Z 0-9 _]) \ DerricKeywords;
