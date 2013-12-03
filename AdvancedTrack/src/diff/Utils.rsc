module diff::Utils

import IO;
import List;
import ValueIO;

import diff::DataType;
import diff::ProjectAST;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

@doc { write m3 models to file system as binary files }
public void writeM3Models(list[loc] projects) {
	for (project <- projects) {
		writeBinaryValueFile(|project://AdvancedTrack/m3/|+"<project.authority>.bin.m3", createM3FromEclipseProject(project));
	}
}

@doc { get a list of M3 models from file system }
public list[M3] getM3Models(list[loc] projects) {
	return {
		for (project <- projects) {
			append(readBinaryValueFile(|project://AdvancedTrack/m3/|+"<project.authority>.bin.m3"));
		}	
	}
}

public M3 getM3ModelByName(str name) {
	return readBinaryValueFile(#M3, |project://AdvancedTrack/m3/|+"<name>.bin.m3");
}
public void binToValue(str name) {
	M3 model = readBinaryValueFile(#M3, |project://AdvancedTrack/m3/|+"<name>.bin.m3");
	writeTextValueFile(|project://AdvancedTrack/m3/|+"<name>.m3", model);
}

@doc { Write transition model to filesystem }
public void writeTransitionsToCache(list[VersionTransition] transitions) {
	writeBinaryValueFile(cacheDir+"Transitions.bin.trans", transitions);
}

@doc { Read transition model from filesystem }
public list[VersionTransition] readTransitionsFromCache() {
	return readBinaryValueFile(#list[VersionTransition], cacheDir+"Transitions.bin.trans");
}
