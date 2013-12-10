package android.net.wifi;
public class WifiConfiguration
  implements android.os.Parcelable
{
public static class KeyMgmt
{
KeyMgmt() { throw new RuntimeException("Stub!"); }
public static final int NONE = 0;
public static final int WPA_PSK = 1;
public static final int WPA_EAP = 2;
public static final int IEEE8021X = 3;
public static final java.lang.String varName = "key_mgmt";
public static final java.lang.String[] strings = null;
}
public static class Protocol
{
Protocol() { throw new RuntimeException("Stub!"); }
public static final int WPA = 0;
public static final int RSN = 1;
public static final java.lang.String varName = "proto";
public static final java.lang.String[] strings = null;
}
public static class AuthAlgorithm
{
AuthAlgorithm() { throw new RuntimeException("Stub!"); }
public static final int OPEN = 0;
public static final int SHARED = 1;
public static final int LEAP = 2;
public static final java.lang.String varName = "auth_alg";
public static final java.lang.String[] strings = null;
}
public static class PairwiseCipher
{
PairwiseCipher() { throw new RuntimeException("Stub!"); }
public static final int NONE = 0;
public static final int TKIP = 1;
public static final int CCMP = 2;
public static final java.lang.String varName = "pairwise";
public static final java.lang.String[] strings = null;
}
public static class GroupCipher
{
GroupCipher() { throw new RuntimeException("Stub!"); }
public static final int WEP40 = 0;
public static final int WEP104 = 1;
public static final int TKIP = 2;
public static final int CCMP = 3;
public static final java.lang.String varName = "group";
public static final java.lang.String[] strings = null;
}
public static class Status
{
Status() { throw new RuntimeException("Stub!"); }
public static final int CURRENT = 0;
public static final int DISABLED = 1;
public static final int ENABLED = 2;
public static final java.lang.String[] strings = null;
}
public  WifiConfiguration() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public int networkId;
public int status;
public java.lang.String SSID;
public java.lang.String BSSID;
public java.lang.String preSharedKey;
public java.lang.String[] wepKeys = null;
public int wepTxKeyIndex;
public int priority;
public boolean hiddenSSID;
public java.util.BitSet allowedKeyManagement;
public java.util.BitSet allowedProtocols;
public java.util.BitSet allowedAuthAlgorithms;
public java.util.BitSet allowedPairwiseCiphers;
public java.util.BitSet allowedGroupCiphers;
}
