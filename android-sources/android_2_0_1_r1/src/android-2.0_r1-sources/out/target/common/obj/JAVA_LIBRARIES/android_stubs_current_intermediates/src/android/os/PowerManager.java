package android.os;
public class PowerManager
{
public class WakeLock
{
WakeLock() { throw new RuntimeException("Stub!"); }
public  void setReferenceCounted(boolean value) { throw new RuntimeException("Stub!"); }
public  void acquire() { throw new RuntimeException("Stub!"); }
public  void acquire(long timeout) { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  boolean isHeld() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
PowerManager() { throw new RuntimeException("Stub!"); }
public  android.os.PowerManager.WakeLock newWakeLock(int flags, java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  void userActivity(long when, boolean noChangeLights) { throw new RuntimeException("Stub!"); }
public  void goToSleep(long time) { throw new RuntimeException("Stub!"); }
public static final int PARTIAL_WAKE_LOCK = 1;
public static final int FULL_WAKE_LOCK = 26;
public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;
public static final int SCREEN_DIM_WAKE_LOCK = 6;
public static final int ACQUIRE_CAUSES_WAKEUP = 268435456;
public static final int ON_AFTER_RELEASE = 536870912;
}
