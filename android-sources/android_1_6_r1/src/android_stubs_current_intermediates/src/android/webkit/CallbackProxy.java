package android.webkit;
 class CallbackProxy
  extends android.os.Handler
{
public  CallbackProxy(android.content.Context context, android.webkit.WebView w) { throw new RuntimeException("Stub!"); }
public  void setWebViewClient(android.webkit.WebViewClient client) { throw new RuntimeException("Stub!"); }
public  void setWebChromeClient(android.webkit.WebChromeClient client) { throw new RuntimeException("Stub!"); }
public  void setDownloadListener(android.webkit.DownloadListener client) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebBackForwardList getBackForwardList() { throw new RuntimeException("Stub!"); }
public  boolean uiOverrideUrlLoading(java.lang.String overrideUrl) { throw new RuntimeException("Stub!"); }
public  boolean uiOverrideKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void handleMessage(android.os.Message msg) { throw new RuntimeException("Stub!"); }
public  int getProgress() { throw new RuntimeException("Stub!"); }
public  void onPageStarted(java.lang.String url, android.graphics.Bitmap favicon) { throw new RuntimeException("Stub!"); }
public  void onPageFinished(java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void onTooManyRedirects(android.os.Message cancelMsg, android.os.Message continueMsg) { throw new RuntimeException("Stub!"); }
public  void onReceivedError(int errorCode, java.lang.String description, java.lang.String failingUrl) { throw new RuntimeException("Stub!"); }
public  void onFormResubmission(android.os.Message dontResend, android.os.Message resend) { throw new RuntimeException("Stub!"); }
public  boolean shouldOverrideUrlLoading(java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void onReceivedHttpAuthRequest(android.webkit.HttpAuthHandler handler, java.lang.String hostName, java.lang.String realmName) { throw new RuntimeException("Stub!"); }
public  void doUpdateVisitedHistory(java.lang.String url, boolean isReload) { throw new RuntimeException("Stub!"); }
public  void onLoadResource(java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void onUnhandledKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onScaleChanged(float oldScale, float newScale) { throw new RuntimeException("Stub!"); }
public  boolean onDownloadStart(java.lang.String url, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimetype, long contentLength) { throw new RuntimeException("Stub!"); }
public  boolean onSavePassword(java.lang.String schemePlusHost, java.lang.String username, java.lang.String password, android.os.Message resumeMsg) { throw new RuntimeException("Stub!"); }
public  void onProgressChanged(int newProgress) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebView createWindow(boolean dialog, boolean userGesture) { throw new RuntimeException("Stub!"); }
public  void onRequestFocus() { throw new RuntimeException("Stub!"); }
public  void onCloseWindow(android.webkit.WebView window) { throw new RuntimeException("Stub!"); }
public  void onReceivedIcon(android.graphics.Bitmap icon) { throw new RuntimeException("Stub!"); }
public  void onReceivedTitle(java.lang.String title) { throw new RuntimeException("Stub!"); }
public  void onJsAlert(java.lang.String url, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  boolean onJsConfirm(java.lang.String url, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  java.lang.String onJsPrompt(java.lang.String url, java.lang.String message, java.lang.String defaultValue) { throw new RuntimeException("Stub!"); }
public  boolean onJsBeforeUnload(java.lang.String url, java.lang.String message) { throw new RuntimeException("Stub!"); }
}
