package android.database.sqlite;
public class SQLiteQueryBuilder
{
public  SQLiteQueryBuilder() { throw new RuntimeException("Stub!"); }
public  void setDistinct(boolean distinct) { throw new RuntimeException("Stub!"); }
public  java.lang.String getTables() { throw new RuntimeException("Stub!"); }
public  void setTables(java.lang.String inTables) { throw new RuntimeException("Stub!"); }
public  void appendWhere(java.lang.CharSequence inWhere) { throw new RuntimeException("Stub!"); }
public  void appendWhereEscapeString(java.lang.String inWhere) { throw new RuntimeException("Stub!"); }
public  void setProjectionMap(java.util.Map<java.lang.String, java.lang.String> columnMap) { throw new RuntimeException("Stub!"); }
public  void setCursorFactory(android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public static  java.lang.String buildQueryString(boolean distinct, java.lang.String tables, java.lang.String[] columns, java.lang.String where, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public static  void appendColumns(java.lang.StringBuilder s, java.lang.String[] columns) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.database.sqlite.SQLiteDatabase db, java.lang.String[] projectionIn, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String sortOrder) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.database.sqlite.SQLiteDatabase db, java.lang.String[] projectionIn, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String sortOrder, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  java.lang.String buildQuery(java.lang.String[] projectionIn, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String sortOrder, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  java.lang.String buildUnionSubQuery(java.lang.String typeDiscriminatorColumn, java.lang.String[] unionColumns, java.util.Set<java.lang.String> columnsPresentInTable, int computedColumnsOffset, java.lang.String typeDiscriminatorValue, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having) { throw new RuntimeException("Stub!"); }
public  java.lang.String buildUnionQuery(java.lang.String[] subQueries, java.lang.String sortOrder, java.lang.String limit) { throw new RuntimeException("Stub!"); }
}
