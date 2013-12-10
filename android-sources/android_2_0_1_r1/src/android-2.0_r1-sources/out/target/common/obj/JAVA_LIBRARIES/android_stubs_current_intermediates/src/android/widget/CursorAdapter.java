package android.widget;
public abstract class CursorAdapter
  extends android.widget.BaseAdapter
  implements android.widget.Filterable
{
public  CursorAdapter(android.content.Context context, android.database.Cursor c) { throw new RuntimeException("Stub!"); }
public  CursorAdapter(android.content.Context context, android.database.Cursor c, boolean autoRequery) { throw new RuntimeException("Stub!"); }
protected  void init(android.content.Context context, android.database.Cursor c, boolean autoRequery) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor getCursor() { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getItem(int position) { throw new RuntimeException("Stub!"); }
public  long getItemId(int position) { throw new RuntimeException("Stub!"); }
public  boolean hasStableIds() { throw new RuntimeException("Stub!"); }
public  android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  android.view.View getDropDownView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public abstract  android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent);
public  android.view.View newDropDownView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public abstract  void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor);
public  void changeCursor(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence convertToString(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence constraint) { throw new RuntimeException("Stub!"); }
public  android.widget.Filter getFilter() { throw new RuntimeException("Stub!"); }
public  android.widget.FilterQueryProvider getFilterQueryProvider() { throw new RuntimeException("Stub!"); }
public  void setFilterQueryProvider(android.widget.FilterQueryProvider filterQueryProvider) { throw new RuntimeException("Stub!"); }
protected  void onContentChanged() { throw new RuntimeException("Stub!"); }
}
