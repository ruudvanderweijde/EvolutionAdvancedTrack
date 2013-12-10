/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/net/IConnectivityManager.aidl
 */
package android.net;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
/**
 * Interface that answers queries about, and allows changing, the
 * state of network connectivity.
 *//** {@hide} */
public interface IConnectivityManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.IConnectivityManager
{
private static final java.lang.String DESCRIPTOR = "android.net.IConnectivityManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IConnectivityManager interface,
 * generating a proxy if needed.
 */
public static android.net.IConnectivityManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.IConnectivityManager))) {
return ((android.net.IConnectivityManager)iin);
}
return new android.net.IConnectivityManager.Stub.Proxy(obj);
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
case TRANSACTION_setNetworkPreference:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setNetworkPreference(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getNetworkPreference:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getNetworkPreference();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActiveNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkInfo _result = this.getActiveNetworkInfo();
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
case TRANSACTION_getNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.NetworkInfo _result = this.getNetworkInfo(_arg0);
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
case TRANSACTION_getAllNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkInfo[] _result = this.getAllNetworkInfo();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_setRadios:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setRadios(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setRadio:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.setRadio(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startUsingNetworkFeature:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.startUsingNetworkFeature(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_stopUsingNetworkFeature:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.stopUsingNetworkFeature(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_requestRouteToHost:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.requestRouteToHost(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBackgroundDataSetting:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getBackgroundDataSetting();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setBackgroundDataSetting:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setBackgroundDataSetting(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.IConnectivityManager
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
public void setNetworkPreference(int pref) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(pref);
mRemote.transact(Stub.TRANSACTION_setNetworkPreference, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getNetworkPreference() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNetworkPreference, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveNetworkInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkInfo.CREATOR.createFromParcel(_reply);
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
public android.net.NetworkInfo getNetworkInfo(int networkType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
mRemote.transact(Stub.TRANSACTION_getNetworkInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkInfo.CREATOR.createFromParcel(_reply);
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
public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllNetworkInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.net.NetworkInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setRadios(boolean onOff) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((onOff)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRadios, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setRadio(int networkType, boolean turnOn) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeInt(((turnOn)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRadio, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int startUsingNetworkFeature(int networkType, java.lang.String feature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeString(feature);
mRemote.transact(Stub.TRANSACTION_startUsingNetworkFeature, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int stopUsingNetworkFeature(int networkType, java.lang.String feature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeString(feature);
mRemote.transact(Stub.TRANSACTION_stopUsingNetworkFeature, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean requestRouteToHost(int networkType, int hostAddress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeInt(hostAddress);
mRemote.transact(Stub.TRANSACTION_requestRouteToHost, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean getBackgroundDataSetting() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBackgroundDataSetting, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setBackgroundDataSetting(boolean allowBackgroundData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((allowBackgroundData)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setBackgroundDataSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setNetworkPreference = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getNetworkPreference = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getActiveNetworkInfo = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getNetworkInfo = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getAllNetworkInfo = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setRadios = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setRadio = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_startUsingNetworkFeature = (IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_stopUsingNetworkFeature = (IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_requestRouteToHost = (IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getBackgroundDataSetting = (IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setBackgroundDataSetting = (IBinder.FIRST_CALL_TRANSACTION + 11);
}
public void setNetworkPreference(int pref) throws android.os.RemoteException;
public int getNetworkPreference() throws android.os.RemoteException;
public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException;
public android.net.NetworkInfo getNetworkInfo(int networkType) throws android.os.RemoteException;
public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException;
public boolean setRadios(boolean onOff) throws android.os.RemoteException;
public boolean setRadio(int networkType, boolean turnOn) throws android.os.RemoteException;
public int startUsingNetworkFeature(int networkType, java.lang.String feature) throws android.os.RemoteException;
public int stopUsingNetworkFeature(int networkType, java.lang.String feature) throws android.os.RemoteException;
public boolean requestRouteToHost(int networkType, int hostAddress) throws android.os.RemoteException;
public boolean getBackgroundDataSetting() throws android.os.RemoteException;
public void setBackgroundDataSetting(boolean allowBackgroundData) throws android.os.RemoteException;
}
