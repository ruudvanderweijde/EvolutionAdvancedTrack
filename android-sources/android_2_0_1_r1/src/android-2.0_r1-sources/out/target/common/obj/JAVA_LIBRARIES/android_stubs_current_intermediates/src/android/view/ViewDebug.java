package android.view;
public class ViewDebug
{
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.FIELD,java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public static @interface ExportedProperty
{
boolean resolveId() default false;
android.view.ViewDebug.IntToString[] mapping() default {};
android.view.ViewDebug.IntToString[] indexMapping() default {};
android.view.ViewDebug.FlagToString[] flagMapping() default {};
boolean deepExport() default false;
java.lang.String prefix() default "";
}
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public static @interface IntToString
{
int from();
java.lang.String to();
}
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public static @interface FlagToString
{
int mask();
int equals();
java.lang.String name();
boolean outputIf() default true;
}
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.FIELD,java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public static @interface CapturedViewProperty
{
boolean retrieveReturn() default false;
}
public static enum HierarchyTraceType
{
BUILD_CACHE(),
DRAW(),
INVALIDATE(),
INVALIDATE_CHILD(),
INVALIDATE_CHILD_IN_PARENT(),
ON_LAYOUT(),
ON_MEASURE(),
REQUEST_LAYOUT();
}
public static enum RecyclerTraceType
{
BIND_VIEW(),
MOVE_FROM_ACTIVE_TO_SCRAP_HEAP(),
MOVE_TO_ACTIVE_HEAP(),
MOVE_TO_SCRAP_HEAP(),
NEW_VIEW(),
RECYCLE_FROM_ACTIVE_HEAP(),
RECYCLE_FROM_SCRAP_HEAP();
}
public  ViewDebug() { throw new RuntimeException("Stub!"); }
public static  void trace(android.view.View view, android.view.ViewDebug.RecyclerTraceType type, int... parameters) { throw new RuntimeException("Stub!"); }
public static  void startRecyclerTracing(java.lang.String prefix, android.view.View view) { throw new RuntimeException("Stub!"); }
public static  void stopRecyclerTracing() { throw new RuntimeException("Stub!"); }
public static  void trace(android.view.View view, android.view.ViewDebug.HierarchyTraceType type) { throw new RuntimeException("Stub!"); }
public static  void startHierarchyTracing(java.lang.String prefix, android.view.View view) { throw new RuntimeException("Stub!"); }
public static  void stopHierarchyTracing() { throw new RuntimeException("Stub!"); }
public static  void dumpCapturedView(java.lang.String tag, java.lang.Object view) { throw new RuntimeException("Stub!"); }
public static final boolean TRACE_HIERARCHY = false;
public static final boolean TRACE_RECYCLER = false;
}
