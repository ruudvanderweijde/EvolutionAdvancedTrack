package android.content;
public abstract class ContentResolver
{
public  ContentResolver(android.content.Context context) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType(android.net.Uri url) { throw new RuntimeException("Stub!"); }
public final  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) { throw new RuntimeException("Stub!"); }
public final  java.io.InputStream openInputStream(android.net.Uri uri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  java.io.OutputStream openOutputStream(android.net.Uri uri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  java.io.OutputStream openOutputStream(android.net.Uri uri, java.lang.String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.os.ParcelFileDescriptor openFileDescriptor(android.net.Uri uri, java.lang.String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetFileDescriptor openAssetFileDescriptor(android.net.Uri uri, java.lang.String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.net.Uri insert(android.net.Uri url, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public final  int bulkInsert(android.net.Uri url, android.content.ContentValues[] values) { throw new RuntimeException("Stub!"); }
public final  int delete(android.net.Uri url, java.lang.String where, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public final  int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String where, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public final  void registerContentObserver(android.net.Uri uri, boolean notifyForDescendents, android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public final  void unregisterContentObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void notifyChange(android.net.Uri uri, android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void notifyChange(android.net.Uri uri, android.database.ContentObserver observer, boolean syncToNetwork) { throw new RuntimeException("Stub!"); }
public  void startSync(android.net.Uri uri, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public static  void validateSyncExtrasBundle(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void cancelSync(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SYNC_EXTRAS_ACCOUNT = "account";
public static final java.lang.String SYNC_EXTRAS_EXPEDITED = "expedited";
public static final java.lang.String SYNC_EXTRAS_FORCE = "force";
public static final java.lang.String SYNC_EXTRAS_UPLOAD = "upload";
public static final java.lang.String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = "deletions_override";
public static final java.lang.String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = "discard_deletions";
public static final java.lang.String SCHEME_CONTENT = "content";
public static final java.lang.String SCHEME_ANDROID_RESOURCE = "android.resource";
public static final java.lang.String SCHEME_FILE = "file";
public static final java.lang.String CURSOR_ITEM_BASE_TYPE = "vnd.android.cursor.item";
public static final java.lang.String CURSOR_DIR_BASE_TYPE = "vnd.android.cursor.dir";
}
