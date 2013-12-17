module cigdem::TestClassLevelChanges


import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import ValueIO;
import Map;
import String;
import List;
import Set;
import diff::DataType;
import diff::Utils;
import diff::Core;

public list[loc] androidProjects = [
							//|project://platform_development-android-2.1_r1|
							//,
							|project://android//jar//android-2-android|
							,
							|project://android//jar//android-3-android|
							];




public list [loc] guavaProjects = [|project://GuavaRelease14.0|,
					|project://GuavaRelease15.0|];
									
public list [loc] myChangedProjects = [|project://ChangedProject01|,
									|project://ChangedProject02|
									];					


set [str] websiteList = {
"AbstractExecutionThreadService",
"AbstractIdleService",
"AbstractListeningExecutorService",
"AbstractScheduledService",
"AbstractService",
"ArrayTable",
"BaseEncoding",
"BloomFilter",
"ByteSink",
"ByteSource",
"ByteStreams",
"CharSink",
"CharSource",
"CharStreams",
"ConcurrentHashMultiset",
"Constraint",
"Constraints",
"ContiguousSet",
"DiscreteDomain",
"DoubleMath",
"FileBackedOutputStream",
"Files",
"FluentIterable",
"ForwardingService",
"ForwardingSortedMap",
"Funnels",
"Futures",
"GenericMapMaker",
"HashCode",
"HashCodes",
"Hasher",
"HashFunction",
"Hashing",
"HttpHeaders",
"ImmutableCollection",
"ImmutableList",
"ImmutableList.Builder",
"ImmutableMultimap",
"ImmutableRangeMap",
"ImmutableSet.Builder",
"ImmutableTable",
"InternetDomainName",
"Joiner",
"Joiner.MapJoiner",
"LinkedListMultimap",
"ListeningScheduledExecutorService",
"MapMaker",
"Maps",
"MediaType",
"Monitor.Guard",
"Multimaps",
"MutableTypeToInstanceMap",
"PrimitiveSink",
"Queues",
"Service",
"Service.Listener",
"Service.State",
"ServiceManager",
"ServiceManager.Listener",
"Sets",
"Splitter",
"Stopwatch",
"TreeBasedTable",
"TypeToken",
"UnsignedInteger",
"UnsignedLong"};

private str getClassNameStr(str className) {
	list [str] strList = split("/", className);
	return last(strList);
}


private set [str] getModelClassStrings (set [loc] classSet) {
	set [str] returnSet = {};
	for (loc aClass <- classSet) {
		returnSet += getClassNameStr(aClass.path);
	}
	return returnSet;
}


private void printDifferences(set [loc] myClassChanges, set [str] classNameList) {
	modelClassStrSet = getModelClassStrings(myClassChanges);
	println("The classes which we found but not in Jdiff:");
	iprintln(modelClassStrSet - classNameList);
	println("The classes which we do not find but which are in Jdiff are:");
	iprintln(classNameList - modelClassStrSet);	 
}



private set [loc] getClassChangesOnly (set[ClassChange] classChanges) {
	set [loc] changedClassesSet = {};
	for (ClassChange classChange <- sort(classChanges)) {
		visit (classChange) {
			case classContentChanged(changedClass, _): {
				changedClassesSet += changedClass;
			}
			case classModifierChanged(changedClass, _, _) : {
				changedClassesSet += changedClass;
			}
			case classDeprected(changedClass)   : {
				changedClassesSet += changedClass;
			}			
			case classUndeprected(changedClass) : {
				changedClassesSet += changedClass;
			}
		}
	}
	return changedClassesSet;
}


public void testChangedProjects() {
	logMessage("Getting m3 models...", 1);
	list[M3] m3Models = getM3Models(myChangedProjects, "tmp");
	logMessage("Comparing m3 models... ", 1);
	list[VersionTransition] transitions = compareM3Models(m3Models);
	for (VersionTransition transition <- transitions ) {
		set [loc] myClassChanges = getClassChangesOnly(transition.classChanges);
		printDifferences(myClassChanges, websiteList);
	}
}


public void testGuavaProjects() {
	logMessage("Getting m3 models...", 1);
	list[M3] m3Models = getM3Models(guavaProjects, "guava");
	logMessage("Comparing m3 models... ", 1);
	list[VersionTransition] transitions = compareM3Models(m3Models);
	for (VersionTransition transition <- transitions ) {
		set [loc] myClassChanges = getClassChangesOnly(transition.classChanges);
		printDifferences(myClassChanges, websiteList);
	}
}