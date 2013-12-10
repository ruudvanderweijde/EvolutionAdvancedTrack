package android.widget;
public interface ExpandableListAdapter
{
public abstract  void registerDataSetObserver(android.database.DataSetObserver observer);
public abstract  void unregisterDataSetObserver(android.database.DataSetObserver observer);
public abstract  int getGroupCount();
public abstract  int getChildrenCount(int groupPosition);
public abstract  java.lang.Object getGroup(int groupPosition);
public abstract  java.lang.Object getChild(int groupPosition, int childPosition);
public abstract  long getGroupId(int groupPosition);
public abstract  long getChildId(int groupPosition, int childPosition);
public abstract  boolean hasStableIds();
public abstract  android.view.View getGroupView(int groupPosition, boolean isExpanded, android.view.View convertView, android.view.ViewGroup parent);
public abstract  android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, android.view.View convertView, android.view.ViewGroup parent);
public abstract  boolean isChildSelectable(int groupPosition, int childPosition);
public abstract  boolean areAllItemsEnabled();
public abstract  boolean isEmpty();
public abstract  void onGroupExpanded(int groupPosition);
public abstract  void onGroupCollapsed(int groupPosition);
public abstract  long getCombinedChildId(long groupId, long childId);
public abstract  long getCombinedGroupId(long groupId);
}
