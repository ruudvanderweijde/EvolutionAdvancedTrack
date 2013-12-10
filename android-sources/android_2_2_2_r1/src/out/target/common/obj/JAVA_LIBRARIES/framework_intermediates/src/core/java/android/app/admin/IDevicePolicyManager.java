/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/admin/IDevicePolicyManager.aidl
 */
package android.app.admin;
/**
 * Internal IPC interface to the device policy service.
 * {@hide}
 */
public interface IDevicePolicyManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.admin.IDevicePolicyManager
{
private static final java.lang.String DESCRIPTOR = "android.app.admin.IDevicePolicyManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.admin.IDevicePolicyManager interface,
 * generating a proxy if needed.
 */
public static android.app.admin.IDevicePolicyManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.admin.IDevicePolicyManager))) {
return ((android.app.admin.IDevicePolicyManager)iin);
}
return new android.app.admin.IDevicePolicyManager.Stub.Proxy(obj);
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
case TRANSACTION_setPasswordQuality:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.setPasswordQuality(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordQuality:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getPasswordQuality(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.setPasswordMinimumLength(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getPasswordMinimumLength(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isActivePasswordSufficient:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isActivePasswordSufficient();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCurrentFailedPasswordAttempts:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getCurrentFailedPasswordAttempts();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setMaximumFailedPasswordsForWipe:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.setMaximumFailedPasswordsForWipe(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getMaximumFailedPasswordsForWipe:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getMaximumFailedPasswordsForWipe(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_resetPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.resetPassword(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setMaximumTimeToLock:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
this.setMaximumTimeToLock(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getMaximumTimeToLock:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _result = this.getMaximumTimeToLock(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_lockNow:
{
data.enforceInterface(DESCRIPTOR);
this.lockNow();
reply.writeNoException();
return true;
}
case TRANSACTION_wipeData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.wipeData(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setActiveAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setActiveAdmin(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isAdminActive:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isAdminActive(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveAdmins:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.content.ComponentName> _result = this.getActiveAdmins();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_packageHasActiveAdmins:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.packageHasActiveAdmins(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getRemoveWarning:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.RemoteCallback _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.RemoteCallback.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.getRemoveWarning(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeActiveAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.removeActiveAdmin(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setActivePasswordState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setActivePasswordState(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reportFailedPasswordAttempt:
{
data.enforceInterface(DESCRIPTOR);
this.reportFailedPasswordAttempt();
reply.writeNoException();
return true;
}
case TRANSACTION_reportSuccessfulPasswordAttempt:
{
data.enforceInterface(DESCRIPTOR);
this.reportSuccessfulPasswordAttempt();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.admin.IDevicePolicyManager
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
public void setPasswordQuality(android.content.ComponentName who, int quality) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(quality);
mRemote.transact(Stub.TRANSACTION_setPasswordQuality, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getPasswordQuality(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPasswordQuality, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setPasswordMinimumLength(android.content.ComponentName who, int length) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumLength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getPasswordMinimumLength(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumLength, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean isActivePasswordSufficient() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isActivePasswordSufficient, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getCurrentFailedPasswordAttempts() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentFailedPasswordAttempts, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int num) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(num);
mRemote.transact(Stub.TRANSACTION_setMaximumFailedPasswordsForWipe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getMaximumFailedPasswordsForWipe(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getMaximumFailedPasswordsForWipe, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean resetPassword(java.lang.String password, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(password);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_resetPassword, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setMaximumTimeToLock(android.content.ComponentName who, long timeMs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(timeMs);
mRemote.transact(Stub.TRANSACTION_setMaximumTimeToLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public long getMaximumTimeToLock(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getMaximumTimeToLock, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void lockNow() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_lockNow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void wipeData(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_wipeData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setActiveAdmin(android.content.ComponentName policyReceiver) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setActiveAdmin, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean isAdminActive(android.content.ComponentName policyReceiver) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isAdminActive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<android.content.ComponentName> getActiveAdmins() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.ComponentName> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveAdmins, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.ComponentName.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean packageHasActiveAdmins(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_packageHasActiveAdmins, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void getRemoveWarning(android.content.ComponentName policyReceiver, android.os.RemoteCallback result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getRemoveWarning, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void removeActiveAdmin(android.content.ComponentName policyReceiver) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeActiveAdmin, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setActivePasswordState(int quality, int length) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(quality);
_data.writeInt(length);
mRemote.transact(Stub.TRANSACTION_setActivePasswordState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void reportFailedPasswordAttempt() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reportFailedPasswordAttempt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void reportSuccessfulPasswordAttempt() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reportSuccessfulPasswordAttempt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setPasswordQuality = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPasswordQuality = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setPasswordMinimumLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getPasswordMinimumLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isActivePasswordSufficient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getCurrentFailedPasswordAttempts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setMaximumFailedPasswordsForWipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getMaximumFailedPasswordsForWipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_resetPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setMaximumTimeToLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getMaximumTimeToLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_lockNow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_wipeData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setActiveAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_isAdminActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getActiveAdmins = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_packageHasActiveAdmins = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getRemoveWarning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_removeActiveAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_setActivePasswordState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_reportFailedPasswordAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_reportSuccessfulPasswordAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
}
public void setPasswordQuality(android.content.ComponentName who, int quality) throws android.os.RemoteException;
public int getPasswordQuality(android.content.ComponentName who) throws android.os.RemoteException;
public void setPasswordMinimumLength(android.content.ComponentName who, int length) throws android.os.RemoteException;
public int getPasswordMinimumLength(android.content.ComponentName who) throws android.os.RemoteException;
public boolean isActivePasswordSufficient() throws android.os.RemoteException;
public int getCurrentFailedPasswordAttempts() throws android.os.RemoteException;
public void setMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int num) throws android.os.RemoteException;
public int getMaximumFailedPasswordsForWipe(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean resetPassword(java.lang.String password, int flags) throws android.os.RemoteException;
public void setMaximumTimeToLock(android.content.ComponentName who, long timeMs) throws android.os.RemoteException;
public long getMaximumTimeToLock(android.content.ComponentName who) throws android.os.RemoteException;
public void lockNow() throws android.os.RemoteException;
public void wipeData(int flags) throws android.os.RemoteException;
public void setActiveAdmin(android.content.ComponentName policyReceiver) throws android.os.RemoteException;
public boolean isAdminActive(android.content.ComponentName policyReceiver) throws android.os.RemoteException;
public java.util.List<android.content.ComponentName> getActiveAdmins() throws android.os.RemoteException;
public boolean packageHasActiveAdmins(java.lang.String packageName) throws android.os.RemoteException;
public void getRemoveWarning(android.content.ComponentName policyReceiver, android.os.RemoteCallback result) throws android.os.RemoteException;
public void removeActiveAdmin(android.content.ComponentName policyReceiver) throws android.os.RemoteException;
public void setActivePasswordState(int quality, int length) throws android.os.RemoteException;
public void reportFailedPasswordAttempt() throws android.os.RemoteException;
public void reportSuccessfulPasswordAttempt() throws android.os.RemoteException;
}
