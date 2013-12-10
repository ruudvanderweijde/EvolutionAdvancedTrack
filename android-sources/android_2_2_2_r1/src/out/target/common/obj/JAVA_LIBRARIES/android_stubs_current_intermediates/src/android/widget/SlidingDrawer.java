package android.widget;
public class SlidingDrawer
  extends android.view.ViewGroup
{
public static interface OnDrawerOpenListener
{
public abstract  void onDrawerOpened();
}
public static interface OnDrawerCloseListener
{
public abstract  void onDrawerClosed();
}
public static interface OnDrawerScrollListener
{
public abstract  void onScrollStarted();
public abstract  void onScrollEnded();
}
public  SlidingDrawer(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  SlidingDrawer(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
protected  void onFinishInflate() { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  boolean onInterceptTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void toggle() { throw new RuntimeException("Stub!"); }
public  void animateToggle() { throw new RuntimeException("Stub!"); }
public  void open() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void animateClose() { throw new RuntimeException("Stub!"); }
public  void animateOpen() { throw new RuntimeException("Stub!"); }
public  void setOnDrawerOpenListener(android.widget.SlidingDrawer.OnDrawerOpenListener onDrawerOpenListener) { throw new RuntimeException("Stub!"); }
public  void setOnDrawerCloseListener(android.widget.SlidingDrawer.OnDrawerCloseListener onDrawerCloseListener) { throw new RuntimeException("Stub!"); }
public  void setOnDrawerScrollListener(android.widget.SlidingDrawer.OnDrawerScrollListener onDrawerScrollListener) { throw new RuntimeException("Stub!"); }
public  android.view.View getHandle() { throw new RuntimeException("Stub!"); }
public  android.view.View getContent() { throw new RuntimeException("Stub!"); }
public  void unlock() { throw new RuntimeException("Stub!"); }
public  void lock() { throw new RuntimeException("Stub!"); }
public  boolean isOpened() { throw new RuntimeException("Stub!"); }
public  boolean isMoving() { throw new RuntimeException("Stub!"); }
public static final int ORIENTATION_HORIZONTAL = 0;
public static final int ORIENTATION_VERTICAL = 1;
}
