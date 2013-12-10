package android.text.style;
public interface LineHeightSpan
  extends android.text.style.ParagraphStyle, android.text.style.WrapTogetherSpan
{
public static interface WithDensity
  extends android.text.style.LineHeightSpan
{
public abstract  void chooseHeight(java.lang.CharSequence text, int start, int end, int spanstartv, int v, android.graphics.Paint.FontMetricsInt fm, android.text.TextPaint paint);
}
public abstract  void chooseHeight(java.lang.CharSequence text, int start, int end, int spanstartv, int v, android.graphics.Paint.FontMetricsInt fm);
}
