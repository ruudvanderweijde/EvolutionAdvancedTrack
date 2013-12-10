package android.database;
public class CursorWrapper
  implements android.database.Cursor
{
public  CursorWrapper(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  void deactivate() { throw new RuntimeException("Stub!"); }
public  boolean moveToFirst() { throw new RuntimeException("Stub!"); }
public  int getColumnCount() { throw new RuntimeException("Stub!"); }
public  int getColumnIndex(java.lang.String columnName) { throw new RuntimeException("Stub!"); }
public  int getColumnIndexOrThrow(java.lang.String columnName) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  java.lang.String getColumnName(int columnIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getColumnNames() { throw new RuntimeException("Stub!"); }
public  double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
public  int getInt(int columnIndex) { throw new RuntimeException("Stub!"); }
public  long getLong(int columnIndex) { throw new RuntimeException("Stub!"); }
public  short getShort(int columnIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(int columnIndex) { throw new RuntimeException("Stub!"); }
public  void copyStringToBuffer(int columnIndex, android.database.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
public  byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
public  boolean getWantsAllOnMoveCalls() { throw new RuntimeException("Stub!"); }
public  boolean isAfterLast() { throw new RuntimeException("Stub!"); }
public  boolean isBeforeFirst() { throw new RuntimeException("Stub!"); }
public  boolean isFirst() { throw new RuntimeException("Stub!"); }
public  boolean isLast() { throw new RuntimeException("Stub!"); }
public  boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); }
public  boolean moveToLast() { throw new RuntimeException("Stub!"); }
public  boolean move(int offset) { throw new RuntimeException("Stub!"); }
public  boolean moveToPosition(int position) { throw new RuntimeException("Stub!"); }
public  boolean moveToNext() { throw new RuntimeException("Stub!"); }
public  int getPosition() { throw new RuntimeException("Stub!"); }
public  boolean moveToPrevious() { throw new RuntimeException("Stub!"); }
public  void registerContentObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void registerDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  boolean requery() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle respond(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void setNotificationUri(android.content.ContentResolver cr, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  void unregisterContentObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void unregisterDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
}
