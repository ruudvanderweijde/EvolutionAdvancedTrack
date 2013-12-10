package android.accessibilityservice;
public abstract class AccessibilityService
  extends android.app.Service
{
public  AccessibilityService() { throw new RuntimeException("Stub!"); }
public abstract  void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent event);
public abstract  void onInterrupt();
protected  void onServiceConnected() { throw new RuntimeException("Stub!"); }
public final  void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo info) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.accessibilityservice.AccessibilityService";
}
