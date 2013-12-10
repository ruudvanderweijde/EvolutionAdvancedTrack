package android.preference;
public final class PreferenceScreen
  extends android.preference.PreferenceGroup
  implements android.widget.AdapterView.OnItemClickListener, android.content.DialogInterface.OnDismissListener
{
PreferenceScreen() { super((android.content.Context)null,(android.util.AttributeSet)null); throw new RuntimeException("Stub!"); }
public  android.widget.ListAdapter getRootAdapter() { throw new RuntimeException("Stub!"); }
protected  android.widget.ListAdapter onCreateRootAdapter() { throw new RuntimeException("Stub!"); }
public  void bind(android.widget.ListView listView) { throw new RuntimeException("Stub!"); }
protected  void onClick() { throw new RuntimeException("Stub!"); }
public  void onDismiss(android.content.DialogInterface dialog) { throw new RuntimeException("Stub!"); }
public  android.app.Dialog getDialog() { throw new RuntimeException("Stub!"); }
public  void onItemClick(android.widget.AdapterView parent, android.view.View view, int position, long id) { throw new RuntimeException("Stub!"); }
protected  boolean isOnSameScreenAsChildren() { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
}
