package android.app;
public class Instrumentation
{
public static class ActivityMonitor
{
public  ActivityMonitor(android.content.IntentFilter which, android.app.Instrumentation.ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); }
public  ActivityMonitor(java.lang.String cls, android.app.Instrumentation.ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); }
public final  android.content.IntentFilter getFilter() { throw new RuntimeException("Stub!"); }
public final  android.app.Instrumentation.ActivityResult getResult() { throw new RuntimeException("Stub!"); }
public final  boolean isBlocking() { throw new RuntimeException("Stub!"); }
public final  int getHits() { throw new RuntimeException("Stub!"); }
public final  android.app.Activity getLastActivity() { throw new RuntimeException("Stub!"); }
public final  android.app.Activity waitForActivity() { throw new RuntimeException("Stub!"); }
public final  android.app.Activity waitForActivityWithTimeout(long timeOut) { throw new RuntimeException("Stub!"); }
}
public static final class ActivityResult
{
public  ActivityResult(int resultCode, android.content.Intent resultData) { throw new RuntimeException("Stub!"); }
public  int getResultCode() { throw new RuntimeException("Stub!"); }
public  android.content.Intent getResultData() { throw new RuntimeException("Stub!"); }
}
public  Instrumentation() { throw new RuntimeException("Stub!"); }
public  void onCreate(android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public  void onStart() { throw new RuntimeException("Stub!"); }
public  boolean onException(java.lang.Object obj, java.lang.Throwable e) { throw new RuntimeException("Stub!"); }
public  void sendStatus(int resultCode, android.os.Bundle results) { throw new RuntimeException("Stub!"); }
public  void finish(int resultCode, android.os.Bundle results) { throw new RuntimeException("Stub!"); }
public  void setAutomaticPerformanceSnapshots() { throw new RuntimeException("Stub!"); }
public  void startPerformanceSnapshot() { throw new RuntimeException("Stub!"); }
public  void endPerformanceSnapshot() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getComponentName() { throw new RuntimeException("Stub!"); }
public  android.content.Context getTargetContext() { throw new RuntimeException("Stub!"); }
public  boolean isProfiling() { throw new RuntimeException("Stub!"); }
public  void startProfiling() { throw new RuntimeException("Stub!"); }
public  void stopProfiling() { throw new RuntimeException("Stub!"); }
public  void setInTouchMode(boolean inTouch) { throw new RuntimeException("Stub!"); }
public  void waitForIdle(java.lang.Runnable recipient) { throw new RuntimeException("Stub!"); }
public  void waitForIdleSync() { throw new RuntimeException("Stub!"); }
public  void runOnMainSync(java.lang.Runnable runner) { throw new RuntimeException("Stub!"); }
public  android.app.Activity startActivitySync(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void addMonitor(android.app.Instrumentation.ActivityMonitor monitor) { throw new RuntimeException("Stub!"); }
public  android.app.Instrumentation.ActivityMonitor addMonitor(android.content.IntentFilter filter, android.app.Instrumentation.ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); }
public  android.app.Instrumentation.ActivityMonitor addMonitor(java.lang.String cls, android.app.Instrumentation.ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); }
public  boolean checkMonitorHit(android.app.Instrumentation.ActivityMonitor monitor, int minHits) { throw new RuntimeException("Stub!"); }
public  android.app.Activity waitForMonitor(android.app.Instrumentation.ActivityMonitor monitor) { throw new RuntimeException("Stub!"); }
public  android.app.Activity waitForMonitorWithTimeout(android.app.Instrumentation.ActivityMonitor monitor, long timeOut) { throw new RuntimeException("Stub!"); }
public  void removeMonitor(android.app.Instrumentation.ActivityMonitor monitor) { throw new RuntimeException("Stub!"); }
public  boolean invokeMenuActionSync(android.app.Activity targetActivity, int id, int flag) { throw new RuntimeException("Stub!"); }
public  boolean invokeContextMenuAction(android.app.Activity targetActivity, int id, int flag) { throw new RuntimeException("Stub!"); }
public  void sendStringSync(java.lang.String text) { throw new RuntimeException("Stub!"); }
public  void sendKeySync(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void sendKeyDownUpSync(int key) { throw new RuntimeException("Stub!"); }
public  void sendCharacterSync(int keyCode) { throw new RuntimeException("Stub!"); }
public  void sendPointerSync(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void sendTrackballEventSync(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  android.app.Application newApplication(java.lang.ClassLoader cl, java.lang.String className, android.content.Context context) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public static  android.app.Application newApplication(java.lang.Class<?> clazz, android.content.Context context) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  void callApplicationOnCreate(android.app.Application app) { throw new RuntimeException("Stub!"); }
public  android.app.Activity newActivity(java.lang.Class<?> clazz, android.content.Context context, android.os.IBinder token, android.app.Application application, android.content.Intent intent, android.content.pm.ActivityInfo info, java.lang.CharSequence title, android.app.Activity parent, java.lang.String id, java.lang.Object lastNonConfigurationInstance) throws java.lang.InstantiationException, java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
public  android.app.Activity newActivity(java.lang.ClassLoader cl, java.lang.String className, android.content.Intent intent) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  void callActivityOnCreate(android.app.Activity activity, android.os.Bundle icicle) { throw new RuntimeException("Stub!"); }
public  void callActivityOnDestroy(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  void callActivityOnRestoreInstanceState(android.app.Activity activity, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void callActivityOnPostCreate(android.app.Activity activity, android.os.Bundle icicle) { throw new RuntimeException("Stub!"); }
public  void callActivityOnNewIntent(android.app.Activity activity, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void callActivityOnStart(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  void callActivityOnRestart(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  void callActivityOnResume(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  void callActivityOnStop(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  void callActivityOnSaveInstanceState(android.app.Activity activity, android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
public  void callActivityOnPause(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  void callActivityOnUserLeaving(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  void startAllocCounting() { throw new RuntimeException("Stub!"); }
public  void stopAllocCounting() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getAllocCounts() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getBinderCounts() { throw new RuntimeException("Stub!"); }
public static final java.lang.String REPORT_KEY_IDENTIFIER = "id";
public static final java.lang.String REPORT_KEY_STREAMRESULT = "stream";
}
