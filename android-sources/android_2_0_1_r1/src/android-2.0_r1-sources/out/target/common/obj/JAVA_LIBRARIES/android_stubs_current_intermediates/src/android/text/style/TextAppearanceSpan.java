package android.text.style;
public class TextAppearanceSpan
  extends android.text.style.MetricAffectingSpan
  implements android.text.ParcelableSpan
{
public  TextAppearanceSpan(android.content.Context context, int appearance) { throw new RuntimeException("Stub!"); }
public  TextAppearanceSpan(android.content.Context context, int appearance, int colorList) { throw new RuntimeException("Stub!"); }
public  TextAppearanceSpan(java.lang.String family, int style, int size, android.content.res.ColorStateList color, android.content.res.ColorStateList linkColor) { throw new RuntimeException("Stub!"); }
public  TextAppearanceSpan(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public  int getSpanTypeId() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String getFamily() { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getTextColor() { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getLinkTextColor() { throw new RuntimeException("Stub!"); }
public  int getTextSize() { throw new RuntimeException("Stub!"); }
public  int getTextStyle() { throw new RuntimeException("Stub!"); }
public  void updateDrawState(android.text.TextPaint ds) { throw new RuntimeException("Stub!"); }
public  void updateMeasureState(android.text.TextPaint ds) { throw new RuntimeException("Stub!"); }
}
