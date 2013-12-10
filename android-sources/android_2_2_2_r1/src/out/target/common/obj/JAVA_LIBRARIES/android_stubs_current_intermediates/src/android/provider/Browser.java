package android.provider;
public class Browser
{
public static class BookmarkColumns
  implements android.provider.BaseColumns
{
public  BookmarkColumns() { throw new RuntimeException("Stub!"); }
public static final java.lang.String URL = "url";
public static final java.lang.String VISITS = "visits";
public static final java.lang.String DATE = "date";
public static final java.lang.String BOOKMARK = "bookmark";
public static final java.lang.String TITLE = "title";
public static final java.lang.String CREATED = "created";
public static final java.lang.String FAVICON = "favicon";
}
public static class SearchColumns
  implements android.provider.BaseColumns
{
public  SearchColumns() { throw new RuntimeException("Stub!"); }
public static final java.lang.String URL = "url";
public static final java.lang.String SEARCH = "search";
public static final java.lang.String DATE = "date";
}
public  Browser() { throw new RuntimeException("Stub!"); }
public static final  void saveBookmark(android.content.Context c, java.lang.String title, java.lang.String url) { throw new RuntimeException("Stub!"); }
public static final  void sendString(android.content.Context c, java.lang.String s) { throw new RuntimeException("Stub!"); }
public static final  android.database.Cursor getAllBookmarks(android.content.ContentResolver cr) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public static final  android.database.Cursor getAllVisitedUrls(android.content.ContentResolver cr) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public static final  void updateVisitedHistory(android.content.ContentResolver cr, java.lang.String url, boolean real) { throw new RuntimeException("Stub!"); }
public static final  void truncateHistory(android.content.ContentResolver cr) { throw new RuntimeException("Stub!"); }
public static final  boolean canClearHistory(android.content.ContentResolver cr) { throw new RuntimeException("Stub!"); }
public static final  void clearHistory(android.content.ContentResolver cr) { throw new RuntimeException("Stub!"); }
public static final  void deleteHistoryTimeFrame(android.content.ContentResolver cr, long begin, long end) { throw new RuntimeException("Stub!"); }
public static final  void deleteFromHistory(android.content.ContentResolver cr, java.lang.String url) { throw new RuntimeException("Stub!"); }
public static final  void addSearchUrl(android.content.ContentResolver cr, java.lang.String search) { throw new RuntimeException("Stub!"); }
public static final  void clearSearches(android.content.ContentResolver cr) { throw new RuntimeException("Stub!"); }
public static final  void requestAllIcons(android.content.ContentResolver cr, java.lang.String where, android.webkit.WebIconDatabase.IconListener listener) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri BOOKMARKS_URI;
public static final java.lang.String INITIAL_ZOOM_LEVEL = "browser.initialZoomLevel";
public static final java.lang.String EXTRA_APPLICATION_ID = "com.android.browser.application_id";
public static final java.lang.String EXTRA_HEADERS = "com.android.browser.headers";
public static final java.lang.String[] HISTORY_PROJECTION = null;
public static final int HISTORY_PROJECTION_ID_INDEX = 0;
public static final int HISTORY_PROJECTION_URL_INDEX = 1;
public static final int HISTORY_PROJECTION_VISITS_INDEX = 2;
public static final int HISTORY_PROJECTION_DATE_INDEX = 3;
public static final int HISTORY_PROJECTION_BOOKMARK_INDEX = 4;
public static final int HISTORY_PROJECTION_TITLE_INDEX = 5;
public static final int HISTORY_PROJECTION_FAVICON_INDEX = 6;
public static final java.lang.String[] TRUNCATE_HISTORY_PROJECTION = null;
public static final int TRUNCATE_HISTORY_PROJECTION_ID_INDEX = 0;
public static final int TRUNCATE_N_OLDEST = 5;
public static final android.net.Uri SEARCHES_URI;
public static final java.lang.String[] SEARCHES_PROJECTION = null;
public static final int SEARCHES_PROJECTION_SEARCH_INDEX = 1;
public static final int SEARCHES_PROJECTION_DATE_INDEX = 2;
static { BOOKMARKS_URI = null; SEARCHES_URI = null; }
}
