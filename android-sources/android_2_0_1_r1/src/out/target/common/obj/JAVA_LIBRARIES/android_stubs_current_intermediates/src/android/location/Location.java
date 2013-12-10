package android.location;
public class Location
  implements android.os.Parcelable
{
public  Location(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  Location(android.location.Location l) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  void set(android.location.Location l) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public static  java.lang.String convert(double coordinate, int outputType) { throw new RuntimeException("Stub!"); }
public static  double convert(java.lang.String coordinate) { throw new RuntimeException("Stub!"); }
public static  void distanceBetween(double startLatitude, double startLongitude, double endLatitude, double endLongitude, float[] results) { throw new RuntimeException("Stub!"); }
public  float distanceTo(android.location.Location dest) { throw new RuntimeException("Stub!"); }
public  float bearingTo(android.location.Location dest) { throw new RuntimeException("Stub!"); }
public  java.lang.String getProvider() { throw new RuntimeException("Stub!"); }
public  void setProvider(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  long getTime() { throw new RuntimeException("Stub!"); }
public  void setTime(long time) { throw new RuntimeException("Stub!"); }
public  double getLatitude() { throw new RuntimeException("Stub!"); }
public  void setLatitude(double latitude) { throw new RuntimeException("Stub!"); }
public  double getLongitude() { throw new RuntimeException("Stub!"); }
public  void setLongitude(double longitude) { throw new RuntimeException("Stub!"); }
public  boolean hasAltitude() { throw new RuntimeException("Stub!"); }
public  double getAltitude() { throw new RuntimeException("Stub!"); }
public  void setAltitude(double altitude) { throw new RuntimeException("Stub!"); }
public  void removeAltitude() { throw new RuntimeException("Stub!"); }
public  boolean hasSpeed() { throw new RuntimeException("Stub!"); }
public  float getSpeed() { throw new RuntimeException("Stub!"); }
public  void setSpeed(float speed) { throw new RuntimeException("Stub!"); }
public  void removeSpeed() { throw new RuntimeException("Stub!"); }
public  boolean hasBearing() { throw new RuntimeException("Stub!"); }
public  float getBearing() { throw new RuntimeException("Stub!"); }
public  void setBearing(float bearing) { throw new RuntimeException("Stub!"); }
public  void removeBearing() { throw new RuntimeException("Stub!"); }
public  boolean hasAccuracy() { throw new RuntimeException("Stub!"); }
public  float getAccuracy() { throw new RuntimeException("Stub!"); }
public  void setAccuracy(float accuracy) { throw new RuntimeException("Stub!"); }
public  void removeAccuracy() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  void setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final int FORMAT_DEGREES = 0;
public static final int FORMAT_MINUTES = 1;
public static final int FORMAT_SECONDS = 2;
public static final android.os.Parcelable.Creator<android.location.Location> CREATOR;
static { CREATOR = null; }
}
