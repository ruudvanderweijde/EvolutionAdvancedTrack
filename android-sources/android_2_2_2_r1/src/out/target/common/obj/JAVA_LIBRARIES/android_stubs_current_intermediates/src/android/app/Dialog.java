package android.app;
public class Dialog
  implements android.content.DialogInterface, android.view.Window.Callback, android.view.KeyEvent.Callback, android.view.View.OnCreateContextMenuListener
{
public  Dialog(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  Dialog(android.content.Context context, int theme) { throw new RuntimeException("Stub!"); }
protected  Dialog(android.content.Context context, boolean cancelable, android.content.DialogInterface.OnCancelListener cancelListener) { throw new RuntimeException("Stub!"); }
public final  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public final  void setOwnerActivity(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public final  android.app.Activity getOwnerActivity() { throw new RuntimeException("Stub!"); }
public  boolean isShowing() { throw new RuntimeException("Stub!"); }
public  void show() { throw new RuntimeException("Stub!"); }
public  void hide() { throw new RuntimeException("Stub!"); }
public  void dismiss() { throw new RuntimeException("Stub!"); }
protected  void onCreate(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
protected  void onStart() { throw new RuntimeException("Stub!"); }
protected  void onStop() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  android.view.Window getWindow() { throw new RuntimeException("Stub!"); }
public  android.view.View getCurrentFocus() { throw new RuntimeException("Stub!"); }
public  android.view.View findViewById(int id) { throw new RuntimeException("Stub!"); }
public  void setContentView(int layoutResID) { throw new RuntimeException("Stub!"); }
public  void setContentView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  void setTitle(int titleId) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyLongPress(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onBackPressed() { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void onWindowAttributesChanged(android.view.WindowManager.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void onContentChanged() { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
public  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
public  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  boolean dispatchTrackballEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
public  android.view.View onCreatePanelView(int featureId) { throw new RuntimeException("Stub!"); }
public  boolean onCreatePanelMenu(int featureId, android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onPreparePanel(int featureId, android.view.View view, android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onMenuOpened(int featureId, android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onMenuItemSelected(int featureId, android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
public  void onPanelClosed(int featureId, android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onCreateOptionsMenu(android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onPrepareOptionsMenu(android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onOptionsItemSelected(android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
public  void onOptionsMenuClosed(android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  void openOptionsMenu() { throw new RuntimeException("Stub!"); }
public  void closeOptionsMenu() { throw new RuntimeException("Stub!"); }
public  void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v, android.view.ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); }
public  void registerForContextMenu(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void unregisterForContextMenu(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void openContextMenu(android.view.View view) { throw new RuntimeException("Stub!"); }
public  boolean onContextItemSelected(android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
public  void onContextMenuClosed(android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean onSearchRequested() { throw new RuntimeException("Stub!"); }
public  void takeKeyEvents(boolean get) { throw new RuntimeException("Stub!"); }
public final  boolean requestWindowFeature(int featureId) { throw new RuntimeException("Stub!"); }
public final  void setFeatureDrawableResource(int featureId, int resId) { throw new RuntimeException("Stub!"); }
public final  void setFeatureDrawableUri(int featureId, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public final  void setFeatureDrawable(int featureId, android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public final  void setFeatureDrawableAlpha(int featureId, int alpha) { throw new RuntimeException("Stub!"); }
public  android.view.LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
public  void setCancelable(boolean flag) { throw new RuntimeException("Stub!"); }
public  void setCanceledOnTouchOutside(boolean cancel) { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void setOnCancelListener(android.content.DialogInterface.OnCancelListener listener) { throw new RuntimeException("Stub!"); }
public  void setCancelMessage(android.os.Message msg) { throw new RuntimeException("Stub!"); }
public  void setOnDismissListener(android.content.DialogInterface.OnDismissListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnShowListener(android.content.DialogInterface.OnShowListener listener) { throw new RuntimeException("Stub!"); }
public  void setDismissMessage(android.os.Message msg) { throw new RuntimeException("Stub!"); }
public final  void setVolumeControlStream(int streamType) { throw new RuntimeException("Stub!"); }
public final  int getVolumeControlStream() { throw new RuntimeException("Stub!"); }
public  void setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener) { throw new RuntimeException("Stub!"); }
}
