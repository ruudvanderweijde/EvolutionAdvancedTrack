package android.telephony;
public class NeighboringCellInfo
  implements android.os.Parcelable
{
public  NeighboringCellInfo() { throw new RuntimeException("Stub!"); }
public  NeighboringCellInfo(int rssi, int cid) { throw new RuntimeException("Stub!"); }
public  NeighboringCellInfo(int rssi, java.lang.String location, int radioType) { throw new RuntimeException("Stub!"); }
public  NeighboringCellInfo(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  int getRssi() { throw new RuntimeException("Stub!"); }
public  int getLac() { throw new RuntimeException("Stub!"); }
public  int getCid() { throw new RuntimeException("Stub!"); }
public  int getPsc() { throw new RuntimeException("Stub!"); }
public  int getNetworkType() { throw new RuntimeException("Stub!"); }
public  void setCid(int cid) { throw new RuntimeException("Stub!"); }
public  void setRssi(int rssi) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final int UNKNOWN_RSSI = 99;
public static final int UNKNOWN_CID = -1;
public static final android.os.Parcelable.Creator<android.telephony.NeighboringCellInfo> CREATOR;
static { CREATOR = null; }
}
