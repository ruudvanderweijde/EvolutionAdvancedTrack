package android.provider;
public class SyncStateContract
{
public static interface Columns
  extends android.provider.BaseColumns
{
public static final java.lang.String ACCOUNT_NAME = "account_name";
public static final java.lang.String ACCOUNT_TYPE = "account_type";
public static final java.lang.String DATA = "data";
}
public static class Constants
  implements android.provider.SyncStateContract.Columns
{
public  Constants() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "syncstate";
}
public static final class Helpers
{
public  Helpers() { throw new RuntimeException("Stub!"); }
public static  byte[] get(android.content.ContentProviderClient provider, android.net.Uri uri, android.accounts.Account account) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public static  void set(android.content.ContentProviderClient provider, android.net.Uri uri, android.accounts.Account account, byte[] data) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public static  android.net.Uri insert(android.content.ContentProviderClient provider, android.net.Uri uri, android.accounts.Account account, byte[] data) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public static  void update(android.content.ContentProviderClient provider, android.net.Uri uri, byte[] data) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public static  android.util.Pair<android.net.Uri, byte[]> getWithUri(android.content.ContentProviderClient provider, android.net.Uri uri, android.accounts.Account account) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public static  android.content.ContentProviderOperation newSetOperation(android.net.Uri uri, android.accounts.Account account, byte[] data) { throw new RuntimeException("Stub!"); }
public static  android.content.ContentProviderOperation newUpdateOperation(android.net.Uri uri, byte[] data) { throw new RuntimeException("Stub!"); }
}
public  SyncStateContract() { throw new RuntimeException("Stub!"); }
}
