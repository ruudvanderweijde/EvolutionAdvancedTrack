package android.widget;
public class ExpandableListView
  extends android.widget.ListView
{
public static interface OnGroupCollapseListener
{
public abstract  void onGroupCollapse(int groupPosition);
}
public static interface OnGroupExpandListener
{
public abstract  void onGroupExpand(int groupPosition);
}
public static interface OnGroupClickListener
{
public abstract  boolean onGroupClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, long id);
}
public static interface OnChildClickListener
{
public abstract  boolean onChildClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, int childPosition, long id);
}
public static class ExpandableListContextMenuInfo
  implements android.view.ContextMenu.ContextMenuInfo
{
public  ExpandableListContextMenuInfo(android.view.View targetView, long packedPosition, long id) { throw new RuntimeException("Stub!"); }
public android.view.View targetView;
public long packedPosition;
public long id;
}
public  ExpandableListView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  ExpandableListView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  ExpandableListView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void setChildDivider(android.graphics.drawable.Drawable childDivider) { throw new RuntimeException("Stub!"); }
public  void setAdapter(android.widget.ListAdapter adapter) { throw new RuntimeException("Stub!"); }
public  android.widget.ListAdapter getAdapter() { throw new RuntimeException("Stub!"); }
public  void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); }
public  void setAdapter(android.widget.ExpandableListAdapter adapter) { throw new RuntimeException("Stub!"); }
public  android.widget.ExpandableListAdapter getExpandableListAdapter() { throw new RuntimeException("Stub!"); }
public  boolean performItemClick(android.view.View v, int position, long id) { throw new RuntimeException("Stub!"); }
public  boolean expandGroup(int groupPos) { throw new RuntimeException("Stub!"); }
public  boolean collapseGroup(int groupPos) { throw new RuntimeException("Stub!"); }
public  void setOnGroupCollapseListener(android.widget.ExpandableListView.OnGroupCollapseListener onGroupCollapseListener) { throw new RuntimeException("Stub!"); }
public  void setOnGroupExpandListener(android.widget.ExpandableListView.OnGroupExpandListener onGroupExpandListener) { throw new RuntimeException("Stub!"); }
public  void setOnGroupClickListener(android.widget.ExpandableListView.OnGroupClickListener onGroupClickListener) { throw new RuntimeException("Stub!"); }
public  void setOnChildClickListener(android.widget.ExpandableListView.OnChildClickListener onChildClickListener) { throw new RuntimeException("Stub!"); }
public  long getExpandableListPosition(int flatListPosition) { throw new RuntimeException("Stub!"); }
public  int getFlatListPosition(long packedPosition) { throw new RuntimeException("Stub!"); }
public  long getSelectedPosition() { throw new RuntimeException("Stub!"); }
public  long getSelectedId() { throw new RuntimeException("Stub!"); }
public  void setSelectedGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
public  boolean setSelectedChild(int groupPosition, int childPosition, boolean shouldExpandGroup) { throw new RuntimeException("Stub!"); }
public  boolean isGroupExpanded(int groupPosition) { throw new RuntimeException("Stub!"); }
public static  int getPackedPositionType(long packedPosition) { throw new RuntimeException("Stub!"); }
public static  int getPackedPositionGroup(long packedPosition) { throw new RuntimeException("Stub!"); }
public static  int getPackedPositionChild(long packedPosition) { throw new RuntimeException("Stub!"); }
public static  long getPackedPositionForChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public static  long getPackedPositionForGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
public  void setChildIndicator(android.graphics.drawable.Drawable childIndicator) { throw new RuntimeException("Stub!"); }
public  void setChildIndicatorBounds(int left, int right) { throw new RuntimeException("Stub!"); }
public  void setGroupIndicator(android.graphics.drawable.Drawable groupIndicator) { throw new RuntimeException("Stub!"); }
public  void setIndicatorBounds(int left, int right) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public static final int PACKED_POSITION_TYPE_GROUP = 0;
public static final int PACKED_POSITION_TYPE_CHILD = 1;
public static final int PACKED_POSITION_TYPE_NULL = 2;
public static final long PACKED_POSITION_VALUE_NULL = 4294967295L;
public static final int CHILD_INDICATOR_INHERIT = -1;
}
