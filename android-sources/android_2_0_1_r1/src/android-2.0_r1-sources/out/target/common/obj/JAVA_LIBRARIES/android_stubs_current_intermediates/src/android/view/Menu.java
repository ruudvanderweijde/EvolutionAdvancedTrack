package android.view;
public interface Menu
{
public abstract  android.view.MenuItem add(java.lang.CharSequence title);
public abstract  android.view.MenuItem add(int titleRes);
public abstract  android.view.MenuItem add(int groupId, int itemId, int order, java.lang.CharSequence title);
public abstract  android.view.MenuItem add(int groupId, int itemId, int order, int titleRes);
public abstract  android.view.SubMenu addSubMenu(java.lang.CharSequence title);
public abstract  android.view.SubMenu addSubMenu(int titleRes);
public abstract  android.view.SubMenu addSubMenu(int groupId, int itemId, int order, java.lang.CharSequence title);
public abstract  android.view.SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes);
public abstract  int addIntentOptions(int groupId, int itemId, int order, android.content.ComponentName caller, android.content.Intent[] specifics, android.content.Intent intent, int flags, android.view.MenuItem[] outSpecificItems);
public abstract  void removeItem(int id);
public abstract  void removeGroup(int groupId);
public abstract  void clear();
public abstract  void setGroupCheckable(int group, boolean checkable, boolean exclusive);
public abstract  void setGroupVisible(int group, boolean visible);
public abstract  void setGroupEnabled(int group, boolean enabled);
public abstract  boolean hasVisibleItems();
public abstract  android.view.MenuItem findItem(int id);
public abstract  int size();
public abstract  android.view.MenuItem getItem(int index);
public abstract  void close();
public abstract  boolean performShortcut(int keyCode, android.view.KeyEvent event, int flags);
public abstract  boolean isShortcutKey(int keyCode, android.view.KeyEvent event);
public abstract  boolean performIdentifierAction(int id, int flags);
public abstract  void setQwertyMode(boolean isQwerty);
public static final int NONE = 0;
public static final int FIRST = 1;
public static final int CATEGORY_CONTAINER = 65536;
public static final int CATEGORY_SYSTEM = 131072;
public static final int CATEGORY_SECONDARY = 196608;
public static final int CATEGORY_ALTERNATIVE = 262144;
public static final int FLAG_APPEND_TO_GROUP = 1;
public static final int FLAG_PERFORM_NO_CLOSE = 1;
public static final int FLAG_ALWAYS_PERFORM_CLOSE = 2;
}
