package android.database;
public class CursorWindow
  extends android.database.sqlite.SQLiteClosable
  implements android.os.Parcelable
{
public  CursorWindow(boolean localWindow) { throw new RuntimeException("Stub!"); }
public  int getStartPosition() { throw new RuntimeException("Stub!"); }
public  void setStartPosition(int pos) { throw new RuntimeException("Stub!"); }
public  int getNumRows() { throw new RuntimeException("Stub!"); }
public  boolean setNumColumns(int columnNum) { throw new RuntimeException("Stub!"); }
public  boolean allocRow() { throw new RuntimeException("Stub!"); }
public  void freeLastRow() { throw new RuntimeException("Stub!"); }
public  boolean putBlob(byte[] value, int row, int col) { throw new RuntimeException("Stub!"); }
public  boolean putString(java.lang.String value, int row, int col) { throw new RuntimeException("Stub!"); }
public  boolean putLong(long value, int row, int col) { throw new RuntimeException("Stub!"); }
public  boolean putDouble(double value, int row, int col) { throw new RuntimeException("Stub!"); }
public  boolean putNull(int row, int col) { throw new RuntimeException("Stub!"); }
public  boolean isNull(int row, int col) { throw new RuntimeException("Stub!"); }
public  byte[] getBlob(int row, int col) { throw new RuntimeException("Stub!"); }
public  boolean isBlob(int row, int col) { throw new RuntimeException("Stub!"); }
public  boolean isLong(int row, int col) { throw new RuntimeException("Stub!"); }
public  boolean isFloat(int row, int col) { throw new RuntimeException("Stub!"); }
public  boolean isString(int row, int col) { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(int row, int col) { throw new RuntimeException("Stub!"); }
public  void copyStringToBuffer(int row, int col, android.database.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
public  long getLong(int row, int col) { throw new RuntimeException("Stub!"); }
public  double getDouble(int row, int col) { throw new RuntimeException("Stub!"); }
public  short getShort(int row, int col) { throw new RuntimeException("Stub!"); }
public  int getInt(int row, int col) { throw new RuntimeException("Stub!"); }
public  float getFloat(int row, int col) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public static  android.database.CursorWindow newFromParcel(android.os.Parcel p) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
protected  void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.database.CursorWindow> CREATOR;
static { CREATOR = null; }
}
