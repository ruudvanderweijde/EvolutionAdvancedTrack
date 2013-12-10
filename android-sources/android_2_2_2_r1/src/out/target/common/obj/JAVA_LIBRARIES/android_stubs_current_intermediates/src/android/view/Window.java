package android.view;
public abstract class Window
{
public static interface Callback
{
public abstract  boolean dispatchKeyEvent(android.view.KeyEvent event);
public abstract  boolean dispatchTouchEvent(android.view.MotionEvent event);
public abstract  boolean dispatchTrackballEvent(android.view.MotionEvent event);
public abstract  boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event);
public abstract  android.view.View onCreatePanelView(int featureId);
public abstract  boolean onCreatePanelMenu(int featureId, android.view.Menu menu);
public abstract  boolean onPreparePanel(int featureId, android.view.View view, android.view.Menu menu);
public abstract  boolean onMenuOpened(int featureId, android.view.Menu menu);
public abstract  boolean onMenuItemSelected(int featureId, android.view.MenuItem item);
public abstract  void onWindowAttributesChanged(android.view.WindowManager.LayoutParams attrs);
public abstract  void onContentChanged();
public abstract  void onWindowFocusChanged(boolean hasFocus);
public abstract  void onAttachedToWindow();
public abstract  void onDetachedFromWindow();
public abstract  void onPanelClosed(int featureId, android.view.Menu menu);
public abstract  boolean onSearchRequested();
}
public  Window(android.content.Context context) { throw new RuntimeException("Stub!"); }
public final  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public final  android.content.res.TypedArray getWindowStyle() { throw new RuntimeException("Stub!"); }
public  void setContainer(android.view.Window container) { throw new RuntimeException("Stub!"); }
public final  android.view.Window getContainer() { throw new RuntimeException("Stub!"); }
public final  boolean hasChildren() { throw new RuntimeException("Stub!"); }
public  void setWindowManager(android.view.WindowManager wm, android.os.IBinder appToken, java.lang.String appName) { throw new RuntimeException("Stub!"); }
public  android.view.WindowManager getWindowManager() { throw new RuntimeException("Stub!"); }
public  void setCallback(android.view.Window.Callback callback) { throw new RuntimeException("Stub!"); }
public final  android.view.Window.Callback getCallback() { throw new RuntimeException("Stub!"); }
public abstract  boolean isFloating();
public  void setLayout(int width, int height) { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  void setType(int type) { throw new RuntimeException("Stub!"); }
public  void setFormat(int format) { throw new RuntimeException("Stub!"); }
public  void setWindowAnimations(int resId) { throw new RuntimeException("Stub!"); }
public  void setSoftInputMode(int mode) { throw new RuntimeException("Stub!"); }
public  void addFlags(int flags) { throw new RuntimeException("Stub!"); }
public  void clearFlags(int flags) { throw new RuntimeException("Stub!"); }
public  void setFlags(int flags, int mask) { throw new RuntimeException("Stub!"); }
public  void setAttributes(android.view.WindowManager.LayoutParams a) { throw new RuntimeException("Stub!"); }
public final  android.view.WindowManager.LayoutParams getAttributes() { throw new RuntimeException("Stub!"); }
protected final  int getForcedWindowFlags() { throw new RuntimeException("Stub!"); }
protected final  boolean hasSoftInputMode() { throw new RuntimeException("Stub!"); }
public  boolean requestFeature(int featureId) { throw new RuntimeException("Stub!"); }
public final  void makeActive() { throw new RuntimeException("Stub!"); }
public final  boolean isActive() { throw new RuntimeException("Stub!"); }
public  android.view.View findViewById(int id) { throw new RuntimeException("Stub!"); }
public abstract  void setContentView(int layoutResID);
public abstract  void setContentView(android.view.View view);
public abstract  void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams params);
public abstract  void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams params);
public abstract  android.view.View getCurrentFocus();
public abstract  android.view.LayoutInflater getLayoutInflater();
public abstract  void setTitle(java.lang.CharSequence title);
public abstract  void setTitleColor(int textColor);
public abstract  void openPanel(int featureId, android.view.KeyEvent event);
public abstract  void closePanel(int featureId);
public abstract  void togglePanel(int featureId, android.view.KeyEvent event);
public abstract  boolean performPanelShortcut(int featureId, int keyCode, android.view.KeyEvent event, int flags);
public abstract  boolean performPanelIdentifierAction(int featureId, int id, int flags);
public abstract  void closeAllPanels();
public abstract  boolean performContextMenuIdentifierAction(int id, int flags);
public abstract  void onConfigurationChanged(android.content.res.Configuration newConfig);
public  void setBackgroundDrawableResource(int resid) { throw new RuntimeException("Stub!"); }
public abstract  void setBackgroundDrawable(android.graphics.drawable.Drawable drawable);
public abstract  void setFeatureDrawableResource(int featureId, int resId);
public abstract  void setFeatureDrawableUri(int featureId, android.net.Uri uri);
public abstract  void setFeatureDrawable(int featureId, android.graphics.drawable.Drawable drawable);
public abstract  void setFeatureDrawableAlpha(int featureId, int alpha);
public abstract  void setFeatureInt(int featureId, int value);
public abstract  void takeKeyEvents(boolean get);
public abstract  boolean superDispatchKeyEvent(android.view.KeyEvent event);
public abstract  boolean superDispatchTouchEvent(android.view.MotionEvent event);
public abstract  boolean superDispatchTrackballEvent(android.view.MotionEvent event);
public abstract  android.view.View getDecorView();
public abstract  android.view.View peekDecorView();
public abstract  android.os.Bundle saveHierarchyState();
public abstract  void restoreHierarchyState(android.os.Bundle savedInstanceState);
protected abstract  void onActive();
protected final  int getFeatures() { throw new RuntimeException("Stub!"); }
protected final  int getLocalFeatures() { throw new RuntimeException("Stub!"); }
protected  void setDefaultWindowFormat(int format) { throw new RuntimeException("Stub!"); }
public abstract  void setChildDrawable(int featureId, android.graphics.drawable.Drawable drawable);
public abstract  void setChildInt(int featureId, int value);
public abstract  boolean isShortcutKey(int keyCode, android.view.KeyEvent event);
public abstract  void setVolumeControlStream(int streamType);
public abstract  int getVolumeControlStream();
public static final int FEATURE_OPTIONS_PANEL = 0;
public static final int FEATURE_NO_TITLE = 1;
public static final int FEATURE_PROGRESS = 2;
public static final int FEATURE_LEFT_ICON = 3;
public static final int FEATURE_RIGHT_ICON = 4;
public static final int FEATURE_INDETERMINATE_PROGRESS = 5;
public static final int FEATURE_CONTEXT_MENU = 6;
public static final int FEATURE_CUSTOM_TITLE = 7;
public static final int PROGRESS_VISIBILITY_ON = -1;
public static final int PROGRESS_VISIBILITY_OFF = -2;
public static final int PROGRESS_INDETERMINATE_ON = -3;
public static final int PROGRESS_INDETERMINATE_OFF = -4;
public static final int PROGRESS_START = 0;
public static final int PROGRESS_END = 10000;
public static final int PROGRESS_SECONDARY_START = 20000;
public static final int PROGRESS_SECONDARY_END = 30000;
protected static final int DEFAULT_FEATURES = 65;
public static final int ID_ANDROID_CONTENT = 16908290;
}
