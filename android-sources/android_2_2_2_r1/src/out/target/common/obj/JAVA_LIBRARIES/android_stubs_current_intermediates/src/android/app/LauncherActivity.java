package android.app;
public abstract class LauncherActivity
  extends android.app.ListActivity
{
public static class ListItem
{
public  ListItem() { throw new RuntimeException("Stub!"); }
public android.content.pm.ResolveInfo resolveInfo;
public java.lang.CharSequence label;
public android.graphics.drawable.Drawable icon;
public java.lang.String packageName;
public java.lang.String className;
public android.os.Bundle extras;
}
public class IconResizer
{
public  IconResizer() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable createIconThumbnail(android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
}
public  LauncherActivity() { throw new RuntimeException("Stub!"); }
protected  void onCreate(android.os.Bundle icicle) { throw new RuntimeException("Stub!"); }
protected  void onSetContentView() { throw new RuntimeException("Stub!"); }
protected  void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) { throw new RuntimeException("Stub!"); }
protected  android.content.Intent intentForPosition(int position) { throw new RuntimeException("Stub!"); }
protected  android.app.LauncherActivity.ListItem itemForPosition(int position) { throw new RuntimeException("Stub!"); }
protected  android.content.Intent getTargetIntent() { throw new RuntimeException("Stub!"); }
protected  java.util.List<android.content.pm.ResolveInfo> onQueryPackageManager(android.content.Intent queryIntent) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.LauncherActivity.ListItem> makeListItems() { throw new RuntimeException("Stub!"); }
}
