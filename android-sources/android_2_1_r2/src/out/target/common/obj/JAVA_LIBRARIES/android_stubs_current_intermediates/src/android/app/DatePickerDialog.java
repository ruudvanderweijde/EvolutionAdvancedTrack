package android.app;
public class DatePickerDialog
  extends android.app.AlertDialog
  implements android.content.DialogInterface.OnClickListener, android.widget.DatePicker.OnDateChangedListener
{
public static interface OnDateSetListener
{
public abstract  void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth);
}
public  DatePickerDialog(android.content.Context context, android.app.DatePickerDialog.OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth) { super((android.content.Context)null,false,(android.content.DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); }
public  DatePickerDialog(android.content.Context context, int theme, android.app.DatePickerDialog.OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth) { super((android.content.Context)null,false,(android.content.DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); }
public  void show() { throw new RuntimeException("Stub!"); }
public  void onClick(android.content.DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); }
public  void onDateChanged(android.widget.DatePicker view, int year, int month, int day) { throw new RuntimeException("Stub!"); }
public  void updateDate(int year, int monthOfYear, int dayOfMonth) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
}
