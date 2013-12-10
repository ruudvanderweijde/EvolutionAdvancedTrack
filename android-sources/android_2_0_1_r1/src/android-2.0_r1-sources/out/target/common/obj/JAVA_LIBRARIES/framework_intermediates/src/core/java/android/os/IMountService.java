/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IMountService.aidl
 */
package android.os;
/** WARNING! Update IMountService.h and IMountService.cpp if you change this file.
 * In particular, the ordering of the methods below must match the 
 * _TRANSACTION enum in IMountService.cpp
 * @hide
 */
public interface IMountService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IMountService
{
private static final java.lang.String DESCRIPTOR = "android.os.IMountService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IMountService interface,
 * generating a proxy if needed.
 */
public static android.os.IMountService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IMountService))) {
return ((android.os.IMountService)iin);
}
return new android.os.IMountService.Stub.Proxy(obj);
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
case TRANSACTION_getMassStorageEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getMassStorageEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setMassStorageEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setMassStorageEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getMassStorageConnected:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getMassStorageConnected();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_mountMedia:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.mountMedia(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unmountMedia:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.unmountMedia(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_formatMedia:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.formatMedia(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPlayNotificationSounds:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getPlayNotificationSounds();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPlayNotificationSounds:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setPlayNotificationSounds(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getAutoStartUms:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getAutoStartUms();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setAutoStartUms:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setAutoStartUms(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IMountService
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
     * Is mass storage support enabled?
     */
public boolean getMassStorageEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMassStorageEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Enable or disable mass storage support.
     */
public void setMassStorageEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMassStorageEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Is mass storage connected?
     */
public boolean getMassStorageConnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMassStorageConnected, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Mount external storage at given mount point.
     */
public void mountMedia(java.lang.String mountPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
mRemote.transact(Stub.TRANSACTION_mountMedia, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Safely unmount external storage at given mount point.
     */
public void unmountMedia(java.lang.String mountPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
mRemote.transact(Stub.TRANSACTION_unmountMedia, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Format external storage given a mount point.
     */
public void formatMedia(java.lang.String mountPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
mRemote.transact(Stub.TRANSACTION_formatMedia, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns true if media notification sounds are enabled.
     */
public boolean getPlayNotificationSounds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPlayNotificationSounds, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets whether or not media notification sounds are played.
     */
public void setPlayNotificationSounds(boolean value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((value)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPlayNotificationSounds, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns true if USB Mass Storage is automatically started
     * when a UMS host is detected.
     */
public boolean getAutoStartUms() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAutoStartUms, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets whether or not USB Mass Storage is automatically started
     * when a UMS host is detected.
     */
public void setAutoStartUms(boolean value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((value)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAutoStartUms, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getMassStorageEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setMassStorageEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getMassStorageConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_mountMedia = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_unmountMedia = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_formatMedia = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getPlayNotificationSounds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setPlayNotificationSounds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getAutoStartUms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setAutoStartUms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
/**
     * Is mass storage support enabled?
     */
public boolean getMassStorageEnabled() throws android.os.RemoteException;
/**
     * Enable or disable mass storage support.
     */
public void setMassStorageEnabled(boolean enabled) throws android.os.RemoteException;
/**
     * Is mass storage connected?
     */
public boolean getMassStorageConnected() throws android.os.RemoteException;
/**
     * Mount external storage at given mount point.
     */
public void mountMedia(java.lang.String mountPoint) throws android.os.RemoteException;
/**
     * Safely unmount external storage at given mount point.
     */
public void unmountMedia(java.lang.String mountPoint) throws android.os.RemoteException;
/**
     * Format external storage given a mount point.
     */
public void formatMedia(java.lang.String mountPoint) throws android.os.RemoteException;
/**
     * Returns true if media notification sounds are enabled.
     */
public boolean getPlayNotificationSounds() throws android.os.RemoteException;
/**
     * Sets whether or not media notification sounds are played.
     */
public void setPlayNotificationSounds(boolean value) throws android.os.RemoteException;
/**
     * Returns true if USB Mass Storage is automatically started
     * when a UMS host is detected.
     */
public boolean getAutoStartUms() throws android.os.RemoteException;
/**
     * Sets whether or not USB Mass Storage is automatically started
     * when a UMS host is detected.
     */
public void setAutoStartUms(boolean value) throws android.os.RemoteException;
}
