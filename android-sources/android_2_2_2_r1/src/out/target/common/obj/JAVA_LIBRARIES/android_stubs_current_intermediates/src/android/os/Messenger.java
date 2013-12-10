package android.os;
public final class Messenger
  implements android.os.Parcelable
{
public  Messenger(android.os.Handler target) { throw new RuntimeException("Stub!"); }
public  Messenger(android.os.IBinder target) { throw new RuntimeException("Stub!"); }
public  void send(android.os.Message message) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.os.IBinder getBinder() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object otherObj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static  void writeMessengerOrNullToParcel(android.os.Messenger messenger, android.os.Parcel out) { throw new RuntimeException("Stub!"); }
public static  android.os.Messenger readMessengerOrNullFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.Messenger> CREATOR;
static { CREATOR = null; }
}
