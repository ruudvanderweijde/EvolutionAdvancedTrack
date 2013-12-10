package android.content;
public interface DialogInterface
{
public static interface OnCancelListener
{
public abstract  void onCancel(android.content.DialogInterface dialog);
}
public static interface OnDismissListener
{
public abstract  void onDismiss(android.content.DialogInterface dialog);
}
public static interface OnShowListener
{
public abstract  void onShow(android.content.DialogInterface dialog);
}
public static interface OnClickListener
{
public abstract  void onClick(android.content.DialogInterface dialog, int which);
}
public static interface OnMultiChoiceClickListener
{
public abstract  void onClick(android.content.DialogInterface dialog, int which, boolean isChecked);
}
public static interface OnKeyListener
{
public abstract  boolean onKey(android.content.DialogInterface dialog, int keyCode, android.view.KeyEvent event);
}
public abstract  void cancel();
public abstract  void dismiss();
public static final int BUTTON_POSITIVE = -1;
public static final int BUTTON_NEGATIVE = -2;
public static final int BUTTON_NEUTRAL = -3;
public static final int BUTTON1 = -1;
public static final int BUTTON2 = -2;
public static final int BUTTON3 = -3;
}
