package android.os;
public class DropBoxManager
{
public static class Entry
  implements android.os.Parcelable
{
public  Entry(java.lang.String tag, long millis) { throw new RuntimeException("Stub!"); }
public  Entry(java.lang.String tag, long millis, java.lang.String text) { throw new RuntimeException("Stub!"); }
public  Entry(java.lang.String tag, long millis, byte[] data, int flags) { throw new RuntimeException("Stub!"); }
public  Entry(java.lang.String tag, long millis, android.os.ParcelFileDescriptor data, int flags) { throw new RuntimeException("Stub!"); }
public  Entry(java.lang.String tag, long millis, java.io.File data, int flags) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTag() { throw new RuntimeException("Stub!"); }
public  long getTimeMillis() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  java.lang.String getText(int maxBytes) { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getInputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.DropBoxManager.Entry> CREATOR;
static { CREATOR = null; }
}
protected  DropBoxManager() { throw new RuntimeException("Stub!"); }
public  void addText(java.lang.String tag, java.lang.String data) { throw new RuntimeException("Stub!"); }
public  void addData(java.lang.String tag, byte[] data, int flags) { throw new RuntimeException("Stub!"); }
public  void addFile(java.lang.String tag, java.io.File file, int flags) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isTagEnabled(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  android.os.DropBoxManager.Entry getNextEntry(java.lang.String tag, long msec) { throw new RuntimeException("Stub!"); }
public static final int IS_EMPTY = 1;
public static final int IS_TEXT = 2;
public static final int IS_GZIPPED = 4;
}
