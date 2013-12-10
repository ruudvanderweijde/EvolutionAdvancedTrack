package android.database.sqlite;
public abstract class SQLiteOpenHelper
{
public  SQLiteOpenHelper(android.content.Context context, java.lang.String name, android.database.sqlite.SQLiteDatabase.CursorFactory factory, int version) { throw new RuntimeException("Stub!"); }
public synchronized  android.database.sqlite.SQLiteDatabase getWritableDatabase() { throw new RuntimeException("Stub!"); }
public synchronized  android.database.sqlite.SQLiteDatabase getReadableDatabase() { throw new RuntimeException("Stub!"); }
public synchronized  void close() { throw new RuntimeException("Stub!"); }
public abstract  void onCreate(android.database.sqlite.SQLiteDatabase db);
public abstract  void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion);
public  void onOpen(android.database.sqlite.SQLiteDatabase db) { throw new RuntimeException("Stub!"); }
}
