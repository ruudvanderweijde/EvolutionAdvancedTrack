package android.webkit;
public class WebView
  extends android.widget.AbsoluteLayout
  implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener, android.view.ViewGroup.OnHierarchyChangeListener
{
public class WebViewTransport
{
public  WebViewTransport() { throw new RuntimeException("Stub!"); }
public synchronized  void setWebView(android.webkit.WebView webview) { throw new RuntimeException("Stub!"); }
public synchronized  android.webkit.WebView getWebView() { throw new RuntimeException("Stub!"); }
}
public static interface PictureListener
{
public abstract  void onNewPicture(android.webkit.WebView view, android.graphics.Picture picture);
}
public class HitTestResult
{
HitTestResult() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getExtra() { throw new RuntimeException("Stub!"); }
public static final int UNKNOWN_TYPE = 0;
public static final int ANCHOR_TYPE = 1;
public static final int PHONE_TYPE = 2;
public static final int GEO_TYPE = 3;
public static final int EMAIL_TYPE = 4;
public static final int IMAGE_TYPE = 5;
public static final int IMAGE_ANCHOR_TYPE = 6;
public static final int SRC_ANCHOR_TYPE = 7;
public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
public static final int EDIT_TEXT_TYPE = 9;
}
public  WebView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  WebView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  WebView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setScrollBarStyle(int style) { throw new RuntimeException("Stub!"); }
public  void setHorizontalScrollbarOverlay(boolean overlay) { throw new RuntimeException("Stub!"); }
public  void setVerticalScrollbarOverlay(boolean overlay) { throw new RuntimeException("Stub!"); }
public  boolean overlayHorizontalScrollbar() { throw new RuntimeException("Stub!"); }
public  boolean overlayVerticalScrollbar() { throw new RuntimeException("Stub!"); }
public  android.net.http.SslCertificate getCertificate() { throw new RuntimeException("Stub!"); }
public  void setCertificate(android.net.http.SslCertificate certificate) { throw new RuntimeException("Stub!"); }
public  void savePassword(java.lang.String host, java.lang.String username, java.lang.String password) { throw new RuntimeException("Stub!"); }
public  void setHttpAuthUsernamePassword(java.lang.String host, java.lang.String realm, java.lang.String username, java.lang.String password) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getHttpAuthUsernamePassword(java.lang.String host, java.lang.String realm) { throw new RuntimeException("Stub!"); }
public  void destroy() { throw new RuntimeException("Stub!"); }
public static  void enablePlatformNotifications() { throw new RuntimeException("Stub!"); }
public static  void disablePlatformNotifications() { throw new RuntimeException("Stub!"); }
public  void setNetworkAvailable(boolean networkUp) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebBackForwardList saveState(android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
public  boolean savePicture(android.os.Bundle b, java.io.File dest) { throw new RuntimeException("Stub!"); }
public  boolean restorePicture(android.os.Bundle b, java.io.File src) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebBackForwardList restoreState(android.os.Bundle inState) { throw new RuntimeException("Stub!"); }
public  void loadUrl(java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void loadData(java.lang.String data, java.lang.String mimeType, java.lang.String encoding) { throw new RuntimeException("Stub!"); }
public  void loadDataWithBaseURL(java.lang.String baseUrl, java.lang.String data, java.lang.String mimeType, java.lang.String encoding, java.lang.String failUrl) { throw new RuntimeException("Stub!"); }
public  void stopLoading() { throw new RuntimeException("Stub!"); }
public  void reload() { throw new RuntimeException("Stub!"); }
public  boolean canGoBack() { throw new RuntimeException("Stub!"); }
public  void goBack() { throw new RuntimeException("Stub!"); }
public  boolean canGoForward() { throw new RuntimeException("Stub!"); }
public  void goForward() { throw new RuntimeException("Stub!"); }
public  boolean canGoBackOrForward(int steps) { throw new RuntimeException("Stub!"); }
public  void goBackOrForward(int steps) { throw new RuntimeException("Stub!"); }
public  boolean pageUp(boolean top) { throw new RuntimeException("Stub!"); }
public  boolean pageDown(boolean bottom) { throw new RuntimeException("Stub!"); }
public  void clearView() { throw new RuntimeException("Stub!"); }
public  android.graphics.Picture capturePicture() { throw new RuntimeException("Stub!"); }
public  float getScale() { throw new RuntimeException("Stub!"); }
public  void setInitialScale(int scaleInPercent) { throw new RuntimeException("Stub!"); }
public  void invokeZoomPicker() { throw new RuntimeException("Stub!"); }
public  android.webkit.WebView.HitTestResult getHitTestResult() { throw new RuntimeException("Stub!"); }
public  void requestFocusNodeHref(android.os.Message hrefMsg) { throw new RuntimeException("Stub!"); }
public  void requestImageRef(android.os.Message msg) { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUrl() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOriginalUrl() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTitle() { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getFavicon() { throw new RuntimeException("Stub!"); }
public  int getProgress() { throw new RuntimeException("Stub!"); }
public  int getContentHeight() { throw new RuntimeException("Stub!"); }
public  void pauseTimers() { throw new RuntimeException("Stub!"); }
public  void resumeTimers() { throw new RuntimeException("Stub!"); }
public  void clearCache(boolean includeDiskFiles) { throw new RuntimeException("Stub!"); }
public  void clearFormData() { throw new RuntimeException("Stub!"); }
public  void clearHistory() { throw new RuntimeException("Stub!"); }
public  void clearSslPreferences() { throw new RuntimeException("Stub!"); }
public  android.webkit.WebBackForwardList copyBackForwardList() { throw new RuntimeException("Stub!"); }
public  void findNext(boolean forward) { throw new RuntimeException("Stub!"); }
public  int findAll(java.lang.String find) { throw new RuntimeException("Stub!"); }
public static  java.lang.String findAddress(java.lang.String addr) { throw new RuntimeException("Stub!"); }
public  void clearMatches() { throw new RuntimeException("Stub!"); }
public  void documentHasImages(android.os.Message response) { throw new RuntimeException("Stub!"); }
public  void computeScroll() { throw new RuntimeException("Stub!"); }
public  void setWebViewClient(android.webkit.WebViewClient client) { throw new RuntimeException("Stub!"); }
public  void setDownloadListener(android.webkit.DownloadListener listener) { throw new RuntimeException("Stub!"); }
public  void setWebChromeClient(android.webkit.WebChromeClient client) { throw new RuntimeException("Stub!"); }
public  void setPictureListener(android.webkit.WebView.PictureListener listener) { throw new RuntimeException("Stub!"); }
public  void addJavascriptInterface(java.lang.Object obj, java.lang.String interfaceName) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebSettings getSettings() { throw new RuntimeException("Stub!"); }
public static synchronized  android.webkit.PluginList getPluginList() { throw new RuntimeException("Stub!"); }
public  void refreshPlugins(boolean reloadOpenPages) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void setLayoutParams(android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  boolean performLongClick() { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  void onChildViewAdded(android.view.View parent, android.view.View child) { throw new RuntimeException("Stub!"); }
public  void onChildViewRemoved(android.view.View p, android.view.View child) { throw new RuntimeException("Stub!"); }
public  void onGlobalFocusChanged(android.view.View oldFocus, android.view.View newFocus) { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
protected  void onSizeChanged(int w, int h, int ow, int oh) { throw new RuntimeException("Stub!"); }
protected  void onScrollChanged(int l, int t, int oldl, int oldt) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  void setMapTrackballToArrowKeys(boolean setMap) { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  void flingScroll(int vx, int vy) { throw new RuntimeException("Stub!"); }
public  android.view.View getZoomControls() { throw new RuntimeException("Stub!"); }
public  boolean zoomIn() { throw new RuntimeException("Stub!"); }
public  boolean zoomOut() { throw new RuntimeException("Stub!"); }
public  boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
public  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rect, boolean immediate) { throw new RuntimeException("Stub!"); }
public  void setBackgroundColor(int color) { throw new RuntimeException("Stub!"); }
public  void debugDump() { throw new RuntimeException("Stub!"); }
public static final java.lang.String SCHEME_TEL = "tel:";
public static final java.lang.String SCHEME_MAILTO = "mailto:";
public static final java.lang.String SCHEME_GEO = "geo:0,0?q=";
}
