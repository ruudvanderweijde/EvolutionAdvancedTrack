package android.database;
public abstract class AbstractWindowedCursor
  extends android.database.AbstractCursor
{
public  AbstractWindowedCursor() { throw new RuntimeException("Stub!"); }
public  byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(int columnIndex) { throw new RuntimeException("Stub!"); }
public  void copyStringToBuffer(int columnIndex, android.database.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
public  short getShort(int columnIndex) { throw new RuntimeException("Stub!"); }
public  int getInt(int columnIndex) { throw new RuntimeException("Stub!"); }
public  long getLong(int columnIndex) { throw new RuntimeException("Stub!"); }
public  float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
public  double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); }
public  boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); }
public  boolean isBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
public  boolean isString(int columnIndex) { throw new RuntimeException("Stub!"); }
public  boolean isLong(int columnIndex) { throw new RuntimeException("Stub!"); }
public  boolean isFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
protected  void checkPosition() { throw new RuntimeException("Stub!"); }
public  android.database.CursorWindow getWindow() { throw new RuntimeException("Stub!"); }
public  void setWindow(android.database.CursorWindow window) { throw new RuntimeException("Stub!"); }
public  boolean hasWindow() { throw new RuntimeException("Stub!"); }
protected android.database.CursorWindow mWindow;
}
