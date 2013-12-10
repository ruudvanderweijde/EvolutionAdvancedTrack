package android.widget;
public abstract class BaseAdapter
  implements android.widget.ListAdapter, android.widget.SpinnerAdapter
{
public  BaseAdapter() { throw new RuntimeException("Stub!"); }
public  boolean hasStableIds() { throw new RuntimeException("Stub!"); }
public  void registerDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  void unregisterDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
public  void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); }
public  boolean areAllItemsEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled(int position) { throw new RuntimeException("Stub!"); }
public  android.view.View getDropDownView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  int getItemViewType(int position) { throw new RuntimeException("Stub!"); }
public  int getViewTypeCount() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
}
