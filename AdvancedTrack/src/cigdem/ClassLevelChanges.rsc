module cigdem::ClassLevelChanges

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



public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
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


