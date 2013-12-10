package android.text.style;
public interface LeadingMarginSpan
  extends android.text.style.ParagraphStyle
{
public static interface LeadingMarginSpan2
  extends android.text.style.LeadingMarginSpan, android.text.style.WrapTogetherSpan
{
public abstract  int getLeadingMarginLineCount();
}
public static class Standard
  implements android.text.style.LeadingMarginSpan, android.text.ParcelableSpan
{
public  Standard(int first, int rest) { throw new RuntimeException("Stub!"); }
public  Standard(int every) { throw new RuntimeException("Stub!"); }
public  Standard(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public  int getSpanTypeId() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int getLeadingMargin(boolean first) { throw new RuntimeException("Stub!"); }
public  void drawLeadingMargin(android.graphics.Canvas c, android.graphics.Paint p, int x, int dir, int top, int baseline, int bottom, java.lang.CharSequence text, int start, int end, boolean first, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
}
public abstract  int getLeadingMargin(boolean first);
public abstract  void drawLeadingMargin(android.graphics.Canvas c, android.graphics.Paint p, int x, int dir, int top, int baseline, int bottom, java.lang.CharSequence text, int start, int end, boolean first, android.text.Layout layout);
}
