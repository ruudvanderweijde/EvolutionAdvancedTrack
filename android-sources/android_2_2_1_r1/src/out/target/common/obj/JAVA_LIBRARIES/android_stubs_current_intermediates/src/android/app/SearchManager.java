package android.app;
public class SearchManager
  implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener
{
public static interface OnDismissListener
{
public abstract  void onDismiss();
}
public static interface OnCancelListener
{
public abstract  void onCancel();
}
SearchManager() { throw new RuntimeException("Stub!"); }
public  void startSearch(java.lang.String initialQuery, boolean selectInitialQuery, android.content.ComponentName launchActivity, android.os.Bundle appSearchData, boolean globalSearch) { throw new RuntimeException("Stub!"); }
public  void triggerSearch(java.lang.String query, android.content.ComponentName launchActivity, android.os.Bundle appSearchData) { throw new RuntimeException("Stub!"); }
public  void stopSearch() { throw new RuntimeException("Stub!"); }
public  void setOnDismissListener(android.app.SearchManager.OnDismissListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnCancelListener(android.app.SearchManager.OnCancelListener listener) { throw new RuntimeException("Stub!"); }
public  void onCancel(android.content.DialogInterface dialog) { throw new RuntimeException("Stub!"); }
public  void onDismiss(android.content.DialogInterface dialog) { throw new RuntimeException("Stub!"); }
public  android.app.SearchableInfo getSearchableInfo(android.content.ComponentName componentName) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.SearchableInfo> getSearchablesInGlobalSearch() { throw new RuntimeException("Stub!"); }
public static final char MENU_KEY = 115;
public static final int MENU_KEYCODE = 47;
public static final java.lang.String QUERY = "query";
public static final java.lang.String USER_QUERY = "user_query";
public static final java.lang.String APP_DATA = "app_data";
public static final java.lang.String ACTION_KEY = "action_key";
public static final java.lang.String EXTRA_DATA_KEY = "intent_extra_data_key";
public static final java.lang.String EXTRA_SELECT_QUERY = "select_query";
public static final java.lang.String CURSOR_EXTRA_KEY_IN_PROGRESS = "in_progress";
public static final java.lang.String ACTION_MSG = "action_msg";
public static final java.lang.String SUGGEST_URI_PATH_QUERY = "search_suggest_query";
public static final java.lang.String SUGGEST_MIME_TYPE = "vnd.android.cursor.dir/vnd.android.search.suggest";
public static final java.lang.String SUGGEST_URI_PATH_SHORTCUT = "search_suggest_shortcut";
public static final java.lang.String SHORTCUT_MIME_TYPE = "vnd.android.cursor.item/vnd.android.search.suggest";
public static final java.lang.String SUGGEST_COLUMN_FORMAT = "suggest_format";
public static final java.lang.String SUGGEST_COLUMN_TEXT_1 = "suggest_text_1";
public static final java.lang.String SUGGEST_COLUMN_TEXT_2 = "suggest_text_2";
public static final java.lang.String SUGGEST_COLUMN_TEXT_2_URL = "suggest_text_2_url";
public static final java.lang.String SUGGEST_COLUMN_ICON_1 = "suggest_icon_1";
public static final java.lang.String SUGGEST_COLUMN_ICON_2 = "suggest_icon_2";
public static final java.lang.String SUGGEST_COLUMN_INTENT_ACTION = "suggest_intent_action";
public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA = "suggest_intent_data";
public static final java.lang.String SUGGEST_COLUMN_INTENT_EXTRA_DATA = "suggest_intent_extra_data";
public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA_ID = "suggest_intent_data_id";
public static final java.lang.String SUGGEST_COLUMN_QUERY = "suggest_intent_query";
public static final java.lang.String SUGGEST_COLUMN_SHORTCUT_ID = "suggest_shortcut_id";
public static final java.lang.String SUGGEST_COLUMN_SPINNER_WHILE_REFRESHING = "suggest_spinner_while_refreshing";
public static final java.lang.String SUGGEST_NEVER_MAKE_SHORTCUT = "_-1";
public static final java.lang.String SUGGEST_PARAMETER_LIMIT = "limit";
public static final java.lang.String INTENT_ACTION_GLOBAL_SEARCH = "android.search.action.GLOBAL_SEARCH";
public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS = "android.search.action.SEARCH_SETTINGS";
public static final java.lang.String INTENT_ACTION_WEB_SEARCH_SETTINGS = "android.search.action.WEB_SEARCH_SETTINGS";
public static final java.lang.String INTENT_ACTION_SEARCHABLES_CHANGED = "android.search.action.SEARCHABLES_CHANGED";
public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS_CHANGED = "android.search.action.SETTINGS_CHANGED";
}
