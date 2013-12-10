package android.os;
public final class Message
  implements android.os.Parcelable
{
public  Message() { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain() { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Message orig) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, java.lang.Runnable callback) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, int what) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, int what, java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, int what, int arg1, int arg2) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, int what, int arg1, int arg2, java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  void recycle() { throw new RuntimeException("Stub!"); }
public  void copyFrom(android.os.Message o) { throw new RuntimeException("Stub!"); }
public  long getWhen() { throw new RuntimeException("Stub!"); }
public  void setTarget(android.os.Handler target) { throw new RuntimeException("Stub!"); }
public  android.os.Handler getTarget() { throw new RuntimeException("Stub!"); }
public  java.lang.Runnable getCallback() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getData() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle peekData() { throw new RuntimeException("Stub!"); }
public  void setData(android.os.Bundle data) { throw new RuntimeException("Stub!"); }
public  void sendToTarget() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public int what;
public int arg1;
public int arg2;
public java.lang.Object obj;
public android.os.Messenger replyTo;
public static final android.os.Parcelable.Creator<android.os.Message> CREATOR;
static { CREATOR = null; }
}
