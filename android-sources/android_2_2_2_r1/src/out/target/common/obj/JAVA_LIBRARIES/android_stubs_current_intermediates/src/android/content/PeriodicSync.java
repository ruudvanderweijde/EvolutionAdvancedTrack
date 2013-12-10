package android.content;
public class PeriodicSync
  implements android.os.Parcelable
{
public  PeriodicSync(android.accounts.Account account, java.lang.String authority, android.os.Bundle extras, long period) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public final android.accounts.Account account;
public final java.lang.String authority;
public final android.os.Bundle extras;
public final long period;
public static final android.os.Parcelable.Creator<android.content.PeriodicSync> CREATOR;
static { CREATOR = null; }
}
