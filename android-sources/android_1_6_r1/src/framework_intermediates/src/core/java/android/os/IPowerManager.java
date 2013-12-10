/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IPowerManager.aidl
 */
package android.os;
import java.lang.String;
/** @hide */
public interface IPowerManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IPowerManager
{
private static final java.lang.String DESCRIPTOR = "android.os.IPowerManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IPowerManager interface,
 * generating a proxy if needed.
 */
public static android.os.IPowerManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IPowerManager))) {
return ((android.os.IPowerManager)iin);
}
return new android.os.IPowerManager.Stub.Proxy(obj);
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
case TRANSACTION_acquireWakeLock:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String _arg2;
_arg2 = data.readString();
this.acquireWakeLock(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_goToSleep:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.goToSleep(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_releaseWakeLock:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.releaseWakeLock(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_userActivity:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.userActivity(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_userActivityWithForce:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _arg2;
_arg2 = (0!=data.readInt());
this.userActivityWithForce(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setPokeLock:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String _arg2;
_arg2 = data.readString();
this.setPokeLock(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setStayOnSetting:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setStayOnSetting(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getScreenOnTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getScreenOnTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_preventScreenOn:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.preventScreenOn(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setScreenBrightnessOverride:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setScreenBrightnessOverride(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IPowerManager
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
public void acquireWakeLock(int flags, android.os.IBinder lock, java.lang.String tag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
_data.writeStrongBinder(lock);
_data.writeString(tag);
mRemote.transact(Stub.TRANSACTION_acquireWakeLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void goToSleep(long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_goToSleep, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void releaseWakeLock(android.os.IBinder lock) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(lock);
mRemote.transact(Stub.TRANSACTION_releaseWakeLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void userActivity(long when, boolean noChangeLights) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(when);
_data.writeInt(((noChangeLights)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_userActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void userActivityWithForce(long when, boolean noChangeLights, boolean force) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(when);
_data.writeInt(((noChangeLights)?(1):(0)));
_data.writeInt(((force)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_userActivityWithForce, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setPokeLock(int pokey, android.os.IBinder lock, java.lang.String tag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(pokey);
_data.writeStrongBinder(lock);
_data.writeString(tag);
mRemote.transact(Stub.TRANSACTION_setPokeLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setStayOnSetting(int val) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(val);
mRemote.transact(Stub.TRANSACTION_setStayOnSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public long getScreenOnTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getScreenOnTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void preventScreenOn(boolean prevent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((prevent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_preventScreenOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setScreenBrightnessOverride(int brightness) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(brightness);
mRemote.transact(Stub.TRANSACTION_setScreenBrightnessOverride, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_acquireWakeLock = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_goToSleep = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_releaseWakeLock = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_userActivity = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_userActivityWithForce = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setPokeLock = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setStayOnSetting = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getScreenOnTime = (IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_preventScreenOn = (IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setScreenBrightnessOverride = (IBinder.FIRST_CALL_TRANSACTION + 9);
}
public void acquireWakeLock(int flags, android.os.IBinder lock, java.lang.String tag) throws android.os.RemoteException;
public void goToSleep(long time) throws android.os.RemoteException;
public void releaseWakeLock(android.os.IBinder lock) throws android.os.RemoteException;
public void userActivity(long when, boolean noChangeLights) throws android.os.RemoteException;
public void userActivityWithForce(long when, boolean noChangeLights, boolean force) throws android.os.RemoteException;
public void setPokeLock(int pokey, android.os.IBinder lock, java.lang.String tag) throws android.os.RemoteException;
public void setStayOnSetting(int val) throws android.os.RemoteException;
public long getScreenOnTime() throws android.os.RemoteException;
public void preventScreenOn(boolean prevent) throws android.os.RemoteException;
public void setScreenBrightnessOverride(int brightness) throws android.os.RemoteException;
}
