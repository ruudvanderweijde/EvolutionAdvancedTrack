package android.widget;
public class RatingBar
  extends android.widget.AbsSeekBar
{
public static interface OnRatingBarChangeListener
{
public abstract  void onRatingChanged(android.widget.RatingBar ratingBar, float rating, boolean fromUser);
}
public  RatingBar(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  RatingBar(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  RatingBar(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setOnRatingBarChangeListener(android.widget.RatingBar.OnRatingBarChangeListener listener) { throw new RuntimeException("Stub!"); }
public  android.widget.RatingBar.OnRatingBarChangeListener getOnRatingBarChangeListener() { throw new RuntimeException("Stub!"); }
public  void setIsIndicator(boolean isIndicator) { throw new RuntimeException("Stub!"); }
public  boolean isIndicator() { throw new RuntimeException("Stub!"); }
public  void setNumStars(int numStars) { throw new RuntimeException("Stub!"); }
public  int getNumStars() { throw new RuntimeException("Stub!"); }
public  void setRating(float rating) { throw new RuntimeException("Stub!"); }
public  float getRating() { throw new RuntimeException("Stub!"); }
public  void setStepSize(float stepSize) { throw new RuntimeException("Stub!"); }
public  float getStepSize() { throw new RuntimeException("Stub!"); }
protected synchronized  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
public synchronized  void setMax(int max) { throw new RuntimeException("Stub!"); }
}
