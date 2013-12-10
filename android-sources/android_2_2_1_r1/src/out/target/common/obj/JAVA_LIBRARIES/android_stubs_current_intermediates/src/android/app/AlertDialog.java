package android.app;
public class AlertDialog
  extends android.app.Dialog
  implements android.content.DialogInterface
{
public static class Builder
{
public  Builder(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setTitle(int titleId) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setCustomTitle(android.view.View customTitleView) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setMessage(int messageId) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setMessage(java.lang.CharSequence message) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setIcon(int iconId) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setIcon(android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setPositiveButton(int textId, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setPositiveButton(java.lang.CharSequence text, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setNegativeButton(int textId, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setNegativeButton(java.lang.CharSequence text, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setNeutralButton(int textId, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setNeutralButton(java.lang.CharSequence text, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setCancelable(boolean cancelable) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setItems(int itemsId, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setItems(java.lang.CharSequence[] items, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setAdapter(android.widget.ListAdapter adapter, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setCursor(android.database.Cursor cursor, android.content.DialogInterface.OnClickListener listener, java.lang.String labelColumn) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setMultiChoiceItems(int itemsId, boolean[] checkedItems, android.content.DialogInterface.OnMultiChoiceClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setMultiChoiceItems(java.lang.CharSequence[] items, boolean[] checkedItems, android.content.DialogInterface.OnMultiChoiceClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setMultiChoiceItems(android.database.Cursor cursor, java.lang.String isCheckedColumn, java.lang.String labelColumn, android.content.DialogInterface.OnMultiChoiceClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setSingleChoiceItems(int itemsId, int checkedItem, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setSingleChoiceItems(android.database.Cursor cursor, int checkedItem, java.lang.String labelColumn, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setSingleChoiceItems(java.lang.CharSequence[] items, int checkedItem, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setSingleChoiceItems(android.widget.ListAdapter adapter, int checkedItem, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener listener) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog.Builder setInverseBackgroundForced(boolean useInverseBackground) { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog create() { throw new RuntimeException("Stub!"); }
public  android.app.AlertDialog show() { throw new RuntimeException("Stub!"); }
}
protected  AlertDialog(android.content.Context context) { super((android.content.Context)null,false,(android.content.DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); }
protected  AlertDialog(android.content.Context context, int theme) { super((android.content.Context)null,false,(android.content.DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); }
protected  AlertDialog(android.content.Context context, boolean cancelable, android.content.DialogInterface.OnCancelListener cancelListener) { super((android.content.Context)null,false,(android.content.DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); }
public  android.widget.Button getButton(int whichButton) { throw new RuntimeException("Stub!"); }
public  android.widget.ListView getListView() { throw new RuntimeException("Stub!"); }
public  void setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  void setCustomTitle(android.view.View customTitleView) { throw new RuntimeException("Stub!"); }
public  void setMessage(java.lang.CharSequence message) { throw new RuntimeException("Stub!"); }
public  void setView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void setView(android.view.View view, int viewSpacingLeft, int viewSpacingTop, int viewSpacingRight, int viewSpacingBottom) { throw new RuntimeException("Stub!"); }
public  void setButton(int whichButton, java.lang.CharSequence text, android.os.Message msg) { throw new RuntimeException("Stub!"); }
public  void setButton(int whichButton, java.lang.CharSequence text, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  void setButton(java.lang.CharSequence text, android.os.Message msg) { throw new RuntimeException("Stub!"); }
public  void setButton2(java.lang.CharSequence text, android.os.Message msg) { throw new RuntimeException("Stub!"); }
public  void setButton3(java.lang.CharSequence text, android.os.Message msg) { throw new RuntimeException("Stub!"); }
public  void setButton(java.lang.CharSequence text, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  void setButton2(java.lang.CharSequence text, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  void setButton3(java.lang.CharSequence text, android.content.DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  void setIcon(int resId) { throw new RuntimeException("Stub!"); }
public  void setIcon(android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
public  void setInverseBackgroundForced(boolean forceInverseBackground) { throw new RuntimeException("Stub!"); }
protected  void onCreate(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
}
