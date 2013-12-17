module cigdem::TestChangedProjects

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import IO;
import ValueIO;
import Map;
import String;
import List;
import Set;
import diff::DataType;
import diff::Utils;
import diff::Core;

list [loc] changedProjectList = [|project://ChangedProject01|,
							|project://ChangedProject02|];

str changedDirectory = "tmp";


public void runChangedProjects() {
	testChangedProjects(changedProjectList, changedDirectory);
}

public void testChangedProjects(list [loc] projectList, str dir) {
	logMessage("Getting m3 models...", 1);
	list[M3] models = getM3Models(projectList, dir);
	logMessage("Comparing m3 models... ", 1);
	list[VersionTransition] transitions = compareM3Models(models);
	printTransitions(transitions);
}


