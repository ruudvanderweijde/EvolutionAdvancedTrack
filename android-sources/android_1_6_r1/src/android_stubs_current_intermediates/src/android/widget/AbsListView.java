package android.widget;
public abstract class AbsListView
  extends android.widget.AdapterView<android.widget.ListAdapter>
  implements android.text.TextWatcher, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.Filter.FilterListener, android.view.ViewTreeObserver.OnTouchModeChangeListener
{
public static interface OnScrollListener
{
public abstract  void onScrollStateChanged(android.widget.AbsListView view, int scrollState);
public abstract  void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount);
public static final int SCROLL_STATE_IDLE = 0;
public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
public static final int SCROLL_STATE_FLING = 2;
}
public static class LayoutParams
  extends android.view.ViewGroup.LayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h, int viewType) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
}
public static interface RecyclerListener
{
public abstract  void onMovedToScrapHeap(android.view.View view);
}
public  AbsListView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  AbsListView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  AbsListView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setFastScrollEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isFastScrollEnabled() { throw new RuntimeException("Stub!"); }
public  void setSmoothScrollbarEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isSmoothScrollbarEnabled() { throw new RuntimeException("Stub!"); }
public  void setOnScrollListener(android.widget.AbsListView.OnScrollListener l) { throw new RuntimeException("Stub!"); }
public  boolean isScrollingCacheEnabled() { throw new RuntimeException("Stub!"); }
public  void setScrollingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setTextFilterEnabled(boolean textFilterEnabled) { throw new RuntimeException("Stub!"); }
public  boolean isTextFilterEnabled() { throw new RuntimeException("Stub!"); }
public  void getFocusedRect(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  boolean isStackFromBottom() { throw new RuntimeException("Stub!"); }
public  void setStackFromBottom(boolean stackFromBottom) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  void setFilterText(java.lang.String filterText) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTextFilter() { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  void requestLayout() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
protected  float getTopFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
protected  float getBottomFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
protected  void layoutChildren() { throw new RuntimeException("Stub!"); }
public  android.view.View getSelectedView() { throw new RuntimeException("Stub!"); }
public  int getListPaddingTop() { throw new RuntimeException("Stub!"); }
public  int getListPaddingBottom() { throw new RuntimeException("Stub!"); }
public  int getListPaddingLeft() { throw new RuntimeException("Stub!"); }
public  int getListPaddingRight() { throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected  void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
public  void setDrawSelectorOnTop(boolean onTop) { throw new RuntimeException("Stub!"); }
public  void setSelector(int resID) { throw new RuntimeException("Stub!"); }
public  void setSelector(android.graphics.drawable.Drawable sel) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getSelector() { throw new RuntimeException("Stub!"); }
public  void setScrollIndicators(android.view.View up, android.view.View down) { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
protected  int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
public  boolean verifyDrawable(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
protected  android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); }
public  boolean showContextMenuForChild(android.view.View originalView) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
protected  void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
public  int pointToPosition(int x, int y) { throw new RuntimeException("Stub!"); }
public  long pointToRowId(int x, int y) { throw new RuntimeException("Stub!"); }
public  void onTouchModeChanged(boolean isInTouchMode) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  boolean onInterceptTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  void addTouchables(java.util.ArrayList<android.view.View> views) { throw new RuntimeException("Stub!"); }
public  void invalidateViews() { throw new RuntimeException("Stub!"); }
protected  void handleDataChanged() { throw new RuntimeException("Stub!"); }
protected  boolean isInFilterMode() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) { throw new RuntimeException("Stub!"); }
public  boolean checkInputConnectionProxy(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void clearTextFilter() { throw new RuntimeException("Stub!"); }
public  boolean hasTextFilter() { throw new RuntimeException("Stub!"); }
public  void onGlobalLayout() { throw new RuntimeException("Stub!"); }
public  void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) { throw new RuntimeException("Stub!"); }
public  void onTextChanged(java.lang.CharSequence s, int start, int before, int count) { throw new RuntimeException("Stub!"); }
public  void afterTextChanged(android.text.Editable s) { throw new RuntimeException("Stub!"); }
public  void onFilterComplete(int count) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  android.widget.AbsListView.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  void setTranscriptMode(int mode) { throw new RuntimeException("Stub!"); }
public  int getTranscriptMode() { throw new RuntimeException("Stub!"); }
public  int getSolidColor() { throw new RuntimeException("Stub!"); }
public  void setCacheColorHint(int color) { throw new RuntimeException("Stub!"); }
public  int getCacheColorHint() { throw new RuntimeException("Stub!"); }
public  void reclaimViews(java.util.List<android.view.View> views) { throw new RuntimeException("Stub!"); }
public  void setRecyclerListener(android.widget.AbsListView.RecyclerListener listener) { throw new RuntimeException("Stub!"); }
public static final int TRANSCRIPT_MODE_DISABLED = 0;
public static final int TRANSCRIPT_MODE_NORMAL = 1;
public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;
}
