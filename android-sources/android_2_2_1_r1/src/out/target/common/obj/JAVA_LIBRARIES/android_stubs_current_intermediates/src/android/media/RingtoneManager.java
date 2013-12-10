package android.media;
public class RingtoneManager
{
public  RingtoneManager(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  RingtoneManager(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void setType(int type) { throw new RuntimeException("Stub!"); }
public  int inferStreamType() { throw new RuntimeException("Stub!"); }
public  void setStopPreviousRingtone(boolean stopPreviousRingtone) { throw new RuntimeException("Stub!"); }
public  boolean getStopPreviousRingtone() { throw new RuntimeException("Stub!"); }
public  void stopPreviousRingtone() { throw new RuntimeException("Stub!"); }
public  boolean getIncludeDrm() { throw new RuntimeException("Stub!"); }
public  void setIncludeDrm(boolean includeDrm) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor getCursor() { throw new RuntimeException("Stub!"); }
public  android.media.Ringtone getRingtone(int position) { throw new RuntimeException("Stub!"); }
public  android.net.Uri getRingtoneUri(int position) { throw new RuntimeException("Stub!"); }
public  int getRingtonePosition(android.net.Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getValidRingtoneUri(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  android.media.Ringtone getRingtone(android.content.Context context, android.net.Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getActualDefaultRingtoneUri(android.content.Context context, int type) { throw new RuntimeException("Stub!"); }
public static  void setActualDefaultRingtoneUri(android.content.Context context, int type, android.net.Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
public static  boolean isDefault(android.net.Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
public static  int getDefaultType(android.net.Uri defaultRingtoneUri) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getDefaultUri(int type) { throw new RuntimeException("Stub!"); }
public static final int TYPE_RINGTONE = 1;
public static final int TYPE_NOTIFICATION = 2;
public static final int TYPE_ALARM = 4;
public static final int TYPE_ALL = 7;
public static final java.lang.String ACTION_RINGTONE_PICKER = "android.intent.action.RINGTONE_PICKER";
public static final java.lang.String EXTRA_RINGTONE_SHOW_DEFAULT = "android.intent.extra.ringtone.SHOW_DEFAULT";
public static final java.lang.String EXTRA_RINGTONE_SHOW_SILENT = "android.intent.extra.ringtone.SHOW_SILENT";
public static final java.lang.String EXTRA_RINGTONE_INCLUDE_DRM = "android.intent.extra.ringtone.INCLUDE_DRM";
public static final java.lang.String EXTRA_RINGTONE_EXISTING_URI = "android.intent.extra.ringtone.EXISTING_URI";
public static final java.lang.String EXTRA_RINGTONE_DEFAULT_URI = "android.intent.extra.ringtone.DEFAULT_URI";
public static final java.lang.String EXTRA_RINGTONE_TYPE = "android.intent.extra.ringtone.TYPE";
public static final java.lang.String EXTRA_RINGTONE_TITLE = "android.intent.extra.ringtone.TITLE";
public static final java.lang.String EXTRA_RINGTONE_PICKED_URI = "android.intent.extra.ringtone.PICKED_URI";
public static final int ID_COLUMN_INDEX = 0;
public static final int TITLE_COLUMN_INDEX = 1;
public static final int URI_COLUMN_INDEX = 2;
}
