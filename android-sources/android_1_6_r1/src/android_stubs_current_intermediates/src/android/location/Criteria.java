package android.location;
public class Criteria
  implements android.os.Parcelable
{
public  Criteria() { throw new RuntimeException("Stub!"); }
public  Criteria(android.location.Criteria criteria) { throw new RuntimeException("Stub!"); }
public  void setAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
public  int getAccuracy() { throw new RuntimeException("Stub!"); }
public  void setPowerRequirement(int level) { throw new RuntimeException("Stub!"); }
public  int getPowerRequirement() { throw new RuntimeException("Stub!"); }
public  void setCostAllowed(boolean costAllowed) { throw new RuntimeException("Stub!"); }
public  boolean isCostAllowed() { throw new RuntimeException("Stub!"); }
public  void setAltitudeRequired(boolean altitudeRequired) { throw new RuntimeException("Stub!"); }
public  boolean isAltitudeRequired() { throw new RuntimeException("Stub!"); }
public  void setSpeedRequired(boolean speedRequired) { throw new RuntimeException("Stub!"); }
public  boolean isSpeedRequired() { throw new RuntimeException("Stub!"); }
public  void setBearingRequired(boolean bearingRequired) { throw new RuntimeException("Stub!"); }
public  boolean isBearingRequired() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final int NO_REQUIREMENT = 0;
public static final int POWER_LOW = 1;
public static final int POWER_MEDIUM = 2;
public static final int POWER_HIGH = 3;
public static final int ACCURACY_FINE = 1;
public static final int ACCURACY_COARSE = 2;
public static final android.os.Parcelable.Creator<android.location.Criteria> CREATOR;
static { CREATOR = null; }
}
