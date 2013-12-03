module diff::Visualization

import diff::DataType;
import diff::Utils;
import diff::ProjectAST;


public void visualizeTransitions(list[VersionTransition] transitions) {
	list[Figure] versions = [];
	logMessage("visualization get dataset...", 2);
	for (transition <- transitions) {
		versions += versionFigure(transition);		
	}
	logMessage("rendering image...", 2);
	//iprintln(versions);
	render(
		hscreen(
			hcat(versions, top(), gap(10)), 
			id("versionLabel")
		)
	);
}

public Figure versionFigure(VersionTransition transition) {
	logMessage("versionFigure: <transition.oldVersion> - <transition.newVersion>", 2);
	list[Figure] version = [];
	//for (change <- transition.classChanges) {
	//	iprintln(change);
	//}
	rel[loc package, loc class, Figure method] pcm = {};  
	for (change <- transition.methodChanges) {
		visit(change) {
			//case change:\unchanged(location)	: pcm += <change@package, change@class, addMethod(location)>;
			case change:\signatureChanged(location, newLocation)	: pcm += <change@package, change@class, addMethod(location, "yellow")>;
			case change:\deprecated(location)	: pcm += <change@package, change@class, addMethod(location, "orange")>;
			case change:\added(location)		: pcm += <change@package, change@class, addMethod(location, "green")>;
			case change:\deleted(location)		: pcm += <change@package, change@class, addMethod(location, "red")>;
		}
	}

	list[Figure] packageFigures = [], classFigures = [], methodFigures = [];	
	logMessage("create map for version: <transition.oldVersion> - <transition.newVersion>", 2);
	set[loc] packages = pcm.package;
	rel[value package, loc class, Figure method] classesFilter = {};
	for (package <- packages) {
		classesFilter = domainR(pcm, {package});
		classFigures = [];
		for (class <- classesFilter.class) {
			methodFigures = [];
			for(method <- { m | <p,c,m> <- pcm, c == class, p == package } ) {
				methodFigures += method;
			}
			classFigures += addClass("<class>", methodFigures);
		}
		packageFigures += addPackage("<package>", classFigures);
	}
	
	str versionLabel = "";
	versionLabel += (/<x:[0-9\._]+>/ := transition.oldVersion.authority) ? (x) : transition.oldVersion.authority;
	versionLabel += " to ";
	versionLabel += (/<x:[0-9\._]+>/ := transition.newVersion.authority) ? (x) : transition.newVersion.authority;
	return addVersion(versionLabel, packageFigures);
}

public FProperty popup(str s) {
	return mouseOver(box(text(s), gap(1), fillColor("Yellow")));
}

public Figure b(str id, str label, str color="white") {
	return box(text(id), popup(label), fillColor(color));
}

public Figure package(str id, str label) {
	return box(text(id), popup(label));
}

public FProperty popup(str s) {
	return mouseOver(box(text(s), gap(1), fillColor("Yellow")));
}

public Figure b(str id, str label) {
	return box(popup(label));
}
//public Figure b(str id, str label) {
//	return box(text(id), popup(label));
//}

public Figure package(str id, str label) {
	return box(text(id), popup(label));
}

public Figure addVersion(str label, list[Figure] packages) {
	return vcat(packages, project(text(label), "versionLabel"));
}
//public Figure addVersion(str label, list[Figure] packages) {
//	return vcat(packages, project(text(label), "versionLabel"));
//}

public Figure addPackage(str label, list[Figure] classes) {
	return vcat([b("p",label), treemap(classes)]);
}

public Figure addClass(str label, list[Figure] methods) {
	return vcat([b("c", label),	treemap(methods)]);
}

public Figure addedMethod(str label) {
	return b("m", label);
}
public Figure deprecatedMethod(str label) {
	return b("m", label, color="red");
}
public Figure addMethod(loc location) {
	return box("m", "<location>");
	return b("m", "<location>");
}
public Figure addMethod(str label) {
	return b("m", label);
}
public Figure addMethod(loc location, str color) {
	str label = last(split("/", "<location>"));
	return b(label, color=color);
}
