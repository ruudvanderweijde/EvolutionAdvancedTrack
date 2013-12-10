/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IHardwareService.aidl
 */
package android.os;
import java.lang.String;
/** {@hide} */
public interface IHardwareService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IHardwareService
{
private static final java.lang.String DESCRIPTOR = "android.os.IHardwareService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IHardwareService interface,
 * generating a proxy if needed.
 */
public static android.os.IHardwareService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IHardwareService))) {
return ((android.os.IHardwareService)iin);
}
return new android.os.IHardwareService.Stub.Proxy(obj);
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
case TRANSACTION_vibrate:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.vibrate(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_vibratePattern:
{
data.enforceInterface(DESCRIPTOR);
long[] _arg0;
_arg0 = data.createLongArray();
int _arg1;
_arg1 = data.readInt();
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
this.vibratePattern(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelVibrate:
{
data.enforceInterface(DESCRIPTOR);
this.cancelVibrate();
reply.writeNoException();
return true;
}
case TRANSACTION_getFlashlightEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getFlashlightEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setFlashlightEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setFlashlightEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_enableCameraFlash:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.enableCameraFlash(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setBacklights:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setBacklights(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setAttentionLight:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setAttentionLight(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IHardwareService
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
// Vibrator support

public void vibrate(long milliseconds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(milliseconds);
mRemote.transact(Stub.TRANSACTION_vibrate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void vibratePattern(long[] pattern, int repeat, android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLongArray(pattern);
_data.writeInt(repeat);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_vibratePattern, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void cancelVibrate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelVibrate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// flashlight support

public boolean getFlashlightEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFlashlightEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setFlashlightEnabled(boolean on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((on)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setFlashlightEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void enableCameraFlash(int milliseconds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(milliseconds);
mRemote.transact(Stub.TRANSACTION_enableCameraFlash, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// sets the brightness of the backlights (screen, keyboard, button) 0-255

public void setBacklights(int brightness) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(brightness);
mRemote.transact(Stub.TRANSACTION_setBacklights, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// for the phone

public void setAttentionLight(boolean on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((on)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAttentionLight, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_vibrate = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_vibratePattern = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_cancelVibrate = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getFlashlightEnabled = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setFlashlightEnabled = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_enableCameraFlash = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setBacklights = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setAttentionLight = (IBinder.FIRST_CALL_TRANSACTION + 7);
}
// Vibrator support

public void vibrate(long milliseconds) throws android.os.RemoteException;
public void vibratePattern(long[] pattern, int repeat, android.os.IBinder token) throws android.os.RemoteException;
public void cancelVibrate() throws android.os.RemoteException;
// flashlight support

public boolean getFlashlightEnabled() throws android.os.RemoteException;
public void setFlashlightEnabled(boolean on) throws android.os.RemoteException;
public void enableCameraFlash(int milliseconds) throws android.os.RemoteException;
// sets the brightness of the backlights (screen, keyboard, button) 0-255

public void setBacklights(int brightness) throws android.os.RemoteException;
// for the phone

public void setAttentionLight(boolean on) throws android.os.RemoteException;
}
