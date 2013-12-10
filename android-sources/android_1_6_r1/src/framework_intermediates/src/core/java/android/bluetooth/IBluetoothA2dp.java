/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothA2dp.aidl
 */
package android.bluetooth;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import java.util.List;
/**
 * System private API for Bluetooth A2DP service
 *
 * {@hide}
 */
public interface IBluetoothA2dp extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothA2dp
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothA2dp";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IBluetoothA2dp interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothA2dp asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothA2dp))) {
return ((android.bluetooth.IBluetoothA2dp)iin);
}
return new android.bluetooth.IBluetoothA2dp.Stub.Proxy(obj);
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
case TRANSACTION_connectSink:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.connectSink(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_disconnectSink:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.disconnectSink(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_listConnectedSinks:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.listConnectedSinks();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_getSinkState:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getSinkState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setSinkPriority:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.setSinkPriority(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSinkPriority:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getSinkPriority(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothA2dp
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
public int connectSink(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_connectSink, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int disconnectSink(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_disconnectSink, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<java.lang.String> listConnectedSinks() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listConnectedSinks, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getSinkState(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getSinkState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int setSinkPriority(java.lang.String address, int priority) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(priority);
mRemote.transact(Stub.TRANSACTION_setSinkPriority, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getSinkPriority(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getSinkPriority, _data, _reply, 0);
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
static final int TRANSACTION_connectSink = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disconnectSink = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_listConnectedSinks = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getSinkState = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setSinkPriority = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getSinkPriority = (IBinder.FIRST_CALL_TRANSACTION + 5);
}
public int connectSink(java.lang.String address) throws android.os.RemoteException;
public int disconnectSink(java.lang.String address) throws android.os.RemoteException;
public java.util.List<java.lang.String> listConnectedSinks() throws android.os.RemoteException;
public int getSinkState(java.lang.String address) throws android.os.RemoteException;
public int setSinkPriority(java.lang.String address, int priority) throws android.os.RemoteException;
public int getSinkPriority(java.lang.String address) throws android.os.RemoteException;
}
