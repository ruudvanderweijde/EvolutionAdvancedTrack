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

import \test::MethodComparison;

import analysis::m3::Core;

import Message;
import Set;
import IO;
import util::FileSystem;
import analysis::graphs::Graph;
extend analysis::m3::TypeSymbol;

data Change = transition(loc old, loc new) | addition(loc new) | deletion(loc old);

data VersionTransition = versionTransition(loc oldVersion,
										   loc newVersion,
										   set[Change] classChanges, 
										   set[MethodChange] methodChanges, 
										   set[Change] fieldChanges);

public list[loc] projects = [
							//|project://GuavaRelease01|,
							//|project://GuavaRelease02|,
							//|project://GuavaRelease03|
							//|project://GuavaRelease05|,
							//|project://GuavaRelease06|,
							//|project://GuavaRelease07|,
							//|project://GuavaRelease08|,
							//|project://GuavaRelease09|,
							//|project://GuavaRelease10.0|,
							//|project://GuavaRelease11.0|,
							//|project://GuavaRelease12.0|,
							//|project://GuavaRelease13.0|,
							|project://GuavaRelease14.0|,
							//|project://GuavaRelease14.0.1|,
							|project://GuavaRelease15.0|
							];
							
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

public void run() {
	list[M3] models = getM3Models(projects);
	list[VersionTransition] transitions = compareM3Models(models);
	
	for (VersionTransition transition <- transitions) {
		println("-------[ Transition from <transition.oldVersion> to <transition.newVersion> ]-------");
		printMethodChangeStatistics(transition.methodChanges);
	}
	
	visualizeTransitions(transitions);
}

private void visualizeTransitions(list[VersionTransition] transitions) {
	
	list[Figure] treemaps = [];
	for (transition <- transitions) {
		logMessage("visit start", 1);
		
		treemaps += treemap([
				box(area(10),fillColor("green")),
	     		box(area(20),fillColor("red")),
	     		box(text("jada"),area(10)),
            	box(vcat([
            		text("nested"),
            		treemap([
            			box(area(5),fillColor("purple")),box(area(10),fillColor("orange"))
            		])
            	],shrink(0.9)),area(30),fillColor("lightblue"))
     ]);
	}
	render(hcat(treemaps, gap(10)));	
}

public Figure versionFigure(VersionTransition transition) {
		
		visit(transition) {
			case addition: println("addition");
			case deletion: println("deletion");
			case transition: println("transition");
		}

}

public FProperty popup(str s) {
	return mouseOver(box(text(s), gap(1), fillColor("Yellow")));
}

public Figure b(str id, str label) {
	return box(text(id), popup(label));
}

public Figure package(str id, str label) {
	return box(text(id), popup(label));
}

public void viz() {
	render(
		hscreen(
			hcat(
				[	
					hcat(
						[
							package("p","Package X"),
							vcat(
								[
									hcat(
										[
											b("c","Class X"),
											vcat(
												[
													b("m", "Method X"), 
													b("m", "Method Y")
												]
											)
										]
									)
									
								]
							)
						],
						project(text("1-2"), "versionLabel")
					),
					hcat(
						[
							b("p","Package X"),
							vcat(
								[
									hcat(
										[
											b("c","Class X"),
											vcat(
												[
													b("m", "Method X"), 
													b("m", "Method Y")
												]
											)
										]
									)
									
								]
							)
						],
						project(text("2-3"), "versionLabel")
					),
					hcat(
						[
							b("p","Package X"),
							vcat(
								[
									hcat(
										[
											b("c","Class X"),
											vcat(
												[
													b("m", "Method X"), 
													b("m", "Method Y")
												]
											)
										]
									)
									
								]
							)
						],
						project(text("3-4"), "versionLabel")
					),
					hcat(
						[
							b("p","Package X"),
							vcat(
								[
									hcat(
										[
											b("c","Class X"),
											vcat(
												[
													b("m", "Method X"), 
													b("m", "Method Y"),
													b("m", "Method Z")
												]
											)
										]
									)
									
								]
							)
						],
						project(text("4-5"), "versionLabel")
					)
				],
				top(),
				gap(10)
			), 
			id("versionLabel")
		)
	);
	return;
}

@doc { get a list of M3 models from file system }
@memo
public list[M3] getM3Models(list[loc] projects) {
	return {
		for (project <- projects) {
			append(readBinaryValueFile(|project://AdvancedTrack/m3/|+"<project.authority>.bin.m3"));
		}	
	}
}

@doc { write m3 models to file system as binary files }
public void writeM3Models(list[loc] projects) {
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
}
@doc { This function returns the differences between a list of M3 models }
public list[VersionTransition] compareM3Models(list[M3] models) {
	// precondition
	if (size(models) < 2) { throw "Precondition failed. Need more than 2 models to compare"; }
	
	list[VersionTransition] changes = [];
	
	for (int index <- [0..size(models)-1]) {
		M3 model1 = models[index];
		M3 model2 = models[index+1];
		changes += getVersionTransition(model1, model2);
	}
	return changes;
}

private VersionTransition getVersionTransition(M3 old, M3 new) {
	//Changed classes can be derived from changed methods and fields.
	set[MethodChange] methodChanges = getMethodChanges(old, new);	
	set[Change] fieldChanges = getFieldChanges(old, new);
	
	//TODO: derive changed classes
	//	set[loc] publicClasses1 = getPublicClassesForModel(old);
	//	set[loc] publicClasses2 = getPublicClassesForModel(new);
	set[Change] classChanges = {};
	
	//TODO: deduce version numbers
	loc oldVersion = old.id;
	loc newVersion = new.id;
	
	return versionTransition(oldVersion, newVersion, classChanges, methodChanges, fieldChanges);
}

private void printMethodChangeStatistics(set[MethodChange] methodChanges) {
	int unchangedMethods = 0, changedMethods = 0, addedMethods = 0, deletedMethods = 0;
	for (MethodChange methodChange <- methodChanges) {
		visit(methodChange) {
			case unchanged(_): unchangedMethods += 1;
			case deprecated(_): changedMethods += 1;
			case added(_): addedMethods += 1;
			case deleted(_): deletedMethods += 1;
		}
	}
	println("In total <unchangedMethods> methods are unchanged, <changedMethods> methods are changed, <addedMethods> methods have been added and <deletedMethods> methods have been deleted.");
}

private set[Change] getFieldChanges(M3 old, M3 new) {
	//TODO: implement
	//set[loc] publicFields1 = getPublicFieldsForModel(old);
	//set[loc] publicFields2 = getPublicFieldsForModel(new);
	return {};
}

public set[loc] getPublicClassesForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isClass(m.definition)};
}
public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}