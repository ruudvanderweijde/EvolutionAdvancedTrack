package android.content.pm;
public class PermissionInfo
  extends android.content.pm.PackageItemInfo
  implements android.os.Parcelable
{
public  PermissionInfo() { throw new RuntimeException("Stub!"); }
public  PermissionInfo(android.content.pm.PermissionInfo orig) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadDescription(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final int PROTECTION_NORMAL = 0;
public static final int PROTECTION_DANGEROUS = 1;
public static final int PROTECTION_SIGNATURE = 2;
public static final int PROTECTION_SIGNATURE_OR_SYSTEM = 3;
public java.lang.String group;
public int descriptionRes;
public java.lang.CharSequence nonLocalizedDescription;
public int protectionLevel;
public static final android.os.Parcelable.Creator<android.content.pm.PermissionInfo> CREATOR;
static { CREATOR = null; }
}
