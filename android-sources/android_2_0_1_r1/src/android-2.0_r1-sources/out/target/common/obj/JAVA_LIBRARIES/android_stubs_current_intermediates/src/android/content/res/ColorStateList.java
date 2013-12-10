package android.content.res;
public class ColorStateList
  implements android.os.Parcelable
{
public  ColorStateList(int[][] states, int[] colors) { throw new RuntimeException("Stub!"); }
public static  android.content.res.ColorStateList valueOf(int color) { throw new RuntimeException("Stub!"); }
public static  android.content.res.ColorStateList createFromXml(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList withAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
public  int getColorForState(int[] stateSet, int defaultColor) { throw new RuntimeException("Stub!"); }
public  int getDefaultColor() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.res.ColorStateList> CREATOR;
static { CREATOR = null; }
}
