/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/net/INetworkManagementEventObserver.aidl
 */
package android.net;
/**
 * Callback class for receiving events from an INetworkManagementService
 *
 * @hide
 */
public interface INetworkManagementEventObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.INetworkManagementEventObserver
{
private static final java.lang.String DESCRIPTOR = "android.net.INetworkManagementEventObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.INetworkManagementEventObserver interface,
 * generating a proxy if needed.
 */
public static android.net.INetworkManagementEventObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.INetworkManagementEventObserver))) {
return ((android.net.INetworkManagementEventObserver)iin);
}
return new android.net.INetworkManagementEventObserver.Stub.Proxy(obj);
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
case TRANSACTION_interfaceLinkStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.interfaceLinkStatusChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_interfaceAdded:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.interfaceAdded(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_interfaceRemoved:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.interfaceRemoved(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.INetworkManagementEventObserver
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
     * Interface link status has changed.
     *
     * @param iface The interface.
     * @param link True if link is up.
     */
public void interfaceLinkStatusChanged(java.lang.String iface, boolean link) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
_data.writeInt(((link)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_interfaceLinkStatusChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * An interface has been added to the system
     *
     * @param iface The interface.
     */
public void interfaceAdded(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_interfaceAdded, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * An interface has been removed from the system
     *
     * @param iface The interface.
     */
public void interfaceRemoved(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_interfaceRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_interfaceLinkStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_interfaceAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_interfaceRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * Interface link status has changed.
     *
     * @param iface The interface.
     * @param link True if link is up.
     */
public void interfaceLinkStatusChanged(java.lang.String iface, boolean link) throws android.os.RemoteException;
/**
     * An interface has been added to the system
     *
     * @param iface The interface.
     */
public void interfaceAdded(java.lang.String iface) throws android.os.RemoteException;
/**
     * An interface has been removed from the system
     *
     * @param iface The interface.
     */
public void interfaceRemoved(java.lang.String iface) throws android.os.RemoteException;
}
