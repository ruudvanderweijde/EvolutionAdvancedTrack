package android.preference;
public abstract class DialogPreference
  extends android.preference.Preference
  implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.preference.PreferenceManager.OnActivityDestroyListener
{
public  DialogPreference(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  DialogPreference(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  void setDialogTitle(java.lang.CharSequence dialogTitle) { throw new RuntimeException("Stub!"); }
public  void setDialogTitle(int dialogTitleResId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDialogTitle() { throw new RuntimeException("Stub!"); }
public  void setDialogMessage(java.lang.CharSequence dialogMessage) { throw new RuntimeException("Stub!"); }
public  void setDialogMessage(int dialogMessageResId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDialogMessage() { throw new RuntimeException("Stub!"); }
public  void setDialogIcon(android.graphics.drawable.Drawable dialogIcon) { throw new RuntimeException("Stub!"); }
public  void setDialogIcon(int dialogIconRes) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDialogIcon() { throw new RuntimeException("Stub!"); }
public  void setPositiveButtonText(java.lang.CharSequence positiveButtonText) { throw new RuntimeException("Stub!"); }
public  void setPositiveButtonText(int positiveButtonTextResId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getPositiveButtonText() { throw new RuntimeException("Stub!"); }
public  void setNegativeButtonText(java.lang.CharSequence negativeButtonText) { throw new RuntimeException("Stub!"); }
public  void setNegativeButtonText(int negativeButtonTextResId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getNegativeButtonText() { throw new RuntimeException("Stub!"); }
public  void setDialogLayoutResource(int dialogLayoutResId) { throw new RuntimeException("Stub!"); }
public  int getDialogLayoutResource() { throw new RuntimeException("Stub!"); }
protected  void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder) { throw new RuntimeException("Stub!"); }
protected  void onClick() { throw new RuntimeException("Stub!"); }
protected  void showDialog(android.os.Bundle state) { throw new RuntimeException("Stub!"); }
protected  android.view.View onCreateDialogView() { throw new RuntimeException("Stub!"); }
protected  void onBindDialogView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void onClick(android.content.DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); }
public  void onDismiss(android.content.DialogInterface dialog) { throw new RuntimeException("Stub!"); }
protected  void onDialogClosed(boolean positiveResult) { throw new RuntimeException("Stub!"); }
public  android.app.Dialog getDialog() { throw new RuntimeException("Stub!"); }
public  void onActivityDestroy() { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
}
