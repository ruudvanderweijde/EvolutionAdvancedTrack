package android.widget;
public interface ListAdapter
  extends android.widget.Adapter
{
public abstract  boolean areAllItemsEnabled();
public abstract  boolean isEnabled(int position);
}
