package android.content.pm;
public class ComponentInfo
  extends android.content.pm.PackageItemInfo
{
public  ComponentInfo() { throw new RuntimeException("Stub!"); }
public  ComponentInfo(android.content.pm.ComponentInfo orig) { throw new RuntimeException("Stub!"); }
protected  ComponentInfo(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadLabel(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public final  int getIconResource() { throw new RuntimeException("Stub!"); }
protected  void dumpFront(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
protected  void dumpBack(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public android.content.pm.ApplicationInfo applicationInfo;
public java.lang.String processName;
public int descriptionRes;
public boolean enabled;
public boolean exported;
}
