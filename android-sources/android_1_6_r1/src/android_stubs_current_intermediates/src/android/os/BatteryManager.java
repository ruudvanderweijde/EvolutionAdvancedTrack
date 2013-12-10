package android.os;
public class BatteryManager
{
public  BatteryManager() { throw new RuntimeException("Stub!"); }
public static final int BATTERY_STATUS_UNKNOWN = 1;
public static final int BATTERY_STATUS_CHARGING = 2;
public static final int BATTERY_STATUS_DISCHARGING = 3;
public static final int BATTERY_STATUS_NOT_CHARGING = 4;
public static final int BATTERY_STATUS_FULL = 5;
public static final int BATTERY_HEALTH_UNKNOWN = 1;
public static final int BATTERY_HEALTH_GOOD = 2;
public static final int BATTERY_HEALTH_OVERHEAT = 3;
public static final int BATTERY_HEALTH_DEAD = 4;
public static final int BATTERY_HEALTH_OVER_VOLTAGE = 5;
public static final int BATTERY_HEALTH_UNSPECIFIED_FAILURE = 6;
public static final int BATTERY_PLUGGED_AC = 1;
public static final int BATTERY_PLUGGED_USB = 2;
}
