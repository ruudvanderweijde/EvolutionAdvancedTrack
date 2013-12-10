package android.text.format;
public class DateUtils
{
public  DateUtils() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDayOfWeekString(int dayOfWeek, int abbrev) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getAMPMString(int ampm) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getMonthString(int month, int abbrev) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence getRelativeTimeSpanString(long startTime) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence getRelativeTimeSpanString(long time, long now, long minResolution) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence getRelativeTimeSpanString(long time, long now, long minResolution, int flags) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence getRelativeDateTimeString(android.content.Context c, long time, long minResolution, long transitionResolution, int flags) { throw new RuntimeException("Stub!"); }
public static  java.lang.String formatElapsedTime(long elapsedSeconds) { throw new RuntimeException("Stub!"); }
public static  java.lang.String formatElapsedTime(java.lang.StringBuilder recycle, long elapsedSeconds) { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence formatSameDayTime(long then, long now, int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); }
public static  boolean isToday(long when) { throw new RuntimeException("Stub!"); }
public static  java.lang.String formatDateRange(android.content.Context context, long startMillis, long endMillis, int flags) { throw new RuntimeException("Stub!"); }
public static  java.lang.String formatDateTime(android.content.Context context, long millis, int flags) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence getRelativeTimeSpanString(android.content.Context c, long millis, boolean withPreposition) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence getRelativeTimeSpanString(android.content.Context c, long millis) { throw new RuntimeException("Stub!"); }
public static final long SECOND_IN_MILLIS = 1000L;
public static final long MINUTE_IN_MILLIS = 60000L;
public static final long HOUR_IN_MILLIS = 3600000L;
public static final long DAY_IN_MILLIS = 86400000L;
public static final long WEEK_IN_MILLIS = 604800000L;
public static final long YEAR_IN_MILLIS = 31449600000L;
public static final int FORMAT_SHOW_TIME = 1;
public static final int FORMAT_SHOW_WEEKDAY = 2;
public static final int FORMAT_SHOW_YEAR = 4;
public static final int FORMAT_NO_YEAR = 8;
public static final int FORMAT_SHOW_DATE = 16;
public static final int FORMAT_NO_MONTH_DAY = 32;
public static final int FORMAT_12HOUR = 64;
public static final int FORMAT_24HOUR = 128;
public static final int FORMAT_CAP_AMPM = 256;
public static final int FORMAT_NO_NOON = 512;
public static final int FORMAT_CAP_NOON = 1024;
public static final int FORMAT_NO_MIDNIGHT = 2048;
public static final int FORMAT_CAP_MIDNIGHT = 4096;
public static final int FORMAT_UTC = 8192;
public static final int FORMAT_ABBREV_TIME = 16384;
public static final int FORMAT_ABBREV_WEEKDAY = 32768;
public static final int FORMAT_ABBREV_MONTH = 65536;
public static final int FORMAT_NUMERIC_DATE = 131072;
public static final int FORMAT_ABBREV_RELATIVE = 262144;
public static final int FORMAT_ABBREV_ALL = 524288;
public static final int FORMAT_CAP_NOON_MIDNIGHT = 5120;
public static final int FORMAT_NO_NOON_MIDNIGHT = 2560;
public static final java.lang.String HOUR_MINUTE_24 = "%H:%M";
public static final java.lang.String MONTH_FORMAT = "%B";
public static final java.lang.String ABBREV_MONTH_FORMAT = "%b";
public static final java.lang.String NUMERIC_MONTH_FORMAT = "%m";
public static final java.lang.String MONTH_DAY_FORMAT = "%-d";
public static final java.lang.String YEAR_FORMAT = "%Y";
public static final java.lang.String YEAR_FORMAT_TWO_DIGITS = "%g";
public static final java.lang.String WEEKDAY_FORMAT = "%A";
public static final java.lang.String ABBREV_WEEKDAY_FORMAT = "%a";
public static final int[] sameYearTable = null;
public static final int[] sameMonthTable = null;
public static final int LENGTH_LONG = 10;
public static final int LENGTH_MEDIUM = 20;
public static final int LENGTH_SHORT = 30;
public static final int LENGTH_SHORTER = 40;
public static final int LENGTH_SHORTEST = 50;
}
