package android.content;
public class SyncAdapterType
  implements android.os.Parcelable
{
public  SyncAdapterType(java.lang.String authority, java.lang.String accountType, boolean userVisible, boolean supportsUploading) { throw new RuntimeException("Stub!"); }
public  SyncAdapterType(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  boolean supportsUploading() { throw new RuntimeException("Stub!"); }
public  boolean isUserVisible() { throw new RuntimeException("Stub!"); }
public static  android.content.SyncAdapterType newKey(java.lang.String authority, java.lang.String accountType) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public final java.lang.String authority;
public final java.lang.String accountType;
public final boolean isKey;
public static final android.os.Parcelable.Creator<android.content.SyncAdapterType> CREATOR;
static { CREATOR = null; }
}
