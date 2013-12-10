package android.app;
public class Notification
  implements android.os.Parcelable
{
public  Notification() { throw new RuntimeException("Stub!"); }
public  Notification(int icon, java.lang.CharSequence tickerText, long when) { throw new RuntimeException("Stub!"); }
public  Notification(android.os.Parcel parcel) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  void setLatestEventInfo(android.content.Context context, java.lang.CharSequence contentTitle, java.lang.CharSequence contentText, android.app.PendingIntent contentIntent) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_ALL = -1;
public static final int DEFAULT_SOUND = 1;
public static final int DEFAULT_VIBRATE = 2;
public static final int DEFAULT_LIGHTS = 4;
public long when;
public int icon;
public int number;
public android.app.PendingIntent contentIntent;
public android.app.PendingIntent deleteIntent;
public java.lang.CharSequence tickerText;
public android.widget.RemoteViews contentView;
public int iconLevel;
public android.net.Uri sound;
public static final int STREAM_DEFAULT = -1;
public int audioStreamType;
public long[] vibrate = null;
public int ledARGB;
public int ledOnMS;
public int ledOffMS;
public int defaults;
public static final int FLAG_SHOW_LIGHTS = 1;
public static final int FLAG_ONGOING_EVENT = 2;
public static final int FLAG_INSISTENT = 4;
public static final int FLAG_ONLY_ALERT_ONCE = 8;
public static final int FLAG_AUTO_CANCEL = 16;
public static final int FLAG_NO_CLEAR = 32;
public int flags;
public static final android.os.Parcelable.Creator<android.app.Notification> CREATOR;
static { CREATOR = null; }
}
