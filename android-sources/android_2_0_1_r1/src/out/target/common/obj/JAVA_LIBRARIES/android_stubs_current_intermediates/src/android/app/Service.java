package android.app;
public abstract class Service
  extends android.content.ContextWrapper
  implements android.content.ComponentCallbacks
{
public  Service() { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public final  android.app.Application getApplication() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onStart(android.content.Intent intent, int startId) { throw new RuntimeException("Stub!"); }
public  int onStartCommand(android.content.Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void onLowMemory() { throw new RuntimeException("Stub!"); }
public abstract  android.os.IBinder onBind(android.content.Intent intent);
public  boolean onUnbind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onRebind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public final  void stopSelf() { throw new RuntimeException("Stub!"); }
public final  void stopSelf(int startId) { throw new RuntimeException("Stub!"); }
public final  boolean stopSelfResult(int startId) { throw new RuntimeException("Stub!"); }
public final  void setForeground(boolean isForeground) { throw new RuntimeException("Stub!"); }
public final  void startForeground(int id, android.app.Notification notification) { throw new RuntimeException("Stub!"); }
public final  void stopForeground(boolean removeNotification) { throw new RuntimeException("Stub!"); }
protected  void dump(java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int START_CONTINUATION_MASK = 15;
public static final int START_STICKY_COMPATIBILITY = 0;
public static final int START_STICKY = 1;
public static final int START_NOT_STICKY = 2;
public static final int START_REDELIVER_INTENT = 3;
public static final int START_FLAG_REDELIVERY = 1;
public static final int START_FLAG_RETRY = 2;
}
