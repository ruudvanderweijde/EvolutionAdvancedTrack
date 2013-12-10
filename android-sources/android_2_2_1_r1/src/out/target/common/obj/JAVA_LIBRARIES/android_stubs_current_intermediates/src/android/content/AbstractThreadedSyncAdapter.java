package android.content;
public abstract class AbstractThreadedSyncAdapter
{
public  AbstractThreadedSyncAdapter(android.content.Context context, boolean autoInitialize) { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder getSyncAdapterBinder() { throw new RuntimeException("Stub!"); }
public abstract  void onPerformSync(android.accounts.Account account, android.os.Bundle extras, java.lang.String authority, android.content.ContentProviderClient provider, android.content.SyncResult syncResult);
public  void onSyncCanceled() { throw new RuntimeException("Stub!"); }
public static final int LOG_SYNC_DETAILS = 2743;
}
