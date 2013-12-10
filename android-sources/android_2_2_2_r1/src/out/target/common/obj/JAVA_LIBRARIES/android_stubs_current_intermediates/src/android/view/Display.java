package android.view;
public class Display
{
Display() { throw new RuntimeException("Stub!"); }
public  int getDisplayId() { throw new RuntimeException("Stub!"); }
public native  int getWidth();
public native  int getHeight();
public  int getRotation() { throw new RuntimeException("Stub!"); }
public native  int getOrientation();
public  int getPixelFormat() { throw new RuntimeException("Stub!"); }
public  float getRefreshRate() { throw new RuntimeException("Stub!"); }
public  void getMetrics(android.util.DisplayMetrics outMetrics) { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_DISPLAY = 0;
}
