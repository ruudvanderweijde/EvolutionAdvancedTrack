package android.net.wifi;
public enum SupplicantState
  implements android.os.Parcelable
{
ASSOCIATED(),
ASSOCIATING(),
COMPLETED(),
DISCONNECTED(),
DORMANT(),
FOUR_WAY_HANDSHAKE(),
GROUP_HANDSHAKE(),
INACTIVE(),
INVALID(),
SCANNING(),
UNINITIALIZED();
public static  boolean isValidState(android.net.wifi.SupplicantState state) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
}
