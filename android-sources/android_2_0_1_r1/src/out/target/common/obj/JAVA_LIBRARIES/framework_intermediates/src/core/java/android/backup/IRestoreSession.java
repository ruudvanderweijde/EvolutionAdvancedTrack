/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/backup/IRestoreSession.aidl
 */
package android.backup;
/**
 * Binder interface used by clients who wish to manage a restore operation.  Every
 * method in this interface requires the android.permission.BACKUP permission.
 *
 * {@hide}
 */
public interface IRestoreSession extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.backup.IRestoreSession
{
private static final java.lang.String DESCRIPTOR = "android.backup.IRestoreSession";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.backup.IRestoreSession interface,
 * generating a proxy if needed.
 */
public static android.backup.IRestoreSession asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.backup.IRestoreSession))) {
return ((android.backup.IRestoreSession)iin);
}
return new android.backup.IRestoreSession.Stub.Proxy(obj);
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
case TRANSACTION_getAvailableRestoreSets:
{
data.enforceInterface(DESCRIPTOR);
android.backup.RestoreSet[] _result = this.getAvailableRestoreSets();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_performRestore:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
android.backup.IRestoreObserver _arg1;
_arg1 = android.backup.IRestoreObserver.Stub.asInterface(data.readStrongBinder());
int _result = this.performRestore(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_endRestoreSession:
{
data.enforceInterface(DESCRIPTOR);
this.endRestoreSession();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.backup.IRestoreSession
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
     * Ask the current transport what the available restore sets are.
     *
     * @return A bundle containing two elements:  an int array under the key
     *   "tokens" whose entries are a transport-private identifier for each backup set;
     *   and a String array under the key "names" whose entries are the user-meaningful
     *   text corresponding to the backup sets at each index in the tokens array.
     */
public android.backup.RestoreSet[] getAvailableRestoreSets() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.backup.RestoreSet[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAvailableRestoreSets, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.backup.RestoreSet.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Restore the given set onto the device, replacing the current data of any app
     * contained in the restore set with the data previously backed up.
     *
     * @return Zero on success; nonzero on error.  The observer will only receive
     *   progress callbacks if this method returned zero.
     * @param token The token from {@link getAvailableRestoreSets()} corresponding to
     *   the restore set that should be used.
     * @param observer If non-null, this binder points to an object that will receive
     *   progress callbacks during the restore operation.
     */
public int performRestore(long token, android.backup.IRestoreObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(token);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_performRestore, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * End this restore session.  After this method is called, the IRestoreSession binder
     * is no longer valid.
     *
     * <p><b>Note:</b> The caller <i>must</i> invoke this method to end the restore session,
     *   even if {@link getAvailableRestoreSets} or {@link performRestore} failed.
     */
public void endRestoreSession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_endRestoreSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getAvailableRestoreSets = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_performRestore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_endRestoreSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * Ask the current transport what the available restore sets are.
     *
     * @return A bundle containing two elements:  an int array under the key
     *   "tokens" whose entries are a transport-private identifier for each backup set;
     *   and a String array under the key "names" whose entries are the user-meaningful
     *   text corresponding to the backup sets at each index in the tokens array.
     */
public android.backup.RestoreSet[] getAvailableRestoreSets() throws android.os.RemoteException;
/**
     * Restore the given set onto the device, replacing the current data of any app
     * contained in the restore set with the data previously backed up.
     *
     * @return Zero on success; nonzero on error.  The observer will only receive
     *   progress callbacks if this method returned zero.
     * @param token The token from {@link getAvailableRestoreSets()} corresponding to
     *   the restore set that should be used.
     * @param observer If non-null, this binder points to an object that will receive
     *   progress callbacks during the restore operation.
     */
public int performRestore(long token, android.backup.IRestoreObserver observer) throws android.os.RemoteException;
/**
     * End this restore session.  After this method is called, the IRestoreSession binder
     * is no longer valid.
     *
     * <p><b>Note:</b> The caller <i>must</i> invoke this method to end the restore session,
     *   even if {@link getAvailableRestoreSets} or {@link performRestore} failed.
     */
public void endRestoreSession() throws android.os.RemoteException;
}
