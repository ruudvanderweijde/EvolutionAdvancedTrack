package android.content.pm;
public class ConfigurationInfo
  implements android.os.Parcelable
{
public  ConfigurationInfo() { throw new RuntimeException("Stub!"); }
public  ConfigurationInfo(android.content.pm.ConfigurationInfo orig) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.String getGlEsVersion() { throw new RuntimeException("Stub!"); }
public int reqTouchScreen;
public int reqKeyboardType;
public int reqNavigation;
public static final int INPUT_FEATURE_HARD_KEYBOARD = 1;
public static final int INPUT_FEATURE_FIVE_WAY_NAV = 2;
public int reqInputFeatures;
public static final int GL_ES_VERSION_UNDEFINED = 0;
public int reqGlEsVersion;
public static final android.os.Parcelable.Creator<android.content.pm.ConfigurationInfo> CREATOR;
static { CREATOR = null; }
}
