module \test::ProjectAST

import IO;
import List;
import Set;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

@doc {
}
public void run() {
	m3Model1 = createM3FromEclipseProject(|project://GuavaRelease01|);
	m3Model2 = createM3FromEclipseProject(|project://GuavaRelease02|);
	m3Model3 = createM3FromEclipseProject(|project://GuavaRelease03|);
	result = compareM3Models([m3Model1, m3Model2, m3Model3]);
	
	for (x <- result) {
		println("-------[ <x> ]-------");
		for (y <- result[x]) {
			iprintln("<y>: <size(result[x][y])>");
		}
	}
}

@doc { This function returns the differences between a list of M3 models }
public map[str, map[str, set[loc]]] compareM3Models(list[M3] models) {
	// precondition
	if (size(models) < 2) { throw "Precondition failed. Need more than 2 models to compare"; }
	
	resultMap = ();
	
	for (int index <- [0..size(models)-1]) {
	
		model1 = models[index];
		model2 = models[index+1];
		
		publicMethods1 = getPublicMethodsForModel(model1);
		publicMethods2 = getPublicMethodsForModel(model2);
		
		publicClasses1 = getPublicClassesForModel(model1);
		publicClasses2 = getPublicClassesForModel(model2);
		
		publicFields1 = getPublicFieldsForModel(model1);
		publicFields2 = getPublicFieldsForModel(model2);
		
		resultMap += ("diff between <model1.id> and <model2.id>": (
			"methods_removed":  publicMethods1 - publicMethods2,
			"methods_added":	publicMethods2 - publicMethods1,
			"classes_removed":  publicClasses1 - publicClasses2,
			"classes_added":	publicClasses2 - publicClasses1,
			"fields_removed":  	publicFields1 - publicFields2,
			"fields_added":		publicFields2 - publicFields1
		));
	}
	return resultMap;
}

public set[loc] getPublicMethodsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isMethod(m.definition)};
}
public set[loc] getPublicClassesForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isClass(m.definition)};
}
public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}