package android.view.animation;
public class Transformation
{
public  Transformation() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  int getTransformationType() { throw new RuntimeException("Stub!"); }
public  void setTransformationType(int transformationType) { throw new RuntimeException("Stub!"); }
public  void set(android.view.animation.Transformation t) { throw new RuntimeException("Stub!"); }
public  void compose(android.view.animation.Transformation t) { throw new RuntimeException("Stub!"); }
public  android.graphics.Matrix getMatrix() { throw new RuntimeException("Stub!"); }
public  void setAlpha(float alpha) { throw new RuntimeException("Stub!"); }
public  float getAlpha() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toShortString() { throw new RuntimeException("Stub!"); }
public static int TYPE_IDENTITY;
public static int TYPE_ALPHA;
public static int TYPE_MATRIX;
public static int TYPE_BOTH;
protected android.graphics.Matrix mMatrix;
protected float mAlpha;
protected int mTransformationType;
}
