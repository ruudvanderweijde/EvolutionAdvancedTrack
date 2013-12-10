package android.webkit;
public class WebSettings
{
public static enum LayoutAlgorithm
{
NARROW_COLUMNS(),
NORMAL(),
SINGLE_COLUMN();
}
public static enum TextSize
{
LARGER(),
LARGEST(),
NORMAL(),
SMALLER(),
SMALLEST();
}
public static enum RenderPriority
{
HIGH(),
LOW(),
NORMAL();
}
WebSettings() { throw new RuntimeException("Stub!"); }
public  void setNavDump(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean getNavDump() { throw new RuntimeException("Stub!"); }
public  void setSupportZoom(boolean support) { throw new RuntimeException("Stub!"); }
public  boolean supportZoom() { throw new RuntimeException("Stub!"); }
public  void setBuiltInZoomControls(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean getBuiltInZoomControls() { throw new RuntimeException("Stub!"); }
public  void setAllowFileAccess(boolean allow) { throw new RuntimeException("Stub!"); }
public  boolean getAllowFileAccess() { throw new RuntimeException("Stub!"); }
public  void setSaveFormData(boolean save) { throw new RuntimeException("Stub!"); }
public  boolean getSaveFormData() { throw new RuntimeException("Stub!"); }
public  void setSavePassword(boolean save) { throw new RuntimeException("Stub!"); }
public  boolean getSavePassword() { throw new RuntimeException("Stub!"); }
public synchronized  void setTextSize(android.webkit.WebSettings.TextSize t) { throw new RuntimeException("Stub!"); }
public synchronized  android.webkit.WebSettings.TextSize getTextSize() { throw new RuntimeException("Stub!"); }
public  void setLightTouchEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean getLightTouchEnabled() { throw new RuntimeException("Stub!"); }
public synchronized  void setUseDoubleTree(boolean use) { throw new RuntimeException("Stub!"); }
public synchronized  boolean getUseDoubleTree() { throw new RuntimeException("Stub!"); }
public synchronized  void setUserAgent(int ua) { throw new RuntimeException("Stub!"); }
public synchronized  int getUserAgent() { throw new RuntimeException("Stub!"); }
public synchronized  void setUseWideViewPort(boolean use) { throw new RuntimeException("Stub!"); }
public synchronized  boolean getUseWideViewPort() { throw new RuntimeException("Stub!"); }
public synchronized  void setSupportMultipleWindows(boolean support) { throw new RuntimeException("Stub!"); }
public synchronized  boolean supportMultipleWindows() { throw new RuntimeException("Stub!"); }
public synchronized  void setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm l) { throw new RuntimeException("Stub!"); }
public synchronized  android.webkit.WebSettings.LayoutAlgorithm getLayoutAlgorithm() { throw new RuntimeException("Stub!"); }
public synchronized  void setStandardFontFamily(java.lang.String font) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getStandardFontFamily() { throw new RuntimeException("Stub!"); }
public synchronized  void setFixedFontFamily(java.lang.String font) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getFixedFontFamily() { throw new RuntimeException("Stub!"); }
public synchronized  void setSansSerifFontFamily(java.lang.String font) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getSansSerifFontFamily() { throw new RuntimeException("Stub!"); }
public synchronized  void setSerifFontFamily(java.lang.String font) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getSerifFontFamily() { throw new RuntimeException("Stub!"); }
public synchronized  void setCursiveFontFamily(java.lang.String font) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getCursiveFontFamily() { throw new RuntimeException("Stub!"); }
public synchronized  void setFantasyFontFamily(java.lang.String font) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getFantasyFontFamily() { throw new RuntimeException("Stub!"); }
public synchronized  void setMinimumFontSize(int size) { throw new RuntimeException("Stub!"); }
public synchronized  int getMinimumFontSize() { throw new RuntimeException("Stub!"); }
public synchronized  void setMinimumLogicalFontSize(int size) { throw new RuntimeException("Stub!"); }
public synchronized  int getMinimumLogicalFontSize() { throw new RuntimeException("Stub!"); }
public synchronized  void setDefaultFontSize(int size) { throw new RuntimeException("Stub!"); }
public synchronized  int getDefaultFontSize() { throw new RuntimeException("Stub!"); }
public synchronized  void setDefaultFixedFontSize(int size) { throw new RuntimeException("Stub!"); }
public synchronized  int getDefaultFixedFontSize() { throw new RuntimeException("Stub!"); }
public synchronized  void setLoadsImagesAutomatically(boolean flag) { throw new RuntimeException("Stub!"); }
public synchronized  boolean getLoadsImagesAutomatically() { throw new RuntimeException("Stub!"); }
public synchronized  void setBlockNetworkImage(boolean flag) { throw new RuntimeException("Stub!"); }
public synchronized  boolean getBlockNetworkImage() { throw new RuntimeException("Stub!"); }
public synchronized  void setJavaScriptEnabled(boolean flag) { throw new RuntimeException("Stub!"); }
public synchronized  void setPluginsEnabled(boolean flag) { throw new RuntimeException("Stub!"); }
public synchronized  void setPluginsPath(java.lang.String pluginsPath) { throw new RuntimeException("Stub!"); }
public synchronized  boolean getJavaScriptEnabled() { throw new RuntimeException("Stub!"); }
public synchronized  boolean getPluginsEnabled() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getPluginsPath() { throw new RuntimeException("Stub!"); }
public synchronized  void setJavaScriptCanOpenWindowsAutomatically(boolean flag) { throw new RuntimeException("Stub!"); }
public synchronized  boolean getJavaScriptCanOpenWindowsAutomatically() { throw new RuntimeException("Stub!"); }
public synchronized  void setDefaultTextEncodingName(java.lang.String encoding) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getDefaultTextEncodingName() { throw new RuntimeException("Stub!"); }
public synchronized  void setUserAgentString(java.lang.String ua) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getUserAgentString() { throw new RuntimeException("Stub!"); }
public  void setNeedInitialFocus(boolean flag) { throw new RuntimeException("Stub!"); }
public synchronized  void setRenderPriority(android.webkit.WebSettings.RenderPriority priority) { throw new RuntimeException("Stub!"); }
public  void setCacheMode(int mode) { throw new RuntimeException("Stub!"); }
public  int getCacheMode() { throw new RuntimeException("Stub!"); }
public static final int LOAD_DEFAULT = -1;
public static final int LOAD_NORMAL = 0;
public static final int LOAD_CACHE_ELSE_NETWORK = 1;
public static final int LOAD_NO_CACHE = 2;
public static final int LOAD_CACHE_ONLY = 3;
}
