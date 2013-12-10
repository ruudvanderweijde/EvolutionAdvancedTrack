package android.os;
public class ParcelFileDescriptor
  implements android.os.Parcelable
{
public static class AutoCloseInputStream
  extends java.io.FileInputStream
{
public  AutoCloseInputStream(android.os.ParcelFileDescriptor fd) { super((java.io.FileDescriptor)null); throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
public static class AutoCloseOutputStream
  extends java.io.FileOutputStream
{
public  AutoCloseOutputStream(android.os.ParcelFileDescriptor fd) { super((java.io.FileDescriptor)null); throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
public  ParcelFileDescriptor(android.os.ParcelFileDescriptor descriptor) { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor open(java.io.File file, int mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor fromSocket(java.net.Socket socket) { throw new RuntimeException("Stub!"); }
public  java.io.FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
public native  long getStatSize();
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final int MODE_WORLD_READABLE = 1;
public static final int MODE_WORLD_WRITEABLE = 2;
public static final int MODE_READ_ONLY = 268435456;
public static final int MODE_WRITE_ONLY = 536870912;
public static final int MODE_READ_WRITE = 805306368;
public static final int MODE_CREATE = 134217728;
public static final int MODE_TRUNCATE = 67108864;
public static final int MODE_APPEND = 33554432;
public static final android.os.Parcelable.Creator<android.os.ParcelFileDescriptor> CREATOR;
static { CREATOR = null; }
}
