package android.widget;
public class TabHost
  extends android.widget.FrameLayout
  implements android.view.ViewTreeObserver.OnTouchModeChangeListener
{
public static interface OnTabChangeListener
{
public abstract  void onTabChanged(java.lang.String tabId);
}
public static interface TabContentFactory
{
public abstract  android.view.View createTabContent(java.lang.String tag);
}
public class TabSpec
{
TabSpec() { throw new RuntimeException("Stub!"); }
public  android.widget.TabHost.TabSpec setIndicator(java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public  android.widget.TabHost.TabSpec setIndicator(java.lang.CharSequence label, android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
public  android.widget.TabHost.TabSpec setIndicator(android.view.View view) { throw new RuntimeException("Stub!"); }
public  android.widget.TabHost.TabSpec setContent(int viewId) { throw new RuntimeException("Stub!"); }
public  android.widget.TabHost.TabSpec setContent(android.widget.TabHost.TabContentFactory contentFactory) { throw new RuntimeException("Stub!"); }
public  android.widget.TabHost.TabSpec setContent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  java.lang.String getTag() { throw new RuntimeException("Stub!"); }
}
public  TabHost(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  TabHost(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  android.widget.TabHost.TabSpec newTabSpec(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  void setup() { throw new RuntimeException("Stub!"); }
public  void setup(android.app.LocalActivityManager activityGroup) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  void onTouchModeChanged(boolean isInTouchMode) { throw new RuntimeException("Stub!"); }
public  void addTab(android.widget.TabHost.TabSpec tabSpec) { throw new RuntimeException("Stub!"); }
public  void clearAllTabs() { throw new RuntimeException("Stub!"); }
public  android.widget.TabWidget getTabWidget() { throw new RuntimeException("Stub!"); }
public  int getCurrentTab() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCurrentTabTag() { throw new RuntimeException("Stub!"); }
public  android.view.View getCurrentTabView() { throw new RuntimeException("Stub!"); }
public  android.view.View getCurrentView() { throw new RuntimeException("Stub!"); }
public  void setCurrentTabByTag(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  android.widget.FrameLayout getTabContentView() { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
public  void setCurrentTab(int index) { throw new RuntimeException("Stub!"); }
public  void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener l) { throw new RuntimeException("Stub!"); }
}
