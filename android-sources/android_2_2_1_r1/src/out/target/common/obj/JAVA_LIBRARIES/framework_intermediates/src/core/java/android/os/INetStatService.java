/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/INetStatService.aidl
 */
package android.os;
/**
 * Retrieves packet and byte counts for the phone data interface,
 * and for all interfaces.
 * Used for the data activity icon and the phone status in Settings.
 *
 * {@hide}
 */
public interface INetStatService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.INetStatService
{
private static final java.lang.String DESCRIPTOR = "android.os.INetStatService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.INetStatService interface,
 * generating a proxy if needed.
 */
public static android.os.INetStatService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.INetStatService))) {
return ((android.os.INetStatService)iin);
}
return new android.os.INetStatService.Stub.Proxy(obj);
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
case TRANSACTION_getMobileTxPackets:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getMobileTxPackets();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getMobileRxPackets:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getMobileRxPackets();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getMobileTxBytes:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getMobileTxBytes();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getMobileRxBytes:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getMobileRxBytes();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getTotalTxPackets:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getTotalTxPackets();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getTotalRxPackets:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getTotalRxPackets();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getTotalTxBytes:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getTotalTxBytes();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getTotalRxBytes:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getTotalRxBytes();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.INetStatService
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
public long getMobileTxPackets() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMobileTxPackets, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long getMobileRxPackets() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMobileRxPackets, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long getMobileTxBytes() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMobileTxBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long getMobileRxBytes() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMobileRxBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long getTotalTxPackets() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTotalTxPackets, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long getTotalRxPackets() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTotalRxPackets, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long getTotalTxBytes() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTotalTxBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long getTotalRxBytes() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTotalRxBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getMobileTxPackets = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getMobileRxPackets = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getMobileTxBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getMobileRxBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getTotalTxPackets = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getTotalRxPackets = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getTotalTxBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getTotalRxBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public long getMobileTxPackets() throws android.os.RemoteException;
public long getMobileRxPackets() throws android.os.RemoteException;
public long getMobileTxBytes() throws android.os.RemoteException;
public long getMobileRxBytes() throws android.os.RemoteException;
public long getTotalTxPackets() throws android.os.RemoteException;
public long getTotalRxPackets() throws android.os.RemoteException;
public long getTotalTxBytes() throws android.os.RemoteException;
public long getTotalRxBytes() throws android.os.RemoteException;
}
