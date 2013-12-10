package android.app;
public abstract class IntentService
  extends android.app.Service
{
public  IntentService(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void setIntentRedelivery(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onStart(android.content.Intent intent, int startId) { throw new RuntimeException("Stub!"); }
public  int onStartCommand(android.content.Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
protected abstract  void onHandleIntent(android.content.Intent intent);
}
