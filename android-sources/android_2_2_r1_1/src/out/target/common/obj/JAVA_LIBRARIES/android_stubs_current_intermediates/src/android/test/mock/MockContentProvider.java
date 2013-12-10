package android.test.mock;
public class MockContentProvider
  extends android.content.ContentProvider
{
protected  MockContentProvider() { throw new RuntimeException("Stub!"); }
public  MockContentProvider(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  MockContentProvider(android.content.Context context, java.lang.String readPermission, java.lang.String writePermission, android.content.pm.PathPermission[] pathPermissions) { throw new RuntimeException("Stub!"); }
public  int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  java.lang.String getType(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.net.Uri insert(android.net.Uri uri, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public  boolean onCreate() { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) { throw new RuntimeException("Stub!"); }
public  int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  int bulkInsert(android.net.Uri uri, android.content.ContentValues[] values) { throw new RuntimeException("Stub!"); }
public  void attachInfo(android.content.Context context, android.content.pm.ProviderInfo info) { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderResult[] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> operations) { throw new RuntimeException("Stub!"); }
}
