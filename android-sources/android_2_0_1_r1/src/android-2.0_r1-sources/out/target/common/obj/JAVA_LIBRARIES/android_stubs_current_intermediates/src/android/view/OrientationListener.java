package android.view;
@java.lang.Deprecated()
public abstract class OrientationListener
  implements android.hardware.SensorListener
{
public  OrientationListener(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  OrientationListener(android.content.Context context, int rate) { throw new RuntimeException("Stub!"); }
public  void enable() { throw new RuntimeException("Stub!"); }
public  void disable() { throw new RuntimeException("Stub!"); }
public  void onAccuracyChanged(int sensor, int accuracy) { throw new RuntimeException("Stub!"); }
public  void onSensorChanged(int sensor, float[] values) { throw new RuntimeException("Stub!"); }
public abstract  void onOrientationChanged(int orientation);
public static final int ORIENTATION_UNKNOWN = -1;
}
