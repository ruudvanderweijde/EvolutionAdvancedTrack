package android.telephony;
public class PhoneStateListener
{
public  PhoneStateListener() { throw new RuntimeException("Stub!"); }
public  void onServiceStateChanged(android.telephony.ServiceState serviceState) { throw new RuntimeException("Stub!"); }
public  void onSignalStrengthChanged(int asu) { throw new RuntimeException("Stub!"); }
public  void onMessageWaitingIndicatorChanged(boolean mwi) { throw new RuntimeException("Stub!"); }
public  void onCallForwardingIndicatorChanged(boolean cfi) { throw new RuntimeException("Stub!"); }
public  void onCellLocationChanged(android.telephony.CellLocation location) { throw new RuntimeException("Stub!"); }
public  void onCallStateChanged(int state, java.lang.String incomingNumber) { throw new RuntimeException("Stub!"); }
public  void onDataConnectionStateChanged(int state) { throw new RuntimeException("Stub!"); }
public  void onDataConnectionStateChanged(int state, int networkType) { throw new RuntimeException("Stub!"); }
public  void onDataActivity(int direction) { throw new RuntimeException("Stub!"); }
public  void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) { throw new RuntimeException("Stub!"); }
public static final int LISTEN_NONE = 0;
public static final int LISTEN_SERVICE_STATE = 1;
public static final int LISTEN_SIGNAL_STRENGTH = 2;
public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;
public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;
public static final int LISTEN_CELL_LOCATION = 16;
public static final int LISTEN_CALL_STATE = 32;
public static final int LISTEN_DATA_CONNECTION_STATE = 64;
public static final int LISTEN_DATA_ACTIVITY = 128;
public static final int LISTEN_SIGNAL_STRENGTHS = 256;
}
