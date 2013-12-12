module cigdem::ClassLevelChanges


import IO;
import ValueIO;
import Map;
import List;
import Set;
import util::Math;
import DateTime;

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;

import diff::DataType;
import diff::Utils;
import diff::ProjectAST;

public set[ClassChange] getClassChanges(M3 oldModel, M3 newModel) {
	set [loc] oldFields = getPublicFieldsForModel(oldModel);
	set [loc] newFields = getPublicFieldsForModel(newModel);
	
	set [ClassChange] classChanges = {};
	set [ClassChange] tempClasses = getChangedAddedRemovedClasses(oldModel, newModel) 
									+ getClassesWithFieldChanges(oldModel, newModel, oldFields, newFields);
	for (aClass <- sanitizeClassChanges(tempClasses) ) { classChanges += aClass; }
	return classChanges;
}

private set [Modifier] getModifiersOfClass(M3 theModel, loc className) {
	return {model.modifier | model <-theModel@modifiers, model.definition == className};
}

private bool isClassModifierChanged (M3 oldModel, M3 newModel, loc className) {
	return (getModifiersOfClass(oldModel, className) != getModifiersOfClass(newModel, className)) ;
}

// Return the set of ClassChanges for added and removed classes, and also 
// for the classes for which modifiers have changed or are deprecated
private set [ClassChange] getChangedAddedRemovedClasses(M3 oldModel, M3 newModel) {
	set [ClassChange] changedClassesSet = {};
	set [loc] oldClasses = getPublicClassesAndInterfaces(oldModel);
	set [loc] newClasses = getPublicClassesAndInterfaces(newModel);
	set [loc] addedClasses = newClasses - oldClasses;
	set [loc] removedClasses = oldClasses  - newClasses;
	set [loc] commonClasses = oldClasses & newClasses;
	
	set[loc] oldDeprecations = findDeprecations(oldModel);
	set[loc] newDeprecations = findDeprecations(newModel);
	
	for ( aClass <- addedClasses) { changedClassesSet += addedClass(aClass); }
	for ( rClass <- removedClasses) { changedClassesSet +=  deletedClass(rClass); }
	//logMessage("The number of added classes : <size(addedClasses)>", 2); 
	//logMessage("The number of removed classes : <size(removedClasses)>", 2); 	
	for (loc oneClass <- commonClasses)  
		{ 	if  (	isClassModifierChanged(oldModel, newModel, oneClass) ) { 
				changedClassesSet += classModifierChanged(oneClass, getModifiersOfClass(oldModel, oneClass),
																	getModifiersOfClass(newModel, oneClass)
														 );
				} 
			else {
					if ( isDeprecated(oneClass, oldDeprecations, newDeprecations))  {
						changedClassesSet += classDeprecated(oneClass);
					}
					else 
						if ( isUndeprecated(oneClass, oldDeprecations, newDeprecations)) {
						changedClassesSet += classUndeprecated(oneClass);					
					}
			}
		}
	return changedClassesSet;
}

// Get the classes which will be marked as changed because they contain
// a changed, deleted or removed field.
private set [ClassChange] getClassesWithFieldChanges(M3 oldModel, M3 newModel,
													set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [ClassChange] changedClassesSet = {};
	set [loc] addedFields = newPublicFields - oldPublicFields;
	set [loc] removedFields = oldPublicFields - newPublicFields;
	for (loc oneField <- addedFields) {
		changedClassesSet += classFieldChanged(getClassOfAField(newModel, oneField), oneField);
	}
	for (loc oneField <- removedFields) {
		changedClassesSet += classFieldChanged(getClassOfAField(oldModel, oneField), oneField);
	}
	return changedClassesSet;
}


private bool isNotInAddedOrDeleted(loc c, set [loc] addedClasses, set [loc] deletedClasses) {
	return (c notin addedClasses) && (c notin deletedClasses) ;
}

private set [ClassChange] sanitizeClassChanges(set [ClassChange] inputSet) {
	set [loc] addedClasses = {};
	set [loc] deletedClasses = {};
	set [loc] changedClasses = {};
	set [ClassChange] returnSet = {};
	visit (inputSet) {
		case addedClass(c) : addedClasses += c;
		case deletedClass(c): deletedClasses += c;	    	 
		case classFieldChanged (c, _) : changedClasses += c;
		case classModifierChanged (c, _, _) : changedClasses += c;
		case classDeprecated(c): changedClasses += c;
		case classUndeprecated(c): changedClasses += c;		
	}	
	visit (inputSet) {
		case cAdded:addedClass(_) : returnSet += cAdded;
		case cDeleted:deletedClass(_): returnSet += cDeleted;	    	 
		case cChanged:classFieldChanged (c, _): { 
			if (isNotInAddedOrDeleted (c, addedClasses, deletedClasses) ) { returnSet += cChanged;};			
		}
		case cChanged:classModifierChanged (c, _, _) : {
			 returnSet += cChanged;
		}
		case cChanged:classDeprecated (c): { 
			 returnSet += cChanged;			
		}
		case cChanged:classUndeprecated (c): { 
			 returnSet += cChanged;			
		}
	}
	return returnSet;
}

//public void printAllResults() {
//	int numOfAddedClasses = 0; int numOfChangedClasses = 0; int numOfDeletedClasses = 0;
//	visit (classChanges) {
//		case addedClass(_) : numOfAddedClasses += 1;
//		case deletedClass(_): numOfDeletedClasses += 1;	    	 
//		case changedClass (_): numOfChangedClasses += 1;
//	}
//	println("Number of added classes <numOfAddedClasses>");
//	println("Number of deleted classes <numOfDeletedClasses>");
//	println("Number of changed classes <numOfChangedClasses>");
//	int numOfAddedFields = 0; int numOfChangedFields = 0; int numOfDeletedFields = 0;	
//	visit (fieldChanges) {
//		case addedField(_) : numOfAddedFields += 1;
//		case deletedField(_): numOfDeletedFields += 1;	    	 
//		case changedField (_): numOfChangedFields += 1;
//	}
//	println("Number of added fields <numOfAddedFields>");
//	println("Number of deleted fields <numOfDeletedFields>");
//	println("Number of changed fields <numOfChangedFields>");	 
//}