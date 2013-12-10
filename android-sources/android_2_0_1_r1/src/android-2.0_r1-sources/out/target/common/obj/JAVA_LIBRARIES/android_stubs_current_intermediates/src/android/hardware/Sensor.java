package android.hardware;
public class Sensor
{
Sensor() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getVendor() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  float getMaximumRange() { throw new RuntimeException("Stub!"); }
public  float getResolution() { throw new RuntimeException("Stub!"); }
public  float getPower() { throw new RuntimeException("Stub!"); }
public static final int TYPE_ACCELEROMETER = 1;
public static final int TYPE_MAGNETIC_FIELD = 2;
public static final int TYPE_ORIENTATION = 3;
public static final int TYPE_GYROSCOPE = 4;
public static final int TYPE_LIGHT = 5;
public static final int TYPE_PRESSURE = 6;
public static final int TYPE_TEMPERATURE = 7;
public static final int TYPE_PROXIMITY = 8;
public static final int TYPE_ALL = -1;
}
