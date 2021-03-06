module diff::Utils

import IO;
import List;
import Set;
import ValueIO;
import DateTime;
import ListRelation;
import String;
import Exception;

import diff::DataType;
import diff::Core;
import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

import lang::csv::IO;

public loc cacheDir = |project://AdvancedTrack/cache|;

							
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

public void writeM3ModelsFromDirectories(list[loc] directories, str name, str subdirectory) {
	for (directory <- directories) {
		logMessage("Now writing file <name>...", 1);
		writeBinaryValueFile(|project://AdvancedTrack/m3/|+"<subdirectory>/<name>.bin.m3", createM3FromDirectory(directory));
		logMessage("Done.", 1);
	}
}

@doc { write m3 models to file system as binary files }
public void writeM3ModelsFromProjects(list[loc] projects, str subdirectory) {
	for (project <- projects) {
		logMessage("Now writing file <project.authority>...", 1);
		writeBinaryValueFile(|project://AdvancedTrack/m3/|+"<subdirectory>/<project.authority>.bin.m3", createM3FromEclipseProject(project));
		logMessage("Done.", 1);
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

public M3 getM3ModelByLocation(loc location) {
	return readBinaryValueFile(#M3, location);
}
public void binToValue(str name, str subdirectory) {
	M3 model = readBinaryValueFile(#M3, |project://AdvancedTrack/m3/|+"<subdirectory>/<name>.bin.m3");
	writeTextValueFile(|project://AdvancedTrack/m3/|+"<subdirectory>/<name>.m3", model);
}

@doc { Write transition model to filesystem }
public void writeTransitionsToCache(list[VersionTransition] transitions) {
	writeBinaryValueFile(cacheDir+"Transitions.bin.trans", transitions);
}

@doc { Write transition model to filesystem }
public void writeTransitionToCache(VersionTransition transition, str name) {
	writeBinaryValueFile(cacheDir+name, transition);
}

@doc { Read transition model from filesystem }
public list[VersionTransition] readTransitionsFromCache() {
	return readBinaryValueFile(#list[VersionTransition], cacheDir+"Transitions.bin.trans");
}

public VersionTransition readTransitionFromCache(str name) {
	loc location = cacheDir + (name + ".trans.bin");
	return readBinaryValueFile(#VersionTransition, location);
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
public lrel[int APILevel, loc LocationM3] getM3Locations(str source) {
    lrel[int APILevel, str LocationM3] res = readCSV(#lrel[int APILevel, str LocationM3], |project://AdvancedTrack/csv/| + "M3Locations<source>.csv");
    // convert string to loc, readCSV is not able to read locs
    for (item <- res) {
    	if (!isFile(toLocation(item.LocationM3))) {
    		logMessage("Warning: skipping file  (unable to read): <item.LocationM3>", 2);
    	}
    }
    return [<a,toLocation(b)> | <a,b> <- res, isFile(toLocation(b))];
}

public set[loc] findDeprecations(M3 model) {
	try {
  	rel[loc declaration, loc annotation] annotationRel = model@annotations;
	return {annotationTuple.declaration | annotationTuple <- annotationRel, annotationTuple.annotation == |java+interface:///java/lang/Deprecated|};
	} 
	catch NoSuchAnnotation(e) :
		println("Warning: annotation tag is missing in the M3 model"); 
		return {};
}

public bool isDeprecated(loc entity, set[loc] oldDeprecated, set[loc] newDeprecated) {
	return entity notin oldDeprecated && entity in newDeprecated;
}

public bool isUndeprecated(loc entity, set[loc] oldDeprecated, set[loc] newDeprecated, set[loc] newEntities) {
	return entity in newEntities && entity in oldDeprecated && entity notin newDeprecated;
}

// Don't forget, the Enums should be added. They ar ein M3 in M3@extends annotation
// | enum name - java.lang.Enum"
public set[loc] getPublicClassesAndInterfaces(M3 model, str whiteListRegex) {
	return {m.definition | m <- model@modifiers, 
		m.modifier == \public(),
		rexpMatch(m.definition.uri, whiteListRegex),
	    (isClass(m.definition) || isInterface(m.definition) || m.definition.scheme == "java+enum" ) };
}

public map[loc enclosed, loc enclosing] getEnclosings(rel[loc from, loc to] containment) {
	map[loc enclosed, loc enclosing] enclosings = ();
	for (tuple[loc from, loc to] r <- containment) {
		enclosings += (r.to : r.from);
	}
	return enclosings;
}

public set[loc] getPublicFieldsForModel(M3 model, str whiteListRegex) {
	set [loc] allPublicFields = {m.definition | m <- model@modifiers, 
		m.modifier == \public(), 
		rexpMatch(m.definition.uri, whiteListRegex),
		isField(m.definition)};
	set [loc] allPublicClasses = getPublicClassesAndInterfaces(model, whiteListRegex);
	
	return publicFieldsInPublicClasses = {r.to | tuple [loc from, loc to] r <- model@containment, (isField(r.to) && r.to in allPublicFields), (r.from in allPublicClasses) };
}

public map[loc classLoc, set[loc] contentLocs] addContentChangeToMap(map[loc classLoc, set[loc] contentLocs] oldMap, loc classLocator, loc contentChange) {
	if (classLocator in oldMap) {
		set[loc] contentChanges = oldMap[classLocator];
		contentChanges += contentChange;
		oldMap[classLocator] = contentChanges;
	} else {
		oldMap += (classLocator: {contentChange} );
	}
	return oldMap;
}

public void printTableHeader() {
	println("<tabs(8,0)>classes<tabs(3,7)>methods<tabs(3,7)>fields");
	println("from<tabs(4,4)>to<tabs(4,2)>^\t+\t-\t^\t+\t-\t^\t+\t-\t");
}

@doc { used in print function to see how many tabs are needed }
public str tabs(int tabs, int size) {
        str string = "";
        int n = (8*tabs)-size;
        do { 
                string += "\t"; 
                n -= 8; 
        } while (n > 0);
        return string;
}
