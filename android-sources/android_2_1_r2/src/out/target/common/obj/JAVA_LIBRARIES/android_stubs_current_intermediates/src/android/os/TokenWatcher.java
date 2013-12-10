package android.os;
public abstract class TokenWatcher
{
public  TokenWatcher(android.os.Handler h, java.lang.String tag) { throw new RuntimeException("Stub!"); }
public abstract  void acquired();
public abstract  void released();
public  void acquire(android.os.IBinder token, java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  void cleanup(android.os.IBinder token, boolean unlink) { throw new RuntimeException("Stub!"); }
public  void release(android.os.IBinder token) { throw new RuntimeException("Stub!"); }
public  boolean isAcquired() { throw new RuntimeException("Stub!"); }
public  void dump() { throw new RuntimeException("Stub!"); }
}
