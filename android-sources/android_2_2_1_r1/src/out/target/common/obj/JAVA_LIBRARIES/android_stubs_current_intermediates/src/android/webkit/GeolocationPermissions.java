package android.webkit;
public final class GeolocationPermissions
{
public static interface Callback
{
public abstract  void invoke(java.lang.String origin, boolean allow, boolean remember);
}
public  GeolocationPermissions() { throw new RuntimeException("Stub!"); }
public static  android.webkit.GeolocationPermissions getInstance() { throw new RuntimeException("Stub!"); }
public  void getOrigins(android.webkit.ValueCallback<java.util.Set<java.lang.String>> callback) { throw new RuntimeException("Stub!"); }
public  void getAllowed(java.lang.String origin, android.webkit.ValueCallback<java.lang.Boolean> callback) { throw new RuntimeException("Stub!"); }
public  void clear(java.lang.String origin) { throw new RuntimeException("Stub!"); }
public  void allow(java.lang.String origin) { throw new RuntimeException("Stub!"); }
public  void clearAll() { throw new RuntimeException("Stub!"); }
}
