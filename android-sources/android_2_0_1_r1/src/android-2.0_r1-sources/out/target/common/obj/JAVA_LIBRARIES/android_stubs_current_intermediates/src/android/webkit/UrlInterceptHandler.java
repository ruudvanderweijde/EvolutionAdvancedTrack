package android.webkit;
@java.lang.Deprecated()
public interface UrlInterceptHandler
{
public abstract  android.webkit.CacheManager.CacheResult service(java.lang.String url, java.util.Map<java.lang.String, java.lang.String> headers);
public abstract  android.webkit.PluginData getPluginData(java.lang.String url, java.util.Map<java.lang.String, java.lang.String> headers);
}
