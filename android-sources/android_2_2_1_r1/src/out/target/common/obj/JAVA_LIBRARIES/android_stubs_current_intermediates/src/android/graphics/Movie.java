package android.graphics;
public class Movie
{
Movie() { throw new RuntimeException("Stub!"); }
public native  int width();
public native  int height();
public native  boolean isOpaque();
public native  int duration();
public native  boolean setTime(int relativeMilliseconds);
public native  void draw(android.graphics.Canvas canvas, float x, float y, android.graphics.Paint paint);
public  void draw(android.graphics.Canvas canvas, float x, float y) { throw new RuntimeException("Stub!"); }
public static native  android.graphics.Movie decodeStream(java.io.InputStream is);
public static native  android.graphics.Movie decodeByteArray(byte[] data, int offset, int length);
public static  android.graphics.Movie decodeFile(java.lang.String pathName) { throw new RuntimeException("Stub!"); }
}
