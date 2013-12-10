package android.content.pm;
public class ResolveInfo
  implements android.os.Parcelable
{
public static class DisplayNameComparator
  implements java.util.Comparator<android.content.pm.ResolveInfo>
{
public  DisplayNameComparator(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public final  int compare(android.content.pm.ResolveInfo a, android.content.pm.ResolveInfo b) { throw new RuntimeException("Stub!"); }
}
public  ResolveInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadLabel(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public final  int getIconResource() { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public android.content.pm.ActivityInfo activityInfo;
public android.content.pm.ServiceInfo serviceInfo;
public android.content.IntentFilter filter;
public int priority;
public int preferredOrder;
public int match;
public int specificIndex;
public boolean isDefault;
public int labelRes;
public java.lang.CharSequence nonLocalizedLabel;
public int icon;
public java.lang.String resolvePackageName;
public static final android.os.Parcelable.Creator<android.content.pm.ResolveInfo> CREATOR;
static { CREATOR = null; }
}
