package android.app;
public class ExpandableListActivity
  extends android.app.Activity
  implements android.view.View.OnCreateContextMenuListener, android.widget.ExpandableListView.OnChildClickListener, android.widget.ExpandableListView.OnGroupCollapseListener, android.widget.ExpandableListView.OnGroupExpandListener
{
public  ExpandableListActivity() { throw new RuntimeException("Stub!"); }
public  void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v, android.view.ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); }
public  boolean onChildClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, int childPosition, long id) { throw new RuntimeException("Stub!"); }
public  void onGroupCollapse(int groupPosition) { throw new RuntimeException("Stub!"); }
public  void onGroupExpand(int groupPosition) { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Bundle state) { throw new RuntimeException("Stub!"); }
public  void onContentChanged() { throw new RuntimeException("Stub!"); }
public  void setListAdapter(android.widget.ExpandableListAdapter adapter) { throw new RuntimeException("Stub!"); }
public  android.widget.ExpandableListView getExpandableListView() { throw new RuntimeException("Stub!"); }
public  android.widget.ExpandableListAdapter getExpandableListAdapter() { throw new RuntimeException("Stub!"); }
public  long getSelectedId() { throw new RuntimeException("Stub!"); }
public  long getSelectedPosition() { throw new RuntimeException("Stub!"); }
public  boolean setSelectedChild(int groupPosition, int childPosition, boolean shouldExpandGroup) { throw new RuntimeException("Stub!"); }
public  void setSelectedGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
}
