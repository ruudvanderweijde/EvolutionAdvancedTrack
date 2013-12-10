package android.preference;
public class Preference
  implements java.lang.Comparable<android.preference.Preference>
{
public static interface OnPreferenceChangeListener
{
public abstract  boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue);
}
public static interface OnPreferenceClickListener
{
public abstract  boolean onPreferenceClick(android.preference.Preference preference);
}
public static class BaseSavedState
  extends android.view.AbsSavedState
{
public  BaseSavedState(android.os.Parcel source) { super((android.os.Parcel)null); throw new RuntimeException("Stub!"); }
public  BaseSavedState(android.os.Parcelable superState) { super((android.os.Parcel)null); throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.preference.Preference.BaseSavedState> CREATOR;
static { CREATOR = null; }
}
public  Preference(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { throw new RuntimeException("Stub!"); }
public  Preference(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  Preference(android.content.Context context) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object onGetDefaultValue(android.content.res.TypedArray a, int index) { throw new RuntimeException("Stub!"); }
public  void setIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  android.content.Intent getIntent() { throw new RuntimeException("Stub!"); }
public  void setLayoutResource(int layoutResId) { throw new RuntimeException("Stub!"); }
public  int getLayoutResource() { throw new RuntimeException("Stub!"); }
public  void setWidgetLayoutResource(int widgetLayoutResId) { throw new RuntimeException("Stub!"); }
public  int getWidgetLayoutResource() { throw new RuntimeException("Stub!"); }
public  android.view.View getView(android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
protected  android.view.View onCreateView(android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
protected  void onBindView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void setOrder(int order) { throw new RuntimeException("Stub!"); }
public  int getOrder() { throw new RuntimeException("Stub!"); }
public  void setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  void setTitle(int titleResId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSummary() { throw new RuntimeException("Stub!"); }
public  void setSummary(java.lang.CharSequence summary) { throw new RuntimeException("Stub!"); }
public  void setSummary(int summaryResId) { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  void setSelectable(boolean selectable) { throw new RuntimeException("Stub!"); }
public  boolean isSelectable() { throw new RuntimeException("Stub!"); }
public  void setShouldDisableView(boolean shouldDisableView) { throw new RuntimeException("Stub!"); }
public  boolean getShouldDisableView() { throw new RuntimeException("Stub!"); }
protected  void onClick() { throw new RuntimeException("Stub!"); }
public  void setKey(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.String getKey() { throw new RuntimeException("Stub!"); }
public  boolean hasKey() { throw new RuntimeException("Stub!"); }
public  boolean isPersistent() { throw new RuntimeException("Stub!"); }
protected  boolean shouldPersist() { throw new RuntimeException("Stub!"); }
public  void setPersistent(boolean persistent) { throw new RuntimeException("Stub!"); }
protected  boolean callChangeListener(java.lang.Object newValue) { throw new RuntimeException("Stub!"); }
public  void setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener onPreferenceChangeListener) { throw new RuntimeException("Stub!"); }
public  android.preference.Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() { throw new RuntimeException("Stub!"); }
public  void setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener onPreferenceClickListener) { throw new RuntimeException("Stub!"); }
public  android.preference.Preference.OnPreferenceClickListener getOnPreferenceClickListener() { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public  android.content.SharedPreferences getSharedPreferences() { throw new RuntimeException("Stub!"); }
public  android.content.SharedPreferences.Editor getEditor() { throw new RuntimeException("Stub!"); }
public  boolean shouldCommit() { throw new RuntimeException("Stub!"); }
public  int compareTo(android.preference.Preference another) { throw new RuntimeException("Stub!"); }
protected  void notifyChanged() { throw new RuntimeException("Stub!"); }
protected  void notifyHierarchyChanged() { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); }
protected  void onAttachedToHierarchy(android.preference.PreferenceManager preferenceManager) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToActivity() { throw new RuntimeException("Stub!"); }
protected  android.preference.Preference findPreferenceInHierarchy(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void notifyDependencyChange(boolean disableDependents) { throw new RuntimeException("Stub!"); }
public  void onDependencyChanged(android.preference.Preference dependency, boolean disableDependent) { throw new RuntimeException("Stub!"); }
public  boolean shouldDisableDependents() { throw new RuntimeException("Stub!"); }
public  void setDependency(java.lang.String dependencyKey) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDependency() { throw new RuntimeException("Stub!"); }
protected  void onPrepareForRemoval() { throw new RuntimeException("Stub!"); }
public  void setDefaultValue(java.lang.Object defaultValue) { throw new RuntimeException("Stub!"); }
protected  void onSetInitialValue(boolean restorePersistedValue, java.lang.Object defaultValue) { throw new RuntimeException("Stub!"); }
protected  boolean persistString(java.lang.String value) { throw new RuntimeException("Stub!"); }
protected  java.lang.String getPersistedString(java.lang.String defaultReturnValue) { throw new RuntimeException("Stub!"); }
protected  boolean persistInt(int value) { throw new RuntimeException("Stub!"); }
protected  int getPersistedInt(int defaultReturnValue) { throw new RuntimeException("Stub!"); }
protected  boolean persistFloat(float value) { throw new RuntimeException("Stub!"); }
protected  float getPersistedFloat(float defaultReturnValue) { throw new RuntimeException("Stub!"); }
protected  boolean persistLong(long value) { throw new RuntimeException("Stub!"); }
protected  long getPersistedLong(long defaultReturnValue) { throw new RuntimeException("Stub!"); }
protected  boolean persistBoolean(boolean value) { throw new RuntimeException("Stub!"); }
protected  boolean getPersistedBoolean(boolean defaultReturnValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void saveHierarchyState(android.os.Bundle container) { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void restoreHierarchyState(android.os.Bundle container) { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_ORDER = 2147483647;
}
