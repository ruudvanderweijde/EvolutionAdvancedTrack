package android.content;
public class ContentProviderClient
{
ContentProviderClient() { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.net.Uri url, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  java.lang.String getType(android.net.Uri url) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.net.Uri insert(android.net.Uri url, android.content.ContentValues initialValues) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int bulkInsert(android.net.Uri url, android.content.ContentValues[] initialValues) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int delete(android.net.Uri url, java.lang.String selection, java.lang.String[] selectionArgs) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int update(android.net.Uri url, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor openFile(android.net.Uri url, java.lang.String mode) throws android.os.RemoteException, java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri url, java.lang.String mode) throws android.os.RemoteException, java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderResult[] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> operations) throws android.os.RemoteException, android.content.OperationApplicationException { throw new RuntimeException("Stub!"); }
public  boolean release() { throw new RuntimeException("Stub!"); }
public  android.content.ContentProvider getLocalContentProvider() { throw new RuntimeException("Stub!"); }
}
