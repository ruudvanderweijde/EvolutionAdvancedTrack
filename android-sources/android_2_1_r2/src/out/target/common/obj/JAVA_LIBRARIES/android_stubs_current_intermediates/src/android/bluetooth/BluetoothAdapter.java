package android.bluetooth;
public final class BluetoothAdapter
{
BluetoothAdapter() { throw new RuntimeException("Stub!"); }
public static synchronized  android.bluetooth.BluetoothAdapter getDefaultAdapter() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothDevice getRemoteDevice(java.lang.String address) { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  boolean enable() { throw new RuntimeException("Stub!"); }
public  boolean disable() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  boolean setName(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int getScanMode() { throw new RuntimeException("Stub!"); }
public  boolean startDiscovery() { throw new RuntimeException("Stub!"); }
public  boolean cancelDiscovery() { throw new RuntimeException("Stub!"); }
public  boolean isDiscovering() { throw new RuntimeException("Stub!"); }
public  java.util.Set<android.bluetooth.BluetoothDevice> getBondedDevices() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothServerSocket listenUsingRfcommWithServiceRecord(java.lang.String name, java.util.UUID uuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  boolean checkBluetoothAddress(java.lang.String address) { throw new RuntimeException("Stub!"); }
public static final int ERROR = -2147483648;
public static final java.lang.String ACTION_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";
public static final java.lang.String EXTRA_STATE = "android.bluetooth.adapter.extra.STATE";
public static final java.lang.String EXTRA_PREVIOUS_STATE = "android.bluetooth.adapter.extra.PREVIOUS_STATE";
public static final int STATE_OFF = 10;
public static final int STATE_TURNING_ON = 11;
public static final int STATE_ON = 12;
public static final int STATE_TURNING_OFF = 13;
public static final java.lang.String ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";
public static final java.lang.String EXTRA_DISCOVERABLE_DURATION = "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";
public static final java.lang.String ACTION_REQUEST_ENABLE = "android.bluetooth.adapter.action.REQUEST_ENABLE";
public static final java.lang.String ACTION_SCAN_MODE_CHANGED = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED";
public static final java.lang.String EXTRA_SCAN_MODE = "android.bluetooth.adapter.extra.SCAN_MODE";
public static final java.lang.String EXTRA_PREVIOUS_SCAN_MODE = "android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE";
public static final int SCAN_MODE_NONE = 20;
public static final int SCAN_MODE_CONNECTABLE = 21;
public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 23;
public static final java.lang.String ACTION_DISCOVERY_STARTED = "android.bluetooth.adapter.action.DISCOVERY_STARTED";
public static final java.lang.String ACTION_DISCOVERY_FINISHED = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
public static final java.lang.String ACTION_LOCAL_NAME_CHANGED = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED";
public static final java.lang.String EXTRA_LOCAL_NAME = "android.bluetooth.adapter.extra.LOCAL_NAME";
}
