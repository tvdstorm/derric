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

module lang::derric::testparse

import ParseTree;
import IO;
import String;
import List;

import lang::derric::Syntax;
import lang::derric::FileFormat;
import lang::derric::BuildFileFormat;
import lang::derric::DesugarFileFormat;
import lang::derric::CheckFileFormat;
import lang::derric::PropagateDefaultsFileFormat;
import lang::derric::PropagateConstantsFileFormat;
import lang::derric::AnnotateFileFormat;
import lang::derric::GenerateDerric;
import lang::derric::Validator;
import lang::derric::BuildValidator;
import lang::derric::GenerateJava;
import lang::derric::GenerateFactoryJava;

str javaPackageName = "org.derric_lang.validator.generated";
str javaPathPrefix = "derric/src/" + replaceAll(javaPackageName, ".", "/") + "/";
str javaClassSuffix = "Validator";
str javaFileSuffix = ".java";

str derricPathPrefix = "derric/formats/out/";
str derricFileSuffix = ".derric";

list[str] formats = ["gif", "jpeg", "png"];
str formatPathPrefix = "derric/formats/";

public void generateAll() {
	generated = for (f <- formats) {
		FileFormat format = load(|project://<formatPathPrefix><f>.derric|);
		writeOutput(format);
		append format;
	}
	rel[str, str] mapping = { };
	for (f <- generated) {
		for (s <- f.extensions) {
			mapping += <s, toUpperCase(f.name) + javaClassSuffix>;
		}
	}
	println("Generating Factory");
	writeFile(|project://<javaPathPrefix><javaClassSuffix>Factory<javaFileSuffix>|, generate(mapping));
}

public void generate(loc path) {
	FileFormat format = load(path);
	writeOutput(format);
}

public FileFormat load(loc path) {
	FileFormat format = build(parse(#start[Format], path).top);
	println("Imploded AST:             <format>");
	list[CheckResult] checkResults = check(format);
	if (!isEmpty(checkResults)) {
		for (error(str message) <- checkResults) {
			println("ERROR: " + message);
		}
		return;
	}
	format = propagateDefaults(format);
	println("Defaults Propagated AST:  <format>");
	format = desugar(format);
	println("Desugared AST:            <format>");
	format = propagateConstants(format);
	println("Constants Propagated AST: <format>");
	format = annotate(format);
	println("Annotated AST:            <format>");
    return format;
}

private void writeOutput(FileFormat format) {
	writeFile(|project://<derricPathPrefix><format.name><derricFileSuffix>|, lang::derric::GenerateDerric::generate(format));
	Validator validator = build(format);
	println("Validator:                <validator>");
	writeFile(|project://<javaPathPrefix><toUpperCase(format.name)><javaClassSuffix><javaFileSuffix>|, lang::derric::GenerateJava::generate(format.sequence, format.extensions[0], validator, javaPackageName));
}