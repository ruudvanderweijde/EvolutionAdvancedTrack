package android.view;
public final class ViewTreeObserver
{
public static interface OnGlobalFocusChangeListener
{
public abstract  void onGlobalFocusChanged(android.view.View oldFocus, android.view.View newFocus);
}
public static interface OnGlobalLayoutListener
{
public abstract  void onGlobalLayout();
}
public static interface OnPreDrawListener
{
public abstract  boolean onPreDraw();
}
public static interface OnTouchModeChangeListener
{
public abstract  void onTouchModeChanged(boolean isInTouchMode);
}
public static interface OnScrollChangedListener
{
public abstract  void onScrollChanged();
}
ViewTreeObserver() { throw new RuntimeException("Stub!"); }
public  void addOnGlobalFocusChangeListener(android.view.ViewTreeObserver.OnGlobalFocusChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnGlobalFocusChangeListener(android.view.ViewTreeObserver.OnGlobalFocusChangeListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnGlobalLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener listener) { throw new RuntimeException("Stub!"); }
public  void removeGlobalOnLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnScrollChangedListener(android.view.ViewTreeObserver.OnScrollChangedListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnScrollChangedListener(android.view.ViewTreeObserver.OnScrollChangedListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnTouchModeChangeListener(android.view.ViewTreeObserver.OnTouchModeChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnTouchModeChangeListener(android.view.ViewTreeObserver.OnTouchModeChangeListener victim) { throw new RuntimeException("Stub!"); }
public  boolean isAlive() { throw new RuntimeException("Stub!"); }
public final  void dispatchOnGlobalLayout() { throw new RuntimeException("Stub!"); }
public final  boolean dispatchOnPreDraw() { throw new RuntimeException("Stub!"); }
}
