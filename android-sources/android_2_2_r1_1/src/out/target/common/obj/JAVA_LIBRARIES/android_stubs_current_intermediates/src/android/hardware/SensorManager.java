package android.hardware;
public class SensorManager
{
SensorManager() { throw new RuntimeException("Stub!"); }
public  int getSensors() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.Sensor> getSensorList(int type) { throw new RuntimeException("Stub!"); }
public  android.hardware.Sensor getDefaultSensor(int type) { throw new RuntimeException("Stub!"); }
public  boolean registerListener(android.hardware.SensorListener listener, int sensors) { throw new RuntimeException("Stub!"); }
public  boolean registerListener(android.hardware.SensorListener listener, int sensors, int rate) { throw new RuntimeException("Stub!"); }
public  void unregisterListener(android.hardware.SensorListener listener, int sensors) { throw new RuntimeException("Stub!"); }
public  void unregisterListener(android.hardware.SensorListener listener) { throw new RuntimeException("Stub!"); }
public  void unregisterListener(android.hardware.SensorEventListener listener, android.hardware.Sensor sensor) { throw new RuntimeException("Stub!"); }
public  void unregisterListener(android.hardware.SensorEventListener listener) { throw new RuntimeException("Stub!"); }
public  boolean registerListener(android.hardware.SensorEventListener listener, android.hardware.Sensor sensor, int rate) { throw new RuntimeException("Stub!"); }
public  boolean registerListener(android.hardware.SensorEventListener listener, android.hardware.Sensor sensor, int rate, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public static  boolean getRotationMatrix(float[] R, float[] I, float[] gravity, float[] geomagnetic) { throw new RuntimeException("Stub!"); }
public static  float getInclination(float[] I) { throw new RuntimeException("Stub!"); }
public static  boolean remapCoordinateSystem(float[] inR, int X, int Y, float[] outR) { throw new RuntimeException("Stub!"); }
public static  float[] getOrientation(float[] R, float[] values) { throw new RuntimeException("Stub!"); }
public static final int SENSOR_ORIENTATION = 1;
public static final int SENSOR_ACCELEROMETER = 2;
public static final int SENSOR_TEMPERATURE = 4;
public static final int SENSOR_MAGNETIC_FIELD = 8;
public static final int SENSOR_LIGHT = 16;
public static final int SENSOR_PROXIMITY = 32;
public static final int SENSOR_TRICORDER = 64;
public static final int SENSOR_ORIENTATION_RAW = 128;
public static final int SENSOR_ALL = 127;
public static final int SENSOR_MIN = 1;
public static final int SENSOR_MAX = 64;
public static final int DATA_X = 0;
public static final int DATA_Y = 1;
public static final int DATA_Z = 2;
public static final int RAW_DATA_INDEX = 3;
public static final int RAW_DATA_X = 3;
public static final int RAW_DATA_Y = 4;
public static final int RAW_DATA_Z = 5;
public static final float STANDARD_GRAVITY = 9.80665f;
public static final float GRAVITY_SUN = 275.0f;
public static final float GRAVITY_MERCURY = 3.7f;
public static final float GRAVITY_VENUS = 8.87f;
public static final float GRAVITY_EARTH = 9.80665f;
public static final float GRAVITY_MOON = 1.6f;
public static final float GRAVITY_MARS = 3.71f;
public static final float GRAVITY_JUPITER = 23.12f;
public static final float GRAVITY_SATURN = 8.96f;
public static final float GRAVITY_URANUS = 8.69f;
public static final float GRAVITY_NEPTUNE = 11.0f;
public static final float GRAVITY_PLUTO = 0.6f;
public static final float GRAVITY_DEATH_STAR_I = 3.5303614E-7f;
public static final float GRAVITY_THE_ISLAND = 4.815162f;
public static final float MAGNETIC_FIELD_EARTH_MAX = 60.0f;
public static final float MAGNETIC_FIELD_EARTH_MIN = 30.0f;
public static final float LIGHT_SUNLIGHT_MAX = 120000.0f;
public static final float LIGHT_SUNLIGHT = 110000.0f;
public static final float LIGHT_SHADE = 20000.0f;
public static final float LIGHT_OVERCAST = 10000.0f;
public static final float LIGHT_SUNRISE = 400.0f;
public static final float LIGHT_CLOUDY = 100.0f;
public static final float LIGHT_FULLMOON = 0.25f;
public static final float LIGHT_NO_MOON = 0.0010f;
public static final int SENSOR_DELAY_FASTEST = 0;
public static final int SENSOR_DELAY_GAME = 1;
public static final int SENSOR_DELAY_UI = 2;
public static final int SENSOR_DELAY_NORMAL = 3;
public static final int SENSOR_STATUS_UNRELIABLE = 0;
public static final int SENSOR_STATUS_ACCURACY_LOW = 1;
public static final int SENSOR_STATUS_ACCURACY_MEDIUM = 2;
public static final int SENSOR_STATUS_ACCURACY_HIGH = 3;
public static final int AXIS_X = 1;
public static final int AXIS_Y = 2;
public static final int AXIS_Z = 3;
public static final int AXIS_MINUS_X = 129;
public static final int AXIS_MINUS_Y = 130;
public static final int AXIS_MINUS_Z = 131;
}
