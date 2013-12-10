package android.webkit;
public final class WebIconDatabase
{
public static interface IconListener
{
public abstract  void onReceivedIcon(java.lang.String url, android.graphics.Bitmap icon);
}
WebIconDatabase() { throw new RuntimeException("Stub!"); }
public  void open(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void removeAllIcons() { throw new RuntimeException("Stub!"); }
public  void requestIconForPageUrl(java.lang.String url, android.webkit.WebIconDatabase.IconListener listener) { throw new RuntimeException("Stub!"); }
public  void retainIconForPageUrl(java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void releaseIconForPageUrl(java.lang.String url) { throw new RuntimeException("Stub!"); }
public static  android.webkit.WebIconDatabase getInstance() { throw new RuntimeException("Stub!"); }
}
