package android.media;
public class MediaScannerConnection
  implements android.content.ServiceConnection
{
public static interface MediaScannerConnectionClient
{
public abstract  void onMediaScannerConnected();
public abstract  void onScanCompleted(java.lang.String path, android.net.Uri uri);
}
public  MediaScannerConnection(android.content.Context context, android.media.MediaScannerConnection.MediaScannerConnectionClient client) { throw new RuntimeException("Stub!"); }
public  void connect() { throw new RuntimeException("Stub!"); }
public  void disconnect() { throw new RuntimeException("Stub!"); }
public synchronized  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  void scanFile(java.lang.String path, java.lang.String mimeType) { throw new RuntimeException("Stub!"); }
public  void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) { throw new RuntimeException("Stub!"); }
public  void onServiceDisconnected(android.content.ComponentName className) { throw new RuntimeException("Stub!"); }
}
