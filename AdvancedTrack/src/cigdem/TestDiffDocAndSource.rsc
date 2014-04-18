module cigdem::TestDiffDocAndSource

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

list [loc] docProject = [|project://lvl4-offline-1387025892406|];
	                               
list [loc] srcProject = [|project://lvl4-offline-1387025892406|];

str docDirectory = "android/doc";
str srcDirectory = "android/doc";

private list[M3] getDocM3Models(list[loc] projects, str subdirectory) {
		    return {
		         for (project <- projects) {
			             append(readBinaryValueFile(|project://AdvancedTrack/m3/|+"<subdirectory>/<project.authority>.bin"));
		         }	
	    }
}


public void runDiffDocSrc() {
					    logMessage("Getting m3 models...", 1);
	    list[M3] docModels = getDocM3Models(docProject, docDirectory);
	    list[M3] srcModels = getDocM3Models(srcProject, srcDirectory);
	    list [M3] models = docModels + srcModels;
	    logMessage("Comparing m3 models... ", 1);
	    list[VersionTransition] transitions = compareM3Models(models, ".*");
	    printTransitions(transitions);
}


