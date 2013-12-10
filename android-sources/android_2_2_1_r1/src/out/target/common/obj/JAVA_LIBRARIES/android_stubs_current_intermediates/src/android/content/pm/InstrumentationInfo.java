package android.content.pm;
public class InstrumentationInfo
  extends android.content.pm.PackageItemInfo
  implements android.os.Parcelable
{
public  InstrumentationInfo() { throw new RuntimeException("Stub!"); }
public  InstrumentationInfo(android.content.pm.InstrumentationInfo orig) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public java.lang.String targetPackage;
public java.lang.String sourceDir;
public java.lang.String publicSourceDir;
public java.lang.String dataDir;
public boolean handleProfiling;
public boolean functionalTest;
public static final android.os.Parcelable.Creator<android.content.pm.InstrumentationInfo> CREATOR;
static { CREATOR = null; }
}
