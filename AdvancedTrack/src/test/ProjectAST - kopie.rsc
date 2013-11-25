module \test::ProjectAST

import IO;
import List;
import Set;
import String;
import DateTime;

import ValueIO;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

@logLevel {
	Log level 0 => no logging;
	Log level 1 => main logging;
	Log level 2 => debug logging;
}
private int logLevel = 1;

@doc { }
public void logMessage(str message, int level) {
	if (level <= logLevel) {
		str date = printDate(now(), "Y-MM-dd HH:mm:ss");
		println("<date> :: <message>");
	}
}

public list[loc] projects = [
							//|project://GuavaRelease01|,
							|project://GuavaRelease02|,
							|project://GuavaRelease03|,
							|project://GuavaRelease05|,
							|project://GuavaRelease06|,
							|project://GuavaRelease07|,
							|project://GuavaRelease08|,
							|project://GuavaRelease09|,
							|project://GuavaRelease10.0|,
							|project://GuavaRelease11.0|,
							|project://GuavaRelease12.0|,
							|project://GuavaRelease13.0|,
							|project://GuavaRelease14.0|,
							|project://GuavaRelease14.0.1|
							//|project://GuavaRelease15.0|
							];
							
@doc {
}
public void run() {
	logMessage("Retrieving M3 models...", 1);
	list[M3] models = getM3Models(projects);

	logMessage("Comparing models...", 1);
	result = compareM3Models(models);
	
	logMessage("Printing table.", 1);
	readablePrint(result);
	printImage(result);
	
	//logMessage("Done.", 1);
	//writeTextValueFile(|project://AdvancedTrack/data/test.txt|, io);
}

