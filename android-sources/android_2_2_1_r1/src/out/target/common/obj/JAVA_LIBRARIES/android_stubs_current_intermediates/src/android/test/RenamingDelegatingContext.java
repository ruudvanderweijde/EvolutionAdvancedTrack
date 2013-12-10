package android.test;
public class RenamingDelegatingContext
  extends android.content.ContextWrapper
{
public  RenamingDelegatingContext(android.content.Context context, java.lang.String filePrefix) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  RenamingDelegatingContext(android.content.Context context, android.content.Context fileContext, java.lang.String filePrefix) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public static <T extends android.content.ContentProvider> T providerWithRenamedContext(java.lang.Class<T> contentProvider, android.content.Context c, java.lang.String filePrefix) throws java.lang.IllegalAccessException, java.lang.InstantiationException { throw new RuntimeException("Stub!"); }
public static <T extends android.content.ContentProvider> T providerWithRenamedContext(java.lang.Class<T> contentProvider, android.content.Context c, java.lang.String filePrefix, boolean allowAccessToExistingFilesAndDbs) throws java.lang.IllegalAccessException, java.lang.InstantiationException { throw new RuntimeException("Stub!"); }
public  void makeExistingFilesAndDbsAccessible() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDatabasePrefix() { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public  boolean deleteDatabase(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.io.File getDatabasePath(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] databaseList() { throw new RuntimeException("Stub!"); }
public  java.io.FileInputStream openFileInput(java.lang.String name) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  java.io.FileOutputStream openFileOutput(java.lang.String name, int mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  java.io.File getFileStreamPath(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean deleteFile(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] fileList() { throw new RuntimeException("Stub!"); }
public  java.io.File getCacheDir() { throw new RuntimeException("Stub!"); }
}
