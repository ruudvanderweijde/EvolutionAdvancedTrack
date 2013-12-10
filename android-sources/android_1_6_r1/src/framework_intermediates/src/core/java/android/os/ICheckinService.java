/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/ICheckinService.aidl
 */
package android.os;
import java.lang.String;
/**
 * System private API for direct access to the checkin service.
 * Users should use the content provider instead.
 *
 * @see android.provider.Checkin
 * {@hide}
 */
public interface ICheckinService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.ICheckinService
{
private static final java.lang.String DESCRIPTOR = "android.os.ICheckinService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an ICheckinService interface,
 * generating a proxy if needed.
 */
public static android.os.ICheckinService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.ICheckinService))) {
return ((android.os.ICheckinService)iin);
}
return new android.os.ICheckinService.Stub.Proxy(obj);
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
case TRANSACTION_checkin:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.checkin();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_reportCrashSync:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.reportCrashSync(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_reportCrashAsync:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.reportCrashAsync(_arg0);
return true;
}
case TRANSACTION_masterClear:
{
data.enforceInterface(DESCRIPTOR);
this.masterClear();
reply.writeNoException();
return true;
}
case TRANSACTION_getParentalControlState:
{
data.enforceInterface(DESCRIPTOR);
android.os.IParentalControlCallback _arg0;
_arg0 = android.os.IParentalControlCallback.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
this.getParentalControlState(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.ICheckinService
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
/** Synchronously attempt a checkin with the server, return true
      * on success.
      * @throws IllegalStateException whenever an error occurs.  The
      * cause of the exception will be the real exception:
      * IOException for network errors, JSONException for invalid
      * server responses, etc.
      */
public boolean checkin() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_checkin, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** Direct submission of crash data; returns after writing the crash. */
public void reportCrashSync(byte[] crashData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(crashData);
mRemote.transact(Stub.TRANSACTION_reportCrashSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Asynchronous "fire and forget" version of crash reporting. */
public void reportCrashAsync(byte[] crashData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(crashData);
mRemote.transact(Stub.TRANSACTION_reportCrashAsync, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/** Reboot into the recovery system and wipe all user data. */
public void masterClear() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_masterClear, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Determine if the device is under parental control. Return null if
     * we are unable to check the parental control status.
     */
public void getParentalControlState(android.os.IParentalControlCallback p, java.lang.String requestingApp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((p!=null))?(p.asBinder()):(null)));
_data.writeString(requestingApp);
mRemote.transact(Stub.TRANSACTION_getParentalControlState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_checkin = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_reportCrashSync = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_reportCrashAsync = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_masterClear = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getParentalControlState = (IBinder.FIRST_CALL_TRANSACTION + 4);
}
/** Synchronously attempt a checkin with the server, return true
      * on success.
      * @throws IllegalStateException whenever an error occurs.  The
      * cause of the exception will be the real exception:
      * IOException for network errors, JSONException for invalid
      * server responses, etc.
      */
public boolean checkin() throws android.os.RemoteException;
/** Direct submission of crash data; returns after writing the crash. */
public void reportCrashSync(byte[] crashData) throws android.os.RemoteException;
/** Asynchronous "fire and forget" version of crash reporting. */
public void reportCrashAsync(byte[] crashData) throws android.os.RemoteException;
/** Reboot into the recovery system and wipe all user data. */
public void masterClear() throws android.os.RemoteException;
/**
     * Determine if the device is under parental control. Return null if
     * we are unable to check the parental control status.
     */
public void getParentalControlState(android.os.IParentalControlCallback p, java.lang.String requestingApp) throws android.os.RemoteException;
}
