package android.location;
public interface LocationListener
{
public abstract  void onLocationChanged(android.location.Location location);
public abstract  void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras);
public abstract  void onProviderEnabled(java.lang.String provider);
public abstract  void onProviderDisabled(java.lang.String provider);
}
