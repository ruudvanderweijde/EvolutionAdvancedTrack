package android.webkit;
public final class WebStorage
{
public static interface QuotaUpdater
{
public abstract  void updateQuota(long newQuota);
}
public  WebStorage() { throw new RuntimeException("Stub!"); }
}
