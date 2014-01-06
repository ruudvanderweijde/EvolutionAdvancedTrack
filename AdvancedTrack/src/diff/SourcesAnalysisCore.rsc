module diff::SourcesAnalysisCore

import IO;
import List;
import Set;
import String;
import DateTime;
import Relation;

import ValueIO;
import Message;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import diff::DataType;
import diff::Utils;

//WARNING: EXPERIMENTAL AND NOT WELL-TESTED ATM
public void compareSources(lrel[str, str] sources) {
	for (tuple[str firstSourceName, str secondSourceName] source <- sources) {
		println("Comparing <source.firstSourceName> to <source.secondSourceName>");
		
		println("SOURCE 1: Retrieving version transition for <source.firstSourceName> from cache.");
		VersionTransition firstVersionTransition = readTransitionFromCache(source.firstSourceName);
		
		println("SOURCE 2: Retrieving version transition for <source.secondSourceName> from cache.");
		VersionTransition secondVersionTransition = readTransitionFromCache(source.secondSourceName);
		
		println("\n\n--------------------------------------------------------------------------------");
		println("Changes present in <source.firstSourceName> but not in <source.secondSourceName>");
		showDifferences(firstVersionTransition, secondVersionTransition);
		
		println("\n\n--------------------------------------------------------------------------------");
		println("Changes present in <source.secondSourceName> but not in <source.firstSourceName>");
		showDifferences(secondVersionTransition, firstVersionTransition);
	}
}

private void showDifferences(VersionTransition a, VersionTransition b) {
	set[ClassChange] classesNotInB = a.classChanges - b.classChanges;
	println("---- CLASSES TOTAL: <size(classesNotInB)> ----");
	printAllChanges(classesNotInB);

	set[MethodChange] methodsNotInB = filterUnchanged(a.methodChanges - b.methodChanges);	
	println("---- METHODS TOTAL: <size(methodsNotInB)> ----");
	printAllChanges(methodsNotInB);

	set[FieldChange] fieldsNotInB = a.fieldChanges - b.fieldChanges;	
	println("---- FIELDS TOTAL: <size(fieldsNotInB)> ----");
	printAllChanges(fieldsNotInB);
}

private set[MethodChange] filterUnchanged(set[MethodChange] changes) {
	return {x | MethodChange x <- changes, !(unchanged(_) := x)};
}

private void printAllChanges(changes) {
	for (change <- changes) {
		println(change);
	}
}