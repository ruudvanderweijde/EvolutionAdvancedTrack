/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/backup/IBackupTransport.aidl
 */
package com.android.internal.backup;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.backup.RestoreSet;
import android.content.pm.PackageInfo;
import android.os.ParcelFileDescriptor;
/** {@hide} */
public interface IBackupTransport extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.backup.IBackupTransport
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.backup.IBackupTransport";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IBackupTransport interface,
 * generating a proxy if needed.
 */
public static com.android.internal.backup.IBackupTransport asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.backup.IBackupTransport))) {
return ((com.android.internal.backup.IBackupTransport)iin);
}
return new com.android.internal.backup.IBackupTransport.Stub.Proxy(obj);
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
case TRANSACTION_transportDirName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.transportDirName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_requestBackupTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.requestBackupTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_performBackup:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.PackageInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.PackageInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.ParcelFileDescriptor _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.performBackup(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_clearBackupData:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.PackageInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.PackageInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.clearBackupData(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_finishBackup:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.finishBackup();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
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
case TRANSACTION_startRestore:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
android.content.pm.PackageInfo[] _arg1;
_arg1 = data.createTypedArray(android.content.pm.PackageInfo.CREATOR);
boolean _result = this.startRestore(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_nextRestorePackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.nextRestorePackage();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRestoreData:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.getRestoreData(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_finishRestore:
{
data.enforceInterface(DESCRIPTOR);
this.finishRestore();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.backup.IBackupTransport
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
/* STOPSHIP - don't ship with this comment in place
    Things the transport interface has to do:
    1. set up the connection to the destination
        - set up encryption
        - for Google cloud, log in using the user's gaia credential or whatever
        - for adb, just set up the all-in-one destination file
    2. send each app's backup transaction
        - parse the data file for key/value pointers etc
        - send key/blobsize set to the Google cloud, get back quota ok/rejected response
        - sd/adb doesn't preflight; no per-app quota
        - app's entire change is essentially atomic
        - cloud transaction encrypts then sends each key/value pair separately; we already
          parsed the data when preflighting so we don't have to again here
        - sd target streams raw data into encryption envelope then to sd?
    3. shut down connection to destination
        - cloud: tear down connection etc
        - adb: close the file
*//**
     * Ask the transport where, on local device storage, to keep backup state blobs.
     * This is per-transport so that mock transports used for testing can coexist with
     * "live" backup services without interfering with the live bookkeeping.  The
     * returned string should be a name that is expected to be unambiguous among all
     * available backup transports; the name of the class implementing the transport
     * is a good choice.
     *
     * @return A unique name, suitable for use as a file or directory name, that the
     *         Backup Manager could use to disambiguate state files associated with
     *         different backup transports.
     */
public java.lang.String transportDirName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_transportDirName, _data, _reply, 0);
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
     * Verify that this is a suitable time for a backup pass.  This should return zero
     * if a backup is reasonable right now, some positive value otherwise.  This method
     * will be called outside of the {@link #startSession}/{@link #endSession} pair.
     *
     * <p>If this is not a suitable time for a backup, the transport should return a
     * backoff delay, in milliseconds, after which the Backup Manager should try again.
     *
     * @return Zero if this is a suitable time for a backup pass, or a positive time delay
     *   in milliseconds to suggest deferring the backup pass for a while.
     */
public long requestBackupTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestBackupTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Send one application's data to the backup destination.  The transport may send
     * the data immediately, or may buffer it.  After this is called, {@link #finishBackup}
     * must be called to ensure the data is sent and recorded successfully.
     *
     * @param packageInfo The identity of the application whose data is being backed up.
     *   This specifically includes the signature list for the package.
     * @param data The data stream that resulted from invoking the application's
     *   BackupService.doBackup() method.  This may be a pipe rather than a file on
     *   persistent media, so it may not be seekable.
     * @return false if errors occurred (the backup should be aborted and rescheduled),
     *   true if everything is OK so far (but {@link #finishBackup} must be called).
     */
public boolean performBackup(android.content.pm.PackageInfo packageInfo, android.os.ParcelFileDescriptor inFd) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((packageInfo!=null)) {
_data.writeInt(1);
packageInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((inFd!=null)) {
_data.writeInt(1);
inFd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_performBackup, _data, _reply, 0);
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
     * Erase the give application's data from the backup destination.  This clears
     * out the given package's data from the current backup set, making it as though
     * the app had never yet been backed up.  After this is called, {@link finishBackup}
     * must be called to ensure that the operation is recorded successfully.
     *
     * @return false if errors occurred (the backup should be aborted and rescheduled),
     *   true if everything is OK so far (but {@link #finishBackup} must be called).
     */
public boolean clearBackupData(android.content.pm.PackageInfo packageInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((packageInfo!=null)) {
_data.writeInt(1);
packageInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clearBackupData, _data, _reply, 0);
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
     * Finish sending application data to the backup destination.  This must be
     * called after {@link #performBackup} or {@link clearBackupData} to ensure that
     * all data is sent.  Only when this method returns true can a backup be assumed
     * to have succeeded.
     *
     * @return false if errors occurred (the backup should be aborted and rescheduled),
     *   true if everything is OK.
     */
public boolean finishBackup() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_finishBackup, _data, _reply, 0);
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
     * Get the set of backups currently available over this transport.
     *
     * @return Descriptions of the set of restore images available for this device,
     *   or null if an error occurred (the attempt should be rescheduled).
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
     * Start restoring application data from backup.  After calling this function,
     * alternate calls to {@link #nextRestorePackage} and {@link #nextRestoreData}
     * to walk through the actual application data.
     *
     * @param token A backup token as returned by {@link #getAvailableRestoreSets}.
     * @param packages List of applications to restore (if data is available).
     *   Application data will be restored in the order given.
     * @return false if errors occurred (the restore should be aborted and rescheduled),
     *   true if everything is OK so far (go ahead and call {@link #nextRestorePackage}).
     */
public boolean startRestore(long token, android.content.pm.PackageInfo[] packages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(token);
_data.writeTypedArray(packages, 0);
mRemote.transact(Stub.TRANSACTION_startRestore, _data, _reply, 0);
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
     * Get the package name of the next application with data in the backup store.
     * @return The name of one of the packages supplied to {@link #startRestore},
     *   or "" (the empty string) if no more backup data is available,
     *   or null if an error occurred (the restore should be aborted and rescheduled).
     */
public java.lang.String nextRestorePackage() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_nextRestorePackage, _data, _reply, 0);
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
     * Get the data for the application returned by {@link #nextRestorePackage}.
     * @param data An open, writable file into which the backup data should be stored.
     * @return false if errors occurred (the restore should be aborted and rescheduled),
     *   true if everything is OK so far (go ahead and call {@link #nextRestorePackage}).
     */
public boolean getRestoreData(android.os.ParcelFileDescriptor outFd) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((outFd!=null)) {
_data.writeInt(1);
outFd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getRestoreData, _data, _reply, 0);
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
     * End a restore session (aborting any in-process data transfer as necessary),
     * freeing any resources and connections used during the restore process.
     */
public void finishRestore() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_finishRestore, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_transportDirName = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_requestBackupTime = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_performBackup = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_clearBackupData = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_finishBackup = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getAvailableRestoreSets = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_startRestore = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_nextRestorePackage = (IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getRestoreData = (IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_finishRestore = (IBinder.FIRST_CALL_TRANSACTION + 9);
}
/* STOPSHIP - don't ship with this comment in place
    Things the transport interface has to do:
    1. set up the connection to the destination
        - set up encryption
        - for Google cloud, log in using the user's gaia credential or whatever
        - for adb, just set up the all-in-one destination file
    2. send each app's backup transaction
        - parse the data file for key/value pointers etc
        - send key/blobsize set to the Google cloud, get back quota ok/rejected response
        - sd/adb doesn't preflight; no per-app quota
        - app's entire change is essentially atomic
        - cloud transaction encrypts then sends each key/value pair separately; we already
          parsed the data when preflighting so we don't have to again here
        - sd target streams raw data into encryption envelope then to sd?
    3. shut down connection to destination
        - cloud: tear down connection etc
        - adb: close the file
*//**
     * Ask the transport where, on local device storage, to keep backup state blobs.
     * This is per-transport so that mock transports used for testing can coexist with
     * "live" backup services without interfering with the live bookkeeping.  The
     * returned string should be a name that is expected to be unambiguous among all
     * available backup transports; the name of the class implementing the transport
     * is a good choice.
     *
     * @return A unique name, suitable for use as a file or directory name, that the
     *         Backup Manager could use to disambiguate state files associated with
     *         different backup transports.
     */
public java.lang.String transportDirName() throws android.os.RemoteException;
/**
     * Verify that this is a suitable time for a backup pass.  This should return zero
     * if a backup is reasonable right now, some positive value otherwise.  This method
     * will be called outside of the {@link #startSession}/{@link #endSession} pair.
     *
     * <p>If this is not a suitable time for a backup, the transport should return a
     * backoff delay, in milliseconds, after which the Backup Manager should try again.
     *
     * @return Zero if this is a suitable time for a backup pass, or a positive time delay
     *   in milliseconds to suggest deferring the backup pass for a while.
     */
public long requestBackupTime() throws android.os.RemoteException;
/**
     * Send one application's data to the backup destination.  The transport may send
     * the data immediately, or may buffer it.  After this is called, {@link #finishBackup}
     * must be called to ensure the data is sent and recorded successfully.
     *
     * @param packageInfo The identity of the application whose data is being backed up.
     *   This specifically includes the signature list for the package.
     * @param data The data stream that resulted from invoking the application's
     *   BackupService.doBackup() method.  This may be a pipe rather than a file on
     *   persistent media, so it may not be seekable.
     * @return false if errors occurred (the backup should be aborted and rescheduled),
     *   true if everything is OK so far (but {@link #finishBackup} must be called).
     */
public boolean performBackup(android.content.pm.PackageInfo packageInfo, android.os.ParcelFileDescriptor inFd) throws android.os.RemoteException;
/**
     * Erase the give application's data from the backup destination.  This clears
     * out the given package's data from the current backup set, making it as though
     * the app had never yet been backed up.  After this is called, {@link finishBackup}
     * must be called to ensure that the operation is recorded successfully.
     *
     * @return false if errors occurred (the backup should be aborted and rescheduled),
     *   true if everything is OK so far (but {@link #finishBackup} must be called).
     */
public boolean clearBackupData(android.content.pm.PackageInfo packageInfo) throws android.os.RemoteException;
/**
     * Finish sending application data to the backup destination.  This must be
     * called after {@link #performBackup} or {@link clearBackupData} to ensure that
     * all data is sent.  Only when this method returns true can a backup be assumed
     * to have succeeded.
     *
     * @return false if errors occurred (the backup should be aborted and rescheduled),
     *   true if everything is OK.
     */
public boolean finishBackup() throws android.os.RemoteException;
/**
     * Get the set of backups currently available over this transport.
     *
     * @return Descriptions of the set of restore images available for this device,
     *   or null if an error occurred (the attempt should be rescheduled).
     */
public android.backup.RestoreSet[] getAvailableRestoreSets() throws android.os.RemoteException;
/**
     * Start restoring application data from backup.  After calling this function,
     * alternate calls to {@link #nextRestorePackage} and {@link #nextRestoreData}
     * to walk through the actual application data.
     *
     * @param token A backup token as returned by {@link #getAvailableRestoreSets}.
     * @param packages List of applications to restore (if data is available).
     *   Application data will be restored in the order given.
     * @return false if errors occurred (the restore should be aborted and rescheduled),
     *   true if everything is OK so far (go ahead and call {@link #nextRestorePackage}).
     */
public boolean startRestore(long token, android.content.pm.PackageInfo[] packages) throws android.os.RemoteException;
/**
     * Get the package name of the next application with data in the backup store.
     * @return The name of one of the packages supplied to {@link #startRestore},
     *   or "" (the empty string) if no more backup data is available,
     *   or null if an error occurred (the restore should be aborted and rescheduled).
     */
public java.lang.String nextRestorePackage() throws android.os.RemoteException;
/**
     * Get the data for the application returned by {@link #nextRestorePackage}.
     * @param data An open, writable file into which the backup data should be stored.
     * @return false if errors occurred (the restore should be aborted and rescheduled),
     *   true if everything is OK so far (go ahead and call {@link #nextRestorePackage}).
     */
public boolean getRestoreData(android.os.ParcelFileDescriptor outFd) throws android.os.RemoteException;
/**
     * End a restore session (aborting any in-process data transfer as necessary),
     * freeing any resources and connections used during the restore process.
     */
public void finishRestore() throws android.os.RemoteException;
}
