package android.webkit;
public final class WebStorage
{
public static interface QuotaUpdater
{
public abstract  void updateQuota(long newQuota);
}
public  WebStorage() { throw new RuntimeException("Stub!"); }
public  void getOrigins(android.webkit.ValueCallback<java.util.Map> callback) { throw new RuntimeException("Stub!"); }
public  void getUsageForOrigin(java.lang.String origin, android.webkit.ValueCallback<java.lang.Long> callback) { throw new RuntimeException("Stub!"); }
public  void getQuotaForOrigin(java.lang.String origin, android.webkit.ValueCallback<java.lang.Long> callback) { throw new RuntimeException("Stub!"); }
public  void setQuotaForOrigin(java.lang.String origin, long quota) { throw new RuntimeException("Stub!"); }
public  void deleteOrigin(java.lang.String origin) { throw new RuntimeException("Stub!"); }
public  void deleteAllData() { throw new RuntimeException("Stub!"); }
public static  android.webkit.WebStorage getInstance() { throw new RuntimeException("Stub!"); }
}
