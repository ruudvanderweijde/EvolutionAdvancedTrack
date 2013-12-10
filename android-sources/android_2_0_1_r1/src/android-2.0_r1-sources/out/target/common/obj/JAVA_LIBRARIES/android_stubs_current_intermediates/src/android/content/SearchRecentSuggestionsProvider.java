package android.content;
public class SearchRecentSuggestionsProvider
  extends android.content.ContentProvider
{
public  SearchRecentSuggestionsProvider() { throw new RuntimeException("Stub!"); }
protected  void setupSuggestions(java.lang.String authority, int mode) { throw new RuntimeException("Stub!"); }
public  int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  java.lang.String getType(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.net.Uri insert(android.net.Uri uri, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public  boolean onCreate() { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) { throw new RuntimeException("Stub!"); }
public  int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public static final int DATABASE_MODE_QUERIES = 1;
public static final int DATABASE_MODE_2LINES = 2;
}
