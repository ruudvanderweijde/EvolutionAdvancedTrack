/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/backup/IRestoreObserver.aidl
 */
package android.backup;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
/**
 * Callback class for receiving progress reports during a restore operation.
 *
 * @hide
 */
public interface IRestoreObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.backup.IRestoreObserver
{
private static final java.lang.String DESCRIPTOR = "android.backup.IRestoreObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IRestoreObserver interface,
 * generating a proxy if needed.
 */
public static android.backup.IRestoreObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.backup.IRestoreObserver))) {
return ((android.backup.IRestoreObserver)iin);
}
return new android.backup.IRestoreObserver.Stub.Proxy(obj);
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
case TRANSACTION_restoreStarting:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.restoreStarting(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onUpdate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onUpdate(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_restoreFinished:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.restoreFinished(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.backup.IRestoreObserver
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
     * The restore operation has begun.
     *
     * @param numPackages The total number of packages being processed in
     *   this restore operation.
     */
public void restoreStarting(int numPackages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(numPackages);
mRemote.transact(Stub.TRANSACTION_restoreStarting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * An indication of which package is being restored currently, out of the
     * total number provided in the restoreStarting() callback.  This method
     * is not guaranteed to be called.
     *
     * @param nowBeingRestored The index, between 1 and the numPackages parameter
     *   to the restoreStarting() callback, of the package now being restored.
     */
public void onUpdate(int nowBeingRestored) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nowBeingRestored);
mRemote.transact(Stub.TRANSACTION_onUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * The restore operation has completed.
     *
     * @param error Zero on success; a nonzero error code if the restore operation
     *   as a whole failed.
     */
public void restoreFinished(int error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(error);
mRemote.transact(Stub.TRANSACTION_restoreFinished, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_restoreStarting = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onUpdate = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_restoreFinished = (IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * The restore operation has begun.
     *
     * @param numPackages The total number of packages being processed in
     *   this restore operation.
     */
public void restoreStarting(int numPackages) throws android.os.RemoteException;
/**
     * An indication of which package is being restored currently, out of the
     * total number provided in the restoreStarting() callback.  This method
     * is not guaranteed to be called.
     *
     * @param nowBeingRestored The index, between 1 and the numPackages parameter
     *   to the restoreStarting() callback, of the package now being restored.
     */
public void onUpdate(int nowBeingRestored) throws android.os.RemoteException;
/**
     * The restore operation has completed.
     *
     * @param error Zero on success; a nonzero error code if the restore operation
     *   as a whole failed.
     */
public void restoreFinished(int error) throws android.os.RemoteException;
}
