package android.location;
public class LocationManager
{
LocationManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getAllProviders() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getProviders(boolean enabledOnly) { throw new RuntimeException("Stub!"); }
public  android.location.LocationProvider getProvider(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getProviders(android.location.Criteria criteria, boolean enabledOnly) { throw new RuntimeException("Stub!"); }
public  java.lang.String getBestProvider(android.location.Criteria criteria, boolean enabledOnly) { throw new RuntimeException("Stub!"); }
public  void requestLocationUpdates(java.lang.String provider, long minTime, float minDistance, android.location.LocationListener listener) { throw new RuntimeException("Stub!"); }
public  void requestLocationUpdates(java.lang.String provider, long minTime, float minDistance, android.location.LocationListener listener, android.os.Looper looper) { throw new RuntimeException("Stub!"); }
public  void requestLocationUpdates(java.lang.String provider, long minTime, float minDistance, android.app.PendingIntent intent) { throw new RuntimeException("Stub!"); }
public  void removeUpdates(android.location.LocationListener listener) { throw new RuntimeException("Stub!"); }
public  void removeUpdates(android.app.PendingIntent intent) { throw new RuntimeException("Stub!"); }
public  void addProximityAlert(double latitude, double longitude, float radius, long expiration, android.app.PendingIntent intent) { throw new RuntimeException("Stub!"); }
public  void removeProximityAlert(android.app.PendingIntent intent) { throw new RuntimeException("Stub!"); }
public  boolean isProviderEnabled(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  android.location.Location getLastKnownLocation(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  void addTestProvider(java.lang.String name, boolean requiresNetwork, boolean requiresSatellite, boolean requiresCell, boolean hasMonetaryCost, boolean supportsAltitude, boolean supportsSpeed, boolean supportsBearing, int powerRequirement, int accuracy) { throw new RuntimeException("Stub!"); }
public  void removeTestProvider(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  void setTestProviderLocation(java.lang.String provider, android.location.Location loc) { throw new RuntimeException("Stub!"); }
public  void clearTestProviderLocation(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  void setTestProviderEnabled(java.lang.String provider, boolean enabled) { throw new RuntimeException("Stub!"); }
public  void clearTestProviderEnabled(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  void setTestProviderStatus(java.lang.String provider, int status, android.os.Bundle extras, long updateTime) { throw new RuntimeException("Stub!"); }
public  void clearTestProviderStatus(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  boolean addGpsStatusListener(android.location.GpsStatus.Listener listener) { throw new RuntimeException("Stub!"); }
public  void removeGpsStatusListener(android.location.GpsStatus.Listener listener) { throw new RuntimeException("Stub!"); }
public  android.location.GpsStatus getGpsStatus(android.location.GpsStatus status) { throw new RuntimeException("Stub!"); }
public  boolean sendExtraCommand(java.lang.String provider, java.lang.String command, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public static final java.lang.String NETWORK_PROVIDER = "network";
public static final java.lang.String GPS_PROVIDER = "gps";
public static final java.lang.String KEY_PROXIMITY_ENTERING = "entering";
public static final java.lang.String KEY_STATUS_CHANGED = "status";
public static final java.lang.String KEY_PROVIDER_ENABLED = "providerEnabled";
public static final java.lang.String KEY_LOCATION_CHANGED = "location";
}
