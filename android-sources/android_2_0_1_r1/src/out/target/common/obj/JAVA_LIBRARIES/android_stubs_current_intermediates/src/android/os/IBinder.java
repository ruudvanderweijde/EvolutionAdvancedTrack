package android.os;
public interface IBinder
{
public static interface DeathRecipient
{
public abstract  void binderDied();
}
public abstract  java.lang.String getInterfaceDescriptor() throws android.os.RemoteException;
public abstract  boolean pingBinder();
public abstract  boolean isBinderAlive();
public abstract  android.os.IInterface queryLocalInterface(java.lang.String descriptor);
public abstract  void dump(java.io.FileDescriptor fd, java.lang.String[] args) throws android.os.RemoteException;
public abstract  boolean transact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException;
public abstract  void linkToDeath(android.os.IBinder.DeathRecipient recipient, int flags) throws android.os.RemoteException;
public abstract  boolean unlinkToDeath(android.os.IBinder.DeathRecipient recipient, int flags);
public static final int FIRST_CALL_TRANSACTION = 1;
public static final int LAST_CALL_TRANSACTION = 16777215;
public static final int PING_TRANSACTION = 1599098439;
public static final int DUMP_TRANSACTION = 1598311760;
public static final int INTERFACE_TRANSACTION = 1598968902;
public static final int FLAG_ONEWAY = 1;
}
