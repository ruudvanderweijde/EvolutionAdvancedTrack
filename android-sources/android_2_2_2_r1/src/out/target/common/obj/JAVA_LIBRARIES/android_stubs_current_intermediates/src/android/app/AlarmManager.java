package android.app;
public class AlarmManager
{
AlarmManager() { throw new RuntimeException("Stub!"); }
public  void set(int type, long triggerAtTime, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void setRepeating(int type, long triggerAtTime, long interval, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void setInexactRepeating(int type, long triggerAtTime, long interval, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void cancel(android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void setTime(long millis) { throw new RuntimeException("Stub!"); }
public  void setTimeZone(java.lang.String timeZone) { throw new RuntimeException("Stub!"); }
public static final int RTC_WAKEUP = 0;
public static final int RTC = 1;
public static final int ELAPSED_REALTIME_WAKEUP = 2;
public static final int ELAPSED_REALTIME = 3;
public static final long INTERVAL_FIFTEEN_MINUTES = 900000L;
public static final long INTERVAL_HALF_HOUR = 1800000L;
public static final long INTERVAL_HOUR = 3600000L;
public static final long INTERVAL_HALF_DAY = 43200000L;
public static final long INTERVAL_DAY = 86400000L;
}
