package android.widget;
public abstract class CursorTreeAdapter
  extends android.widget.BaseExpandableListAdapter
  implements android.widget.Filterable
{
public  CursorTreeAdapter(android.database.Cursor cursor, android.content.Context context) { throw new RuntimeException("Stub!"); }
public  CursorTreeAdapter(android.database.Cursor cursor, android.content.Context context, boolean autoRequery) { throw new RuntimeException("Stub!"); }
protected abstract  android.database.Cursor getChildrenCursor(android.database.Cursor groupCursor);
public  void setGroupCursor(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  void setChildrenCursor(int groupPosition, android.database.Cursor childrenCursor) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor getChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  long getChildId(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  int getChildrenCount(int groupPosition) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor getGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
public  int getGroupCount() { throw new RuntimeException("Stub!"); }
public  long getGroupId(int groupPosition) { throw new RuntimeException("Stub!"); }
public  android.view.View getGroupView(int groupPosition, boolean isExpanded, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
protected abstract  android.view.View newGroupView(android.content.Context context, android.database.Cursor cursor, boolean isExpanded, android.view.ViewGroup parent);
protected abstract  void bindGroupView(android.view.View view, android.content.Context context, android.database.Cursor cursor, boolean isExpanded);
public  android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
protected abstract  android.view.View newChildView(android.content.Context context, android.database.Cursor cursor, boolean isLastChild, android.view.ViewGroup parent);
protected abstract  void bindChildView(android.view.View view, android.content.Context context, android.database.Cursor cursor, boolean isLastChild);
public  boolean isChildSelectable(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  boolean hasStableIds() { throw new RuntimeException("Stub!"); }
public  void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
public  void notifyDataSetChanged(boolean releaseCursors) { throw new RuntimeException("Stub!"); }
public  void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); }
public  void onGroupCollapsed(int groupPosition) { throw new RuntimeException("Stub!"); }
public  java.lang.String convertToString(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence constraint) { throw new RuntimeException("Stub!"); }
public  android.widget.Filter getFilter() { throw new RuntimeException("Stub!"); }
public  android.widget.FilterQueryProvider getFilterQueryProvider() { throw new RuntimeException("Stub!"); }
public  void setFilterQueryProvider(android.widget.FilterQueryProvider filterQueryProvider) { throw new RuntimeException("Stub!"); }
public  void changeCursor(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor getCursor() { throw new RuntimeException("Stub!"); }
}
