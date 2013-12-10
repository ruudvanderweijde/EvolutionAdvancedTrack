package android.view;
public interface ViewParent
{
public abstract  void requestLayout();
public abstract  boolean isLayoutRequested();
public abstract  void requestTransparentRegion(android.view.View child);
public abstract  void invalidateChild(android.view.View child, android.graphics.Rect r);
public abstract  android.view.ViewParent invalidateChildInParent(int[] location, android.graphics.Rect r);
public abstract  android.view.ViewParent getParent();
public abstract  void requestChildFocus(android.view.View child, android.view.View focused);
public abstract  void recomputeViewAttributes(android.view.View child);
public abstract  void clearChildFocus(android.view.View child);
public abstract  boolean getChildVisibleRect(android.view.View child, android.graphics.Rect r, android.graphics.Point offset);
public abstract  android.view.View focusSearch(android.view.View v, int direction);
public abstract  void bringChildToFront(android.view.View child);
public abstract  void focusableViewAvailable(android.view.View v);
public abstract  boolean showContextMenuForChild(android.view.View originalView);
public abstract  void createContextMenu(android.view.ContextMenu menu);
public abstract  void childDrawableStateChanged(android.view.View child);
public abstract  void requestDisallowInterceptTouchEvent(boolean disallowIntercept);
public abstract  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rectangle, boolean immediate);
}
