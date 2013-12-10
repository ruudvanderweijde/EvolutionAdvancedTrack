package android.gesture;
public class GestureOverlayView
  extends android.widget.FrameLayout
{
public static interface OnGesturingListener
{
public abstract  void onGesturingStarted(android.gesture.GestureOverlayView overlay);
public abstract  void onGesturingEnded(android.gesture.GestureOverlayView overlay);
}
public static interface OnGestureListener
{
public abstract  void onGestureStarted(android.gesture.GestureOverlayView overlay, android.view.MotionEvent event);
public abstract  void onGesture(android.gesture.GestureOverlayView overlay, android.view.MotionEvent event);
public abstract  void onGestureEnded(android.gesture.GestureOverlayView overlay, android.view.MotionEvent event);
public abstract  void onGestureCancelled(android.gesture.GestureOverlayView overlay, android.view.MotionEvent event);
}
public static interface OnGesturePerformedListener
{
public abstract  void onGesturePerformed(android.gesture.GestureOverlayView overlay, android.gesture.Gesture gesture);
}
public  GestureOverlayView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  GestureOverlayView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  GestureOverlayView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<android.gesture.GesturePoint> getCurrentStroke() { throw new RuntimeException("Stub!"); }
public  int getOrientation() { throw new RuntimeException("Stub!"); }
public  void setOrientation(int orientation) { throw new RuntimeException("Stub!"); }
public  void setGestureColor(int color) { throw new RuntimeException("Stub!"); }
public  void setUncertainGestureColor(int color) { throw new RuntimeException("Stub!"); }
public  int getUncertainGestureColor() { throw new RuntimeException("Stub!"); }
public  int getGestureColor() { throw new RuntimeException("Stub!"); }
public  float getGestureStrokeWidth() { throw new RuntimeException("Stub!"); }
public  void setGestureStrokeWidth(float gestureStrokeWidth) { throw new RuntimeException("Stub!"); }
public  int getGestureStrokeType() { throw new RuntimeException("Stub!"); }
public  void setGestureStrokeType(int gestureStrokeType) { throw new RuntimeException("Stub!"); }
public  float getGestureStrokeLengthThreshold() { throw new RuntimeException("Stub!"); }
public  void setGestureStrokeLengthThreshold(float gestureStrokeLengthThreshold) { throw new RuntimeException("Stub!"); }
public  float getGestureStrokeSquarenessTreshold() { throw new RuntimeException("Stub!"); }
public  void setGestureStrokeSquarenessTreshold(float gestureStrokeSquarenessTreshold) { throw new RuntimeException("Stub!"); }
public  float getGestureStrokeAngleThreshold() { throw new RuntimeException("Stub!"); }
public  void setGestureStrokeAngleThreshold(float gestureStrokeAngleThreshold) { throw new RuntimeException("Stub!"); }
public  boolean isEventsInterceptionEnabled() { throw new RuntimeException("Stub!"); }
public  void setEventsInterceptionEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isFadeEnabled() { throw new RuntimeException("Stub!"); }
public  void setFadeEnabled(boolean fadeEnabled) { throw new RuntimeException("Stub!"); }
public  android.gesture.Gesture getGesture() { throw new RuntimeException("Stub!"); }
public  void setGesture(android.gesture.Gesture gesture) { throw new RuntimeException("Stub!"); }
public  android.graphics.Path getGesturePath() { throw new RuntimeException("Stub!"); }
public  android.graphics.Path getGesturePath(android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public  boolean isGestureVisible() { throw new RuntimeException("Stub!"); }
public  void setGestureVisible(boolean visible) { throw new RuntimeException("Stub!"); }
public  long getFadeOffset() { throw new RuntimeException("Stub!"); }
public  void setFadeOffset(long fadeOffset) { throw new RuntimeException("Stub!"); }
public  void addOnGestureListener(android.gesture.GestureOverlayView.OnGestureListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnGestureListener(android.gesture.GestureOverlayView.OnGestureListener listener) { throw new RuntimeException("Stub!"); }
public  void removeAllOnGestureListeners() { throw new RuntimeException("Stub!"); }
public  void addOnGesturePerformedListener(android.gesture.GestureOverlayView.OnGesturePerformedListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnGesturePerformedListener(android.gesture.GestureOverlayView.OnGesturePerformedListener listener) { throw new RuntimeException("Stub!"); }
public  void removeAllOnGesturePerformedListeners() { throw new RuntimeException("Stub!"); }
public  void addOnGesturingListener(android.gesture.GestureOverlayView.OnGesturingListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnGesturingListener(android.gesture.GestureOverlayView.OnGesturingListener listener) { throw new RuntimeException("Stub!"); }
public  void removeAllOnGesturingListeners() { throw new RuntimeException("Stub!"); }
public  boolean isGesturing() { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void clear(boolean animated) { throw new RuntimeException("Stub!"); }
public  void cancelClearAnimation() { throw new RuntimeException("Stub!"); }
public  void cancelGesture() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  boolean dispatchTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public static final int GESTURE_STROKE_TYPE_SINGLE = 0;
public static final int GESTURE_STROKE_TYPE_MULTIPLE = 1;
public static final int ORIENTATION_HORIZONTAL = 0;
public static final int ORIENTATION_VERTICAL = 1;
}
