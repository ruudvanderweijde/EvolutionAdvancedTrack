package android.hardware;
public interface SensorEventListener
{
public abstract  void onSensorChanged(android.hardware.SensorEvent event);
public abstract  void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy);
}
