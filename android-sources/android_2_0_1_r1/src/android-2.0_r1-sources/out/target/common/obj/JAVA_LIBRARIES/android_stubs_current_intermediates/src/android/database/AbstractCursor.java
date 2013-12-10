package android.database;
public abstract class AbstractCursor
  implements android.database.CrossProcessCursor
{
protected static class SelfContentObserver
  extends android.database.ContentObserver
{
public  SelfContentObserver(android.database.AbstractCursor cursor) { super((android.os.Handler)null); throw new RuntimeException("Stub!"); }
public  boolean deliverSelfNotifications() { throw new RuntimeException("Stub!"); }
public  void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
}
public  AbstractCursor() { throw new RuntimeException("Stub!"); }
public abstract  int getCount();
public abstract  java.lang.String[] getColumnNames();
public abstract  java.lang.String getString(int column);
public abstract  short getShort(int column);
public abstract  int getInt(int column);
public abstract  long getLong(int column);
public abstract  float getFloat(int column);
public abstract  double getDouble(int column);
public abstract  boolean isNull(int column);
public  byte[] getBlob(int column) { throw new RuntimeException("Stub!"); }
public  android.database.CursorWindow getWindow() { throw new RuntimeException("Stub!"); }
public  int getColumnCount() { throw new RuntimeException("Stub!"); }
public  void deactivate() { throw new RuntimeException("Stub!"); }
public  boolean requery() { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  boolean onMove(int oldPosition, int newPosition) { throw new RuntimeException("Stub!"); }
public  void copyStringToBuffer(int columnIndex, android.database.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
public final  int getPosition() { throw new RuntimeException("Stub!"); }
public final  boolean moveToPosition(int position) { throw new RuntimeException("Stub!"); }
public  void fillWindow(int position, android.database.CursorWindow window) { throw new RuntimeException("Stub!"); }
public final  boolean move(int offset) { throw new RuntimeException("Stub!"); }
public final  boolean moveToFirst() { throw new RuntimeException("Stub!"); }
public final  boolean moveToLast() { throw new RuntimeException("Stub!"); }
public final  boolean moveToNext() { throw new RuntimeException("Stub!"); }
public final  boolean moveToPrevious() { throw new RuntimeException("Stub!"); }
public final  boolean isFirst() { throw new RuntimeException("Stub!"); }
public final  boolean isLast() { throw new RuntimeException("Stub!"); }
public final  boolean isBeforeFirst() { throw new RuntimeException("Stub!"); }
public final  boolean isAfterLast() { throw new RuntimeException("Stub!"); }
public  int getColumnIndex(java.lang.String columnName) { throw new RuntimeException("Stub!"); }
public  int getColumnIndexOrThrow(java.lang.String columnName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getColumnName(int columnIndex) { throw new RuntimeException("Stub!"); }
public  void registerContentObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void unregisterContentObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void registerDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  void unregisterDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
protected  void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
public  void setNotificationUri(android.content.ContentResolver cr, android.net.Uri notifyUri) { throw new RuntimeException("Stub!"); }
public  boolean getWantsAllOnMoveCalls() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle respond(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
protected  boolean isFieldUpdated(int columnIndex) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object getUpdatedField(int columnIndex) { throw new RuntimeException("Stub!"); }
protected  void checkPosition() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
protected java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> mUpdatedRows;
protected int mRowIdColumnIndex;
protected int mPos;
protected java.lang.Long mCurrentRowID;
protected android.content.ContentResolver mContentResolver;
protected boolean mClosed;
}
