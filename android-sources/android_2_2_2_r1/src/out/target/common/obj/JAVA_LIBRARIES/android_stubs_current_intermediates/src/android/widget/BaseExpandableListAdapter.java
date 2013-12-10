package android.widget;
public abstract class BaseExpandableListAdapter
  implements android.widget.ExpandableListAdapter, android.widget.HeterogeneousExpandableList
{
public  BaseExpandableListAdapter() { throw new RuntimeException("Stub!"); }
public  void registerDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  void unregisterDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); }
public  void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
public  boolean areAllItemsEnabled() { throw new RuntimeException("Stub!"); }
public  void onGroupCollapsed(int groupPosition) { throw new RuntimeException("Stub!"); }
public  void onGroupExpanded(int groupPosition) { throw new RuntimeException("Stub!"); }
public  long getCombinedChildId(long groupId, long childId) { throw new RuntimeException("Stub!"); }
public  long getCombinedGroupId(long groupId) { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  int getChildType(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  int getChildTypeCount() { throw new RuntimeException("Stub!"); }
public  int getGroupType(int groupPosition) { throw new RuntimeException("Stub!"); }
public  int getGroupTypeCount() { throw new RuntimeException("Stub!"); }
}
