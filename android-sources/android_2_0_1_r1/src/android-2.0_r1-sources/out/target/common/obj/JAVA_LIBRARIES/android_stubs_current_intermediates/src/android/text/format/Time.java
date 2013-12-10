package android.text.format;
public class Time
{
public  Time(java.lang.String timezone) { throw new RuntimeException("Stub!"); }
public  Time() { throw new RuntimeException("Stub!"); }
public  Time(android.text.format.Time other) { throw new RuntimeException("Stub!"); }
public native  long normalize(boolean ignoreDst);
public native  void switchTimezone(java.lang.String timezone);
public  int getActualMaximum(int field) { throw new RuntimeException("Stub!"); }
public  void clear(java.lang.String timezone) { throw new RuntimeException("Stub!"); }
public static native  int compare(android.text.format.Time a, android.text.format.Time b);
public  java.lang.String format(java.lang.String format) { throw new RuntimeException("Stub!"); }
public native  java.lang.String toString();
public  boolean parse(java.lang.String s) { throw new RuntimeException("Stub!"); }
public  boolean parse3339(java.lang.String s) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getCurrentTimezone() { throw new RuntimeException("Stub!"); }
public native  void setToNow();
public native  long toMillis(boolean ignoreDst);
public native  void set(long millis);
public native  java.lang.String format2445();
public  void set(android.text.format.Time that) { throw new RuntimeException("Stub!"); }
public  void set(int second, int minute, int hour, int monthDay, int month, int year) { throw new RuntimeException("Stub!"); }
public  void set(int monthDay, int month, int year) { throw new RuntimeException("Stub!"); }
public  boolean before(android.text.format.Time that) { throw new RuntimeException("Stub!"); }
public  boolean after(android.text.format.Time that) { throw new RuntimeException("Stub!"); }
public  int getWeekNumber() { throw new RuntimeException("Stub!"); }
public  java.lang.String format3339(boolean allDay) { throw new RuntimeException("Stub!"); }
public static  boolean isEpoch(android.text.format.Time time) { throw new RuntimeException("Stub!"); }
public static  int getJulianDay(long millis, long gmtoff) { throw new RuntimeException("Stub!"); }
public  long setJulianDay(int julianDay) { throw new RuntimeException("Stub!"); }
public static final java.lang.String TIMEZONE_UTC = "UTC";
public static final int EPOCH_JULIAN_DAY = 2440588;
public boolean allDay;
public int second;
public int minute;
public int hour;
public int monthDay;
public int month;
public int year;
public int weekDay;
public int yearDay;
public int isDst;
public long gmtoff;
public java.lang.String timezone;
public static final int SECOND = 1;
public static final int MINUTE = 2;
public static final int HOUR = 3;
public static final int MONTH_DAY = 4;
public static final int MONTH = 5;
public static final int YEAR = 6;
public static final int WEEK_DAY = 7;
public static final int YEAR_DAY = 8;
public static final int WEEK_NUM = 9;
public static final int SUNDAY = 0;
public static final int MONDAY = 1;
public static final int TUESDAY = 2;
public static final int WEDNESDAY = 3;
public static final int THURSDAY = 4;
public static final int FRIDAY = 5;
public static final int SATURDAY = 6;
}
