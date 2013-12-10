package android.database.sqlite;
public interface SQLiteCursorDriver
{
public abstract  android.database.Cursor query(android.database.sqlite.SQLiteDatabase.CursorFactory factory, java.lang.String[] bindArgs);
public abstract  void cursorDeactivated();
public abstract  void cursorRequeried(android.database.Cursor cursor);
public abstract  void cursorClosed();
public abstract  void setBindArguments(java.lang.String[] bindArgs);
}
