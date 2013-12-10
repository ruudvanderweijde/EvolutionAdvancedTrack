package android.webkit;
public final class CacheManager
{
public static class CacheResult
{
public  CacheResult() { throw new RuntimeException("Stub!"); }
public  int getHttpStatusCode() { throw new RuntimeException("Stub!"); }
public  long getContentLength() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLocalPath() { throw new RuntimeException("Stub!"); }
public  long getExpires() { throw new RuntimeException("Stub!"); }
public  java.lang.String getExpiresString() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLastModified() { throw new RuntimeException("Stub!"); }
public  java.lang.String getETag() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMimeType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLocation() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEncoding() { throw new RuntimeException("Stub!"); }
public  java.lang.String getContentDisposition() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getInputStream() { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getOutputStream() { throw new RuntimeException("Stub!"); }
public  void setInputStream(java.io.InputStream stream) { throw new RuntimeException("Stub!"); }
public  void setEncoding(java.lang.String encoding) { throw new RuntimeException("Stub!"); }
}
public  CacheManager() { throw new RuntimeException("Stub!"); }
public static  java.io.File getCacheFileBaseDir() { throw new RuntimeException("Stub!"); }
public static  boolean cacheDisabled() { throw new RuntimeException("Stub!"); }
public static  boolean startCacheTransaction() { throw new RuntimeException("Stub!"); }
public static  boolean endCacheTransaction() { throw new RuntimeException("Stub!"); }
public static  android.webkit.CacheManager.CacheResult getCacheFile(java.lang.String url, java.util.Map<java.lang.String, java.lang.String> headers) { throw new RuntimeException("Stub!"); }
public static  void saveCacheFile(java.lang.String url, android.webkit.CacheManager.CacheResult cacheRet) { throw new RuntimeException("Stub!"); }
}
