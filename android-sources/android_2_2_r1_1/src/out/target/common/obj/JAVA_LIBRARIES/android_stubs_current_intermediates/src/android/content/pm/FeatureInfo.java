package android.content.pm;
public class FeatureInfo
  implements android.os.Parcelable
{
public  FeatureInfo() { throw new RuntimeException("Stub!"); }
public  FeatureInfo(android.content.pm.FeatureInfo orig) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.String getGlEsVersion() { throw new RuntimeException("Stub!"); }
public java.lang.String name;
public static final int GL_ES_VERSION_UNDEFINED = 0;
public int reqGlEsVersion;
public static final int FLAG_REQUIRED = 1;
public int flags;
public static final android.os.Parcelable.Creator<android.content.pm.FeatureInfo> CREATOR;
static { CREATOR = null; }
}
