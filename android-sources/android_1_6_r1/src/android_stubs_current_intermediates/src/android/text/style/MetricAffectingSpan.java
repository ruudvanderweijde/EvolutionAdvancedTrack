package android.text.style;
public abstract class MetricAffectingSpan
  extends android.text.style.CharacterStyle
  implements android.text.style.UpdateLayout
{
public  MetricAffectingSpan() { throw new RuntimeException("Stub!"); }
public abstract  void updateMeasureState(android.text.TextPaint p);
public  android.text.style.MetricAffectingSpan getUnderlying() { throw new RuntimeException("Stub!"); }
}
