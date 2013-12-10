package android.os;
public class ResultReceiver
  implements android.os.Parcelable
{
public  ResultReceiver(android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void send(int resultCode, android.os.Bundle resultData) { throw new RuntimeException("Stub!"); }
protected  void onReceiveResult(int resultCode, android.os.Bundle resultData) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.ResultReceiver> CREATOR;
static { CREATOR = null; }
}
