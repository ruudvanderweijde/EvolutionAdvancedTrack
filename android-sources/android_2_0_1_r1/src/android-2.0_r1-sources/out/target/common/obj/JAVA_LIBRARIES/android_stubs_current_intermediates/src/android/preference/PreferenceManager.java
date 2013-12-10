package android.preference;
public class PreferenceManager
{
public static interface OnActivityResultListener
{
public abstract  boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data);
}
public static interface OnActivityStopListener
{
public abstract  void onActivityStop();
}
public static interface OnActivityDestroyListener
{
public abstract  void onActivityDestroy();
}
PreferenceManager() { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceScreen createPreferenceScreen(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSharedPreferencesName() { throw new RuntimeException("Stub!"); }
public  void setSharedPreferencesName(java.lang.String sharedPreferencesName) { throw new RuntimeException("Stub!"); }
public  int getSharedPreferencesMode() { throw new RuntimeException("Stub!"); }
public  void setSharedPreferencesMode(int sharedPreferencesMode) { throw new RuntimeException("Stub!"); }
public  android.content.SharedPreferences getSharedPreferences() { throw new RuntimeException("Stub!"); }
public static  android.content.SharedPreferences getDefaultSharedPreferences(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.preference.Preference findPreference(java.lang.CharSequence key) { throw new RuntimeException("Stub!"); }
public static  void setDefaultValues(android.content.Context context, int resId, boolean readAgain) { throw new RuntimeException("Stub!"); }
public static  void setDefaultValues(android.content.Context context, java.lang.String sharedPreferencesName, int sharedPreferencesMode, int resId, boolean readAgain) { throw new RuntimeException("Stub!"); }
public static final java.lang.String METADATA_KEY_PREFERENCES = "android.preference";
public static final java.lang.String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
}
