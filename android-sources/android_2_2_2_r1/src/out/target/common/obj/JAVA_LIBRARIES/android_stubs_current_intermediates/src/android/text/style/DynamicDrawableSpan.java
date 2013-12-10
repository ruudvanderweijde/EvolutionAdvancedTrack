package android.text.style;
public abstract class DynamicDrawableSpan
  extends android.text.style.ReplacementSpan
{
public  DynamicDrawableSpan() { throw new RuntimeException("Stub!"); }
protected  DynamicDrawableSpan(int verticalAlignment) { throw new RuntimeException("Stub!"); }
public  int getVerticalAlignment() { throw new RuntimeException("Stub!"); }
public abstract  android.graphics.drawable.Drawable getDrawable();
public  int getSize(android.graphics.Paint paint, java.lang.CharSequence text, int start, int end, android.graphics.Paint.FontMetricsInt fm) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas, java.lang.CharSequence text, int start, int end, float x, int top, int y, int bottom, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public static final int ALIGN_BOTTOM = 0;
public static final int ALIGN_BASELINE = 1;
protected final int mVerticalAlignment;
}
