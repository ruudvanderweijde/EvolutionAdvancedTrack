package android.widget;
public abstract class SimpleCursorTreeAdapter
  extends android.widget.ResourceCursorTreeAdapter
{
public static interface ViewBinder
{
public abstract  boolean setViewValue(android.view.View view, android.database.Cursor cursor, int columnIndex);
}
public  SimpleCursorTreeAdapter(android.content.Context context, android.database.Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, java.lang.String[] groupFrom, int[] groupTo, int childLayout, int lastChildLayout, java.lang.String[] childFrom, int[] childTo) { super((android.content.Context)null,(android.database.Cursor)null,0,0); throw new RuntimeException("Stub!"); }
public  SimpleCursorTreeAdapter(android.content.Context context, android.database.Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, java.lang.String[] groupFrom, int[] groupTo, int childLayout, java.lang.String[] childFrom, int[] childTo) { super((android.content.Context)null,(android.database.Cursor)null,0,0); throw new RuntimeException("Stub!"); }
public  SimpleCursorTreeAdapter(android.content.Context context, android.database.Cursor cursor, int groupLayout, java.lang.String[] groupFrom, int[] groupTo, int childLayout, java.lang.String[] childFrom, int[] childTo) { super((android.content.Context)null,(android.database.Cursor)null,0,0); throw new RuntimeException("Stub!"); }
public  android.widget.SimpleCursorTreeAdapter.ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); }
public  void setViewBinder(android.widget.SimpleCursorTreeAdapter.ViewBinder viewBinder) { throw new RuntimeException("Stub!"); }
protected  void bindChildView(android.view.View view, android.content.Context context, android.database.Cursor cursor, boolean isLastChild) { throw new RuntimeException("Stub!"); }
protected  void bindGroupView(android.view.View view, android.content.Context context, android.database.Cursor cursor, boolean isExpanded) { throw new RuntimeException("Stub!"); }
protected  void setViewImage(android.widget.ImageView v, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setViewText(android.widget.TextView v, java.lang.String text) { throw new RuntimeException("Stub!"); }
}
