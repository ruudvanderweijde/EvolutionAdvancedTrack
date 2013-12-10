/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IWallpaperService.aidl
 */
package android.app;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
/** @hide */
public interface IWallpaperService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IWallpaperService
{
private static final java.lang.String DESCRIPTOR = "android.app.IWallpaperService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IWallpaperService interface,
 * generating a proxy if needed.
 */
public static android.app.IWallpaperService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IWallpaperService))) {
return ((android.app.IWallpaperService)iin);
}
return new android.app.IWallpaperService.Stub.Proxy(obj);
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
case TRANSACTION_setWallpaper:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _result = this.setWallpaper();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getWallpaper:
{
data.enforceInterface(DESCRIPTOR);
android.app.IWallpaperServiceCallback _arg0;
_arg0 = android.app.IWallpaperServiceCallback.Stub.asInterface(data.readStrongBinder());
android.os.ParcelFileDescriptor _result = this.getWallpaper(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_clearWallpaper:
{
data.enforceInterface(DESCRIPTOR);
this.clearWallpaper();
reply.writeNoException();
return true;
}
case TRANSACTION_setDimensionHints:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setDimensionHints(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getWidthHint:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getWidthHint();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getHeightHint:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getHeightHint();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IWallpaperService
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
     * Set the wallpaper.
     */
public android.os.ParcelFileDescriptor setWallpaper() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_setWallpaper, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the wallpaper.
     */
public android.os.ParcelFileDescriptor getWallpaper(android.app.IWallpaperServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getWallpaper, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Clear the wallpaper.
     */
public void clearWallpaper() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearWallpaper, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Sets the dimension hint for the wallpaper. These hints indicate the desired
     * minimum width and height for the wallpaper.
     */
public void setDimensionHints(int width, int height) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(width);
_data.writeInt(height);
mRemote.transact(Stub.TRANSACTION_setDimensionHints, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns the desired minimum width for the wallpaper.
     */
public int getWidthHint() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getWidthHint, _data, _reply, 0);
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
     * Returns the desired minimum height for the wallpaper.
     */
public int getHeightHint() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getHeightHint, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setWallpaper = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getWallpaper = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_clearWallpaper = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setDimensionHints = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getWidthHint = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getHeightHint = (IBinder.FIRST_CALL_TRANSACTION + 5);
}
/**
     * Set the wallpaper.
     */
public android.os.ParcelFileDescriptor setWallpaper() throws android.os.RemoteException;
/**
     * Get the wallpaper.
     */
public android.os.ParcelFileDescriptor getWallpaper(android.app.IWallpaperServiceCallback cb) throws android.os.RemoteException;
/**
     * Clear the wallpaper.
     */
public void clearWallpaper() throws android.os.RemoteException;
/**
     * Sets the dimension hint for the wallpaper. These hints indicate the desired
     * minimum width and height for the wallpaper.
     */
public void setDimensionHints(int width, int height) throws android.os.RemoteException;
/**
     * Returns the desired minimum width for the wallpaper.
     */
public int getWidthHint() throws android.os.RemoteException;
/**
     * Returns the desired minimum height for the wallpaper.
     */
public int getHeightHint() throws android.os.RemoteException;
}
