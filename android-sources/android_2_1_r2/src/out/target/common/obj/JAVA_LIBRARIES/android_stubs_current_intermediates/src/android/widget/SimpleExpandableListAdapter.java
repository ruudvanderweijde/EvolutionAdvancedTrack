package android.widget;
public class SimpleExpandableListAdapter
  extends android.widget.BaseExpandableListAdapter
{
public  SimpleExpandableListAdapter(android.content.Context context, java.util.List<? extends java.util.Map<java.lang.String, ?>> groupData, int groupLayout, java.lang.String[] groupFrom, int[] groupTo, java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> childData, int childLayout, java.lang.String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); }
public  SimpleExpandableListAdapter(android.content.Context context, java.util.List<? extends java.util.Map<java.lang.String, ?>> groupData, int expandedGroupLayout, int collapsedGroupLayout, java.lang.String[] groupFrom, int[] groupTo, java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> childData, int childLayout, java.lang.String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); }
public  SimpleExpandableListAdapter(android.content.Context context, java.util.List<? extends java.util.Map<java.lang.String, ?>> groupData, int expandedGroupLayout, int collapsedGroupLayout, java.lang.String[] groupFrom, int[] groupTo, java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ?>>> childData, int childLayout, int lastChildLayout, java.lang.String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  long getChildId(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  android.view.View newChildView(boolean isLastChild, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  int getChildrenCount(int groupPosition) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
public  int getGroupCount() { throw new RuntimeException("Stub!"); }
public  long getGroupId(int groupPosition) { throw new RuntimeException("Stub!"); }
public  android.view.View getGroupView(int groupPosition, boolean isExpanded, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  android.view.View newGroupView(boolean isExpanded, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  boolean isChildSelectable(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
public  boolean hasStableIds() { throw new RuntimeException("Stub!"); }
}
