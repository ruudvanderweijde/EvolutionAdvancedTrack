package android.view;
public class GestureDetector
{
public static interface OnGestureListener
{
public abstract  boolean onDown(android.view.MotionEvent e);
public abstract  void onShowPress(android.view.MotionEvent e);
public abstract  boolean onSingleTapUp(android.view.MotionEvent e);
public abstract  boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY);
public abstract  void onLongPress(android.view.MotionEvent e);
public abstract  boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY);
}
public static interface OnDoubleTapListener
{
public abstract  boolean onSingleTapConfirmed(android.view.MotionEvent e);
public abstract  boolean onDoubleTap(android.view.MotionEvent e);
public abstract  boolean onDoubleTapEvent(android.view.MotionEvent e);
}
public static class SimpleOnGestureListener
  implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener
{
public  SimpleOnGestureListener() { throw new RuntimeException("Stub!"); }
public  boolean onSingleTapUp(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  void onLongPress(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY) { throw new RuntimeException("Stub!"); }
public  boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) { throw new RuntimeException("Stub!"); }
public  void onShowPress(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onDown(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onDoubleTap(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onDoubleTapEvent(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onSingleTapConfirmed(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
}
public  GestureDetector(android.view.GestureDetector.OnGestureListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  GestureDetector(android.view.GestureDetector.OnGestureListener listener) { throw new RuntimeException("Stub!"); }
public  GestureDetector(android.content.Context context, android.view.GestureDetector.OnGestureListener listener) { throw new RuntimeException("Stub!"); }
public  GestureDetector(android.content.Context context, android.view.GestureDetector.OnGestureListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  GestureDetector(android.content.Context context, android.view.GestureDetector.OnGestureListener listener, android.os.Handler handler, boolean ignoreMultitouch) { throw new RuntimeException("Stub!"); }
public  void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener) { throw new RuntimeException("Stub!"); }
public  void setIsLongpressEnabled(boolean isLongpressEnabled) { throw new RuntimeException("Stub!"); }
public  boolean isLongpressEnabled() { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
}
