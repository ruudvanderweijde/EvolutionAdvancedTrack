package android.appwidget;
public class AppWidgetProviderInfo
  implements android.os.Parcelable
{
public  AppWidgetProviderInfo() { throw new RuntimeException("Stub!"); }
public  AppWidgetProviderInfo(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public android.content.ComponentName provider;
public int minWidth;
public int minHeight;
public int updatePeriodMillis;
public int initialLayout;
public android.content.ComponentName configure;
public java.lang.String label;
public int icon;
public static final android.os.Parcelable.Creator<android.appwidget.AppWidgetProviderInfo> CREATOR;
static { CREATOR = null; }
}
