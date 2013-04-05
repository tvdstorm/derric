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

module Plugin

import lang::derric::Syntax;
import util::IDE;
import util::Prompt;
import ParseTree;
import Message;
import lang::derric::FileFormat;
import lang::derric::BuildFileFormat;
import lang::derric::DesugarFileFormat;
import lang::derric::CheckFileFormat;
import lang::derric::PropagateDefaultsFileFormat;
import lang::derric::PropagateConstantsFileFormat;
import lang::derric::AnnotateFileFormat;
import lang::derric::GenerateDerric;
import lang::derric::Validator;
import lang::derric::Refactor;
import lang::derric::XRef;
import lang::derric::BuildValidator;
import lang::derric::GenerateJava;
import lang::derric::GenerateFactoryJava;
import lang::derric::OutlineFormat;
import lang::derric::Visualize;
import vis::Render;
import String;
import IO;

private str DERRIC = "Derric";
private str DERRIC_EXT = "derric";

str javaClassSuffix = "Validator";
str javaFileSuffix = ".java";
str javaPackageName = "org.derric_lang.validator.generated";
str javaPathPrefix = "derric/src/" + replaceAll(javaPackageName, ".", "/") + "/";

public set[loc] getDerrics() {
  str prefix = "derric/formats";
  result = {};
  for (path <- listEntries(|project://<prefix>|), endsWith(path, ".derric")) {
     println(path);
     result += {|project://<prefix>/<path>|};
  }
  return result;
}

public void main() {
  registerLanguage(DERRIC, DERRIC_EXT, Tree(str input, loc org) {
	      return parse(#start[FileFormat], input, org);
  });
  
  contribs = {
    builder(set[Message] (Tree pt) {
      ast = build(pt);
      ast = annotate(propagateConstants(desugar(propagateDefaults(ast))));
      Validator validator = build(ast);
      writeFile(|project://<javaPathPrefix><toUpperCase(ast.name)><javaClassSuffix><javaFileSuffix>|, 
             generate(ast.sequence, ast.extensions[0], validator, javaPackageName));
      return {};
    }),
    
    popup(menu("Derric", [
    
    action("Generate Factory", void (Tree tree, loc selection) {
      generated = [ loadProcessed(f) | f <- getDerrics() ];
      rel[str, str] mapping = { <s, toUpperCase(f.name) + javaClassSuffix> | f <- generated, s <- f.extensions };
      println("Generating Factory");
       writeFile(|project://<javaPathPrefix><javaClassSuffix>Factory<javaFileSuffix>|, generate(mapping));
    }),
    
    action("Compile all", void (Tree tree, loc selection) {
      for (f <- getDerrics()) {
        ast = loadProcessed(f);
        Validator validator = build(ast);
        writeFile(|project://<javaPathPrefix><toUpperCase(ast.name)><javaClassSuffix><javaFileSuffix>|, 
             generate(ast.sequence, ast.extensions[0], validator, javaPackageName));
      }
    }),
    
    edit("Rename structure...(not working)", str (start[FileFormat] pt, loc selection) {
       newName = prompt("Enter new name: ");
       return unparse(rename(pt, selection, newName));
    })
    
    ])),
  
  
    annotator(Tree (Tree pt) {
      ast = build(pt);
      msgs = check(ast);
      pt = xrefFormat(pt);
      return pt[@messages=msgs];
    }),
    
    outliner(node (Tree pt) {
      return outline(build(pt));
    })
  };
  
  registerContributions(DERRIC, contribs);	  
}




public lang::derric::FileFormat::FileFormat loadProcessed(loc path) {
    ast = load(path);
    println("Imploded AST:             <ast>");
    ast = propagateDefaults(ast);
    println("Defaults Propagated AST:  <ast>");
    ast = desugar(ast);
    println("Desugared AST:            <ast>");
    ast = propagateConstants(ast);
    println("Constants Propagated AST: <ast>");
    ast = annotate(ast);
    println("Annotated AST:            <ast>");
    return ast;
}