package android.graphics.drawable;
public class ShapeDrawable
  extends android.graphics.drawable.Drawable
{
public abstract static class ShaderFactory
{
public  ShaderFactory() { throw new RuntimeException("Stub!"); }
public abstract  android.graphics.Shader resize(int width, int height);
}
public  ShapeDrawable() { throw new RuntimeException("Stub!"); }
public  ShapeDrawable(android.graphics.drawable.shapes.Shape s) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.shapes.Shape getShape() { throw new RuntimeException("Stub!"); }
public  void setShape(android.graphics.drawable.shapes.Shape s) { throw new RuntimeException("Stub!"); }
public  void setShaderFactory(android.graphics.drawable.ShapeDrawable.ShaderFactory fact) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.ShapeDrawable.ShaderFactory getShaderFactory() { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint getPaint() { throw new RuntimeException("Stub!"); }
public  void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  void setIntrinsicWidth(int width) { throw new RuntimeException("Stub!"); }
public  void setIntrinsicHeight(int height) { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  boolean getPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.drawable.shapes.Shape shape, android.graphics.Canvas canvas, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter cf) { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
protected  boolean inflateTag(java.lang.String name, android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
}
