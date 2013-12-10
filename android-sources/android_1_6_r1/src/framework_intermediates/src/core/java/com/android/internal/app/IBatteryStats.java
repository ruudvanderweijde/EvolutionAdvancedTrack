/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/app/IBatteryStats.aidl
 */
package com.android.internal.app;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.telephony.SignalStrength;
public interface IBatteryStats extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IBatteryStats
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IBatteryStats";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IBatteryStats interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IBatteryStats asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IBatteryStats))) {
return ((com.android.internal.app.IBatteryStats)iin);
}
return new com.android.internal.app.IBatteryStats.Stub.Proxy(obj);
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
case TRANSACTION_getStatistics:
{
data.enforceInterface(DESCRIPTOR);
byte[] _result = this.getStatistics();
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_noteStartWakelock:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.noteStartWakelock(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStopWakelock:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.noteStopWakelock(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStartSensor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.noteStartSensor(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStopSensor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.noteStopSensor(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStartGps:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteStartGps(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStopGps:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteStopGps(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteScreenOn:
{
data.enforceInterface(DESCRIPTOR);
this.noteScreenOn();
reply.writeNoException();
return true;
}
case TRANSACTION_noteScreenBrightness:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteScreenBrightness(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteScreenOff:
{
data.enforceInterface(DESCRIPTOR);
this.noteScreenOff();
reply.writeNoException();
return true;
}
case TRANSACTION_noteInputEvent:
{
data.enforceInterface(DESCRIPTOR);
this.noteInputEvent();
reply.writeNoException();
return true;
}
case TRANSACTION_noteUserActivity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.noteUserActivity(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notePhoneOn:
{
data.enforceInterface(DESCRIPTOR);
this.notePhoneOn();
reply.writeNoException();
return true;
}
case TRANSACTION_notePhoneOff:
{
data.enforceInterface(DESCRIPTOR);
this.notePhoneOff();
reply.writeNoException();
return true;
}
case TRANSACTION_notePhoneSignalStrength:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.SignalStrength _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.SignalStrength.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.notePhoneSignalStrength(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notePhoneDataConnectionState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.notePhoneDataConnectionState(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteAirplaneMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.noteAirplaneMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiOn:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteWifiOn(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiOff:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteWifiOff(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiRunning:
{
data.enforceInterface(DESCRIPTOR);
this.noteWifiRunning();
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiStopped:
{
data.enforceInterface(DESCRIPTOR);
this.noteWifiStopped();
reply.writeNoException();
return true;
}
case TRANSACTION_noteBluetoothOn:
{
data.enforceInterface(DESCRIPTOR);
this.noteBluetoothOn();
reply.writeNoException();
return true;
}
case TRANSACTION_noteBluetoothOff:
{
data.enforceInterface(DESCRIPTOR);
this.noteBluetoothOff();
reply.writeNoException();
return true;
}
case TRANSACTION_noteFullWifiLockAcquired:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteFullWifiLockAcquired(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteFullWifiLockReleased:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteFullWifiLockReleased(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteScanWifiLockAcquired:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteScanWifiLockAcquired(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteScanWifiLockReleased:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteScanWifiLockReleased(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiMulticastEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteWifiMulticastEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiMulticastDisabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteWifiMulticastDisabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setOnBattery:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
this.setOnBattery(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_recordCurrentLevel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.recordCurrentLevel(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getAwakeTimeBattery:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getAwakeTimeBattery();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getAwakeTimePlugged:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getAwakeTimePlugged();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IBatteryStats
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
public byte[] getStatistics() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatistics, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void noteStartWakelock(int uid, java.lang.String name, int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(name);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_noteStartWakelock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteStopWakelock(int uid, java.lang.String name, int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(name);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_noteStopWakelock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteStartSensor(int uid, int sensor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(sensor);
mRemote.transact(Stub.TRANSACTION_noteStartSensor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteStopSensor(int uid, int sensor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(sensor);
mRemote.transact(Stub.TRANSACTION_noteStopSensor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteStartGps(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteStartGps, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteStopGps(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteStopGps, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteScreenOn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteScreenOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteScreenBrightness(int brightness) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(brightness);
mRemote.transact(Stub.TRANSACTION_noteScreenBrightness, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteScreenOff() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteScreenOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteInputEvent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteInputEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteUserActivity(int uid, int event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(event);
mRemote.transact(Stub.TRANSACTION_noteUserActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void notePhoneOn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_notePhoneOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void notePhoneOff() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_notePhoneOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void notePhoneSignalStrength(android.telephony.SignalStrength signalStrength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((signalStrength!=null)) {
_data.writeInt(1);
signalStrength.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notePhoneSignalStrength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void notePhoneDataConnectionState(int dataType, boolean hasData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(dataType);
_data.writeInt(((hasData)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notePhoneDataConnectionState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteAirplaneMode(boolean isAirplaneMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isAirplaneMode)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_noteAirplaneMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteWifiOn(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteWifiOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteWifiOff(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteWifiOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteWifiRunning() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteWifiRunning, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteWifiStopped() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteWifiStopped, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteBluetoothOn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteBluetoothOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteBluetoothOff() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteBluetoothOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteFullWifiLockAcquired(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteFullWifiLockAcquired, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteFullWifiLockReleased(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteFullWifiLockReleased, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteScanWifiLockAcquired(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteScanWifiLockAcquired, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteScanWifiLockReleased(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteScanWifiLockReleased, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteWifiMulticastEnabled(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteWifiMulticastEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void noteWifiMulticastDisabled(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteWifiMulticastDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setOnBattery(boolean onBattery, int level) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((onBattery)?(1):(0)));
_data.writeInt(level);
mRemote.transact(Stub.TRANSACTION_setOnBattery, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void recordCurrentLevel(int level) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(level);
mRemote.transact(Stub.TRANSACTION_recordCurrentLevel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public long getAwakeTimeBattery() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAwakeTimeBattery, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long getAwakeTimePlugged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAwakeTimePlugged, _data, _reply, 0);
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
static final int TRANSACTION_getStatistics = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_noteStartWakelock = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_noteStopWakelock = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_noteStartSensor = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_noteStopSensor = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_noteStartGps = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_noteStopGps = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_noteScreenOn = (IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_noteScreenBrightness = (IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_noteScreenOff = (IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_noteInputEvent = (IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_noteUserActivity = (IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_notePhoneOn = (IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_notePhoneOff = (IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_notePhoneSignalStrength = (IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_notePhoneDataConnectionState = (IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_noteAirplaneMode = (IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_noteWifiOn = (IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_noteWifiOff = (IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_noteWifiRunning = (IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_noteWifiStopped = (IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_noteBluetoothOn = (IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_noteBluetoothOff = (IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_noteFullWifiLockAcquired = (IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_noteFullWifiLockReleased = (IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_noteScanWifiLockAcquired = (IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_noteScanWifiLockReleased = (IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_noteWifiMulticastEnabled = (IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_noteWifiMulticastDisabled = (IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_setOnBattery = (IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_recordCurrentLevel = (IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getAwakeTimeBattery = (IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getAwakeTimePlugged = (IBinder.FIRST_CALL_TRANSACTION + 32);
}
public byte[] getStatistics() throws android.os.RemoteException;
public void noteStartWakelock(int uid, java.lang.String name, int type) throws android.os.RemoteException;
public void noteStopWakelock(int uid, java.lang.String name, int type) throws android.os.RemoteException;
public void noteStartSensor(int uid, int sensor) throws android.os.RemoteException;
public void noteStopSensor(int uid, int sensor) throws android.os.RemoteException;
public void noteStartGps(int uid) throws android.os.RemoteException;
public void noteStopGps(int uid) throws android.os.RemoteException;
public void noteScreenOn() throws android.os.RemoteException;
public void noteScreenBrightness(int brightness) throws android.os.RemoteException;
public void noteScreenOff() throws android.os.RemoteException;
public void noteInputEvent() throws android.os.RemoteException;
public void noteUserActivity(int uid, int event) throws android.os.RemoteException;
public void notePhoneOn() throws android.os.RemoteException;
public void notePhoneOff() throws android.os.RemoteException;
public void notePhoneSignalStrength(android.telephony.SignalStrength signalStrength) throws android.os.RemoteException;
public void notePhoneDataConnectionState(int dataType, boolean hasData) throws android.os.RemoteException;
public void noteAirplaneMode(boolean isAirplaneMode) throws android.os.RemoteException;
public void noteWifiOn(int uid) throws android.os.RemoteException;
public void noteWifiOff(int uid) throws android.os.RemoteException;
public void noteWifiRunning() throws android.os.RemoteException;
public void noteWifiStopped() throws android.os.RemoteException;
public void noteBluetoothOn() throws android.os.RemoteException;
public void noteBluetoothOff() throws android.os.RemoteException;
public void noteFullWifiLockAcquired(int uid) throws android.os.RemoteException;
public void noteFullWifiLockReleased(int uid) throws android.os.RemoteException;
public void noteScanWifiLockAcquired(int uid) throws android.os.RemoteException;
public void noteScanWifiLockReleased(int uid) throws android.os.RemoteException;
public void noteWifiMulticastEnabled(int uid) throws android.os.RemoteException;
public void noteWifiMulticastDisabled(int uid) throws android.os.RemoteException;
public void setOnBattery(boolean onBattery, int level) throws android.os.RemoteException;
public void recordCurrentLevel(int level) throws android.os.RemoteException;
public long getAwakeTimeBattery() throws android.os.RemoteException;
public long getAwakeTimePlugged() throws android.os.RemoteException;
}
