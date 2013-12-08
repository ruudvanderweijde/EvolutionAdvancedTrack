module diff::DeprecateCheck

import IO;

import diff::Utils;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;


@doc { result:

2013-12-07 14:30:45 :: Deprecation found in typeDependency:
{
  <|java+method:///nl/uva/se/Deprecate/annotationDeprecation()|,|java+interface:///java/lang/Deprecated|>,
  <|java+method:///nl/uva/se/Deprecate/bothDeprecation()|,|java+interface:///java/lang/Deprecated|>
}2013-12-07 14:30:45 :: Deprecation found in uses:
{
  <|project://Deprecate/src/nl/uva/se/Deprecate.java|(105,10,<10,2>,<10,12>),|java+interface:///java/lang/Deprecated|>,
  <|project://Deprecate/src/nl/uva/se/Deprecate.java|(338,10,<27,2>,<27,12>),|java+interface:///java/lang/Deprecated|>
}2013-12-07 14:30:45 :: Deprecation found in annotations:
{
  <|java+method:///nl/uva/se/Deprecate/annotationDeprecation()|,|java+interface:///java/lang/Deprecated|>,
  <|java+method:///nl/uva/se/Deprecate/bothDeprecation()|,|java+interface:///java/lang/Deprecated|>
}ok

}
public void main() {
	logMessage("Creating m3 model", 1);
	M3 model = createM3FromEclipseProject(|project://Deprecate|);

	logMessage("Deprecation found in typeDependency:", 1);
	iprint({ <l,t> | <l,t> <- model@typeDependency, t == |java+interface:///java/lang/Deprecated|});
	logMessage("Deprecation found in uses:", 1);
	iprint({ <l,t> | <l,t> <- model@uses, t == |java+interface:///java/lang/Deprecated|});
	logMessage("Deprecation found in annotations:", 1);
	iprint({ <l,t> | <l,t> <- model@annotations, t == |java+interface:///java/lang/Deprecated|});
}
