/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothDevice.aidl
 */
package android.bluetooth;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
/**
 * System private API for talking with the Bluetooth service.
 *
 * {@hide}
 */
public interface IBluetoothDevice extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothDevice
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothDevice";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IBluetoothDevice interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothDevice asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothDevice))) {
return ((android.bluetooth.IBluetoothDevice)iin);
}
return new android.bluetooth.IBluetoothDevice.Stub.Proxy(obj);
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
case TRANSACTION_isEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBluetoothState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getBluetoothState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_enable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.enable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disable:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.disable(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getAddress();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setName(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getVersion:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getVersion();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRevision:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getRevision();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getManufacturer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getManufacturer();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCompany:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getCompany();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getScanMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getScanMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setScanMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setScanMode(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDiscoverableTimeout:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDiscoverableTimeout();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDiscoverableTimeout:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setDiscoverableTimeout(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startDiscovery:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.startDiscovery(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_cancelDiscovery:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.cancelDiscovery();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDiscovering:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDiscovering();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startPeriodicDiscovery:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.startPeriodicDiscovery();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopPeriodicDiscovery:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopPeriodicDiscovery();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isPeriodicDiscovery:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isPeriodicDiscovery();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_listRemoteDevices:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.listRemoteDevices();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_listAclConnections:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.listAclConnections();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_isAclConnected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isAclConnected(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disconnectRemoteDeviceAcl:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.disconnectRemoteDeviceAcl(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_createBond:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.createBond(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_cancelBondProcess:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.cancelBondProcess(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeBond:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.removeBond(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_listBonds:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.listBonds();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getBondState:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getBondState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getRemoteName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getRemoteName(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRemoteVersion:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getRemoteVersion(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRemoteRevision:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getRemoteRevision(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRemoteClass:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getRemoteClass(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getRemoteManufacturer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getRemoteManufacturer(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRemoteCompany:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getRemoteCompany(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRemoteServiceChannel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.bluetooth.IBluetoothDeviceCallback _arg2;
_arg2 = android.bluetooth.IBluetoothDeviceCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.getRemoteServiceChannel(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getRemoteFeatures:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _result = this.getRemoteFeatures(_arg0);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_lastSeen:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.lastSeen(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_lastUsed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.lastUsed(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setPin:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _result = this.setPin(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_cancelPin:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.cancelPin(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothDevice
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
public boolean isEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getBluetoothState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBluetoothState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean enable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean disable(boolean persistSetting) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((persistSetting)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_disable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getAddress() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAddress, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setName(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_setName, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getVersion() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVersion, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getRevision() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRevision, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getManufacturer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getManufacturer, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getCompany() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCompany, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getScanMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getScanMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setScanMode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setScanMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getDiscoverableTimeout() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDiscoverableTimeout, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setDiscoverableTimeout(int timeout) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(timeout);
mRemote.transact(Stub.TRANSACTION_setDiscoverableTimeout, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean startDiscovery(boolean resolveNames) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((resolveNames)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_startDiscovery, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean cancelDiscovery() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelDiscovery, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean isDiscovering() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDiscovering, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean startPeriodicDiscovery() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startPeriodicDiscovery, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean stopPeriodicDiscovery() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopPeriodicDiscovery, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean isPeriodicDiscovery() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isPeriodicDiscovery, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] listRemoteDevices() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listRemoteDevices, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] listAclConnections() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listAclConnections, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean isAclConnected(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_isAclConnected, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean disconnectRemoteDeviceAcl(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_disconnectRemoteDeviceAcl, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean createBond(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_createBond, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean cancelBondProcess(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_cancelBondProcess, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean removeBond(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_removeBond, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] listBonds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listBonds, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getBondState(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getBondState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getRemoteName(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getRemoteName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getRemoteVersion(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getRemoteVersion, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getRemoteRevision(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getRemoteRevision, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getRemoteClass(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getRemoteClass, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getRemoteManufacturer(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getRemoteManufacturer, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getRemoteCompany(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getRemoteCompany, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean getRemoteServiceChannel(java.lang.String address, int uuid16, android.bluetooth.IBluetoothDeviceCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(uuid16);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getRemoteServiceChannel, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public byte[] getRemoteFeatures(java.lang.String adddress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(adddress);
mRemote.transact(Stub.TRANSACTION_getRemoteFeatures, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String lastSeen(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_lastSeen, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String lastUsed(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_lastUsed, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setPin(java.lang.String address, byte[] pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeByteArray(pin);
mRemote.transact(Stub.TRANSACTION_setPin, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean cancelPin(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_cancelPin, _data, _reply, 0);
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
static final int TRANSACTION_isEnabled = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getBluetoothState = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_enable = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_disable = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getAddress = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getName = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setName = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getVersion = (IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getRevision = (IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getManufacturer = (IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getCompany = (IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getScanMode = (IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setScanMode = (IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getDiscoverableTimeout = (IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setDiscoverableTimeout = (IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_startDiscovery = (IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_cancelDiscovery = (IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_isDiscovering = (IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_startPeriodicDiscovery = (IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_stopPeriodicDiscovery = (IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_isPeriodicDiscovery = (IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_listRemoteDevices = (IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_listAclConnections = (IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_isAclConnected = (IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_disconnectRemoteDeviceAcl = (IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_createBond = (IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_cancelBondProcess = (IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_removeBond = (IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_listBonds = (IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getBondState = (IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getRemoteName = (IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getRemoteVersion = (IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getRemoteRevision = (IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_getRemoteClass = (IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_getRemoteManufacturer = (IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_getRemoteCompany = (IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_getRemoteServiceChannel = (IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_getRemoteFeatures = (IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_lastSeen = (IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_lastUsed = (IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_setPin = (IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_cancelPin = (IBinder.FIRST_CALL_TRANSACTION + 41);
}
public boolean isEnabled() throws android.os.RemoteException;
public int getBluetoothState() throws android.os.RemoteException;
public boolean enable() throws android.os.RemoteException;
public boolean disable(boolean persistSetting) throws android.os.RemoteException;
public java.lang.String getAddress() throws android.os.RemoteException;
public java.lang.String getName() throws android.os.RemoteException;
public boolean setName(java.lang.String name) throws android.os.RemoteException;
public java.lang.String getVersion() throws android.os.RemoteException;
public java.lang.String getRevision() throws android.os.RemoteException;
public java.lang.String getManufacturer() throws android.os.RemoteException;
public java.lang.String getCompany() throws android.os.RemoteException;
public int getScanMode() throws android.os.RemoteException;
public boolean setScanMode(int mode) throws android.os.RemoteException;
public int getDiscoverableTimeout() throws android.os.RemoteException;
public boolean setDiscoverableTimeout(int timeout) throws android.os.RemoteException;
public boolean startDiscovery(boolean resolveNames) throws android.os.RemoteException;
public boolean cancelDiscovery() throws android.os.RemoteException;
public boolean isDiscovering() throws android.os.RemoteException;
public boolean startPeriodicDiscovery() throws android.os.RemoteException;
public boolean stopPeriodicDiscovery() throws android.os.RemoteException;
public boolean isPeriodicDiscovery() throws android.os.RemoteException;
public java.lang.String[] listRemoteDevices() throws android.os.RemoteException;
public java.lang.String[] listAclConnections() throws android.os.RemoteException;
public boolean isAclConnected(java.lang.String address) throws android.os.RemoteException;
public boolean disconnectRemoteDeviceAcl(java.lang.String address) throws android.os.RemoteException;
public boolean createBond(java.lang.String address) throws android.os.RemoteException;
public boolean cancelBondProcess(java.lang.String address) throws android.os.RemoteException;
public boolean removeBond(java.lang.String address) throws android.os.RemoteException;
public java.lang.String[] listBonds() throws android.os.RemoteException;
public int getBondState(java.lang.String address) throws android.os.RemoteException;
public java.lang.String getRemoteName(java.lang.String address) throws android.os.RemoteException;
public java.lang.String getRemoteVersion(java.lang.String address) throws android.os.RemoteException;
public java.lang.String getRemoteRevision(java.lang.String address) throws android.os.RemoteException;
public int getRemoteClass(java.lang.String address) throws android.os.RemoteException;
public java.lang.String getRemoteManufacturer(java.lang.String address) throws android.os.RemoteException;
public java.lang.String getRemoteCompany(java.lang.String address) throws android.os.RemoteException;
public boolean getRemoteServiceChannel(java.lang.String address, int uuid16, android.bluetooth.IBluetoothDeviceCallback callback) throws android.os.RemoteException;
public byte[] getRemoteFeatures(java.lang.String adddress) throws android.os.RemoteException;
public java.lang.String lastSeen(java.lang.String address) throws android.os.RemoteException;
public java.lang.String lastUsed(java.lang.String address) throws android.os.RemoteException;
public boolean setPin(java.lang.String address, byte[] pin) throws android.os.RemoteException;
public boolean cancelPin(java.lang.String address) throws android.os.RemoteException;
}
