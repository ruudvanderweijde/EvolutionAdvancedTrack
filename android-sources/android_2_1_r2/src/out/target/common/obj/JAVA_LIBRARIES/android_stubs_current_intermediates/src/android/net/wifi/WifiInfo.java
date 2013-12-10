package android.net.wifi;
public class WifiInfo
  implements android.os.Parcelable
{
WifiInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSSID() { throw new RuntimeException("Stub!"); }
public  java.lang.String getBSSID() { throw new RuntimeException("Stub!"); }
public  int getRssi() { throw new RuntimeException("Stub!"); }
public  int getLinkSpeed() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMacAddress() { throw new RuntimeException("Stub!"); }
public  int getNetworkId() { throw new RuntimeException("Stub!"); }
public  android.net.wifi.SupplicantState getSupplicantState() { throw new RuntimeException("Stub!"); }
public  int getIpAddress() { throw new RuntimeException("Stub!"); }
public  boolean getHiddenSSID() { throw new RuntimeException("Stub!"); }
public static  android.net.NetworkInfo.DetailedState getDetailedStateOf(android.net.wifi.SupplicantState suppState) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final java.lang.String LINK_SPEED_UNITS = "Mbps";
}
