package android.hardware;
@java.lang.Deprecated()
public interface SensorListener
{
public abstract  void onSensorChanged(int sensor, float[] values);
public abstract  void onAccuracyChanged(int sensor, int accuracy);
}
