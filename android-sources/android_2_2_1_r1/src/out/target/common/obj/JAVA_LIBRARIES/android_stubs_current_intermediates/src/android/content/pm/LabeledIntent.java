package android.content.pm;
public class LabeledIntent
  extends android.content.Intent
{
public  LabeledIntent(android.content.Intent origIntent, java.lang.String sourcePackage, int labelRes, int icon) { throw new RuntimeException("Stub!"); }
public  LabeledIntent(android.content.Intent origIntent, java.lang.String sourcePackage, java.lang.CharSequence nonLocalizedLabel, int icon) { throw new RuntimeException("Stub!"); }
public  LabeledIntent(java.lang.String sourcePackage, int labelRes, int icon) { throw new RuntimeException("Stub!"); }
public  LabeledIntent(java.lang.String sourcePackage, java.lang.CharSequence nonLocalizedLabel, int icon) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSourcePackage() { throw new RuntimeException("Stub!"); }
public  int getLabelResource() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getNonLocalizedLabel() { throw new RuntimeException("Stub!"); }
public  int getIconResource() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadLabel(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.LabeledIntent> CREATOR;
static { CREATOR = null; }
}
