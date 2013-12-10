package android.net;
public class TrafficStats
{
public  TrafficStats() { throw new RuntimeException("Stub!"); }
public static native  long getMobileTxPackets();
public static native  long getMobileRxPackets();
public static native  long getMobileTxBytes();
public static native  long getMobileRxBytes();
public static native  long getTotalTxPackets();
public static native  long getTotalRxPackets();
public static native  long getTotalTxBytes();
public static native  long getTotalRxBytes();
public static native  long getUidTxBytes(int uid);
public static native  long getUidRxBytes(int uid);
public static final int UNSUPPORTED = -1;
}
