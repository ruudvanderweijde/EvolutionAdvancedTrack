package android.telephony;
public class TelephonyManager
{
TelephonyManager() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDeviceSoftwareVersion() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDeviceId() { throw new RuntimeException("Stub!"); }
public  android.telephony.CellLocation getCellLocation() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo() { throw new RuntimeException("Stub!"); }
public  int getPhoneType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkOperatorName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkOperator() { throw new RuntimeException("Stub!"); }
public  boolean isNetworkRoaming() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkCountryIso() { throw new RuntimeException("Stub!"); }
public  int getNetworkType() { throw new RuntimeException("Stub!"); }
public  boolean hasIccCard() { throw new RuntimeException("Stub!"); }
public  int getSimState() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimOperator() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimOperatorName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimCountryIso() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimSerialNumber() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubscriberId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLine1Number() { throw new RuntimeException("Stub!"); }
public  java.lang.String getVoiceMailNumber() { throw new RuntimeException("Stub!"); }
public  java.lang.String getVoiceMailAlphaTag() { throw new RuntimeException("Stub!"); }
public  int getCallState() { throw new RuntimeException("Stub!"); }
public  int getDataActivity() { throw new RuntimeException("Stub!"); }
public  int getDataState() { throw new RuntimeException("Stub!"); }
public  void listen(android.telephony.PhoneStateListener listener, int events) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
public static final java.lang.String EXTRA_STATE = "state";
public static final java.lang.String EXTRA_STATE_IDLE;
public static final java.lang.String EXTRA_STATE_RINGING;
public static final java.lang.String EXTRA_STATE_OFFHOOK;
public static final java.lang.String EXTRA_INCOMING_NUMBER = "incoming_number";
public static final int PHONE_TYPE_NONE = 0;
public static final int PHONE_TYPE_GSM = 1;
public static final int PHONE_TYPE_CDMA = 2;
public static final int NETWORK_TYPE_UNKNOWN = 0;
public static final int NETWORK_TYPE_GPRS = 1;
public static final int NETWORK_TYPE_EDGE = 2;
public static final int NETWORK_TYPE_UMTS = 3;
public static final int NETWORK_TYPE_CDMA = 4;
public static final int NETWORK_TYPE_EVDO_0 = 5;
public static final int NETWORK_TYPE_EVDO_A = 6;
public static final int NETWORK_TYPE_1xRTT = 7;
public static final int NETWORK_TYPE_HSDPA = 8;
public static final int NETWORK_TYPE_HSUPA = 9;
public static final int NETWORK_TYPE_HSPA = 10;
public static final int SIM_STATE_UNKNOWN = 0;
public static final int SIM_STATE_ABSENT = 1;
public static final int SIM_STATE_PIN_REQUIRED = 2;
public static final int SIM_STATE_PUK_REQUIRED = 3;
public static final int SIM_STATE_NETWORK_LOCKED = 4;
public static final int SIM_STATE_READY = 5;
public static final int CALL_STATE_IDLE = 0;
public static final int CALL_STATE_RINGING = 1;
public static final int CALL_STATE_OFFHOOK = 2;
public static final int DATA_ACTIVITY_NONE = 0;
public static final int DATA_ACTIVITY_IN = 1;
public static final int DATA_ACTIVITY_OUT = 2;
public static final int DATA_ACTIVITY_INOUT = 3;
public static final int DATA_ACTIVITY_DORMANT = 4;
public static final int DATA_DISCONNECTED = 0;
public static final int DATA_CONNECTING = 1;
public static final int DATA_CONNECTED = 2;
public static final int DATA_SUSPENDED = 3;
static { EXTRA_STATE_IDLE = null; EXTRA_STATE_RINGING = null; EXTRA_STATE_OFFHOOK = null; }
}
