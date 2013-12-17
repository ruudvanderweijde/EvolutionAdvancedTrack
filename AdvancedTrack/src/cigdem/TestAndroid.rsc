module cigdem::TestAndroid


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

list [loc] androidProjectList = [|project://android-6-android|,
							|project://android-7-android|];

str androidDirectory = "android/jar";


public void runAndroid() {
	testAndroid(androidProjectList, androidDirectory);
}

public void testAndroid(list [loc] projectList, str dir) {
	logMessage("Getting m3 models...", 1);
	list[M3] models = getM3Models(projectList, dir);
	logMessage("Comparing m3 models... ", 1);
	list[VersionTransition] transitions = compareM3Models(models);
	printTransitions(transitions);
}


