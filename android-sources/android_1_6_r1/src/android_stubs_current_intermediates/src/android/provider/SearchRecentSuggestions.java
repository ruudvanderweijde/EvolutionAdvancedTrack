package android.provider;
public class SearchRecentSuggestions
{
public  SearchRecentSuggestions(android.content.Context context, java.lang.String authority, int mode) { throw new RuntimeException("Stub!"); }
public  void saveRecentQuery(java.lang.String queryString, java.lang.String line2) { throw new RuntimeException("Stub!"); }
public  void clearHistory() { throw new RuntimeException("Stub!"); }
protected  void truncateHistory(android.content.ContentResolver cr, int maxEntries) { throw new RuntimeException("Stub!"); }
public static final java.lang.String[] QUERIES_PROJECTION_1LINE = null;
public static final java.lang.String[] QUERIES_PROJECTION_2LINE = null;
public static final int QUERIES_PROJECTION_DATE_INDEX = 1;
public static final int QUERIES_PROJECTION_QUERY_INDEX = 2;
public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = 3;
public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = 4;
}
