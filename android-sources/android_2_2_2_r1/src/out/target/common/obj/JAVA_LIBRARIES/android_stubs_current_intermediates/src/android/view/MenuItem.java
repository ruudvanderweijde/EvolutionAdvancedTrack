package android.view;
public interface MenuItem
{
public static interface OnMenuItemClickListener
{
public abstract  boolean onMenuItemClick(android.view.MenuItem item);
}
public abstract  int getItemId();
public abstract  int getGroupId();
public abstract  int getOrder();
public abstract  android.view.MenuItem setTitle(java.lang.CharSequence title);
public abstract  android.view.MenuItem setTitle(int title);
public abstract  java.lang.CharSequence getTitle();
public abstract  android.view.MenuItem setTitleCondensed(java.lang.CharSequence title);
public abstract  java.lang.CharSequence getTitleCondensed();
public abstract  android.view.MenuItem setIcon(android.graphics.drawable.Drawable icon);
public abstract  android.view.MenuItem setIcon(int iconRes);
public abstract  android.graphics.drawable.Drawable getIcon();
public abstract  android.view.MenuItem setIntent(android.content.Intent intent);
public abstract  android.content.Intent getIntent();
public abstract  android.view.MenuItem setShortcut(char numericChar, char alphaChar);
public abstract  android.view.MenuItem setNumericShortcut(char numericChar);
public abstract  char getNumericShortcut();
public abstract  android.view.MenuItem setAlphabeticShortcut(char alphaChar);
public abstract  char getAlphabeticShortcut();
public abstract  android.view.MenuItem setCheckable(boolean checkable);
public abstract  boolean isCheckable();
public abstract  android.view.MenuItem setChecked(boolean checked);
public abstract  boolean isChecked();
public abstract  android.view.MenuItem setVisible(boolean visible);
public abstract  boolean isVisible();
public abstract  android.view.MenuItem setEnabled(boolean enabled);
public abstract  boolean isEnabled();
public abstract  boolean hasSubMenu();
public abstract  android.view.SubMenu getSubMenu();
public abstract  android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener menuItemClickListener);
public abstract  android.view.ContextMenu.ContextMenuInfo getMenuInfo();
}
