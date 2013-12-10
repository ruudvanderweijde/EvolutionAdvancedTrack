package android.location;
public abstract class LocationProvider
{
LocationProvider() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  boolean meetsCriteria(android.location.Criteria criteria) { throw new RuntimeException("Stub!"); }
public abstract  boolean requiresNetwork();
public abstract  boolean requiresSatellite();
public abstract  boolean requiresCell();
public abstract  boolean hasMonetaryCost();
public abstract  boolean supportsAltitude();
public abstract  boolean supportsSpeed();
public abstract  boolean supportsBearing();
public abstract  int getPowerRequirement();
public abstract  int getAccuracy();
public static final int OUT_OF_SERVICE = 0;
public static final int TEMPORARILY_UNAVAILABLE = 1;
public static final int AVAILABLE = 2;
}
