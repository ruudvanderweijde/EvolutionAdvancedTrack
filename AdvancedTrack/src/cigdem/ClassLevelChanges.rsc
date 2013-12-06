module cigdem::ClassLevelChanges

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import ValueIO;
import Map;
import List;
import Set;
import util::Math;
import diff::DataType;
import diff::Utils;
import diff::ProjectAST;

data FieldChange = 	unchangedField(loc locator)	| changedField(loc locator) 
					| addedField(loc locator) 	| deletedField(loc locator);

set [FieldChange] fieldChanges = {};

data ClassChange = unchangedClass(loc locator)	| changedClass(loc locator) 
					| addedClass(loc locator) 	| deletedClass(loc locator);

set [ClassChange] classChanges = {};

public map [loc, str] androidVersionToLevel= (
		|project://platform_development-android-1.6_r1|: "Level 4",
		|project://platform_development-android-1.6_r2|: "Level ?",
		|project://platform_development-android-2.0_r1|: "Level 5",
		|project://platform_development-android-2.1_r1|: "Level 7",
		|project://platform_development-android-2.2_r1|: "Level 8", 
		|project://platform_development-android-2.3_r1|: "Level 9"
		);


public list[loc] androidProjects = [
							//|project://platform_development-android-2.1_r1|
							//,
							|project://platform_development-android-2.2_r1|
							,
							|project://platform_development-android-2.3_r1|
							];




public list [loc] guava2Projects = [ |project://guava//GuavaRelease06|
									,
									|project://guava//GuavaRelease07|];
									
public list [loc] changedProjects = [|project://tmp//ChangedProject01|,
									|project://tmp//ChangedProject02|
									];							
									
public list[M3] cigdemsGetM3Models(list[loc] projects) {
	return {
		for (project <- projects) {
			append(readBinaryValueFile(|project://AdvancedTrack/m3/|+
							"<project.authority><project.path>.bin.m3"));
		}	
	}
}		

// This method takes set of fields as argument and returns a set of fields which are
// defined in public classes or interfaces only
public set [loc] takeFieldsInPublicClasses (M3 model, set[loc] fields) {
	set [loc] publicClasses = getPublicClassesAndInterfaces(model);
	set [loc] takenFields = {};
	for (aField <- fields ) {
		if (getClassOfAField(model, aField) in publicClasses) {
			takenFields += aField;
		}
	}
	return takenFields;
}


public set[loc] getPublicClassesAndInterfaces(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), (isClass(m.definition) || isInterface(m.definition) ) };
}



public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}



public loc getClassOfAField(M3 model, loc field) {
	set [loc] classes = {r.from | tuple [loc from, loc to] r <- model@containment, isField(r.to) && r.to == field };
	if (size(classes) != 1) {
		println("Error in getClassOfAfield()! ");
		throw ("The field should have one parent class.");
	}
	else { return getOneFrom(classes); }
}


public set [Modifier] getModifiersOfField(M3 theModel, loc fieldName) {
	return {model.modifier | model <-theModel@modifiers, model.definition == fieldName};
}



public set [Modifier] getModifiersOfClass(M3 theModel, loc className) {
	return {model.modifier | model <-theModel@modifiers, model.definition == className};
}



public bool isFieldModifierChanged (M3 oldModel, M3 newModel, loc fieldName) {
	return (getModifiersOfField(oldModel, fieldName) != getModifiersOfField(newModel, fieldName)) ;
}


public bool isClassModifierChanged (M3 oldModel, M3 newModel, loc className) {
	return (getModifiersOfClass(oldModel, className) != getModifiersOfClass(newModel, className)) ;
}



public loc getTypeOfField (M3 theModel, loc fieldName) {
	list [loc] typeList = [theType.to | theType <- theModel@typeDependency,  theType.from == fieldName];
	return typeList[0];
}


// <|java+field:///MyHelloWorld/zbb|,|java+primitiveType:///boolean|>
// rel[loc from,loc to]

public bool isFieldTypeChanged (M3 oldModel, M3 newModel, loc fieldName) {
	return (getTypeOfField(oldModel, fieldName) != getTypeOfField(newModel, fieldName)) ;
}


set [loc] getDeprecatedSetForLocation(rel [loc from, loc to] dependencies, loc locName) {
	return {dependency.from | dependency <- dependencies, 
 					dependency.to == |java+interface:///java/lang/Deprecated|,
 					dependency.from == locName};
}



set [loc] getDeprecatedSetForField(rel [loc from, loc to] dependencies, loc fieldName) {
	return getDeprecatedSetForLocation(dependencies, fieldName);
}


set [loc] getDeprecatedSetForClass(rel [loc from, loc to] dependencies, loc className) {
	return getDeprecatedSetForLocation(dependencies, className);
}


public bool isClassDeprecated(M3 oldModel, M3 newModel, loc className) {
 rel[loc from, loc to] newDependencies = newModel@typeDependency;
 rel[loc from, loc to] oldDependencies = oldModel@typeDependency;
 return (! isEmpty( getDeprecatedSetForClass(newDependencies, className)) &&
 		isEmpty( getDeprecatedSetForClass(oldDependencies, className)) 
 		) ;
}



public bool isFieldDeprecated(M3 oldModel, M3 newModel, loc fieldName) {
 rel[loc from, loc to] newDependencies = newModel@typeDependency;
 rel[loc from, loc to] oldDependencies = oldModel@typeDependency;
 return (! isEmpty( getDeprecatedSetForField(newDependencies, fieldName)) &&
 		isEmpty( getDeprecatedSetForField(oldDependencies, fieldName)) 
 		) ;
}


