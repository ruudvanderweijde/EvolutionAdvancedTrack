package android.preference;
public abstract class PreferenceGroup
  extends android.preference.Preference
{
public  PreferenceGroup(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  PreferenceGroup(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  void setOrderingAsAdded(boolean orderingAsAdded) { throw new RuntimeException("Stub!"); }
public  boolean isOrderingAsAdded() { throw new RuntimeException("Stub!"); }
public  void addItemFromInflater(android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  int getPreferenceCount() { throw new RuntimeException("Stub!"); }
public  android.preference.Preference getPreference(int index) { throw new RuntimeException("Stub!"); }
public  boolean addPreference(android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  boolean removePreference(android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  void removeAll() { throw new RuntimeException("Stub!"); }
protected  boolean onPrepareAddPreference(android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  android.preference.Preference findPreference(java.lang.CharSequence key) { throw new RuntimeException("Stub!"); }
protected  boolean isOnSameScreenAsChildren() { throw new RuntimeException("Stub!"); }
protected  void onAttachedToActivity() { throw new RuntimeException("Stub!"); }
protected  void onPrepareForRemoval() { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
protected  void dispatchSaveInstanceState(android.os.Bundle container) { throw new RuntimeException("Stub!"); }
protected  void dispatchRestoreInstanceState(android.os.Bundle container) { throw new RuntimeException("Stub!"); }
}
