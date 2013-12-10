package android.telephony;
public class ServiceState
  implements android.os.Parcelable
{
public  ServiceState() { throw new RuntimeException("Stub!"); }
public  ServiceState(android.telephony.ServiceState s) { throw new RuntimeException("Stub!"); }
public  ServiceState(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
protected  void copyFrom(android.telephony.ServiceState s) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  boolean getRoaming() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOperatorAlphaLong() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOperatorAlphaShort() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOperatorNumeric() { throw new RuntimeException("Stub!"); }
public  boolean getIsManualSelection() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void setStateOutOfService() { throw new RuntimeException("Stub!"); }
public  void setStateOff() { throw new RuntimeException("Stub!"); }
public  void setState(int state) { throw new RuntimeException("Stub!"); }
public  void setRoaming(boolean roaming) { throw new RuntimeException("Stub!"); }
public  void setOperatorName(java.lang.String longName, java.lang.String shortName, java.lang.String numeric) { throw new RuntimeException("Stub!"); }
public  void setIsManualSelection(boolean isManual) { throw new RuntimeException("Stub!"); }
public static final int STATE_IN_SERVICE = 0;
public static final int STATE_OUT_OF_SERVICE = 1;
public static final int STATE_EMERGENCY_ONLY = 2;
public static final int STATE_POWER_OFF = 3;
public static final android.os.Parcelable.Creator<android.telephony.ServiceState> CREATOR;
static { CREATOR = null; }
}
