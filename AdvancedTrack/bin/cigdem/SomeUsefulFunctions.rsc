module cigdem::SomeUsefulFunctions
import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import Map;
import List;
import Set;
import util::Math;
import \test::ProjectAST;

public list[loc] myTestProjects = [
							|project://GuavaRelease01|
							 ,
							//|project://GuavaRelease02|
							//,
							//|project://GuavaRelease03|
							//,
							//|project://GuavaRelease05|
							//,
							//|project://GuavaRelease06|
							//,
							//|project://GuavaRelease07|
							//,
							//|project://GuavaRelease08|
							//,
							//|project://GuavaRelease09|
							//,
							//|project://GuavaRelease10.0|
							//,
							//|project://GuavaRelease11.0|
							//,
							//|project://GuavaRelease12.0|
							//,
							//|project://GuavaRelease13.0|
							//,
							//|project://GuavaRelease14.0|
							//,
							//|project://GuavaRelease14.0.1|
							//,
							|project://GuavaRelease15.0|
							];


public set [Modifier] getSetOfModifiersPerClass(M3 theModel, loc className) {
	// theModel@modifiers returns a set of relations : rel [loc definition, Modifier modifier]
	// example: {<|java+class:///MyHelloWorld|, public()>}
	// map [loc, Modifier] 
	set [Modifier] modifiers = {m.modifier | m <-theModel@modifiers, m.definition == className};
 	return modifiers;
}

public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}

public void findChangedModifiers(M3 oldModel, M3 newModel, loc className) {
	set [Modifier] oldModifiers = getSetOfModifiersPerClass(oldModel, className) ;
	set [Modifier] newModifiers = getSetOfModifiersPerClass(newModel, className) ;
	set [Modifier] addedModifiers = newModifiers - oldModifiers;
	set [Modifier] removedModifiers = oldModifiers - newModifiers;		
	if (! isEmpty(addedModifiers)) { println("Added modifiers for class <className>: <addedModifiers>"); };
	if (! isEmpty(removedModifiers)) { println("Removed modifiers for class <className>: <removedModifiers>"); 	};
}

public void listAllFieldsOfAClass(M3 newModel, loc c) {
	// get only the fields which are public
	set [loc] allPublicFields = fields(newModel, c) & getPublicFieldsForModel(newModel) ;
	println(allPublicFields);
} 



public void findClassLevelChanges(loc oldProject, loc newProject) {
	oldModel = createM3FromEclipseProject(oldProject);
	newModel = createM3FromEclipseProject(newProject);
	set [loc] allClassesForOldProject = classes(oldModel);
	set [loc] allClassesForNewProject = classes(newModel);
	set [loc] allCommonClasses = allClassesForNewProject & allClassesForNewProject;
	set [loc] addedClasses = allClassesForNewProject - allClassesForOldProject;
	if (isEmpty(addedClasses)) {
		println("No new classes are added."); 
	}
	else { 
		println("Added classes: <addedClasses>"); 
		for (loc c <- addedClasses) {
			listAllFieldsOfAClass(newModel, c); 
	};
		
	}; 
	if (isEmpty(allClassesForOldProject - allClassesForNewProject)) {	
		println("No classes are removed.");
	}
	else {
		println("Removed classes: <allClassesForOldProject - allClassesForNewProject>");	
	}	
	println("--------------------------------------");
	for (loc l <- allCommonClasses) {
		findChangedModifiers(oldModel, newModel, l);
	};
}

public set [loc] getAddedPublicFields(M3 oldModel, M3 newModel) {
	return (getPublicFieldsForModel(newModel) - getPublicFieldsForModel(oldModel));
}

public set [loc] getRemovedPublicFields(M3 oldModel, M3 newModel) {
	return (getPublicFieldsForModel(oldModel) - getPublicFieldsForModel(newModel));
}

public loc getClassOfAField(M3 model, loc field) {
	set [loc] classes =  {c | <c,field> <- model@containment };
	if (size(classes) != 1) {throw ("The field should have one parent class.");}
	else { return getOneFrom(classes); }
}

public void test1(){
	findClassLevelChanges(|project://CodeAnalysisExamples|, |project://CodeAnalysisExamplesNew|);
}

public void test2(){
	findClassLevelChanges(|project://Guava/versions/01|, |project://Guava/versions/02|);
}

public void test3(){
	M3 myModel = createM3FromEclipseProject(|project://CodeAnalysisExamplesNew|);
	loc myClass = |java+class:///MyHelloWorld|;
	listAllFieldsOfAClass(myModel, myClass);
}

public void test4() {
	M3 oldModel = createM3FromEclipseProject(|project://CodeAnalysisExamples|);
	M3 newModel = createM3FromEclipseProject(|project://CodeAnalysisExamplesNew|);
	set [loc] oldPublicFields = getPublicFieldsForModel(oldModel);
	set [loc] newPublicFields = getPublicFieldsForModel(newModel);
	set [loc] addedFields = newPublicFields - oldPublicFields;
	set [loc] removedFields = oldPublicFields - newPublicFields;
	if ( isEmpty(addedFields) ) { println ("No new fields are added."); }
	else {println ("Added fields: <addedFields>");}
	if ( isEmpty(removedFields) ) { println ("No fields are removed."); }
	else {println ("Removed fields: <removedFields>");}	
}

public void test5() {
	list [M3] models = getM3Models(myTestProjects);
	M3 oldModel = models[0];
	M3 newModel = models[1];
	set [loc] addedFields = getAddedPublicFields(oldModel, newModel);
	set [loc] removedFields = getRemovedPublicFields(oldModel, newModel);
	println("Changes between two projects: <myTestProjects[0]> and <myTestProjects[1]>");
	println("Number of added fields: <size(addedFields)>");
	println("Number of removed fields: <size(removedFields)>");	
	set [loc] changedNewClasses = {getClassOfAField(newModel, field) | field <- addedFields};
	set [loc] changedOldClasses = {getClassOfAField(oldModel, field) | field <- removedFields};
	println("The number of changed classes because of an added field: <size(changedNewClasses)>");
	println("The number of changed classes because of a removed field: <size(changedOldClasses)>");	
}


