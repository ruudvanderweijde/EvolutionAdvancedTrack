package android.graphics;
public class NinePatch
{
public  NinePatch(android.graphics.Bitmap bitmap, byte[] chunk, java.lang.String srcName) { throw new RuntimeException("Stub!"); }
public  void setPaint(android.graphics.Paint p) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas, android.graphics.RectF location) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas, android.graphics.Rect location) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas, android.graphics.Rect location, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  int getDensity() { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public final  boolean hasAlpha() { throw new RuntimeException("Stub!"); }
public final  android.graphics.Region getTransparentRegion(android.graphics.Rect location) { throw new RuntimeException("Stub!"); }
public static native  boolean isNinePatchChunk(byte[] chunk);
}
