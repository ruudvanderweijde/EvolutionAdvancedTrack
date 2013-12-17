module diff::FieldComparison

import IO;
import List;
import Set;
import Type;
import String;
import Relation;

import diff::Utils;
import diff::DataType;

import util::ValueUI;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;

public set[FieldChange] getFieldChanges(M3 oldModel, M3 newModel) {
	
	logMessage("Start getFieldChanges() ",2);
	
	set [FieldChange] fieldChanges = {};
	set [FieldChange] tempFields = getAddedAndRemovedFields(oldModel, newModel);

	logMessage("getAddedAndRemovedFields is finished",2);
	
	for (aField <- tempFields) {fieldChanges += aField; }
	tempFields = getAllChangedFields(oldModel, newModel);
	for (aField <- tempFields) {fieldChanges += aField; }
	
	return fieldChanges;
}

// This method returns the set of FieldChanges form added and removed fields only 
private set [FieldChange]  getAddedAndRemovedFields(M3 oldModel, M3 newModel) {
	logMessage("Step 1: Start: getAddedAndRemovedFields",2);
	oldPublicFields = getPublicFieldsForModel(oldModel);
	newPublicFields = getPublicFieldsForModel(newModel);
	logMessage("Step 2: getAddedAndRemovedFields",2);
	set [FieldChange] addRemFieldsSet = {};
	set [loc] addedFields = newPublicFields- oldPublicFields;
	logMessage("Step 3: getAddedAndRemovedFields",2);
	set [loc] removedFields = oldPublicFields - newPublicFields;
	logMessage("Step 4: getAddedAndRemovedFields",2);
	for ( aField <- addedFields) { 	addRemFieldsSet = addRemFieldsSet + addedField(aField); }
	for ( rField <- removedFields) { 	addRemFieldsSet = addRemFieldsSet + deletedField(rField); }	
	logMessage("Step 5: Finished getAddedAndRemovedFields",2);
	return addRemFieldsSet;
}

// This method returns the set of FieldChanges for fields which are changed 
// (modifier, type or deprecated)
private set [FieldChange]  getAllChangedFields(M3 oldModel, M3 newModel) {
	logMessage("Step 1: Start: getAllChangedFields",2);

	set [loc] oldPublicFields = getPublicFieldsForModel(oldModel);
	set [loc] newPublicFields = getPublicFieldsForModel(newModel);
	set [FieldChange] returnSet = {};
	set [loc] commonFields = oldPublicFields & newPublicFields;
	
	set[loc] oldDeprecations = findDeprecations(oldModel);
	set[loc] newDeprecations = findDeprecations(newModel);
	
	map[loc name, set[TypeSymbol] typ] oldTypes = index(oldModel@types);
	map[loc name, set[TypeSymbol] typ] newTypes = index(newModel@types);
	
	map[loc definition, set[Modifier] modifier] oldModifiers = index(oldModel@modifiers);
	map[loc definition, set[Modifier] modifier] newModifiers = index(newModel@modifiers);
	

	//logMessage("Number of common fields: <size(commonFields)>", 2);
	for (loc oneField <- commonFields) {
		set[Modifier] oldFieldModifiers = oneField in oldModifiers ? oldModifiers[oneField] : {};
	    set[Modifier] newFieldModifiers = oneField in newModifiers ? newModifiers[oneField] : {};
				
		TypeSymbol oldFieldType = getOneFrom(oldTypes[oneField]);
		TypeSymbol newFieldType = getOneFrom(newTypes[oneField]);
		
		if  (oldFieldModifiers != newFieldModifiers) {
			returnSet += fieldModifierChanged(oneField, oldFieldModifiers, newFieldModifiers);
		} 
		else {
			if (oldFieldType != newFieldType) {
				returnSet += fieldTypeChanged(oneField, oldFieldType, newFieldType); 
			}	
			else { 
				if (isDeprecated(oneField, oldDeprecations, newDeprecations)) {
					returnSet += fieldDeprecated(oneField);
				}
				else {
					if (isUndeprecated(oneField, oldDeprecations, newDeprecations, newPublicFields)) {
						returnSet += fieldUndeprecated(oneField);
					}
				}
			}
		} 
	}
	return returnSet ;
}

private map[loc to, loc from] makeFieldTypeMap(M3 model) {
	return (typeDep.to : typeDep.from[0] | typeDep <- model@typeDependency);
}

// This method takes set of fields as argument and returns a set of fields which are
// defined in public classes or interfaces only
//private set [loc] takeFieldsInPublicClasses (M3 model, set[loc] fields) {
//	set [loc] publicClasses = getPublicClassesAndInterfaces(model);
//	set [loc] takenFields = {};
//	for (aField <- fields ) {
//		if (getClassOfAField(model, aField) in publicClasses) {
//			takenFields += aField;
//		}
//	}
//	return takenFields;
//}