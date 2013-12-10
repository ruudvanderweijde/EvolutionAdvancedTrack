package android.widget;
public class SeekBar
  extends android.widget.AbsSeekBar
{
public static interface OnSeekBarChangeListener
{
public abstract  void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser);
public abstract  void onStartTrackingTouch(android.widget.SeekBar seekBar);
public abstract  void onStopTrackingTouch(android.widget.SeekBar seekBar);
}
public  SeekBar(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  SeekBar(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  SeekBar(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setOnSeekBarChangeListener(android.widget.SeekBar.OnSeekBarChangeListener l) { throw new RuntimeException("Stub!"); }
}
