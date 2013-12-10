/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IStatusBar.aidl
 */
package android.app;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
/** @hide */
public interface IStatusBar extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IStatusBar
{
private static final java.lang.String DESCRIPTOR = "android.app.IStatusBar";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IStatusBar interface,
 * generating a proxy if needed.
 */
public static android.app.IStatusBar asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IStatusBar))) {
return ((android.app.IStatusBar)iin);
}
return new android.app.IStatusBar.Stub.Proxy(obj);
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
case TRANSACTION_activate:
{
data.enforceInterface(DESCRIPTOR);
this.activate();
reply.writeNoException();
return true;
}
case TRANSACTION_deactivate:
{
data.enforceInterface(DESCRIPTOR);
this.deactivate();
reply.writeNoException();
return true;
}
case TRANSACTION_toggle:
{
data.enforceInterface(DESCRIPTOR);
this.toggle();
reply.writeNoException();
return true;
}
case TRANSACTION_disable:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String _arg2;
_arg2 = data.readString();
this.disable(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_addIcon:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.os.IBinder _result = this.addIcon(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_updateIcon:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.updateIcon(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_removeIcon:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.removeIcon(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IStatusBar
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
public void activate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_activate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void deactivate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_deactivate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void toggle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_toggle, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void disable(int what, android.os.IBinder token, java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(what);
_data.writeStrongBinder(token);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_disable, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public android.os.IBinder addIcon(java.lang.String slot, java.lang.String iconPackage, int iconId, int iconLevel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(slot);
_data.writeString(iconPackage);
_data.writeInt(iconId);
_data.writeInt(iconLevel);
mRemote.transact(Stub.TRANSACTION_addIcon, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void updateIcon(android.os.IBinder key, java.lang.String slot, java.lang.String iconPackage, int iconId, int iconLevel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(key);
_data.writeString(slot);
_data.writeString(iconPackage);
_data.writeInt(iconId);
_data.writeInt(iconLevel);
mRemote.transact(Stub.TRANSACTION_updateIcon, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void removeIcon(android.os.IBinder key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(key);
mRemote.transact(Stub.TRANSACTION_removeIcon, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_activate = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_deactivate = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_toggle = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_disable = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_addIcon = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_updateIcon = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_removeIcon = (IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void activate() throws android.os.RemoteException;
public void deactivate() throws android.os.RemoteException;
public void toggle() throws android.os.RemoteException;
public void disable(int what, android.os.IBinder token, java.lang.String pkg) throws android.os.RemoteException;
public android.os.IBinder addIcon(java.lang.String slot, java.lang.String iconPackage, int iconId, int iconLevel) throws android.os.RemoteException;
public void updateIcon(android.os.IBinder key, java.lang.String slot, java.lang.String iconPackage, int iconId, int iconLevel) throws android.os.RemoteException;
public void removeIcon(android.os.IBinder key) throws android.os.RemoteException;
}
