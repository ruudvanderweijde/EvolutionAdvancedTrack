package android.graphics.drawable.shapes;
public abstract class Shape
  implements java.lang.Cloneable
{
public  Shape() { throw new RuntimeException("Stub!"); }
public final  float getWidth() { throw new RuntimeException("Stub!"); }
public final  float getHeight() { throw new RuntimeException("Stub!"); }
public abstract  void draw(android.graphics.Canvas canvas, android.graphics.Paint paint);
public final  void resize(float width, float height) { throw new RuntimeException("Stub!"); }
public  boolean hasAlpha() { throw new RuntimeException("Stub!"); }
protected  void onResize(float width, float height) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.shapes.Shape clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
