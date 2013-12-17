module cigdem::TestAndroidFromSource

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

list [loc] androidProjectList = [|project://android-1.6_r1.1|,
							|project://android-2.0_r1|];

str androidDirectory = "android/src";


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


