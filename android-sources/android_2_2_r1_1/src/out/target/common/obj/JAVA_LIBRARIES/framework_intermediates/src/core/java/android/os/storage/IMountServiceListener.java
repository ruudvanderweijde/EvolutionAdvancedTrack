/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/storage/IMountServiceListener.aidl
 */
package android.os.storage;
/**
 * Callback class for receiving events from MountService.
 *
 * @hide - Applications should use android.os.storage.IStorageEventListener
 * for storage event callbacks.
 */
public interface IMountServiceListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.storage.IMountServiceListener
{
private static final java.lang.String DESCRIPTOR = "android.os.storage.IMountServiceListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.storage.IMountServiceListener interface,
 * generating a proxy if needed.
 */
public static android.os.storage.IMountServiceListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.storage.IMountServiceListener))) {
return ((android.os.storage.IMountServiceListener)iin);
}
return new android.os.storage.IMountServiceListener.Stub.Proxy(obj);
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
case TRANSACTION_onUsbMassStorageConnectionChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onUsbMassStorageConnectionChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onStorageStateChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.onStorageStateChanged(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.storage.IMountServiceListener
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
     * Detection state of USB Mass Storage has changed
     *
     * @param available true if a UMS host is connected.
     */
public void onUsbMassStorageConnectionChanged(boolean connected) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((connected)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onUsbMassStorageConnectionChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Storage state has changed.
     *
     * @param path The volume mount path.
     * @param oldState The old state of the volume.
     * @param newState The new state of the volume.
     *
     * Note: State is one of the values returned by Environment.getExternalStorageState()
     */
public void onStorageStateChanged(java.lang.String path, java.lang.String oldState, java.lang.String newState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
_data.writeString(oldState);
_data.writeString(newState);
mRemote.transact(Stub.TRANSACTION_onStorageStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onUsbMassStorageConnectionChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onStorageStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Detection state of USB Mass Storage has changed
     *
     * @param available true if a UMS host is connected.
     */
public void onUsbMassStorageConnectionChanged(boolean connected) throws android.os.RemoteException;
/**
     * Storage state has changed.
     *
     * @param path The volume mount path.
     * @param oldState The old state of the volume.
     * @param newState The new state of the volume.
     *
     * Note: State is one of the values returned by Environment.getExternalStorageState()
     */
public void onStorageStateChanged(java.lang.String path, java.lang.String oldState, java.lang.String newState) throws android.os.RemoteException;
}
