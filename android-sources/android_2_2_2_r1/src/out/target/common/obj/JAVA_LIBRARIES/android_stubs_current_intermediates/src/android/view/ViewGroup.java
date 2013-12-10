package android.view;
public abstract class ViewGroup
  extends android.view.View
  implements android.view.ViewParent, android.view.ViewManager
{
public static interface OnHierarchyChangeListener
{
public abstract  void onChildViewAdded(android.view.View parent, android.view.View child);
public abstract  void onChildViewRemoved(android.view.View parent, android.view.View child);
}
public static class LayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  LayoutParams(int width, int height) { throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams source) { throw new RuntimeException("Stub!"); }
protected  void setBaseAttributes(android.content.res.TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!"); }
public static final int FILL_PARENT = -1;
public static final int MATCH_PARENT = -1;
public static final int WRAP_CONTENT = -2;
public int width;
public int height;
public android.view.animation.LayoutAnimationController.AnimationParameters layoutAnimationParameters;
}
public static class MarginLayoutParams
  extends android.view.ViewGroup.LayoutParams
{
public  MarginLayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  MarginLayoutParams(int width, int height) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  MarginLayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  MarginLayoutParams(android.view.ViewGroup.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  void setMargins(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public int leftMargin;
public int topMargin;
public int rightMargin;
public int bottomMargin;
}
public  ViewGroup(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  ViewGroup(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  ViewGroup(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  int getDescendantFocusability() { throw new RuntimeException("Stub!"); }
public  void setDescendantFocusability(int focusability) { throw new RuntimeException("Stub!"); }
public  void requestChildFocus(android.view.View child, android.view.View focused) { throw new RuntimeException("Stub!"); }
public  void focusableViewAvailable(android.view.View v) { throw new RuntimeException("Stub!"); }
public  boolean showContextMenuForChild(android.view.View originalView) { throw new RuntimeException("Stub!"); }
public  android.view.View focusSearch(android.view.View focused, int direction) { throw new RuntimeException("Stub!"); }
public  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); }
public  boolean dispatchUnhandledMove(android.view.View focused, int direction) { throw new RuntimeException("Stub!"); }
public  void clearChildFocus(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void clearFocus() { throw new RuntimeException("Stub!"); }
public  android.view.View getFocusedChild() { throw new RuntimeException("Stub!"); }
public  boolean hasFocus() { throw new RuntimeException("Stub!"); }
public  android.view.View findFocus() { throw new RuntimeException("Stub!"); }
public  boolean hasFocusable() { throw new RuntimeException("Stub!"); }
public  void addFocusables(java.util.ArrayList<android.view.View> views, int direction) { throw new RuntimeException("Stub!"); }
public  void addFocusables(java.util.ArrayList<android.view.View> views, int direction, int focusableMode) { throw new RuntimeException("Stub!"); }
public  void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
public  void addTouchables(java.util.ArrayList<android.view.View> views) { throw new RuntimeException("Stub!"); }
public  void dispatchDisplayHint(int hint) { throw new RuntimeException("Stub!"); }
protected  void dispatchVisibilityChanged(android.view.View changedView, int visibility) { throw new RuntimeException("Stub!"); }
public  void dispatchWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
public  void dispatchConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void recomputeViewAttributes(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void bringChildToFront(android.view.View child) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEventPreIme(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyShortcutEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  void requestDisallowInterceptTouchEvent(boolean disallowIntercept) { throw new RuntimeException("Stub!"); }
public  boolean onInterceptTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
protected  boolean onRequestFocusInDescendants(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
public  void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
protected  void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void dispatchFreezeSelfOnly(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void dispatchThawSelfOnly(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void setChildrenDrawingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
protected  void onAnimationStart() { throw new RuntimeException("Stub!"); }
protected  void onAnimationEnd() { throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected  int getChildDrawingOrder(int childCount, int i) { throw new RuntimeException("Stub!"); }
protected  boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long drawingTime) { throw new RuntimeException("Stub!"); }
public  void setClipChildren(boolean clipChildren) { throw new RuntimeException("Stub!"); }
public  void setClipToPadding(boolean clipToPadding) { throw new RuntimeException("Stub!"); }
public  void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); }
protected  void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
protected  void setStaticTransformationsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
protected  boolean getChildStaticTransformation(android.view.View child, android.view.animation.Transformation t) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int width, int height) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); }
protected  boolean addViewInLayout(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
protected  boolean addViewInLayout(android.view.View child, int index, android.view.ViewGroup.LayoutParams params, boolean preventRequestLayout) { throw new RuntimeException("Stub!"); }
protected  void cleanupLayoutState(android.view.View child) { throw new RuntimeException("Stub!"); }
protected  void attachLayoutAnimationParameters(android.view.View child, android.view.ViewGroup.LayoutParams params, int index, int count) { throw new RuntimeException("Stub!"); }
public  void removeView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void removeViewInLayout(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void removeViewsInLayout(int start, int count) { throw new RuntimeException("Stub!"); }
public  void removeViewAt(int index) { throw new RuntimeException("Stub!"); }
public  void removeViews(int start, int count) { throw new RuntimeException("Stub!"); }
public  void removeAllViews() { throw new RuntimeException("Stub!"); }
public  void removeAllViewsInLayout() { throw new RuntimeException("Stub!"); }
protected  void removeDetachedView(android.view.View child, boolean animate) { throw new RuntimeException("Stub!"); }
protected  void attachViewToParent(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
protected  void detachViewFromParent(android.view.View child) { throw new RuntimeException("Stub!"); }
protected  void detachViewFromParent(int index) { throw new RuntimeException("Stub!"); }
protected  void detachViewsFromParent(int start, int count) { throw new RuntimeException("Stub!"); }
protected  void detachAllViewsFromParent() { throw new RuntimeException("Stub!"); }
public final  void invalidateChild(android.view.View child, android.graphics.Rect dirty) { throw new RuntimeException("Stub!"); }
public  android.view.ViewParent invalidateChildInParent(int[] location, android.graphics.Rect dirty) { throw new RuntimeException("Stub!"); }
public final  void offsetDescendantRectToMyCoords(android.view.View descendant, android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
public final  void offsetRectIntoDescendantCoords(android.view.View descendant, android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
public  boolean getChildVisibleRect(android.view.View child, android.graphics.Rect r, android.graphics.Point offset) { throw new RuntimeException("Stub!"); }
protected abstract  void onLayout(boolean changed, int l, int t, int r, int b);
protected  boolean canAnimate() { throw new RuntimeException("Stub!"); }
public  void startLayoutAnimation() { throw new RuntimeException("Stub!"); }
public  void scheduleLayoutAnimation() { throw new RuntimeException("Stub!"); }
public  void setLayoutAnimation(android.view.animation.LayoutAnimationController controller) { throw new RuntimeException("Stub!"); }
public  android.view.animation.LayoutAnimationController getLayoutAnimation() { throw new RuntimeException("Stub!"); }
public  boolean isAnimationCacheEnabled() { throw new RuntimeException("Stub!"); }
public  void setAnimationCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isAlwaysDrawnWithCacheEnabled() { throw new RuntimeException("Stub!"); }
public  void setAlwaysDrawnWithCacheEnabled(boolean always) { throw new RuntimeException("Stub!"); }
protected  boolean isChildrenDrawnWithCacheEnabled() { throw new RuntimeException("Stub!"); }
protected  void setChildrenDrawnWithCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
protected  boolean isChildrenDrawingOrderEnabled() { throw new RuntimeException("Stub!"); }
protected  void setChildrenDrawingOrderEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  int getPersistentDrawingCache() { throw new RuntimeException("Stub!"); }
public  void setPersistentDrawingCache(int drawingCacheToKeep) { throw new RuntimeException("Stub!"); }
public  android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
protected  void debug(int depth) { throw new RuntimeException("Stub!"); }
public  int indexOfChild(android.view.View child) { throw new RuntimeException("Stub!"); }
public  int getChildCount() { throw new RuntimeException("Stub!"); }
public  android.view.View getChildAt(int index) { throw new RuntimeException("Stub!"); }
protected  void measureChildren(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void measureChild(android.view.View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void measureChildWithMargins(android.view.View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) { throw new RuntimeException("Stub!"); }
public static  int getChildMeasureSpec(int spec, int padding, int childDimension) { throw new RuntimeException("Stub!"); }
public  void clearDisappearingChildren() { throw new RuntimeException("Stub!"); }
public  boolean gatherTransparentRegion(android.graphics.Region region) { throw new RuntimeException("Stub!"); }
public  void requestTransparentRegion(android.view.View child) { throw new RuntimeException("Stub!"); }
protected  boolean fitSystemWindows(android.graphics.Rect insets) { throw new RuntimeException("Stub!"); }
public  android.view.animation.Animation.AnimationListener getLayoutAnimationListener() { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
protected  int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
public  void setAddStatesFromChildren(boolean addsStates) { throw new RuntimeException("Stub!"); }
public  boolean addStatesFromChildren() { throw new RuntimeException("Stub!"); }
public  void childDrawableStateChanged(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void setLayoutAnimationListener(android.view.animation.Animation.AnimationListener animationListener) { throw new RuntimeException("Stub!"); }
public static final int FOCUS_BEFORE_DESCENDANTS = 131072;
public static final int FOCUS_AFTER_DESCENDANTS = 262144;
public static final int FOCUS_BLOCK_DESCENDANTS = 393216;
public static final int PERSISTENT_NO_CACHE = 0;
public static final int PERSISTENT_ANIMATION_CACHE = 1;
public static final int PERSISTENT_SCROLLING_CACHE = 2;
public static final int PERSISTENT_ALL_CACHES = 3;
protected static final int CLIP_TO_PADDING_MASK = 34;
}
