package android.os;
public final class SystemClock
{
SystemClock() { throw new RuntimeException("Stub!"); }
public static  void sleep(long ms) { throw new RuntimeException("Stub!"); }
public static native  boolean setCurrentTimeMillis(long millis);
public static native  long uptimeMillis();
public static native  long elapsedRealtime();
public static native  long currentThreadTimeMillis();
}
