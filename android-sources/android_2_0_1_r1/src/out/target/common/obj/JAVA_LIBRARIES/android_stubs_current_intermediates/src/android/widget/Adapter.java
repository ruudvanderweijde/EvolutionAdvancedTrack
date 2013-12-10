package android.widget;
public interface Adapter
{
public abstract  void registerDataSetObserver(android.database.DataSetObserver observer);
public abstract  void unregisterDataSetObserver(android.database.DataSetObserver observer);
public abstract  int getCount();
public abstract  java.lang.Object getItem(int position);
public abstract  long getItemId(int position);
public abstract  boolean hasStableIds();
public abstract  android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent);
public abstract  int getItemViewType(int position);
public abstract  int getViewTypeCount();
public abstract  boolean isEmpty();
public static final int IGNORE_ITEM_VIEW_TYPE = -1;
public static final int NO_SELECTION = -2147483648;
}
