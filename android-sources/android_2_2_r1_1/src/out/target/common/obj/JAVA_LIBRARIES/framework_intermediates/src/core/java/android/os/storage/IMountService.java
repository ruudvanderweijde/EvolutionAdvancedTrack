/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/storage/IMountService.aidl
 */
package android.os.storage;
/** WARNING! Update IMountService.h and IMountService.cpp if you change this file.
 * In particular, the ordering of the methods below must match the 
 * _TRANSACTION enum in IMountService.cpp
 * @hide - Applications should use android.os.storage.StorageManager to access
 * storage functions.
 */
public interface IMountService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.storage.IMountService
{
private static final java.lang.String DESCRIPTOR = "android.os.storage.IMountService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.storage.IMountService interface,
 * generating a proxy if needed.
 */
public static android.os.storage.IMountService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.storage.IMountService))) {
return ((android.os.storage.IMountService)iin);
}
return new android.os.storage.IMountService.Stub.Proxy(obj);
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
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.storage.IMountServiceListener _arg0;
_arg0 = android.os.storage.IMountServiceListener.Stub.asInterface(data.readStrongBinder());
this.registerListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.storage.IMountServiceListener _arg0;
_arg0 = android.os.storage.IMountServiceListener.Stub.asInterface(data.readStrongBinder());
this.unregisterListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isUsbMassStorageConnected:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isUsbMassStorageConnected();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setUsbMassStorageEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setUsbMassStorageEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isUsbMassStorageEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isUsbMassStorageEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_mountVolume:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.mountVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_unmountVolume:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.unmountVolume(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_formatVolume:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.formatVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getStorageUsers:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _result = this.getStorageUsers(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getVolumeState:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getVolumeState(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_createSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
int _result = this.createSecureContainer(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_finalizeSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.finalizeSecureContainer(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_destroySecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.destroySecureContainer(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_mountSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _result = this.mountSecureContainer(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_unmountSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.unmountSecureContainer(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isSecureContainerMounted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isSecureContainerMounted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_renameSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.renameSecureContainer(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSecureContainerPath:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getSecureContainerPath(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSecureContainerList:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getSecureContainerList();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
android.os.storage.IMountShutdownObserver _arg0;
_arg0 = android.os.storage.IMountShutdownObserver.Stub.asInterface(data.readStrongBinder());
this.shutdown(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_finishMediaUpdate:
{
data.enforceInterface(DESCRIPTOR);
this.finishMediaUpdate();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.storage.IMountService
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
     * Registers an IMountServiceListener for receiving async
     * notifications.
     */
public void registerListener(android.os.storage.IMountServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Unregisters an IMountServiceListener
     */
public void unregisterListener(android.os.storage.IMountServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns true if a USB mass storage host is connected
     */
public boolean isUsbMassStorageConnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isUsbMassStorageConnected, _data, _reply, 0);
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
     * Enables / disables USB mass storage.
     * The caller should check actual status of enabling/disabling
     * USB mass storage via StorageEventListener.
     */
public void setUsbMassStorageEnabled(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUsbMassStorageEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns true if a USB mass storage host is enabled (media is shared)
     */
public boolean isUsbMassStorageEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isUsbMassStorageEnabled, _data, _reply, 0);
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
     * Returns an int consistent with MountServiceResultCode
     */
public int mountVolume(java.lang.String mountPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
mRemote.transact(Stub.TRANSACTION_mountVolume, _data, _reply, 0);
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
     * Safely unmount external storage at given mount point.
     * The unmount is an asynchronous operation. Applications
     * should register StorageEventListener for storage related
     * status changes.
     * 
     */
public void unmountVolume(java.lang.String mountPoint, boolean force) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
_data.writeInt(((force)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_unmountVolume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Format external storage given a mount point.
     * Returns an int consistent with MountServiceResultCode
     */
public int formatVolume(java.lang.String mountPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
mRemote.transact(Stub.TRANSACTION_formatVolume, _data, _reply, 0);
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
     * Returns an array of pids with open files on
     * the specified path.
     */
public int[] getStorageUsers(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_getStorageUsers, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Gets the state of a volume via its mountpoint.
     */
public java.lang.String getVolumeState(java.lang.String mountPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
mRemote.transact(Stub.TRANSACTION_getVolumeState, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Creates a secure container with the specified parameters.
     * Returns an int consistent with MountServiceResultCode
     */
public int createSecureContainer(java.lang.String id, int sizeMb, java.lang.String fstype, java.lang.String key, int ownerUid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeInt(sizeMb);
_data.writeString(fstype);
_data.writeString(key);
_data.writeInt(ownerUid);
mRemote.transact(Stub.TRANSACTION_createSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Finalize a container which has just been created and populated.
     * After finalization, the container is immutable.
     * Returns an int consistent with MountServiceResultCode
     */
public int finalizeSecureContainer(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_finalizeSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Destroy a secure container, and free up all resources associated with it.
     * NOTE: Ensure all references are released prior to deleting.
     * Returns an int consistent with MountServiceResultCode
     */
public int destroySecureContainer(java.lang.String id, boolean force) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeInt(((force)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_destroySecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Mount a secure container with the specified key and owner UID.
     * Returns an int consistent with MountServiceResultCode
     */
public int mountSecureContainer(java.lang.String id, java.lang.String key, int ownerUid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeString(key);
_data.writeInt(ownerUid);
mRemote.transact(Stub.TRANSACTION_mountSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Unount a secure container.
     * Returns an int consistent with MountServiceResultCode
     */
public int unmountSecureContainer(java.lang.String id, boolean force) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeInt(((force)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_unmountSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Returns true if the specified container is mounted
     */
public boolean isSecureContainerMounted(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_isSecureContainerMounted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Rename an unmounted secure container.
     * Returns an int consistent with MountServiceResultCode
     */
public int renameSecureContainer(java.lang.String oldId, java.lang.String newId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(oldId);
_data.writeString(newId);
mRemote.transact(Stub.TRANSACTION_renameSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Returns the filesystem path of a mounted secure container.
     */
public java.lang.String getSecureContainerPath(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_getSecureContainerPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Gets an Array of currently known secure container IDs
     */
public java.lang.String[] getSecureContainerList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSecureContainerList, _data, _reply, 0);
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
     * Shuts down the MountService and gracefully unmounts all external media.
     * Invokes call back once the shutdown is complete.
     */
public void shutdown(android.os.storage.IMountShutdownObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Call into MountService by PackageManager to notify that its done
     * processing the media status update request.
     */
public void finishMediaUpdate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_finishMediaUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isUsbMassStorageConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setUsbMassStorageEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isUsbMassStorageEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_mountVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_unmountVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_formatVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getStorageUsers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getVolumeState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_createSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_finalizeSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_destroySecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_mountSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_unmountSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_isSecureContainerMounted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_renameSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getSecureContainerPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getSecureContainerList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_finishMediaUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
}
/**
     * Registers an IMountServiceListener for receiving async
     * notifications.
     */
public void registerListener(android.os.storage.IMountServiceListener listener) throws android.os.RemoteException;
/**
     * Unregisters an IMountServiceListener
     */
public void unregisterListener(android.os.storage.IMountServiceListener listener) throws android.os.RemoteException;
/**
     * Returns true if a USB mass storage host is connected
     */
public boolean isUsbMassStorageConnected() throws android.os.RemoteException;
/**
     * Enables / disables USB mass storage.
     * The caller should check actual status of enabling/disabling
     * USB mass storage via StorageEventListener.
     */
public void setUsbMassStorageEnabled(boolean enable) throws android.os.RemoteException;
/**
     * Returns true if a USB mass storage host is enabled (media is shared)
     */
public boolean isUsbMassStorageEnabled() throws android.os.RemoteException;
/**
     * Mount external storage at given mount point.
     * Returns an int consistent with MountServiceResultCode
     */
public int mountVolume(java.lang.String mountPoint) throws android.os.RemoteException;
/**
     * Safely unmount external storage at given mount point.
     * The unmount is an asynchronous operation. Applications
     * should register StorageEventListener for storage related
     * status changes.
     * 
     */
public void unmountVolume(java.lang.String mountPoint, boolean force) throws android.os.RemoteException;
/**
     * Format external storage given a mount point.
     * Returns an int consistent with MountServiceResultCode
     */
public int formatVolume(java.lang.String mountPoint) throws android.os.RemoteException;
/**
     * Returns an array of pids with open files on
     * the specified path.
     */
public int[] getStorageUsers(java.lang.String path) throws android.os.RemoteException;
/**
     * Gets the state of a volume via its mountpoint.
     */
public java.lang.String getVolumeState(java.lang.String mountPoint) throws android.os.RemoteException;
/*
     * Creates a secure container with the specified parameters.
     * Returns an int consistent with MountServiceResultCode
     */
public int createSecureContainer(java.lang.String id, int sizeMb, java.lang.String fstype, java.lang.String key, int ownerUid) throws android.os.RemoteException;
/*
     * Finalize a container which has just been created and populated.
     * After finalization, the container is immutable.
     * Returns an int consistent with MountServiceResultCode
     */
public int finalizeSecureContainer(java.lang.String id) throws android.os.RemoteException;
/*
     * Destroy a secure container, and free up all resources associated with it.
     * NOTE: Ensure all references are released prior to deleting.
     * Returns an int consistent with MountServiceResultCode
     */
public int destroySecureContainer(java.lang.String id, boolean force) throws android.os.RemoteException;
/*
     * Mount a secure container with the specified key and owner UID.
     * Returns an int consistent with MountServiceResultCode
     */
public int mountSecureContainer(java.lang.String id, java.lang.String key, int ownerUid) throws android.os.RemoteException;
/*
     * Unount a secure container.
     * Returns an int consistent with MountServiceResultCode
     */
public int unmountSecureContainer(java.lang.String id, boolean force) throws android.os.RemoteException;
/*
     * Returns true if the specified container is mounted
     */
public boolean isSecureContainerMounted(java.lang.String id) throws android.os.RemoteException;
/*
     * Rename an unmounted secure container.
     * Returns an int consistent with MountServiceResultCode
     */
public int renameSecureContainer(java.lang.String oldId, java.lang.String newId) throws android.os.RemoteException;
/*
     * Returns the filesystem path of a mounted secure container.
     */
public java.lang.String getSecureContainerPath(java.lang.String id) throws android.os.RemoteException;
/**
     * Gets an Array of currently known secure container IDs
     */
public java.lang.String[] getSecureContainerList() throws android.os.RemoteException;
/**
     * Shuts down the MountService and gracefully unmounts all external media.
     * Invokes call back once the shutdown is complete.
     */
public void shutdown(android.os.storage.IMountShutdownObserver observer) throws android.os.RemoteException;
/**
     * Call into MountService by PackageManager to notify that its done
     * processing the media status update request.
     */
public void finishMediaUpdate() throws android.os.RemoteException;
}
