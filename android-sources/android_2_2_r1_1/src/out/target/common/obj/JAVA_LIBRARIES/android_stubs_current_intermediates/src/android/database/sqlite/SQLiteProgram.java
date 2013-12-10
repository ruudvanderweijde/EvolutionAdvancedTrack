package android.database.sqlite;
public abstract class SQLiteProgram
  extends android.database.sqlite.SQLiteClosable
{
SQLiteProgram() { throw new RuntimeException("Stub!"); }
protected  void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
protected  void onAllReferencesReleasedFromContainer() { throw new RuntimeException("Stub!"); }
public final  int getUniqueId() { throw new RuntimeException("Stub!"); }
protected  void compile(java.lang.String sql, boolean forceCompilation) { throw new RuntimeException("Stub!"); }
public  void bindNull(int index) { throw new RuntimeException("Stub!"); }
public  void bindLong(int index, long value) { throw new RuntimeException("Stub!"); }
public  void bindDouble(int index, double value) { throw new RuntimeException("Stub!"); }
public  void bindString(int index, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void bindBlob(int index, byte[] value) { throw new RuntimeException("Stub!"); }
public  void clearBindings() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected final native  void native_compile(java.lang.String sql);
protected final native  void native_finalize();
protected final native  void native_bind_null(int index);
protected final native  void native_bind_long(int index, long value);
protected final native  void native_bind_double(int index, double value);
protected final native  void native_bind_string(int index, java.lang.String value);
protected final native  void native_bind_blob(int index, byte[] value);
protected android.database.sqlite.SQLiteDatabase mDatabase;
protected int nHandle;
protected int nStatement;
}
