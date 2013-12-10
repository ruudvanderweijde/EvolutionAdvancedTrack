package android.view;
public interface ContextMenu
  extends android.view.Menu
{
public static interface ContextMenuInfo
{
}
public abstract  android.view.ContextMenu setHeaderTitle(int titleRes);
public abstract  android.view.ContextMenu setHeaderTitle(java.lang.CharSequence title);
public abstract  android.view.ContextMenu setHeaderIcon(int iconRes);
public abstract  android.view.ContextMenu setHeaderIcon(android.graphics.drawable.Drawable icon);
public abstract  android.view.ContextMenu setHeaderView(android.view.View view);
public abstract  void clearHeader();
}
