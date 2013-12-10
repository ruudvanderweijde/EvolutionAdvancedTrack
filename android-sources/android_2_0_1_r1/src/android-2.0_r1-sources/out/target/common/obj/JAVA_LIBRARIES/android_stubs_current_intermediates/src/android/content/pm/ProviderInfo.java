package android.content.pm;
public final class ProviderInfo
  extends android.content.pm.ComponentInfo
  implements android.os.Parcelable
{
public  ProviderInfo() { throw new RuntimeException("Stub!"); }
public  ProviderInfo(android.content.pm.ProviderInfo orig) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public java.lang.String authority;
public java.lang.String readPermission;
public java.lang.String writePermission;
public boolean grantUriPermissions;
public android.os.PatternMatcher[] uriPermissionPatterns = null;
public android.content.pm.PathPermission[] pathPermissions = null;
public boolean multiprocess;
public int initOrder;
public boolean isSyncable;
public static final android.os.Parcelable.Creator<android.content.pm.ProviderInfo> CREATOR;
static { CREATOR = null; }
}
