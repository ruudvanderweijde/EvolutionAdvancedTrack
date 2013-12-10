package android.app.admin;
public class DevicePolicyManager
{
DevicePolicyManager() { throw new RuntimeException("Stub!"); }
public  boolean isAdminActive(android.content.ComponentName who) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.ComponentName> getActiveAdmins() { throw new RuntimeException("Stub!"); }
public  void removeActiveAdmin(android.content.ComponentName who) { throw new RuntimeException("Stub!"); }
public  void setPasswordQuality(android.content.ComponentName admin, int quality) { throw new RuntimeException("Stub!"); }
public  int getPasswordQuality(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPasswordMinimumLength(android.content.ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
public  int getPasswordMinimumLength(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  int getPasswordMaximumLength(int quality) { throw new RuntimeException("Stub!"); }
public  boolean isActivePasswordSufficient() { throw new RuntimeException("Stub!"); }
public  int getCurrentFailedPasswordAttempts() { throw new RuntimeException("Stub!"); }
public  void setMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int num) { throw new RuntimeException("Stub!"); }
public  int getMaximumFailedPasswordsForWipe(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean resetPassword(java.lang.String password, int flags) { throw new RuntimeException("Stub!"); }
public  void setMaximumTimeToLock(android.content.ComponentName admin, long timeMs) { throw new RuntimeException("Stub!"); }
public  long getMaximumTimeToLock(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void lockNow() { throw new RuntimeException("Stub!"); }
public  void wipeData(int flags) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_ADD_DEVICE_ADMIN = "android.app.action.ADD_DEVICE_ADMIN";
public static final java.lang.String EXTRA_DEVICE_ADMIN = "android.app.extra.DEVICE_ADMIN";
public static final java.lang.String EXTRA_ADD_EXPLANATION = "android.app.extra.ADD_EXPLANATION";
public static final java.lang.String ACTION_SET_NEW_PASSWORD = "android.app.action.SET_NEW_PASSWORD";
public static final int PASSWORD_QUALITY_UNSPECIFIED = 0;
public static final int PASSWORD_QUALITY_SOMETHING = 65536;
public static final int PASSWORD_QUALITY_NUMERIC = 131072;
public static final int PASSWORD_QUALITY_ALPHABETIC = 262144;
public static final int PASSWORD_QUALITY_ALPHANUMERIC = 327680;
public static final int RESET_PASSWORD_REQUIRE_ENTRY = 1;
}
