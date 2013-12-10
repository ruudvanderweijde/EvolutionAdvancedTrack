package android.graphics;
public class Paint
{
public static enum Style
{
FILL(),
FILL_AND_STROKE(),
STROKE();
}
public static enum Cap
{
BUTT(),
ROUND(),
SQUARE();
}
public static enum Join
{
BEVEL(),
MITER(),
ROUND();
}
public static enum Align
{
CENTER(),
LEFT(),
RIGHT();
}
public static class FontMetrics
{
public  FontMetrics() { throw new RuntimeException("Stub!"); }
public float top;
public float ascent;
public float descent;
public float bottom;
public float leading;
}
public static class FontMetricsInt
{
public  FontMetricsInt() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public int top;
public int ascent;
public int descent;
public int bottom;
public int leading;
}
public  Paint() { throw new RuntimeException("Stub!"); }
public  Paint(int flags) { throw new RuntimeException("Stub!"); }
public  Paint(android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void set(android.graphics.Paint src) { throw new RuntimeException("Stub!"); }
public native  int getFlags();
public native  void setFlags(int flags);
public final  boolean isAntiAlias() { throw new RuntimeException("Stub!"); }
public native  void setAntiAlias(boolean aa);
public final  boolean isDither() { throw new RuntimeException("Stub!"); }
public native  void setDither(boolean dither);
public final  boolean isLinearText() { throw new RuntimeException("Stub!"); }
public native  void setLinearText(boolean linearText);
public final  boolean isSubpixelText() { throw new RuntimeException("Stub!"); }
public native  void setSubpixelText(boolean subpixelText);
public final  boolean isUnderlineText() { throw new RuntimeException("Stub!"); }
public native  void setUnderlineText(boolean underlineText);
public final  boolean isStrikeThruText() { throw new RuntimeException("Stub!"); }
public native  void setStrikeThruText(boolean strikeThruText);
public final  boolean isFakeBoldText() { throw new RuntimeException("Stub!"); }
public native  void setFakeBoldText(boolean fakeBoldText);
public final  boolean isFilterBitmap() { throw new RuntimeException("Stub!"); }
public native  void setFilterBitmap(boolean filter);
public  android.graphics.Paint.Style getStyle() { throw new RuntimeException("Stub!"); }
public  void setStyle(android.graphics.Paint.Style style) { throw new RuntimeException("Stub!"); }
public native  int getColor();
public native  void setColor(int color);
public native  int getAlpha();
public native  void setAlpha(int a);
public  void setARGB(int a, int r, int g, int b) { throw new RuntimeException("Stub!"); }
public native  float getStrokeWidth();
public native  void setStrokeWidth(float width);
public native  float getStrokeMiter();
public native  void setStrokeMiter(float miter);
public  android.graphics.Paint.Cap getStrokeCap() { throw new RuntimeException("Stub!"); }
public  void setStrokeCap(android.graphics.Paint.Cap cap) { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint.Join getStrokeJoin() { throw new RuntimeException("Stub!"); }
public  void setStrokeJoin(android.graphics.Paint.Join join) { throw new RuntimeException("Stub!"); }
public  boolean getFillPath(android.graphics.Path src, android.graphics.Path dst) { throw new RuntimeException("Stub!"); }
public  android.graphics.Shader getShader() { throw new RuntimeException("Stub!"); }
public  android.graphics.Shader setShader(android.graphics.Shader shader) { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorFilter setColorFilter(android.graphics.ColorFilter filter) { throw new RuntimeException("Stub!"); }
public  android.graphics.Xfermode getXfermode() { throw new RuntimeException("Stub!"); }
public  android.graphics.Xfermode setXfermode(android.graphics.Xfermode xfermode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PathEffect getPathEffect() { throw new RuntimeException("Stub!"); }
public  android.graphics.PathEffect setPathEffect(android.graphics.PathEffect effect) { throw new RuntimeException("Stub!"); }
public  android.graphics.MaskFilter getMaskFilter() { throw new RuntimeException("Stub!"); }
public  android.graphics.MaskFilter setMaskFilter(android.graphics.MaskFilter maskfilter) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface getTypeface() { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface setTypeface(android.graphics.Typeface typeface) { throw new RuntimeException("Stub!"); }
public  android.graphics.Rasterizer getRasterizer() { throw new RuntimeException("Stub!"); }
public  android.graphics.Rasterizer setRasterizer(android.graphics.Rasterizer rasterizer) { throw new RuntimeException("Stub!"); }
public native  void setShadowLayer(float radius, float dx, float dy, int color);
public  void clearShadowLayer() { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint.Align getTextAlign() { throw new RuntimeException("Stub!"); }
public  void setTextAlign(android.graphics.Paint.Align align) { throw new RuntimeException("Stub!"); }
public native  float getTextSize();
public native  void setTextSize(float textSize);
public native  float getTextScaleX();
public native  void setTextScaleX(float scaleX);
public native  float getTextSkewX();
public native  void setTextSkewX(float skewX);
public native  float ascent();
public native  float descent();
public native  float getFontMetrics(android.graphics.Paint.FontMetrics metrics);
public  android.graphics.Paint.FontMetrics getFontMetrics() { throw new RuntimeException("Stub!"); }
public native  int getFontMetricsInt(android.graphics.Paint.FontMetricsInt fmi);
public  android.graphics.Paint.FontMetricsInt getFontMetricsInt() { throw new RuntimeException("Stub!"); }
public  float getFontSpacing() { throw new RuntimeException("Stub!"); }
public  float measureText(char[] text, int index, int count) { throw new RuntimeException("Stub!"); }
public  float measureText(java.lang.String text, int start, int end) { throw new RuntimeException("Stub!"); }
public  float measureText(java.lang.String text) { throw new RuntimeException("Stub!"); }
public  float measureText(java.lang.CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
public  int breakText(char[] text, int index, int count, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); }
public  int breakText(java.lang.CharSequence text, int start, int end, boolean measureForwards, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); }
public  int breakText(java.lang.String text, boolean measureForwards, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); }
public  int getTextWidths(char[] text, int index, int count, float[] widths) { throw new RuntimeException("Stub!"); }
public  int getTextWidths(java.lang.CharSequence text, int start, int end, float[] widths) { throw new RuntimeException("Stub!"); }
public  int getTextWidths(java.lang.String text, int start, int end, float[] widths) { throw new RuntimeException("Stub!"); }
public  int getTextWidths(java.lang.String text, float[] widths) { throw new RuntimeException("Stub!"); }
public  void getTextPath(char[] text, int index, int count, float x, float y, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public  void getTextPath(java.lang.String text, int start, int end, float x, float y, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public  void getTextBounds(java.lang.String text, int start, int end, android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  void getTextBounds(char[] text, int index, int count, android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int ANTI_ALIAS_FLAG = 1;
public static final int FILTER_BITMAP_FLAG = 2;
public static final int DITHER_FLAG = 4;
public static final int UNDERLINE_TEXT_FLAG = 8;
public static final int STRIKE_THRU_TEXT_FLAG = 16;
public static final int FAKE_BOLD_TEXT_FLAG = 32;
public static final int LINEAR_TEXT_FLAG = 64;
public static final int SUBPIXEL_TEXT_FLAG = 128;
public static final int DEV_KERN_TEXT_FLAG = 256;
}
