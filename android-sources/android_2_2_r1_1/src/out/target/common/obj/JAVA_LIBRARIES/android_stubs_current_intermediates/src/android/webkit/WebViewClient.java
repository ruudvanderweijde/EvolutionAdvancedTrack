package android.webkit;
public class WebViewClient
{
public  WebViewClient() { throw new RuntimeException("Stub!"); }
public  boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) { throw new RuntimeException("Stub!"); }
public  void onPageFinished(android.webkit.WebView view, java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void onLoadResource(android.webkit.WebView view, java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void onTooManyRedirects(android.webkit.WebView view, android.os.Message cancelMsg, android.os.Message continueMsg) { throw new RuntimeException("Stub!"); }
public  void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) { throw new RuntimeException("Stub!"); }
public  void onFormResubmission(android.webkit.WebView view, android.os.Message dontResend, android.os.Message resend) { throw new RuntimeException("Stub!"); }
public  void doUpdateVisitedHistory(android.webkit.WebView view, java.lang.String url, boolean isReload) { throw new RuntimeException("Stub!"); }
public  void onReceivedSslError(android.webkit.WebView view, android.webkit.SslErrorHandler handler, android.net.http.SslError error) { throw new RuntimeException("Stub!"); }
public  void onReceivedHttpAuthRequest(android.webkit.WebView view, android.webkit.HttpAuthHandler handler, java.lang.String host, java.lang.String realm) { throw new RuntimeException("Stub!"); }
public  boolean shouldOverrideKeyEvent(android.webkit.WebView view, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onUnhandledKeyEvent(android.webkit.WebView view, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onScaleChanged(android.webkit.WebView view, float oldScale, float newScale) { throw new RuntimeException("Stub!"); }
public static final int ERROR_UNKNOWN = -1;
public static final int ERROR_HOST_LOOKUP = -2;
public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
public static final int ERROR_AUTHENTICATION = -4;
public static final int ERROR_PROXY_AUTHENTICATION = -5;
public static final int ERROR_CONNECT = -6;
public static final int ERROR_IO = -7;
public static final int ERROR_TIMEOUT = -8;
public static final int ERROR_REDIRECT_LOOP = -9;
public static final int ERROR_UNSUPPORTED_SCHEME = -10;
public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
public static final int ERROR_BAD_URL = -12;
public static final int ERROR_FILE = -13;
public static final int ERROR_FILE_NOT_FOUND = -14;
public static final int ERROR_TOO_MANY_REQUESTS = -15;
}
