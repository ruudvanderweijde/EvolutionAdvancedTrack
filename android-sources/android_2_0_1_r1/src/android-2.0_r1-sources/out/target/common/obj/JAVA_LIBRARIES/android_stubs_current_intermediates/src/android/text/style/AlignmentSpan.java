package android.text.style;
public interface AlignmentSpan
  extends android.text.style.ParagraphStyle
{
public static class Standard
  implements android.text.style.AlignmentSpan, android.text.ParcelableSpan
{
public  Standard(android.text.Layout.Alignment align) { throw new RuntimeException("Stub!"); }
public  Standard(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public  int getSpanTypeId() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  android.text.Layout.Alignment getAlignment() { throw new RuntimeException("Stub!"); }
}
public abstract  android.text.Layout.Alignment getAlignment();
}
