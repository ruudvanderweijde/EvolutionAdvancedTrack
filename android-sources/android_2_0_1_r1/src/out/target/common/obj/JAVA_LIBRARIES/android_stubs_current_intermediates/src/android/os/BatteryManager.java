package android.os;
public class BatteryManager
{
public  BatteryManager() { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_STATUS = "status";
public static final java.lang.String EXTRA_HEALTH = "health";
public static final java.lang.String EXTRA_PRESENT = "present";
public static final java.lang.String EXTRA_LEVEL = "level";
public static final java.lang.String EXTRA_SCALE = "scale";
public static final java.lang.String EXTRA_ICON_SMALL = "icon-small";
public static final java.lang.String EXTRA_PLUGGED = "plugged";
public static final java.lang.String EXTRA_VOLTAGE = "voltage";
public static final java.lang.String EXTRA_TEMPERATURE = "temperature";
public static final java.lang.String EXTRA_TECHNOLOGY = "technology";
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
