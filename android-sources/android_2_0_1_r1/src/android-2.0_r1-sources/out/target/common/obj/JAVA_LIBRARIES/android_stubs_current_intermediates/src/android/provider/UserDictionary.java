package android.provider;
public class UserDictionary
{
public static class Words
  implements android.provider.BaseColumns
{
public  Words() { throw new RuntimeException("Stub!"); }
public static  void addWord(android.content.Context context, java.lang.String word, int frequency, int localeType) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.userword";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.userword";
public static final java.lang.String _ID = "_id";
public static final java.lang.String WORD = "word";
public static final java.lang.String FREQUENCY = "frequency";
public static final java.lang.String LOCALE = "locale";
public static final java.lang.String APP_ID = "appid";
public static final int LOCALE_TYPE_ALL = 0;
public static final int LOCALE_TYPE_CURRENT = 1;
public static final java.lang.String DEFAULT_SORT_ORDER = "frequency DESC";
static { CONTENT_URI = null; }
}
public  UserDictionary() { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUTHORITY = "user_dictionary";
public static final android.net.Uri CONTENT_URI;
static { CONTENT_URI = null; }
}
