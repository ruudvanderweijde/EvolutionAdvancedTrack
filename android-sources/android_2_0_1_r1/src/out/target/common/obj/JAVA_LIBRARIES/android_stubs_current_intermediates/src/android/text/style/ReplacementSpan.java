package android.text.style;
public abstract class ReplacementSpan
  extends android.text.style.MetricAffectingSpan
{
public  ReplacementSpan() { throw new RuntimeException("Stub!"); }
public abstract  int getSize(android.graphics.Paint paint, java.lang.CharSequence text, int start, int end, android.graphics.Paint.FontMetricsInt fm);
public abstract  void draw(android.graphics.Canvas canvas, java.lang.CharSequence text, int start, int end, float x, int top, int y, int bottom, android.graphics.Paint paint);
public  void updateMeasureState(android.text.TextPaint p) { throw new RuntimeException("Stub!"); }
public  void updateDrawState(android.text.TextPaint ds) { throw new RuntimeException("Stub!"); }
}
