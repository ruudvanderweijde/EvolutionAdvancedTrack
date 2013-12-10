package android.view;
public interface SubMenu
  extends android.view.Menu
{
public abstract  android.view.SubMenu setHeaderTitle(int titleRes);
public abstract  android.view.SubMenu setHeaderTitle(java.lang.CharSequence title);
public abstract  android.view.SubMenu setHeaderIcon(int iconRes);
public abstract  android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable icon);
public abstract  android.view.SubMenu setHeaderView(android.view.View view);
public abstract  void clearHeader();
public abstract  android.view.SubMenu setIcon(int iconRes);
public abstract  android.view.SubMenu setIcon(android.graphics.drawable.Drawable icon);
public abstract  android.view.MenuItem getItem();
}
