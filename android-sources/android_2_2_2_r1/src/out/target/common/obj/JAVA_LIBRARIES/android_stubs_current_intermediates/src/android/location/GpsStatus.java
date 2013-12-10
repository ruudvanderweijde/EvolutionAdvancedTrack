package android.location;
public final class GpsStatus
{
public static interface Listener
{
public abstract  void onGpsStatusChanged(int event);
}
public static interface NmeaListener
{
public abstract  void onNmeaReceived(long timestamp, java.lang.String nmea);
}
GpsStatus() { throw new RuntimeException("Stub!"); }
public  int getTimeToFirstFix() { throw new RuntimeException("Stub!"); }
public  java.lang.Iterable<android.location.GpsSatellite> getSatellites() { throw new RuntimeException("Stub!"); }
public  int getMaxSatellites() { throw new RuntimeException("Stub!"); }
public static final int GPS_EVENT_STARTED = 1;
public static final int GPS_EVENT_STOPPED = 2;
public static final int GPS_EVENT_FIRST_FIX = 3;
public static final int GPS_EVENT_SATELLITE_STATUS = 4;
}
