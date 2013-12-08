module diff::Utils

import IO;
import List;
import ValueIO;
import DateTime;
import ListRelation;
import String;

import diff::DataType;
import diff::ProjectAST;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

import lang::csv::IO;

							
@logLevel {
	Log level 0 => no logging;
	Log level 1 => main logging;
	Log level 2 => debug logging;
}
private int logLevel = 2;

@doc { }
public void logMessage(str message, int level) {
	if (level <= logLevel) {
		str date = printDate(now(), "Y-MM-dd HH:mm:ss");
		println("<date> :: <message>");
	}
}

@doc { write m3 models to file system as binary files }
public void writeM3Models(list[loc] projects, str subdirectory) {
	for (project <- projects) {
		writeBinaryValueFile(|project://AdvancedTrack/m3/|+"<subdirectory>/<project.authority>.bin.m3", createM3FromEclipseProject(project));
	}
}



@doc { get a list of M3 models from file system }
public list[M3] getM3Models(list[loc] projects, str subdirectory) {
	return {
		for (project <- projects) {
			append(readBinaryValueFile(|project://AdvancedTrack/m3/|+"<subdirectory>/<project.authority>.bin.m3"));
		}	
	}
}

public M3 getM3ModelByName(str name, str subdirectory) {
	return readBinaryValueFile(#M3, |project://AdvancedTrack/m3/|+"<subdirectory>/<name>.bin.m3");
}
public void binToValue(str name, str subdirectory) {
	M3 model = readBinaryValueFile(#M3, |project://AdvancedTrack/m3/|+"<subdirectory>/<name>.bin.m3");
	writeTextValueFile(|project://AdvancedTrack/m3/|+"<subdirectory>/<name>.m3", model);
}

@doc { Write transition model to filesystem }
public void writeTransitionsToCache(list[VersionTransition] transitions) {
	writeBinaryValueFile(cacheDir+"Transitions.bin.trans", transitions);
}

@doc { Read transition model from filesystem }
public list[VersionTransition] readTransitionsFromCache() {
	return readBinaryValueFile(#list[VersionTransition], cacheDir+"Transitions.bin.trans");
}

@doc { get Android information from csv }
public lrel[int APILevel, str Version, datetime ReleaseDate] getAndroidVersions() {
        return readCSV(#lrel[int APILevel, str Version, datetime ReleaseDate], |project://AdvancedTrack/csv/Versions.csv|);
}

@doc { get locations of src m3s }
public lrel[int APILevel, loc LocationM3] getM3LocationsDOC(set[int] APILevels) {
    return domainR(getM3Locations("DOC"), APILevels);
}
@doc { get locations of src m3s }
public lrel[int APILevel, loc LocationM3] getM3LocationsJAR(set[int] APILevels) {
    return domainR(getM3Locations("JAR"), APILevels);
}
@doc { get locations of src m3s }
public lrel[int APILevel, loc LocationM3] getM3LocationsSRC(set[int] APILevels) {
    return domainR(getM3Locations("SRC"), APILevels);
}
@doc { convert lrel[int, str] to lrel[int, loc] }
private lrel[int APILevel, loc LocationM3] getM3Locations(str source) {
    lrel[int APILevel, str LocationM3] res = readCSV(#lrel[int APILevel, str LocationM3], |project://AdvancedTrack/csv/| + "M3Locations<source>.csv");
    // convert string to loc, readCSV is not able to read locs
    return [<a,toLocation(b)> | <a,b> <- res, isFile(toLocation(b))];
}