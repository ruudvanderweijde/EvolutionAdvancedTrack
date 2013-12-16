module cigdem::TestClassLevelChanges

import diff::ClassLevelChanges;
import diff::Utils;
import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import ValueIO;
import Map;
import List;
import Set;
import diff::DataType;

public list[loc] androidProjects = [
							//|project://platform_development-android-2.1_r1|
							//,
							|project://android//jar//android-2-android|
							,
							|project://android//jar//android-3-android|
							];




public list [loc] guava2Projects = [ |project://GuavaRelease14.0|
									,
									|project://GuavaRelease15.0|];
									
public list [loc] changedProjects = [|project://tmp//ChangedProject01|,
									|project://tmp//ChangedProject02|
									];					

public void testAndroidProjects() {
	println("Starting....<now()>"); 
	list[M3] m3Models = getM3Models(androidProjects, "android");
	findAllFieldAndClassChanges(m3Models[0], m3Models[1]);
	printAllResults();
	//iprintln(sort(classChanges)); println();
	//iprintln(sort(fieldChanges));
}


public void testChangedProjects() {
	println("Starting....<now()>"); 
	list[M3] m3Models = getM3Models(changedProjects, "tmp");
	findAllFieldAndClassChanges(m3Models[0], m3Models[1]);
	printAllResults();
	//iprintln(sort(classChanges)); println();
	//iprintln(sort(fieldChanges));
}

public void testGuavaProjects() {
	list[M3] m3Models = getM3Models(guava2Projects, "guava");
	findAllFieldAndClassChanges(m3Models[0], m3Models[1]);
	iprintln(sort(classChanges)); println();
	iprintln(sort(fieldChanges));
	printAllResults();
}