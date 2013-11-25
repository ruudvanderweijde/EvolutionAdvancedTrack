module cigdem::ClassLevelChanges

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import Map;
import List;
import Set;
import util::Math;


public set [Modifier] getSetOfModifiersPerClass(M3 theModel, loc className) {
	// theModel@modifiers returns a set of relations : rel [loc definition, Modifier modifier]
	// example: {<|java+class:///MyHelloWorld|, public()>}
	// map [loc, Modifier] 
	set [Modifier] modifiers = {m.modifier | m <-theModel@modifiers, m.definition == className};
 	println("All modifiers for class <className>: <modifiers>");
 	return modifiers;
}


public void findClassLevelChanges(loc oldProject, loc newProject) {
	oldModel = createM3FromEclipseProject(oldProject);
	newModel = createM3FromEclipseProject(newProject);
	loc exampleClass = |java+class:///MyHelloWorld|;
	set [Modifier] oldModifiers = getSetOfModifiersPerClass(oldModel, exampleClass) ;
	set [Modifier] newModifiers = getSetOfModifiersPerClass(newModel, exampleClass) ;
	
}


public void test1(){
	findClassLevelChanges(|project://CodeAnalysisExamples|, |project://CodeAnalysisExamplesNew|);
}

