package android.content.res;
public final class Configuration
  implements android.os.Parcelable, java.lang.Comparable<android.content.res.Configuration>
{
public  Configuration() { throw new RuntimeException("Stub!"); }
public  Configuration(android.content.res.Configuration o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void setToDefaults() { throw new RuntimeException("Stub!"); }
public  int updateFrom(android.content.res.Configuration delta) { throw new RuntimeException("Stub!"); }
public  int diff(android.content.res.Configuration delta) { throw new RuntimeException("Stub!"); }
public static  boolean needNewResources(int configChanges, int interestingChanges) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int compareTo(android.content.res.Configuration that) { throw new RuntimeException("Stub!"); }
public  boolean equals(android.content.res.Configuration that) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object that) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public float fontScale;
public int mcc;
public int mnc;
public java.util.Locale locale;
public static final int SCREENLAYOUT_SIZE_MASK = 15;
public static final int SCREENLAYOUT_SIZE_UNDEFINED = 0;
public static final int SCREENLAYOUT_SIZE_SMALL = 1;
public static final int SCREENLAYOUT_SIZE_NORMAL = 2;
public static final int SCREENLAYOUT_SIZE_LARGE = 3;
public static final int SCREENLAYOUT_LONG_MASK = 48;
public static final int SCREENLAYOUT_LONG_UNDEFINED = 0;
public static final int SCREENLAYOUT_LONG_NO = 16;
public static final int SCREENLAYOUT_LONG_YES = 32;
public int screenLayout;
public static final int TOUCHSCREEN_UNDEFINED = 0;
public static final int TOUCHSCREEN_NOTOUCH = 1;
public static final int TOUCHSCREEN_STYLUS = 2;
public static final int TOUCHSCREEN_FINGER = 3;
public int touchscreen;
public static final int KEYBOARD_UNDEFINED = 0;
public static final int KEYBOARD_NOKEYS = 1;
public static final int KEYBOARD_QWERTY = 2;
public static final int KEYBOARD_12KEY = 3;
public int keyboard;
public static final int KEYBOARDHIDDEN_UNDEFINED = 0;
public static final int KEYBOARDHIDDEN_NO = 1;
public static final int KEYBOARDHIDDEN_YES = 2;
public int keyboardHidden;
public static final int HARDKEYBOARDHIDDEN_UNDEFINED = 0;
public static final int HARDKEYBOARDHIDDEN_NO = 1;
public static final int HARDKEYBOARDHIDDEN_YES = 2;
public int hardKeyboardHidden;
public static final int NAVIGATION_UNDEFINED = 0;
public static final int NAVIGATION_NONAV = 1;
public static final int NAVIGATION_DPAD = 2;
public static final int NAVIGATION_TRACKBALL = 3;
public static final int NAVIGATION_WHEEL = 4;
public int navigation;
public static final int ORIENTATION_UNDEFINED = 0;
public static final int ORIENTATION_PORTRAIT = 1;
public static final int ORIENTATION_LANDSCAPE = 2;
public static final int ORIENTATION_SQUARE = 3;
public int orientation;
public static final android.os.Parcelable.Creator<android.content.res.Configuration> CREATOR;
static { CREATOR = null; }
}
