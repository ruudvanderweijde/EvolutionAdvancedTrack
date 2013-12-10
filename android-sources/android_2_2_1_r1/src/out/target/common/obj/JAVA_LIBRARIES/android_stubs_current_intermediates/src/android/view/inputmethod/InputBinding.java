package android.view.inputmethod;
public final class InputBinding
  implements android.os.Parcelable
{
public  InputBinding(android.view.inputmethod.InputConnection conn, android.os.IBinder connToken, int uid, int pid) { throw new RuntimeException("Stub!"); }
public  InputBinding(android.view.inputmethod.InputConnection conn, android.view.inputmethod.InputBinding binding) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputConnection getConnection() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder getConnectionToken() { throw new RuntimeException("Stub!"); }
public  int getUid() { throw new RuntimeException("Stub!"); }
public  int getPid() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.inputmethod.InputBinding> CREATOR;
static { CREATOR = null; }
}
