package android.os;
public class Binder
  implements android.os.IBinder
{
public  Binder() { throw new RuntimeException("Stub!"); }
public static final native  int getCallingPid();
public static final native  int getCallingUid();
public static final native  long clearCallingIdentity();
public static final native  void restoreCallingIdentity(long token);
public static final native  void flushPendingCommands();
public static final native  void joinThreadPool();
public  void attachInterface(android.os.IInterface owner, java.lang.String descriptor) { throw new RuntimeException("Stub!"); }
public  java.lang.String getInterfaceDescriptor() { throw new RuntimeException("Stub!"); }
public  boolean pingBinder() { throw new RuntimeException("Stub!"); }
public  boolean isBinderAlive() { throw new RuntimeException("Stub!"); }
public  android.os.IInterface queryLocalInterface(java.lang.String descriptor) { throw new RuntimeException("Stub!"); }
protected  boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void dump(java.io.FileDescriptor fd, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
protected  void dump(java.io.FileDescriptor fd, java.io.PrintWriter fout, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public final  boolean transact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void linkToDeath(android.os.IBinder.DeathRecipient recipient, int flags) { throw new RuntimeException("Stub!"); }
public  boolean unlinkToDeath(android.os.IBinder.DeathRecipient recipient, int flags) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
