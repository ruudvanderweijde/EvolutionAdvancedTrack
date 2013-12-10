package android.widget;
public class SimpleCursorAdapter
  extends android.widget.ResourceCursorAdapter
{
public static interface ViewBinder
{
public abstract  boolean setViewValue(android.view.View view, android.database.Cursor cursor, int columnIndex);
}
public static interface CursorToStringConverter
{
public abstract  java.lang.CharSequence convertToString(android.database.Cursor cursor);
}
public  SimpleCursorAdapter(android.content.Context context, int layout, android.database.Cursor c, java.lang.String[] from, int[] to) { super((android.content.Context)null,0,(android.database.Cursor)null,false); throw new RuntimeException("Stub!"); }
public  void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  android.widget.SimpleCursorAdapter.ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); }
public  void setViewBinder(android.widget.SimpleCursorAdapter.ViewBinder viewBinder) { throw new RuntimeException("Stub!"); }
public  void setViewImage(android.widget.ImageView v, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setViewText(android.widget.TextView v, java.lang.String text) { throw new RuntimeException("Stub!"); }
public  int getStringConversionColumn() { throw new RuntimeException("Stub!"); }
public  void setStringConversionColumn(int stringConversionColumn) { throw new RuntimeException("Stub!"); }
public  android.widget.SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter() { throw new RuntimeException("Stub!"); }
public  void setCursorToStringConverter(android.widget.SimpleCursorAdapter.CursorToStringConverter cursorToStringConverter) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence convertToString(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  void changeCursor(android.database.Cursor c) { throw new RuntimeException("Stub!"); }
public  void changeCursorAndColumns(android.database.Cursor c, java.lang.String[] from, int[] to) { throw new RuntimeException("Stub!"); }
}
