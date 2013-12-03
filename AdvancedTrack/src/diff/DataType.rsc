module diff::DataType

import IO;
import List;
import Set;
import String;
import DateTime;
import Relation;

import ValueIO;
import Message;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import diff::DataType;
import diff::Utils;
import diff::MethodComparison;
import cigdem::ClassLevelChanges;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;
import analysis::m3::Core;
import util::FileSystem;
import analysis::graphs::Graph;
extend analysis::m3::TypeSymbol;

data Change = transition(loc old, loc new) | addition(loc new) | deletion(loc old);

data VersionTransition = versionTransition(loc oldVersion,
										   loc newVersion,
										   set[Change] classChanges, 
										   set[MethodChange] methodChanges, 
										   set[FieldChange] fieldChanges);

// represents a method signature
data MethodSignature = nil() 
					   | methodSignature(str name, list[Modifier] modifiers, Type returnType, loc location, list[Declaration] params, list[Expression] exceptions)
					   | constructorSignature(str name, list[Modifier] modifiers, loc location, list[Declaration] params, list[Expression] exceptions);

// represents a parameter without considering its name
data NamelessParameter = vararg(Type \type) | namelessParameter(Type \type, int extraDimensions);

data MethodChange = unchanged(loc locator) | signatureChanged(loc old, loc new) | deprecated(loc locator) | added(loc locator) | deleted(loc locator);

anno loc MethodChange @ class;
anno loc MethodChange @ package;
