package android.content;
public class SyncStats
  implements android.os.Parcelable
{
public  SyncStats() { throw new RuntimeException("Stub!"); }
public  SyncStats(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public long numAuthExceptions;
public long numIoExceptions;
public long numParseExceptions;
public long numConflictDetectedExceptions;
public long numInserts;
public long numUpdates;
public long numDeletes;
public long numEntries;
public long numSkippedEntries;
public static final android.os.Parcelable.Creator<android.content.SyncStats> CREATOR;
static { CREATOR = null; }
}
