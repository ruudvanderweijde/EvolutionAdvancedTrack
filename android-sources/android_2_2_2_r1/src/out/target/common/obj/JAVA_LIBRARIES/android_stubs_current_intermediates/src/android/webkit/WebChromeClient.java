package android.webkit;
public class WebChromeClient
{
public static interface CustomViewCallback
{
public abstract  void onCustomViewHidden();
}
public  WebChromeClient() { throw new RuntimeException("Stub!"); }
public  void onProgressChanged(android.webkit.WebView view, int newProgress) { throw new RuntimeException("Stub!"); }
public  void onReceivedTitle(android.webkit.WebView view, java.lang.String title) { throw new RuntimeException("Stub!"); }
public  void onReceivedIcon(android.webkit.WebView view, android.graphics.Bitmap icon) { throw new RuntimeException("Stub!"); }
public  void onReceivedTouchIconUrl(android.webkit.WebView view, java.lang.String url, boolean precomposed) { throw new RuntimeException("Stub!"); }
public  void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback callback) { throw new RuntimeException("Stub!"); }
public  void onHideCustomView() { throw new RuntimeException("Stub!"); }
public  boolean onCreateWindow(android.webkit.WebView view, boolean dialog, boolean userGesture, android.os.Message resultMsg) { throw new RuntimeException("Stub!"); }
public  void onRequestFocus(android.webkit.WebView view) { throw new RuntimeException("Stub!"); }
public  void onCloseWindow(android.webkit.WebView window) { throw new RuntimeException("Stub!"); }
public  boolean onJsAlert(android.webkit.WebView view, java.lang.String url, java.lang.String message, android.webkit.JsResult result) { throw new RuntimeException("Stub!"); }
public  boolean onJsConfirm(android.webkit.WebView view, java.lang.String url, java.lang.String message, android.webkit.JsResult result) { throw new RuntimeException("Stub!"); }
public  boolean onJsPrompt(android.webkit.WebView view, java.lang.String url, java.lang.String message, java.lang.String defaultValue, android.webkit.JsPromptResult result) { throw new RuntimeException("Stub!"); }
public  boolean onJsBeforeUnload(android.webkit.WebView view, java.lang.String url, java.lang.String message, android.webkit.JsResult result) { throw new RuntimeException("Stub!"); }
public  void onExceededDatabaseQuota(java.lang.String url, java.lang.String databaseIdentifier, long currentQuota, long estimatedSize, long totalUsedQuota, android.webkit.WebStorage.QuotaUpdater quotaUpdater) { throw new RuntimeException("Stub!"); }
public  void onReachedMaxAppCacheSize(long spaceNeeded, long totalUsedQuota, android.webkit.WebStorage.QuotaUpdater quotaUpdater) { throw new RuntimeException("Stub!"); }
public  void onGeolocationPermissionsShowPrompt(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) { throw new RuntimeException("Stub!"); }
public  void onGeolocationPermissionsHidePrompt() { throw new RuntimeException("Stub!"); }
public  boolean onJsTimeout() { throw new RuntimeException("Stub!"); }
public  void onConsoleMessage(java.lang.String message, int lineNumber, java.lang.String sourceID) { throw new RuntimeException("Stub!"); }
public  boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getDefaultVideoPoster() { throw new RuntimeException("Stub!"); }
public  android.view.View getVideoLoadingProgressView() { throw new RuntimeException("Stub!"); }
public  void getVisitedHistory(android.webkit.ValueCallback<java.lang.String[]> callback) { throw new RuntimeException("Stub!"); }
}
