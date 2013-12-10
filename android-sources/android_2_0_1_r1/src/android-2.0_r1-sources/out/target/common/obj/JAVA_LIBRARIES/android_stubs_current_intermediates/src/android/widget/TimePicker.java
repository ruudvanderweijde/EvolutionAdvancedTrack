package android.widget;
public class TimePicker
  extends android.widget.FrameLayout
{
public static interface OnTimeChangedListener
{
public abstract  void onTimeChanged(android.widget.TimePicker view, int hourOfDay, int minute);
}
public  TimePicker(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  TimePicker(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  TimePicker(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  void setOnTimeChangedListener(android.widget.TimePicker.OnTimeChangedListener onTimeChangedListener) { throw new RuntimeException("Stub!"); }
public  java.lang.Integer getCurrentHour() { throw new RuntimeException("Stub!"); }
public  void setCurrentHour(java.lang.Integer currentHour) { throw new RuntimeException("Stub!"); }
public  void setIs24HourView(java.lang.Boolean is24HourView) { throw new RuntimeException("Stub!"); }
public  boolean is24HourView() { throw new RuntimeException("Stub!"); }
public  java.lang.Integer getCurrentMinute() { throw new RuntimeException("Stub!"); }
public  void setCurrentMinute(java.lang.Integer currentMinute) { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
}
