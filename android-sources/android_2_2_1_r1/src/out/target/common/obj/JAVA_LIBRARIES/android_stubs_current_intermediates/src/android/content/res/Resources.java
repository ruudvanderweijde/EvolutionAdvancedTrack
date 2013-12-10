package android.content.res;
public class Resources
{
public static class NotFoundException
  extends java.lang.RuntimeException
{
public  NotFoundException() { throw new RuntimeException("Stub!"); }
public  NotFoundException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public final class Theme
{
Theme() { throw new RuntimeException("Stub!"); }
public  void applyStyle(int resid, boolean force) { throw new RuntimeException("Stub!"); }
public  void setTo(android.content.res.Resources.Theme other) { throw new RuntimeException("Stub!"); }
public  android.content.res.TypedArray obtainStyledAttributes(int[] attrs) { throw new RuntimeException("Stub!"); }
public  android.content.res.TypedArray obtainStyledAttributes(int resid, int[] attrs) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
public  boolean resolveAttribute(int resid, android.util.TypedValue outValue, boolean resolveRefs) { throw new RuntimeException("Stub!"); }
public  void dump(int priority, java.lang.String tag, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
public  Resources(android.content.res.AssetManager assets, android.util.DisplayMetrics metrics, android.content.res.Configuration config) { throw new RuntimeException("Stub!"); }
public static  android.content.res.Resources getSystem() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getQuantityText(int id, int quantity) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(int id, java.lang.Object... formatArgs) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.String getQuantityString(int id, int quantity, java.lang.Object... formatArgs) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.String getQuantityString(int id, int quantity) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText(int id, java.lang.CharSequence def) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence[] getTextArray(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getStringArray(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  int[] getIntArray(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.TypedArray obtainTypedArray(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  float getDimension(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  int getDimensionPixelOffset(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  int getDimensionPixelSize(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  float getFraction(int id, int base, int pbase) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDrawable(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.Movie getMovie(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  int getColor(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getColorStateList(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  boolean getBoolean(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  int getInteger(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.XmlResourceParser getLayout(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.XmlResourceParser getAnimation(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.XmlResourceParser getXml(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.io.InputStream openRawResource(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.io.InputStream openRawResource(int id, android.util.TypedValue value) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.AssetFileDescriptor openRawResourceFd(int id) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  void getValue(int id, android.util.TypedValue outValue, boolean resolveRefs) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  void getValue(java.lang.String name, android.util.TypedValue outValue, boolean resolveRefs) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.Resources.Theme newTheme() { throw new RuntimeException("Stub!"); }
public  android.content.res.TypedArray obtainAttributes(android.util.AttributeSet set, int[] attrs) { throw new RuntimeException("Stub!"); }
public  void updateConfiguration(android.content.res.Configuration config, android.util.DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
public  android.util.DisplayMetrics getDisplayMetrics() { throw new RuntimeException("Stub!"); }
public  android.content.res.Configuration getConfiguration() { throw new RuntimeException("Stub!"); }
public  int getIdentifier(java.lang.String name, java.lang.String defType, java.lang.String defPackage) { throw new RuntimeException("Stub!"); }
public  java.lang.String getResourceName(int resid) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.String getResourcePackageName(int resid) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.String getResourceTypeName(int resid) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.String getResourceEntryName(int resid) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  void parseBundleExtras(android.content.res.XmlResourceParser parser, android.os.Bundle outBundle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parseBundleExtra(java.lang.String tagName, android.util.AttributeSet attrs, android.os.Bundle outBundle) throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetManager getAssets() { throw new RuntimeException("Stub!"); }
public final  void flushLayoutCache() { throw new RuntimeException("Stub!"); }
public final  void finishPreloading() { throw new RuntimeException("Stub!"); }
}
