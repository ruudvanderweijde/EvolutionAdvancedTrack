package android.graphics.drawable;
public class LayerDrawable
  extends android.graphics.drawable.Drawable
  implements android.graphics.drawable.Drawable.Callback
{
public  LayerDrawable(android.graphics.drawable.Drawable[] layers) { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable findDrawableByLayerId(int id) { throw new RuntimeException("Stub!"); }
public  void setId(int index, int id) { throw new RuntimeException("Stub!"); }
public  int getNumberOfLayers() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDrawable(int index) { throw new RuntimeException("Stub!"); }
public  int getId(int index) { throw new RuntimeException("Stub!"); }
public  boolean setDrawableByLayerId(int id, android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  void setLayerInset(int index, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long when) { throw new RuntimeException("Stub!"); }
public  void unscheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public  boolean getPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter cf) { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); }
protected  boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
}
