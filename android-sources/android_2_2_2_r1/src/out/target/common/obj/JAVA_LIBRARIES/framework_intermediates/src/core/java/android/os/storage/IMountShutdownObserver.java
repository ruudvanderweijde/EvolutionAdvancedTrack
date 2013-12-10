/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/storage/IMountShutdownObserver.aidl
 */
package android.os.storage;
/**
 * Callback class for receiving events related
 * to shutdown.
 *
 * @hide - For internal consumption only.
 */
public interface IMountShutdownObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.storage.IMountShutdownObserver
{
private static final java.lang.String DESCRIPTOR = "android.os.storage.IMountShutdownObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.storage.IMountShutdownObserver interface,
 * generating a proxy if needed.
 */
public static android.os.storage.IMountShutdownObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.storage.IMountShutdownObserver))) {
return ((android.os.storage.IMountShutdownObserver)iin);
}
return new android.os.storage.IMountShutdownObserver.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onShutDownComplete:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onShutDownComplete(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.storage.IMountShutdownObserver
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * This method is called when the shutdown
     * of MountService completed.
     * @param statusCode indicates success or failure
     * of the shutdown.
     */
public void onShutDownComplete(int statusCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(statusCode);
mRemote.transact(Stub.TRANSACTION_onShutDownComplete, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onShutDownComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * This method is called when the shutdown
     * of MountService completed.
     * @param statusCode indicates success or failure
     * of the shutdown.
     */
public void onShutDownComplete(int statusCode) throws android.os.RemoteException;
}
