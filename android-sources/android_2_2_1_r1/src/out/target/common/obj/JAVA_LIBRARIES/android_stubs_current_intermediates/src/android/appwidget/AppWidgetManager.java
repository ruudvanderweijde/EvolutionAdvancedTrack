package android.appwidget;
public class AppWidgetManager
{
AppWidgetManager() { throw new RuntimeException("Stub!"); }
public static  android.appwidget.AppWidgetManager getInstance(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void updateAppWidget(int[] appWidgetIds, android.widget.RemoteViews views) { throw new RuntimeException("Stub!"); }
public  void updateAppWidget(int appWidgetId, android.widget.RemoteViews views) { throw new RuntimeException("Stub!"); }
public  void updateAppWidget(android.content.ComponentName provider, android.widget.RemoteViews views) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.appwidget.AppWidgetProviderInfo> getInstalledProviders() { throw new RuntimeException("Stub!"); }
public  android.appwidget.AppWidgetProviderInfo getAppWidgetInfo(int appWidgetId) { throw new RuntimeException("Stub!"); }
public  void bindAppWidgetId(int appWidgetId, android.content.ComponentName provider) { throw new RuntimeException("Stub!"); }
public  int[] getAppWidgetIds(android.content.ComponentName provider) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_APPWIDGET_PICK = "android.appwidget.action.APPWIDGET_PICK";
public static final java.lang.String ACTION_APPWIDGET_CONFIGURE = "android.appwidget.action.APPWIDGET_CONFIGURE";
public static final java.lang.String EXTRA_APPWIDGET_ID = "appWidgetId";
public static final java.lang.String EXTRA_APPWIDGET_IDS = "appWidgetIds";
public static final java.lang.String EXTRA_CUSTOM_INFO = "customInfo";
public static final java.lang.String EXTRA_CUSTOM_EXTRAS = "customExtras";
public static final int INVALID_APPWIDGET_ID = 0;
public static final java.lang.String ACTION_APPWIDGET_UPDATE = "android.appwidget.action.APPWIDGET_UPDATE";
public static final java.lang.String ACTION_APPWIDGET_DELETED = "android.appwidget.action.APPWIDGET_DELETED";
public static final java.lang.String ACTION_APPWIDGET_DISABLED = "android.appwidget.action.APPWIDGET_DISABLED";
public static final java.lang.String ACTION_APPWIDGET_ENABLED = "android.appwidget.action.APPWIDGET_ENABLED";
public static final java.lang.String META_DATA_APPWIDGET_PROVIDER = "android.appwidget.provider";
}
