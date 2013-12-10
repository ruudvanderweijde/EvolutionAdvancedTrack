package android.preference;
public class RingtonePreference
  extends android.preference.Preference
  implements android.preference.PreferenceManager.OnActivityResultListener
{
public  RingtonePreference(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  RingtonePreference(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  RingtonePreference(android.content.Context context) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  int getRingtoneType() { throw new RuntimeException("Stub!"); }
public  void setRingtoneType(int type) { throw new RuntimeException("Stub!"); }
public  boolean getShowDefault() { throw new RuntimeException("Stub!"); }
public  void setShowDefault(boolean showDefault) { throw new RuntimeException("Stub!"); }
public  boolean getShowSilent() { throw new RuntimeException("Stub!"); }
public  void setShowSilent(boolean showSilent) { throw new RuntimeException("Stub!"); }
protected  void onClick() { throw new RuntimeException("Stub!"); }
protected  void onPrepareRingtonePickerIntent(android.content.Intent ringtonePickerIntent) { throw new RuntimeException("Stub!"); }
protected  void onSaveRingtone(android.net.Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
protected  android.net.Uri onRestoreRingtone() { throw new RuntimeException("Stub!"); }
protected  java.lang.Object onGetDefaultValue(android.content.res.TypedArray a, int index) { throw new RuntimeException("Stub!"); }
protected  void onSetInitialValue(boolean restorePersistedValue, java.lang.Object defaultValueObj) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToHierarchy(android.preference.PreferenceManager preferenceManager) { throw new RuntimeException("Stub!"); }
public  boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data) { throw new RuntimeException("Stub!"); }
}
