package android.preference;
public abstract class PreferenceActivity
  extends android.app.ListActivity
{
public  PreferenceActivity() { throw new RuntimeException("Stub!"); }
protected  void onCreate(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
protected  void onStop() { throw new RuntimeException("Stub!"); }
protected  void onDestroy() { throw new RuntimeException("Stub!"); }
protected  void onSaveInstanceState(android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Bundle state) { throw new RuntimeException("Stub!"); }
protected  void onActivityResult(int requestCode, int resultCode, android.content.Intent data) { throw new RuntimeException("Stub!"); }
public  void onContentChanged() { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); }
public  void setPreferenceScreen(android.preference.PreferenceScreen preferenceScreen) { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceScreen getPreferenceScreen() { throw new RuntimeException("Stub!"); }
public  void addPreferencesFromIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void addPreferencesFromResource(int preferencesResId) { throw new RuntimeException("Stub!"); }
public  boolean onPreferenceTreeClick(android.preference.PreferenceScreen preferenceScreen, android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  android.preference.Preference findPreference(java.lang.CharSequence key) { throw new RuntimeException("Stub!"); }
protected  void onNewIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
}
