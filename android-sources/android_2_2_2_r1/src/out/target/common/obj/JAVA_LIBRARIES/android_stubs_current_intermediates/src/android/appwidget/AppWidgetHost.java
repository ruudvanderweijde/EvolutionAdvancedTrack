package android.appwidget;
public class AppWidgetHost
{
public  AppWidgetHost(android.content.Context context, int hostId) { throw new RuntimeException("Stub!"); }
public  void startListening() { throw new RuntimeException("Stub!"); }
public  void stopListening() { throw new RuntimeException("Stub!"); }
public  int allocateAppWidgetId() { throw new RuntimeException("Stub!"); }
public  void deleteAppWidgetId(int appWidgetId) { throw new RuntimeException("Stub!"); }
public  void deleteHost() { throw new RuntimeException("Stub!"); }
public static  void deleteAllHosts() { throw new RuntimeException("Stub!"); }
public final  android.appwidget.AppWidgetHostView createView(android.content.Context context, int appWidgetId, android.appwidget.AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); }
protected  android.appwidget.AppWidgetHostView onCreateView(android.content.Context context, int appWidgetId, android.appwidget.AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); }
protected  void onProviderChanged(int appWidgetId, android.appwidget.AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); }
}
