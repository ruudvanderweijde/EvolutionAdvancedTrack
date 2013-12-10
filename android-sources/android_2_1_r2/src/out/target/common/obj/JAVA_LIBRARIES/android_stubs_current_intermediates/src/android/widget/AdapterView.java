package android.widget;
public abstract class AdapterView<T extends android.widget.Adapter>
  extends android.view.ViewGroup
{
public static interface OnItemClickListener
{
public abstract  void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id);
}
public static interface OnItemLongClickListener
{
public abstract  boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id);
}
public static interface OnItemSelectedListener
{
public abstract  void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id);
public abstract  void onNothingSelected(android.widget.AdapterView<?> parent);
}
public static class AdapterContextMenuInfo
  implements android.view.ContextMenu.ContextMenuInfo
{
public  AdapterContextMenuInfo(android.view.View targetView, int position, long id) { throw new RuntimeException("Stub!"); }
public android.view.View targetView;
public int position;
public long id;
}
public  AdapterView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  AdapterView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  AdapterView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener listener) { throw new RuntimeException("Stub!"); }
public final  android.widget.AdapterView.OnItemClickListener getOnItemClickListener() { throw new RuntimeException("Stub!"); }
public  boolean performItemClick(android.view.View view, int position, long id) { throw new RuntimeException("Stub!"); }
public  void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener listener) { throw new RuntimeException("Stub!"); }
public final  android.widget.AdapterView.OnItemLongClickListener getOnItemLongClickListener() { throw new RuntimeException("Stub!"); }
public  void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener listener) { throw new RuntimeException("Stub!"); }
public final  android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() { throw new RuntimeException("Stub!"); }
public abstract  T getAdapter();
public abstract  void setAdapter(T adapter);
public  void addView(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void removeView(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void removeViewAt(int index) { throw new RuntimeException("Stub!"); }
public  void removeAllViews() { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  int getSelectedItemPosition() { throw new RuntimeException("Stub!"); }
public  long getSelectedItemId() { throw new RuntimeException("Stub!"); }
public abstract  android.view.View getSelectedView();
public  java.lang.Object getSelectedItem() { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  int getPositionForView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  int getFirstVisiblePosition() { throw new RuntimeException("Stub!"); }
public  int getLastVisiblePosition() { throw new RuntimeException("Stub!"); }
public abstract  void setSelection(int position);
public  void setEmptyView(android.view.View emptyView) { throw new RuntimeException("Stub!"); }
public  android.view.View getEmptyView() { throw new RuntimeException("Stub!"); }
public  void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
public  void setFocusableInTouchMode(boolean focusable) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getItemAtPosition(int position) { throw new RuntimeException("Stub!"); }
public  long getItemIdAtPosition(int position) { throw new RuntimeException("Stub!"); }
public  void setOnClickListener(android.view.View.OnClickListener l) { throw new RuntimeException("Stub!"); }
protected  void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
public  boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
protected  boolean canAnimate() { throw new RuntimeException("Stub!"); }
public static final int ITEM_VIEW_TYPE_IGNORE = -1;
public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;
public static final int INVALID_POSITION = -1;
public static final long INVALID_ROW_ID = -9223372036854775808L;
}
