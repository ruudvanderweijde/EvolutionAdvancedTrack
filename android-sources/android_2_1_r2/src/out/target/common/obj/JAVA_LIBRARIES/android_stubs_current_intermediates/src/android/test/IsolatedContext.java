package android.test;
public class IsolatedContext
  extends android.content.ContextWrapper
{
public  IsolatedContext(android.content.ContentResolver resolver, android.content.Context targetContext) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.Intent> getAndClearBroadcastIntents() { throw new RuntimeException("Stub!"); }
public  android.content.ContentResolver getContentResolver() { throw new RuntimeException("Stub!"); }
public  boolean bindService(android.content.Intent service, android.content.ServiceConnection conn, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter) { throw new RuntimeException("Stub!"); }
public  void sendBroadcast(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void sendOrderedBroadcast(android.content.Intent intent, java.lang.String receiverPermission) { throw new RuntimeException("Stub!"); }
public  int checkUriPermission(android.net.Uri uri, java.lang.String readPermission, java.lang.String writePermission, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); }
public  int checkUriPermission(android.net.Uri uri, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getSystemService(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.io.File getFilesDir() { throw new RuntimeException("Stub!"); }
}
