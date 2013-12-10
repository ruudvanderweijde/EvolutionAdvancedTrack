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
import DateTime;

data FieldChange = 	  changedField(loc locator) 
					| addedField(loc locator) 	| deletedField(loc locator);

set [FieldChange] fieldChanges = {};

data ClassChange =    changedClass(loc locator) 
					| addedClass(loc locator) 	| deletedClass(loc locator);

set [ClassChange] classChanges = {};


public list[loc] androidProjects = [
							//|project://platform_development-android-2.1_r1|
							//,
							|project://android//jar//android-2-android|
							,
							|project://android//jar//android-3-android|
							];




public list [loc] guava2Projects = [ |project://guava//GuavaRelease09|
									,
									|project://guava//GuavaRelease10.0|];
									
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



// Don't forget, the Enums should be added. They ar ein M3 in M3@extends annotation
// | enum name - java.lang.Enum"
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
	for ( aClass <- addedClasses) { changedClassesSet += addedClass(aClass); }
	for ( rClass <- removedClasses) { changedClassesSet +=  deletedClass(rClass); }
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


public set [ClassChange] sanitizeClassChanges(set [ClassChange] inputSet) {
	set [loc] addedClasses = {};
	set [loc] deletedClasses = {};
	set [loc] changedClasses = {};
	set [ClassChange] returnSet = {};
	visit (inputSet) {
		case addedClass(c) : addedClasses += c;
		case deletedClass(c): deletedClasses += c;	    	 
		case changedClass (c): changedClasses += c;
	}
	logMessage("Added classes: <sort(addedClasses)>", 2);
	logMessage("Number of added classes: <size(addedClasses)>", 2);	
	logMessage("Deleted classes: <sort(deletedClasses)>", 2);
	logMessage("Number of deleted classes: <size(deletedClasses)>", 2);		
	logMessage("Changed classes: <sort(changedClasses)>", 2);	
	logMessage("Number of changed classes ??? - first sanitize: <size(changedClasses)>", 2);		
	visit (inputSet) {
		case cAdded:addedClass(_) : returnSet += cAdded;
		case cDeleted:deletedClass(_): returnSet += cDeleted;	    	 
		case cChanged:changedClass (c): {
			if ((c notin addedClasses) && (c notin deletedClasses) ) { returnSet += cChanged;};	
		}
	}
	return returnSet;
}


public void findAllFieldAndClassChanges(list [loc] projectList) {
	list [M3] models = cigdemsGetM3Models(projectList);
	M3 oldModel = models[0];
	M3 newModel = models[1];
	set [loc] oldFields = getPublicFieldsForModel(oldModel);
	set [loc] newFields = getPublicFieldsForModel(newModel);	
	set [ClassChange] tempClasses = getChangedAddedRemovedClasses(oldModel, newModel) 
									+ getClassesWithFieldChanges(oldModel, newModel, oldFields, newFields);
	for (aClass <- sanitizeClassChanges(tempClasses) ) { classChanges += aClass; }
	
	//set [FieldChange] tempFields = getAddedAndRemovedFields(oldModel, newModel, oldFields, newFields);
	//for (aField <- tempFields) {fieldChanges += aField; }
	//tempFields = getAllChangedFields(oldModel, newModel, oldFields, newFields);
	//for (aField <- tempFields) {fieldChanges += aField; }
}


public void printAllResults() {
	int numOfAddedClasses = 0; int numOfChangedClasses = 0; int numOfDeletedClasses = 0;
	visit (classChanges) {
		case addedClass(_) : numOfAddedClasses += 1;
		case deletedClass(_): numOfDeletedClasses += 1;	    	 
		case changedClass (_): numOfChangedClasses += 1;
	}
	println("Number of added classes <numOfAddedClasses>");
	println("Number of deleted classes <numOfDeletedClasses>");
	println("Number of changed classes <numOfChangedClasses>");
	int numOfAddedFields = 0; int numOfChangedFields = 0; int numOfDeletedFields = 0;	
	visit (fieldChanges) {
		case addedField(_) : numOfAddedFields += 1;
		case deletedField(_): numOfDeletedFields += 1;	    	 
		case changedField (_): numOfChangedFields += 1;
	}
	println("Number of added fields <numOfAddedFields>");
	println("Number of deleted fields <numOfDeletedFields>");
	println("Number of changed fields <numOfChangedFields>");	 
}


public void testAndroidProjects() {
	println("Starting....<now()>"); 
	findAllFieldAndClassChanges(androidProjects);
	printAllResults();
	//iprintln(sort(classChanges)); println();
	//iprintln(sort(fieldChanges));
}


public void testChangedProjects() {
	println("Starting....<now()>"); 
	findAllFieldAndClassChanges(changedProjects);
	printAllResults();
	//iprintln(sort(classChanges)); println();
	//iprintln(sort(fieldChanges));
}

public void testGuavaProjects() {
	findAllFieldAndClassChanges(guava2Projects);
	iprintln(sort(classChanges)); println();
	iprintln(sort(fieldChanges));
}


