package android.content.res;
public final class AssetManager
{
public final class AssetInputStream
  extends java.io.InputStream
{
AssetInputStream() { throw new RuntimeException("Stub!"); }
public final  int getAssetInt() { throw new RuntimeException("Stub!"); }
public final  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  boolean markSupported() { throw new RuntimeException("Stub!"); }
public final  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void mark(int readlimit) { throw new RuntimeException("Stub!"); }
public final  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  int read(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  int read(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  long skip(long n) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
AssetManager() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public final  java.io.InputStream open(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  java.io.InputStream open(java.lang.String fileName, int accessMode) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetFileDescriptor openFd(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final native  java.lang.String[] list(java.lang.String path) throws java.io.IOException;
public final  android.content.res.AssetFileDescriptor openNonAssetFd(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetFileDescriptor openNonAssetFd(int cookie, java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  android.content.res.XmlResourceParser openXmlResourceParser(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  android.content.res.XmlResourceParser openXmlResourceParser(int cookie, java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public final native  java.lang.String[] getLocales();
public static final int ACCESS_UNKNOWN = 0;
public static final int ACCESS_RANDOM = 1;
public static final int ACCESS_STREAMING = 2;
public static final int ACCESS_BUFFER = 3;
}
