/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/accounts/IAccountsService.aidl
 */
package android.accounts;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
/**
 * Central application service that allows querying the list of accounts.
 */
public interface IAccountsService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.accounts.IAccountsService
{
private static final java.lang.String DESCRIPTOR = "android.accounts.IAccountsService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IAccountsService interface,
 * generating a proxy if needed.
 */
public static android.accounts.IAccountsService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.accounts.IAccountsService))) {
return ((android.accounts.IAccountsService)iin);
}
return new android.accounts.IAccountsService.Stub.Proxy(obj);
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
case TRANSACTION_getAccounts:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getAccounts();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_shouldUnlock:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.shouldUnlock(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.accounts.IAccountsService
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
     * Gets the list of Accounts the user has previously logged
     * in to.  Accounts are of the form "username@domain".
     * <p>
     * This method will return an empty array if the device doesn't
     * know about any accounts (yet).
     *
     * @return The accounts.  The array will be zero-length if the
     *         AccountsService doesn't know about any accounts yet.
     */
public java.lang.String[] getAccounts() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAccounts, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * This is an interim solution for bypassing a forgotten gesture on the
     * unlock screen (it is hidden, please make sure it stays this way!). This
     * will be *removed* when the unlock screen design supports additional
     * authenticators.
     * <p>
     * The user will be presented with username and password fields that are
     * called as parameters to this method. If true is returned, the user is
     * able to define a new gesture and get back into the system. If false, the
     * user can try again.
     * 
     * @param username The username entered.
     * @param password The password entered.
     * @return Whether to allow the user to bypass the lock screen and define a
     *         new gesture.
     * @hide (The package is already hidden, but just in case someone
     *       unhides that, this should not be revealed.)
     */
public boolean shouldUnlock(java.lang.String username, java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(username);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_shouldUnlock, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getAccounts = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_shouldUnlock = (IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Gets the list of Accounts the user has previously logged
     * in to.  Accounts are of the form "username@domain".
     * <p>
     * This method will return an empty array if the device doesn't
     * know about any accounts (yet).
     *
     * @return The accounts.  The array will be zero-length if the
     *         AccountsService doesn't know about any accounts yet.
     */
public java.lang.String[] getAccounts() throws android.os.RemoteException;
/**
     * This is an interim solution for bypassing a forgotten gesture on the
     * unlock screen (it is hidden, please make sure it stays this way!). This
     * will be *removed* when the unlock screen design supports additional
     * authenticators.
     * <p>
     * The user will be presented with username and password fields that are
     * called as parameters to this method. If true is returned, the user is
     * able to define a new gesture and get back into the system. If false, the
     * user can try again.
     * 
     * @param username The username entered.
     * @param password The password entered.
     * @return Whether to allow the user to bypass the lock screen and define a
     *         new gesture.
     * @hide (The package is already hidden, but just in case someone
     *       unhides that, this should not be revealed.)
     */
public boolean shouldUnlock(java.lang.String username, java.lang.String password) throws android.os.RemoteException;
}