// This method returns the set of FieldChanges form added and removed fields only 
public set [FieldChange]  getAddedAndRemovedFields(M3 oldModel, M3 newModel, set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [FieldChange] addRemFieldsSet = {};
	set [loc] addedFields = takeFieldsInPublicClasses (newModel, (newPublicFields- oldPublicFields));
	set [loc] removedFields = takeFieldsInPublicClasses (oldModel, (oldPublicFields - newPublicFields));
	for ( aField <- addedFields) { 	addRemFieldsSet = addRemFieldsSet + addedField(aField); }
	for ( rField <- removedFields) { 	addRemFieldsSet = addRemFieldsSet + deletedField(rField); }	
	return addRemFieldsSet;
}




// This method returns the set of FieldChanges for fields which are changed 
// (modifier, type or deprecated)
public set [FieldChange]  getAllChangedFields(M3 oldModel, M3 newModel, set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [loc] changedFields = {};
	set [FieldChange] returnSet = {};
	set [loc] commonFields = oldPublicFields & newPublicFields;
	logMessage("Number of common fields: <size(commonFields)>", 2);
	for (loc oneField <- commonFields)  
		{ 	if  (	isFieldModifierChanged(oldModel, newModel, oneField) ||
					isFieldTypeChanged(oldModel, newModel, oneField) 	 ||
					isFieldDeprecated(oldModel, newModel, oneField) ) {
				changedFields += (oneField);	
			}		
		}
	set [loc] fieldsInPublicClasses = takeFieldsInPublicClasses(oldModel, changedFields);
	for ( cField <- fieldsInPublicClasses) { returnSet += changedField(cField); }	
	return returnSet ;
}




// Return the set of ClassChanges for added and removed classes, and also 
// for the classes for which modifiers have changed or are deprecated
public set [ClassChange] getChangedAddedRemovedClasses(M3 oldModel, M3 newModel) {
	set [ClassChange] changedClassesSet = {};
	set [loc] oldClasses = getPublicClassesAndInterfaces(oldModel);
	set [loc] newClasses = getPublicClassesAndInterfaces(newModel);
	set [loc] addedClasses = newClasses - oldClasses;
	set [loc] removedClasses = oldClasses  - newClasses;
	set [loc] commonClasses = oldClasses & newClasses;
	for ( aClass <- addedClasses) { classChanges = classChanges + addedClass(aClass); }
	for ( rClass <- removedClasses) { classChanges = classChanges + deletedClass(rClass); }
	//logMessage("The number of added classes : <size(addedClasses)>", 2); 
	//logMessage("The number of removed classes : <size(removedClasses)>", 2); 	
	for (loc oneClass <- commonClasses)  
		{ 	if  (	isClassModifierChanged(oldModel, newModel, oneClass) ||
					isClassDeprecated(oldModel, newModel, oneClass) ) {
				changedClassesSet = changedClassesSet + changedClass(oneClass);	
			}		
		}
	return changedClassesSet;
}

// Get the classes which will be marked as changed because they contain
// a changed, deleted or removed field.
public set [ClassChange] getClassesWithFieldChanges(M3 oldModel, M3 newModel,
													set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [ClassChange] changedClassesSet = {};
	set [loc] addedFields = newPublicFields - oldPublicFields;
	set [loc] removedFields = oldPublicFields - newPublicFields;
	set [loc] changedNewClasses = {getClassOfAField(newModel, field) | field <- addedFields};
	set [loc] changedOldClasses = {getClassOfAField(oldModel, field) | field <- removedFields};
	//logMessage("The number of changed classes because of an added field: <size(changedNewClasses)>", 2);
	//logMessage("The number of changed classes because of a removed field: <size(changedOldClasses)>", 2);	
	for (loc oneClass <- changedNewClasses)  { 	changedClassesSet = changedClassesSet + changedClass(oneClass); }		
	for (loc oneClass <- changedOldClasses)  { 	changedClassesSet = changedClassesSet + changedClass(oneClass); }			
	return changedClassesSet;
}


public void findAllFieldAndClassChanges(list [loc] projectList) {
	list [M3] models = cigdemsGetM3Models(projectList);
	M3 oldModel = models[0];
	M3 newModel = models[1];
	set [loc] oldFields = getPublicFieldsForModel(oldModel);
	set [loc] newFields = getPublicFieldsForModel(newModel);	
	set [ClassChange] tempClasses = getChangedAddedRemovedClasses(oldModel, newModel);
	for (aClass <- tempClasses ) { classChanges += aClass; }
	tempClasses = getClassesWithFieldChanges(oldModel, newModel, oldFields, newFields);
	for (aClass <- tempClasses ) { classChanges += aClass; }
	set [FieldChange] tempFields = getAddedAndRemovedFields(oldModel, newModel, oldFields, newFields);
	for (aField <- tempFields) {fieldChanges += aField; }
	tempFields = getAllChangedFields(oldModel, newModel, oldFields, newFields);
	for (aField <- tempFields) {fieldChanges += aField; }
}


public void testChangedProjects() {
	findAllFieldAndClassChanges(changedProjects);
	iprintln(sort(classChanges)); println();
	iprintln(sort(fieldChanges));
}

public void testGuavaProjects() {
	findAllFieldAndClassChanges(guava2Projects);
	iprintln(sort(classChanges)); println();
	iprintln(sort(fieldChanges));
}


