package android.app;
public class ActivityManager
{
public static class RecentTaskInfo
  implements android.os.Parcelable
{
public  RecentTaskInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public int id;
public android.content.Intent baseIntent;
public android.content.ComponentName origActivity;
public static final android.os.Parcelable.Creator<android.app.ActivityManager.RecentTaskInfo> CREATOR;
static { CREATOR = null; }
}
public static class RunningTaskInfo
  implements android.os.Parcelable
{
public  RunningTaskInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public int id;
public android.content.ComponentName baseActivity;
public android.content.ComponentName topActivity;
public android.graphics.Bitmap thumbnail;
public java.lang.CharSequence description;
public int numActivities;
public int numRunning;
public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningTaskInfo> CREATOR;
static { CREATOR = null; }
}
public static class RunningServiceInfo
  implements android.os.Parcelable
{
public  RunningServiceInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public android.content.ComponentName service;
public int pid;
public java.lang.String process;
public boolean foreground;
public long activeSince;
public boolean started;
public int clientCount;
public int crashCount;
public long lastActivityTime;
public long restarting;
public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningServiceInfo> CREATOR;
static { CREATOR = null; }
}
public static class MemoryInfo
  implements android.os.Parcelable
{
public  MemoryInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public long availMem;
public long threshold;
public boolean lowMemory;
public static final android.os.Parcelable.Creator<android.app.ActivityManager.MemoryInfo> CREATOR;
static { CREATOR = null; }
}
public static class ProcessErrorStateInfo
  implements android.os.Parcelable
{
public  ProcessErrorStateInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public static final int NO_ERROR = 0;
public static final int CRASHED = 1;
public static final int NOT_RESPONDING = 2;
public int condition;
public java.lang.String processName;
public int pid;
public int uid;
public java.lang.String tag;
public java.lang.String shortMsg;
public java.lang.String longMsg;
public byte[] crashData = null;
public static final android.os.Parcelable.Creator<android.app.ActivityManager.ProcessErrorStateInfo> CREATOR;
static { CREATOR = null; }
}
public static class RunningAppProcessInfo
  implements android.os.Parcelable
{
public  RunningAppProcessInfo() { throw new RuntimeException("Stub!"); }
public  RunningAppProcessInfo(java.lang.String pProcessName, int pPid, java.lang.String[] pArr) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public java.lang.String processName;
public int pid;
public java.lang.String[] pkgList = null;
public static final int IMPORTANCE_FOREGROUND = 100;
public static final int IMPORTANCE_VISIBLE = 200;
public static final int IMPORTANCE_SERVICE = 300;
public static final int IMPORTANCE_BACKGROUND = 400;
public static final int IMPORTANCE_EMPTY = 500;
public int importance;
public int lru;
public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningAppProcessInfo> CREATOR;
static { CREATOR = null; }
}
ActivityManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int maxNum, int flags) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.ActivityManager.RunningTaskInfo> getRunningTasks(int maxNum) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.ActivityManager.RunningServiceInfo> getRunningServices(int maxNum) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  void getMemoryInfo(android.app.ActivityManager.MemoryInfo outInfo) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() { throw new RuntimeException("Stub!"); }
public  void restartPackage(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() { throw new RuntimeException("Stub!"); }
public static final int RECENT_WITH_EXCLUDED = 1;
}
