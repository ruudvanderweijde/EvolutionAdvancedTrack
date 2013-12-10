package android.content;
public class IntentSender
  implements android.os.Parcelable
{
public static class SendIntentException
  extends android.util.AndroidException
{
public  SendIntentException() { throw new RuntimeException("Stub!"); }
public  SendIntentException(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  SendIntentException(java.lang.Exception cause) { throw new RuntimeException("Stub!"); }
}
public static interface OnFinished
{
public abstract  void onSendFinished(android.content.IntentSender IntentSender, android.content.Intent intent, int resultCode, java.lang.String resultData, android.os.Bundle resultExtras);
}
IntentSender() { throw new RuntimeException("Stub!"); }
public  void sendIntent(android.content.Context context, int code, android.content.Intent intent, android.content.IntentSender.OnFinished onFinished, android.os.Handler handler) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object otherObj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static  void writeIntentSenderOrNullToParcel(android.content.IntentSender sender, android.os.Parcel out) { throw new RuntimeException("Stub!"); }
public static  android.content.IntentSender readIntentSenderOrNullFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.IntentSender> CREATOR;
static { CREATOR = null; }
}
