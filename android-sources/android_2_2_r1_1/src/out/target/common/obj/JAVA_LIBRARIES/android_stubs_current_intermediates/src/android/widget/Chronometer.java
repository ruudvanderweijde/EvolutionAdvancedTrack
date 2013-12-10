package android.widget;
@android.widget.RemoteViews.RemoteView()
public class Chronometer
  extends android.widget.TextView
{
public static interface OnChronometerTickListener
{
public abstract  void onChronometerTick(android.widget.Chronometer chronometer);
}
public  Chronometer(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  Chronometer(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  Chronometer(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setBase(long base) { throw new RuntimeException("Stub!"); }
public  long getBase() { throw new RuntimeException("Stub!"); }
public  void setFormat(java.lang.String format) { throw new RuntimeException("Stub!"); }
public  java.lang.String getFormat() { throw new RuntimeException("Stub!"); }
public  void setOnChronometerTickListener(android.widget.Chronometer.OnChronometerTickListener listener) { throw new RuntimeException("Stub!"); }
public  android.widget.Chronometer.OnChronometerTickListener getOnChronometerTickListener() { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public  void stop() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
protected  void onWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
}
