package android.view;
public abstract class OrientationEventListener
{
public  OrientationEventListener(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  OrientationEventListener(android.content.Context context, int rate) { throw new RuntimeException("Stub!"); }
public  void enable() { throw new RuntimeException("Stub!"); }
public  void disable() { throw new RuntimeException("Stub!"); }
public  boolean canDetectOrientation() { throw new RuntimeException("Stub!"); }
public abstract  void onOrientationChanged(int orientation);
public static final int ORIENTATION_UNKNOWN = -1;
}
