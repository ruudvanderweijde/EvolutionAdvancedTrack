package android.webkit;
 abstract class WebSyncManager
  implements java.lang.Runnable
{
protected  WebSyncManager(android.content.Context context, java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public  void run() { throw new RuntimeException("Stub!"); }
public  void sync() { throw new RuntimeException("Stub!"); }
public  void resetSync() { throw new RuntimeException("Stub!"); }
public  void startSync() { throw new RuntimeException("Stub!"); }
public  void stopSync() { throw new RuntimeException("Stub!"); }
protected  void onSyncInit() { throw new RuntimeException("Stub!"); }
protected android.os.Handler mHandler;
protected android.webkit.WebViewDatabase mDataBase;
protected static final java.lang.String LOGTAG = "websync";
}