public list[M3] getM3Models(list[loc] projects) {
	return {
		for (project <- projects) {
			append(readTextValueFile(|project://AdvancedTrack/m3/<project>|));
		}	
	}
}

public void writeM3Models(list[loc] projects) {
	for (project <- projects) {
		writeTextValueFile(|project://AdvancedTrack/m3/|+"<project.authority>.m3", createM3FromEclipseProject(project));
		writeBinaryValueFile(|project://AdvancedTrack/m3/|+"<project.authority>.bin.m3", createM3FromEclipseProject(project));
	}
}

public void writeM3ModelsBinary(list[loc] projects) {
	for (project <- projects) {
		writeBinaryValueFile(|project://AdvancedTrack/m3/|+"<project.authority>.bin.m3", createM3FromEclipseProject(project));
	}
}
public void printImage(lrel[loc from, loc to, set[loc] ca, set[loc] cr, set[loc] ma, set[loc] mr, set[loc] fa, set[loc] fr] diff) {
	map[str, num] total = ("ca":0,"cr":0,"ma":0,"mr":0,"fa":0,"fr":0);
	for (x <- diff) {
		total["ca"] += size(x.ca);
		total["cr"] += size(x.cr);
		total["ma"] += size(x.ma);
		total["mr"] += size(x.mr);
		total["fa"] += size(x.fa);
		total["fr"] += size(x.fr);
	}
	//Figure point(num x, num y, str color){ return ellipse(shrink(0.05),fillColor(color),align(x,y));}
	Figure point(num x, num y, str color, str txt){ 
		//return ellipse(shrink(0.05),fillColor(color),align(x,y));
		return box(fillColor(color),project(text(txt),"hscreen"), bottom());
	}
	
	list[Figure] coords = [];
	num step = 0;
	num stepPos = 0;
	for (x <- diff) {
		stepPos = step/(size(diff)-1); 
		step+=1;
		//println("pos: <step>,<stepPos> || size: <size(x.ca)> || total: <total["ca"]> || res: <size(x.ca)/total["ca"]>");
		coords += point(stepPos, total["ca"] == 0 ? 0 : 1-(size(x.ca)/total["ca"]), "red", "ca");
		coords += point(stepPos, total["cr"] == 0 ? 0 : 1-(size(x.cr)/total["cr"]), "blue", "cr");
		coords += point(stepPos, total["ma"] == 0 ? 0 : 1-(size(x.ma)/total["ma"]), "green", "ma");
		coords += point(stepPos, total["mr"] == 0 ? 0 : 1-(size(x.mr)/total["mr"]), "pink", "mr");
		coords += point(stepPos, total["fa"] == 0 ? 0 : 1-(size(x.fa)/total["fa"]), "yellow", "fa");
		coords += point(stepPos, total["fr"] == 0 ? 0 : 1-(size(x.fr)/total["fr"]), "orange", "fr");
	}
	
	//ovl = overlay(coords, shapeConnected(false));
	//legend = hcat([box(text("<i>"), size(50,20), fillColor(color("black", 0.9))) | i <- total]);
 	render(hscreen(
 			hcat([coords]),
 			id("hscreen")));
	//render(ovl);
}

public void tst() {	
	result = compareM3Models([	createM3FromEclipseProject(|project://UnitTest1|),
								createM3FromEclipseProject(|project://UnitTest5|)]);
	iprintln(result);
	readablePrint(result);
}

public void readablePrint(lrel[loc from, loc to, set[loc] ca, set[loc] cr, set[loc] ma, set[loc] mr, set[loc] fa, set[loc] fr] diff) {
	// print header
	println("<tabs(8,0)>classes<tabs(2,7)>methods<tabs(2,7)>fields");
	println("from<tabs(4,4)>to<tabs(4,2)>+\t-\t+\t-\t+\t-\t");
	str io = "";
	for (x <- diff) {
		io += "<x.from>"		+ tabs(4, size("<x.from>"));
		io += "<x.to>"			+ tabs(4, size("<x.to>"));
		io += "<size(x.ca)>" 	+ "\t";
		io += "<size(x.cr)>" 	+ "\t";
		io += "<size(x.ma)>" 	+ "\t";
		io += "<size(x.mr)>" 	+ "\t";
		io += "<size(x.fa)>" 	+ "\t";
		io += "<size(x.fr)>" 	+ "\t";
		io += "\n";
	}
	println(io);
}

@doc { used in print function to see how many tabs are needed }
private str tabs(int tabs, int size) {
	str string = "";
	int n = (8*tabs)-size;
	do { 
		string += "\t"; 
		n -= 8; 
	} while (n > 0);
	return string;
}
		
@doc { This function returns the differences between a list of M3 models }
public lrel[loc, loc, set[loc], set[loc], set[loc], set[loc], set[loc], set[loc]] compareM3Models(list[M3] models) {
	// precondition
	if (size(models) < 2) { throw "Precondition failed. Need more than 2 models to compare"; }
	
	return {	
		for (int index <- [0..size(models)-1]) {
		
			M3 model1 = models[index];
			M3 model2 = models[index+1];
			
			set[loc] publicMethods1 = getPublicMethodsForModel(model1);
			set[loc] publicMethods2 = getPublicMethodsForModel(model2);
			
			set[loc] publicClasses1 = getPublicClassesForModel(model1);
			set[loc] publicClasses2 = getPublicClassesForModel(model2);
			
			set[loc] publicFields1 = getPublicFieldsForModel(model1);
			set[loc] publicFields2 = getPublicFieldsForModel(model2);
		
			append(<model1.id,							// loc from
					model2.id,							// loc to
					publicClasses2 - publicClasses1,	// set[loc] ca - classes added
					publicClasses1 - publicClasses2,	// set[loc] cr - classes removed
					publicMethods2 - publicMethods1,	// set[loc] ma - methods added
					publicMethods1 - publicMethods2,	// set[loc] mr - methods removed
					publicFields2 - publicFields1,		// set[loc] fa - fields added
					publicFields1 - publicFields2>);	// set[loc] fr - fields removed
		}
	}
}

public set[loc] getPublicMethodsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isMethod(m.definition)};
}
public set[loc] getPublicClassesForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isClass(m.definition)};
}
public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}