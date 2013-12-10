package android.database.sqlite;
public class SQLiteDatabase
  extends android.database.sqlite.SQLiteClosable
{
public static interface CursorFactory
{
public abstract  android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase db, android.database.sqlite.SQLiteCursorDriver masterQuery, java.lang.String editTable, android.database.sqlite.SQLiteQuery query);
}
SQLiteDatabase() { throw new RuntimeException("Stub!"); }
protected  void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
public static native  int releaseMemory();
public  void setLockingEnabled(boolean lockingEnabled) { throw new RuntimeException("Stub!"); }
public  void beginTransaction() { throw new RuntimeException("Stub!"); }
public  void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener transactionListener) { throw new RuntimeException("Stub!"); }
public  void endTransaction() { throw new RuntimeException("Stub!"); }
public  void setTransactionSuccessful() { throw new RuntimeException("Stub!"); }
public  boolean inTransaction() { throw new RuntimeException("Stub!"); }
public  boolean isDbLockedByCurrentThread() { throw new RuntimeException("Stub!"); }
public  boolean isDbLockedByOtherThreads() { throw new RuntimeException("Stub!"); }
public  boolean yieldIfContended() { throw new RuntimeException("Stub!"); }
public  boolean yieldIfContendedSafely() { throw new RuntimeException("Stub!"); }
public  boolean yieldIfContendedSafely(long sleepAfterYieldDelay) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.String> getSyncedTables() { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String path, android.database.sqlite.SQLiteDatabase.CursorFactory factory, int flags) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.io.File file, android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String path, android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase create(android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  void setVersion(int version) { throw new RuntimeException("Stub!"); }
public  long getMaximumSize() { throw new RuntimeException("Stub!"); }
public  long setMaximumSize(long numBytes) { throw new RuntimeException("Stub!"); }
public  long getPageSize() { throw new RuntimeException("Stub!"); }
public  void setPageSize(long numBytes) { throw new RuntimeException("Stub!"); }
public  void markTableSyncable(java.lang.String table, java.lang.String deletedTable) { throw new RuntimeException("Stub!"); }
public  void markTableSyncable(java.lang.String table, java.lang.String foreignKey, java.lang.String updateTable) { throw new RuntimeException("Stub!"); }
public static  java.lang.String findEditTable(java.lang.String tables) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteStatement compileStatement(java.lang.String sql) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(boolean distinct, java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor queryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, boolean distinct, java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor rawQuery(java.lang.String sql, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor rawQueryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String sql, java.lang.String[] selectionArgs, java.lang.String editTable) { throw new RuntimeException("Stub!"); }
public  long insert(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public  long insertOrThrow(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues values) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
public  long replace(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues initialValues) { throw new RuntimeException("Stub!"); }
public  long replaceOrThrow(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues initialValues) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
public  long insertWithOnConflict(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues initialValues, int conflictAlgorithm) { throw new RuntimeException("Stub!"); }
public  int delete(java.lang.String table, java.lang.String whereClause, java.lang.String[] whereArgs) { throw new RuntimeException("Stub!"); }
public  int update(java.lang.String table, android.content.ContentValues values, java.lang.String whereClause, java.lang.String[] whereArgs) { throw new RuntimeException("Stub!"); }
public  int updateWithOnConflict(java.lang.String table, android.content.ContentValues values, java.lang.String whereClause, java.lang.String[] whereArgs, int conflictAlgorithm) { throw new RuntimeException("Stub!"); }
public  void execSQL(java.lang.String sql) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
public  void execSQL(java.lang.String sql, java.lang.Object[] bindArgs) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  boolean isReadOnly() { throw new RuntimeException("Stub!"); }
public  boolean isOpen() { throw new RuntimeException("Stub!"); }
public  boolean needUpgrade(int newVersion) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public  void setLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final int CONFLICT_ROLLBACK = 1;
public static final int CONFLICT_ABORT = 2;
public static final int CONFLICT_FAIL = 3;
public static final int CONFLICT_IGNORE = 4;
public static final int CONFLICT_REPLACE = 5;
public static final int CONFLICT_NONE = 0;
public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
public static final int OPEN_READWRITE = 0;
public static final int OPEN_READONLY = 1;
public static final int NO_LOCALIZED_COLLATORS = 16;
public static final int CREATE_IF_NECESSARY = 268435456;
}
