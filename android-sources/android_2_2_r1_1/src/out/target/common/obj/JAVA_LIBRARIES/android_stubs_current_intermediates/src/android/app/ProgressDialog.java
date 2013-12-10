package android.app;
public class ProgressDialog
  extends android.app.AlertDialog
{
public  ProgressDialog(android.content.Context context) { super((android.content.Context)null,false,(android.content.DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); }
public  ProgressDialog(android.content.Context context, int theme) { super((android.content.Context)null,false,(android.content.DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); }
public static  android.app.ProgressDialog show(android.content.Context context, java.lang.CharSequence title, java.lang.CharSequence message) { throw new RuntimeException("Stub!"); }
public static  android.app.ProgressDialog show(android.content.Context context, java.lang.CharSequence title, java.lang.CharSequence message, boolean indeterminate) { throw new RuntimeException("Stub!"); }
public static  android.app.ProgressDialog show(android.content.Context context, java.lang.CharSequence title, java.lang.CharSequence message, boolean indeterminate, boolean cancelable) { throw new RuntimeException("Stub!"); }
public static  android.app.ProgressDialog show(android.content.Context context, java.lang.CharSequence title, java.lang.CharSequence message, boolean indeterminate, boolean cancelable, android.content.DialogInterface.OnCancelListener cancelListener) { throw new RuntimeException("Stub!"); }
protected  void onCreate(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onStart() { throw new RuntimeException("Stub!"); }
protected  void onStop() { throw new RuntimeException("Stub!"); }
public  void setProgress(int value) { throw new RuntimeException("Stub!"); }
public  void setSecondaryProgress(int secondaryProgress) { throw new RuntimeException("Stub!"); }
public  int getProgress() { throw new RuntimeException("Stub!"); }
public  int getSecondaryProgress() { throw new RuntimeException("Stub!"); }
public  int getMax() { throw new RuntimeException("Stub!"); }
public  void setMax(int max) { throw new RuntimeException("Stub!"); }
public  void incrementProgressBy(int diff) { throw new RuntimeException("Stub!"); }
public  void incrementSecondaryProgressBy(int diff) { throw new RuntimeException("Stub!"); }
public  void setProgressDrawable(android.graphics.drawable.Drawable d) { throw new RuntimeException("Stub!"); }
public  void setIndeterminateDrawable(android.graphics.drawable.Drawable d) { throw new RuntimeException("Stub!"); }
public  void setIndeterminate(boolean indeterminate) { throw new RuntimeException("Stub!"); }
public  boolean isIndeterminate() { throw new RuntimeException("Stub!"); }
public  void setMessage(java.lang.CharSequence message) { throw new RuntimeException("Stub!"); }
public  void setProgressStyle(int style) { throw new RuntimeException("Stub!"); }
public static final int STYLE_SPINNER = 0;
public static final int STYLE_HORIZONTAL = 1;
}
