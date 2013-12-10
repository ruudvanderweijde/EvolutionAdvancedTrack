package android.test.mock;
public class MockPackageManager
  extends android.content.pm.PackageManager
{
public  MockPackageManager() { throw new RuntimeException("Stub!"); }
public  android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.Intent getLaunchIntentForPackage(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int[] getPackageGids(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.PermissionInfo getPermissionInfo(java.lang.String name, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String group, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String name, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags) { throw new RuntimeException("Stub!"); }
public  int checkPermission(java.lang.String permName, java.lang.String pkgName) { throw new RuntimeException("Stub!"); }
public  boolean addPermission(android.content.pm.PermissionInfo info) { throw new RuntimeException("Stub!"); }
public  void removePermission(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int checkSignatures(java.lang.String pkg1, java.lang.String pkg2) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getPackagesForUid(int uid) { throw new RuntimeException("Stub!"); }
public  java.lang.String getNameForUid(int uid) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ResolveInfo resolveActivity(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions(android.content.ComponentName caller, android.content.Intent[] specifics, android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ResolveInfo resolveService(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ProviderInfo resolveContentProvider(java.lang.String name, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String processName, int uid, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.InstrumentationInfo> queryInstrumentation(java.lang.String targetPackage, int flags) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDrawable(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getActivityIcon(android.content.Intent intent) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDefaultActivityIcon() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getApplicationIcon(android.content.pm.ApplicationInfo info) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getApplicationIcon(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
public  android.content.res.XmlResourceParser getXml(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getApplicationLabel(android.content.pm.ApplicationInfo info) { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources getResourcesForActivity(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources getResourcesForApplication(android.content.pm.ApplicationInfo app) { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources getResourcesForApplication(java.lang.String appPackageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.PackageInfo getPackageArchiveInfo(java.lang.String archiveFilePath, int flags) { throw new RuntimeException("Stub!"); }
public  void addPackageToPreferred(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void removePackageFromPreferred(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PackageInfo> getPreferredPackages(int flags) { throw new RuntimeException("Stub!"); }
public  void setComponentEnabledSetting(android.content.ComponentName componentName, int newState, int flags) { throw new RuntimeException("Stub!"); }
public  int getComponentEnabledSetting(android.content.ComponentName componentName) { throw new RuntimeException("Stub!"); }
public  void setApplicationEnabledSetting(java.lang.String packageName, int newState, int flags) { throw new RuntimeException("Stub!"); }
public  int getApplicationEnabledSetting(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void addPreferredActivity(android.content.IntentFilter filter, int match, android.content.ComponentName[] set, android.content.ComponentName activity) { throw new RuntimeException("Stub!"); }
public  void clearPackagePreferredActivities(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int getPreferredActivities(java.util.List<android.content.IntentFilter> outFilters, java.util.List<android.content.ComponentName> outActivities, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getSystemSharedLibraryNames() { throw new RuntimeException("Stub!"); }
public  boolean isSafeMode() { throw new RuntimeException("Stub!"); }
}
