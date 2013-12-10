package android.text;
public class BoringLayout
  extends android.text.Layout
  implements android.text.TextUtils.EllipsizeCallback
{
public static class Metrics
  extends android.graphics.Paint.FontMetricsInt
{
public  Metrics() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public int width;
}
public  BoringLayout(java.lang.CharSequence source, android.text.TextPaint paint, int outerwidth, android.text.Layout.Alignment align, float spacingmult, float spacingadd, android.text.BoringLayout.Metrics metrics, boolean includepad) { super((java.lang.CharSequence)null,(android.text.TextPaint)null,0,(android.text.Layout.Alignment)null,0,0); throw new RuntimeException("Stub!"); }
public  BoringLayout(java.lang.CharSequence source, android.text.TextPaint paint, int outerwidth, android.text.Layout.Alignment align, float spacingmult, float spacingadd, android.text.BoringLayout.Metrics metrics, boolean includepad, android.text.TextUtils.TruncateAt ellipsize, int ellipsizedWidth) { super((java.lang.CharSequence)null,(android.text.TextPaint)null,0,(android.text.Layout.Alignment)null,0,0); throw new RuntimeException("Stub!"); }
public static  android.text.BoringLayout make(java.lang.CharSequence source, android.text.TextPaint paint, int outerwidth, android.text.Layout.Alignment align, float spacingmult, float spacingadd, android.text.BoringLayout.Metrics metrics, boolean includepad) { throw new RuntimeException("Stub!"); }
public static  android.text.BoringLayout make(java.lang.CharSequence source, android.text.TextPaint paint, int outerwidth, android.text.Layout.Alignment align, float spacingmult, float spacingadd, android.text.BoringLayout.Metrics metrics, boolean includepad, android.text.TextUtils.TruncateAt ellipsize, int ellipsizedWidth) { throw new RuntimeException("Stub!"); }
public  android.text.BoringLayout replaceOrMake(java.lang.CharSequence source, android.text.TextPaint paint, int outerwidth, android.text.Layout.Alignment align, float spacingmult, float spacingadd, android.text.BoringLayout.Metrics metrics, boolean includepad) { throw new RuntimeException("Stub!"); }
public  android.text.BoringLayout replaceOrMake(java.lang.CharSequence source, android.text.TextPaint paint, int outerwidth, android.text.Layout.Alignment align, float spacingmult, float spacingadd, android.text.BoringLayout.Metrics metrics, boolean includepad, android.text.TextUtils.TruncateAt ellipsize, int ellipsizedWidth) { throw new RuntimeException("Stub!"); }
public static  android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence text, android.text.TextPaint paint) { throw new RuntimeException("Stub!"); }
public static  android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence text, android.text.TextPaint paint, android.text.BoringLayout.Metrics metrics) { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  int getLineCount() { throw new RuntimeException("Stub!"); }
public  int getLineTop(int line) { throw new RuntimeException("Stub!"); }
public  int getLineDescent(int line) { throw new RuntimeException("Stub!"); }
public  int getLineStart(int line) { throw new RuntimeException("Stub!"); }
public  int getParagraphDirection(int line) { throw new RuntimeException("Stub!"); }
public  boolean getLineContainsTab(int line) { throw new RuntimeException("Stub!"); }
public  float getLineMax(int line) { throw new RuntimeException("Stub!"); }
public final  android.text.Layout.Directions getLineDirections(int line) { throw new RuntimeException("Stub!"); }
public  int getTopPadding() { throw new RuntimeException("Stub!"); }
public  int getBottomPadding() { throw new RuntimeException("Stub!"); }
public  int getEllipsisCount(int line) { throw new RuntimeException("Stub!"); }
public  int getEllipsisStart(int line) { throw new RuntimeException("Stub!"); }
public  int getEllipsizedWidth() { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas c, android.graphics.Path highlight, android.graphics.Paint highlightpaint, int cursorOffset) { throw new RuntimeException("Stub!"); }
public  void ellipsized(int start, int end) { throw new RuntimeException("Stub!"); }
}
