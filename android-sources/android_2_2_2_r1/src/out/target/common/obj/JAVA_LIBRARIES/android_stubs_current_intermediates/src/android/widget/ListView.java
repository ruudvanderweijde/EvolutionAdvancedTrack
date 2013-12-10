package android.widget;
public class ListView
  extends android.widget.AbsListView
{
public class FixedViewInfo
{
public  FixedViewInfo() { throw new RuntimeException("Stub!"); }
public android.view.View view;
public java.lang.Object data;
public boolean isSelectable;
}
public  ListView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  ListView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  ListView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  int getMaxScrollAmount() { throw new RuntimeException("Stub!"); }
public  void addHeaderView(android.view.View v, java.lang.Object data, boolean isSelectable) { throw new RuntimeException("Stub!"); }
public  void addHeaderView(android.view.View v) { throw new RuntimeException("Stub!"); }
public  int getHeaderViewsCount() { throw new RuntimeException("Stub!"); }
public  boolean removeHeaderView(android.view.View v) { throw new RuntimeException("Stub!"); }
public  void addFooterView(android.view.View v, java.lang.Object data, boolean isSelectable) { throw new RuntimeException("Stub!"); }
public  void addFooterView(android.view.View v) { throw new RuntimeException("Stub!"); }
public  int getFooterViewsCount() { throw new RuntimeException("Stub!"); }
public  boolean removeFooterView(android.view.View v) { throw new RuntimeException("Stub!"); }
public  android.widget.ListAdapter getAdapter() { throw new RuntimeException("Stub!"); }
public  void setAdapter(android.widget.ListAdapter adapter) { throw new RuntimeException("Stub!"); }
public  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rect, boolean immediate) { throw new RuntimeException("Stub!"); }
protected  void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void layoutChildren() { throw new RuntimeException("Stub!"); }
protected  boolean canAnimate() { throw new RuntimeException("Stub!"); }
public  void setSelection(int position) { throw new RuntimeException("Stub!"); }
public  void setSelectionFromTop(int position, int y) { throw new RuntimeException("Stub!"); }
public  boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
public  void setSelectionAfterHeaderView() { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void setItemsCanFocus(boolean itemsCanFocus) { throw new RuntimeException("Stub!"); }
public  boolean getItemsCanFocus() { throw new RuntimeException("Stub!"); }
public  void setCacheColorHint(int color) { throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDivider() { throw new RuntimeException("Stub!"); }
public  void setDivider(android.graphics.drawable.Drawable divider) { throw new RuntimeException("Stub!"); }
public  int getDividerHeight() { throw new RuntimeException("Stub!"); }
public  void setDividerHeight(int height) { throw new RuntimeException("Stub!"); }
public  void setHeaderDividersEnabled(boolean headerDividersEnabled) { throw new RuntimeException("Stub!"); }
public  void setFooterDividersEnabled(boolean footerDividersEnabled) { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
protected  void onFinishInflate() { throw new RuntimeException("Stub!"); }
protected  android.view.View findViewTraversal(int id) { throw new RuntimeException("Stub!"); }
protected  android.view.View findViewWithTagTraversal(java.lang.Object tag) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  int getChoiceMode() { throw new RuntimeException("Stub!"); }
public  void setChoiceMode(int choiceMode) { throw new RuntimeException("Stub!"); }
public  boolean performItemClick(android.view.View view, int position, long id) { throw new RuntimeException("Stub!"); }
public  void setItemChecked(int position, boolean value) { throw new RuntimeException("Stub!"); }
public  boolean isItemChecked(int position) { throw new RuntimeException("Stub!"); }
public  int getCheckedItemPosition() { throw new RuntimeException("Stub!"); }
public  android.util.SparseBooleanArray getCheckedItemPositions() { throw new RuntimeException("Stub!"); }
public  long[] getCheckItemIds() { throw new RuntimeException("Stub!"); }
public  long[] getCheckedItemIds() { throw new RuntimeException("Stub!"); }
public  void clearChoices() { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public static final int CHOICE_MODE_NONE = 0;
public static final int CHOICE_MODE_SINGLE = 1;
public static final int CHOICE_MODE_MULTIPLE = 2;
}
