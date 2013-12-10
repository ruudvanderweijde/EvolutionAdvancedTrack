package android.content;
public interface SharedPreferences
{
public static interface OnSharedPreferenceChangeListener
{
public abstract  void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key);
}
public static interface Editor
{
public abstract  android.content.SharedPreferences.Editor putString(java.lang.String key, java.lang.String value);
public abstract  android.content.SharedPreferences.Editor putInt(java.lang.String key, int value);
public abstract  android.content.SharedPreferences.Editor putLong(java.lang.String key, long value);
public abstract  android.content.SharedPreferences.Editor putFloat(java.lang.String key, float value);
public abstract  android.content.SharedPreferences.Editor putBoolean(java.lang.String key, boolean value);
public abstract  android.content.SharedPreferences.Editor remove(java.lang.String key);
public abstract  android.content.SharedPreferences.Editor clear();
public abstract  boolean commit();
}
public abstract  java.util.Map<java.lang.String, ?> getAll();
public abstract  java.lang.String getString(java.lang.String key, java.lang.String defValue);
public abstract  int getInt(java.lang.String key, int defValue);
public abstract  long getLong(java.lang.String key, long defValue);
public abstract  float getFloat(java.lang.String key, float defValue);
public abstract  boolean getBoolean(java.lang.String key, boolean defValue);
public abstract  boolean contains(java.lang.String key);
public abstract  android.content.SharedPreferences.Editor edit();
public abstract  void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener listener);
public abstract  void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener listener);
}
