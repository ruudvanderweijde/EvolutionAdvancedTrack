/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/view/IWindowManager.aidl
 */
package android.view;
import java.lang.CharSequence;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import com.android.internal.view.IInputContext;
import com.android.internal.view.IInputMethodClient;
import android.content.res.Configuration;
import java.util.List;
/**
 * System private interface to the window manager.
 *
 * {@hide}
 */
public interface IWindowManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IWindowManager
{
private static final java.lang.String DESCRIPTOR = "android.view.IWindowManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IWindowManager interface,
 * generating a proxy if needed.
 */
public static android.view.IWindowManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IWindowManager))) {
return ((android.view.IWindowManager)iin);
}
return new android.view.IWindowManager.Stub.Proxy(obj);
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
case TRANSACTION_startViewServer:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.startViewServer(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopViewServer:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopViewServer();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isViewServerRunning:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isViewServerRunning();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_openSession:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.view.IInputMethodClient _arg0;
_arg0 = com.android.internal.view.IInputMethodClient.Stub.asInterface(data.readStrongBinder());
com.android.internal.view.IInputContext _arg1;
_arg1 = com.android.internal.view.IInputContext.Stub.asInterface(data.readStrongBinder());
android.view.IWindowSession _result = this.openSession(_arg0, _arg1);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_inputMethodClientHasFocus:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.view.IInputMethodClient _arg0;
_arg0 = com.android.internal.view.IInputMethodClient.Stub.asInterface(data.readStrongBinder());
boolean _result = this.inputMethodClientHasFocus(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_injectKeyEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.KeyEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.injectKeyEvent(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_injectPointerEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.MotionEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.MotionEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.injectPointerEvent(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_injectTrackballEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.MotionEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.MotionEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.injectTrackballEvent(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_pauseKeyDispatching:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.pauseKeyDispatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_resumeKeyDispatching:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.resumeKeyDispatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setEventDispatching:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setEventDispatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addWindowToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.addWindowToken(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeWindowToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.removeWindowToken(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addAppToken:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.view.IApplicationToken _arg1;
_arg1 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
boolean _arg4;
_arg4 = (0!=data.readInt());
this.addAppToken(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_setAppGroupId:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.setAppGroupId(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_updateOrientationFromAppTokens:
{
data.enforceInterface(DESCRIPTOR);
android.content.res.Configuration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.content.res.Configuration _result = this.updateOrientationFromAppTokens(_arg0, _arg1);
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
case TRANSACTION_setAppOrientation:
{
data.enforceInterface(DESCRIPTOR);
android.view.IApplicationToken _arg0;
_arg0 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.setAppOrientation(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getAppOrientation:
{
data.enforceInterface(DESCRIPTOR);
android.view.IApplicationToken _arg0;
_arg0 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
int _result = this.getAppOrientation(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setFocusedApp:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setFocusedApp(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_prepareAppTransition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.prepareAppTransition(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPendingAppTransition:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPendingAppTransition();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_executeAppTransition:
{
data.enforceInterface(DESCRIPTOR);
this.executeAppTransition();
reply.writeNoException();
return true;
}
case TRANSACTION_setAppStartingWindow:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.lang.CharSequence _arg3;
if ((0!=data.readInt())) {
_arg3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
android.os.IBinder _arg6;
_arg6 = data.readStrongBinder();
boolean _arg7;
_arg7 = (0!=data.readInt());
this.setAppStartingWindow(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
return true;
}
case TRANSACTION_setAppWillBeHidden:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.setAppWillBeHidden(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setAppVisibility:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setAppVisibility(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startAppFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.startAppFreezingScreen(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_stopAppFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.stopAppFreezingScreen(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeAppToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.removeAppToken(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_moveAppToken:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.moveAppToken(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_moveAppTokensToTop:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.os.IBinder> _arg0;
_arg0 = data.createBinderArrayList();
this.moveAppTokensToTop(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_moveAppTokensToBottom:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.os.IBinder> _arg0;
_arg0 = data.createBinderArrayList();
this.moveAppTokensToBottom(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_disableKeyguard:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
this.disableKeyguard(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reenableKeyguard:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.reenableKeyguard(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_exitKeyguardSecurely:
{
data.enforceInterface(DESCRIPTOR);
android.view.IOnKeyguardExitResult _arg0;
_arg0 = android.view.IOnKeyguardExitResult.Stub.asInterface(data.readStrongBinder());
this.exitKeyguardSecurely(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_inKeyguardRestrictedInputMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.inKeyguardRestrictedInputMode();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAnimationScale:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _result = this.getAnimationScale(_arg0);
reply.writeNoException();
reply.writeFloat(_result);
return true;
}
case TRANSACTION_getAnimationScales:
{
data.enforceInterface(DESCRIPTOR);
float[] _result = this.getAnimationScales();
reply.writeNoException();
reply.writeFloatArray(_result);
return true;
}
case TRANSACTION_setAnimationScale:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
this.setAnimationScale(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAnimationScales:
{
data.enforceInterface(DESCRIPTOR);
float[] _arg0;
_arg0 = data.createFloatArray();
this.setAnimationScales(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getSwitchState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getSwitchState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSwitchStateForDevice:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.getSwitchStateForDevice(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getScancodeState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getScancodeState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getScancodeStateForDevice:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.getScancodeStateForDevice(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getKeycodeState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getKeycodeState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getKeycodeStateForDevice:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.getKeycodeStateForDevice(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_hasKeys:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
boolean[] _arg1;
_arg1 = data.createBooleanArray();
boolean _result = this.hasKeys(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
reply.writeBooleanArray(_arg1);
return true;
}
case TRANSACTION_setInTouchMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setInTouchMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setRotation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.setRotation(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getRotation:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRotation();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_watchRotation:
{
data.enforceInterface(DESCRIPTOR);
android.view.IRotationWatcher _arg0;
_arg0 = android.view.IRotationWatcher.Stub.asInterface(data.readStrongBinder());
int _result = this.watchRotation(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IWindowManager
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
     * ===== NOTICE =====
     * The first three methods must remain the first three methods. Scripts
     * and tools rely on their transaction number to work properly.
     */// This is used for debugging

public boolean startViewServer(int port) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(port);
mRemote.transact(Stub.TRANSACTION_startViewServer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Transaction #1

public boolean stopViewServer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopViewServer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Transaction #2

public boolean isViewServerRunning() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isViewServerRunning, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Transaction #3

public android.view.IWindowSession openSession(com.android.internal.view.IInputMethodClient client, com.android.internal.view.IInputContext inputContext) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.IWindowSession _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
_data.writeStrongBinder((((inputContext!=null))?(inputContext.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_openSession, _data, _reply, 0);
_reply.readException();
_result = android.view.IWindowSession.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean inputMethodClientHasFocus(com.android.internal.view.IInputMethodClient client) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_inputMethodClientHasFocus, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// These can only be called when injecting events to your own window,
// or by holding the INJECT_EVENTS permission.

public boolean injectKeyEvent(android.view.KeyEvent ev, boolean sync) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ev!=null)) {
_data.writeInt(1);
ev.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((sync)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_injectKeyEvent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean injectPointerEvent(android.view.MotionEvent ev, boolean sync) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ev!=null)) {
_data.writeInt(1);
ev.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((sync)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_injectPointerEvent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean injectTrackballEvent(android.view.MotionEvent ev, boolean sync) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ev!=null)) {
_data.writeInt(1);
ev.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((sync)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_injectTrackballEvent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// These can only be called when holding the MANAGE_APP_TOKENS permission.

public void pauseKeyDispatching(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_pauseKeyDispatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void resumeKeyDispatching(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_resumeKeyDispatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setEventDispatching(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setEventDispatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void addWindowToken(android.os.IBinder token, int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_addWindowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void removeWindowToken(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_removeWindowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void addAppToken(int addPos, android.view.IApplicationToken token, int groupId, int requestedOrientation, boolean fullscreen) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(addPos);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(groupId);
_data.writeInt(requestedOrientation);
_data.writeInt(((fullscreen)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_addAppToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setAppGroupId(android.os.IBinder token, int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_setAppGroupId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public android.content.res.Configuration updateOrientationFromAppTokens(android.content.res.Configuration currentConfig, android.os.IBinder freezeThisOneIfNeeded) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.res.Configuration _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((currentConfig!=null)) {
_data.writeInt(1);
currentConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(freezeThisOneIfNeeded);
mRemote.transact(Stub.TRANSACTION_updateOrientationFromAppTokens, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.res.Configuration.CREATOR.createFromParcel(_reply);
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
public void setAppOrientation(android.view.IApplicationToken token, int requestedOrientation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(requestedOrientation);
mRemote.transact(Stub.TRANSACTION_setAppOrientation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getAppOrientation(android.view.IApplicationToken token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getAppOrientation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setFocusedApp(android.os.IBinder token, boolean moveFocusNow) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((moveFocusNow)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setFocusedApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void prepareAppTransition(int transit) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(transit);
mRemote.transact(Stub.TRANSACTION_prepareAppTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getPendingAppTransition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPendingAppTransition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void executeAppTransition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_executeAppTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setAppStartingWindow(android.os.IBinder token, java.lang.String pkg, int theme, java.lang.CharSequence nonLocalizedLabel, int labelRes, int icon, android.os.IBinder transferFrom, boolean createIfNeeded) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeString(pkg);
_data.writeInt(theme);
if ((nonLocalizedLabel!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(nonLocalizedLabel, _data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(labelRes);
_data.writeInt(icon);
_data.writeStrongBinder(transferFrom);
_data.writeInt(((createIfNeeded)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAppStartingWindow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setAppWillBeHidden(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_setAppWillBeHidden, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setAppVisibility(android.os.IBinder token, boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAppVisibility, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void startAppFreezingScreen(android.os.IBinder token, int configChanges) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(configChanges);
mRemote.transact(Stub.TRANSACTION_startAppFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void stopAppFreezingScreen(android.os.IBinder token, boolean force) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((force)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_stopAppFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void removeAppToken(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_removeAppToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void moveAppToken(int index, android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_moveAppToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void moveAppTokensToTop(java.util.List<android.os.IBinder> tokens) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeBinderList(tokens);
mRemote.transact(Stub.TRANSACTION_moveAppTokensToTop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void moveAppTokensToBottom(java.util.List<android.os.IBinder> tokens) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeBinderList(tokens);
mRemote.transact(Stub.TRANSACTION_moveAppTokensToBottom, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// these require DISABLE_KEYGUARD permission

public void disableKeyguard(android.os.IBinder token, java.lang.String tag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeString(tag);
mRemote.transact(Stub.TRANSACTION_disableKeyguard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void reenableKeyguard(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_reenableKeyguard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_exitKeyguardSecurely, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean inKeyguardRestrictedInputMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_inKeyguardRestrictedInputMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// These can only be called with the SET_ANIMATON_SCALE permission.

public float getAnimationScale(int which) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(which);
mRemote.transact(Stub.TRANSACTION_getAnimationScale, _data, _reply, 0);
_reply.readException();
_result = _reply.readFloat();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public float[] getAnimationScales() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAnimationScales, _data, _reply, 0);
_reply.readException();
_result = _reply.createFloatArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setAnimationScale(int which, float scale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(which);
_data.writeFloat(scale);
mRemote.transact(Stub.TRANSACTION_setAnimationScale, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setAnimationScales(float[] scales) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloatArray(scales);
mRemote.transact(Stub.TRANSACTION_setAnimationScales, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// These require the READ_INPUT_STATE permission.

public int getSwitchState(int sw) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sw);
mRemote.transact(Stub.TRANSACTION_getSwitchState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getSwitchStateForDevice(int devid, int sw) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(devid);
_data.writeInt(sw);
mRemote.transact(Stub.TRANSACTION_getSwitchStateForDevice, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getScancodeState(int sw) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sw);
mRemote.transact(Stub.TRANSACTION_getScancodeState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getScancodeStateForDevice(int devid, int sw) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(devid);
_data.writeInt(sw);
mRemote.transact(Stub.TRANSACTION_getScancodeStateForDevice, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getKeycodeState(int sw) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sw);
mRemote.transact(Stub.TRANSACTION_getKeycodeState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getKeycodeStateForDevice(int devid, int sw) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(devid);
_data.writeInt(sw);
mRemote.transact(Stub.TRANSACTION_getKeycodeStateForDevice, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Report whether the hardware supports the given keys; returns true if successful

public boolean hasKeys(int[] keycodes, boolean[] keyExists) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(keycodes);
_data.writeBooleanArray(keyExists);
mRemote.transact(Stub.TRANSACTION_hasKeys, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
_reply.readBooleanArray(keyExists);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// For testing

public void setInTouchMode(boolean showFocus) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((showFocus)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setInTouchMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// These can only be called with the SET_ORIENTATION permission.
/**
     * Change the current screen rotation, constants as per
     * {@link android.view.Surface}.
     * @param rotation the intended rotation.
     * @param alwaysSendConfiguration Flag to force a new configuration to
     * be evaluated.  This can be used when there are other parameters in
     * configuration that are changing.
     * @param animFlags Animation flags as per {@link android.view.Surface}.
     */
public void setRotation(int rotation, boolean alwaysSendConfiguration, int animFlags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rotation);
_data.writeInt(((alwaysSendConfiguration)?(1):(0)));
_data.writeInt(animFlags);
mRemote.transact(Stub.TRANSACTION_setRotation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Retrieve the current screen orientation, constants as per
     * {@link android.view.Surface}.
     */
public int getRotation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRotation, _data, _reply, 0);
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
     * Watch the rotation of the screen.  Returns the current rotation,
     * calls back when it changes.
     */
public int watchRotation(android.view.IRotationWatcher watcher) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((watcher!=null))?(watcher.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_watchRotation, _data, _reply, 0);
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
static final int TRANSACTION_startViewServer = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopViewServer = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isViewServerRunning = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_openSession = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_inputMethodClientHasFocus = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_injectKeyEvent = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_injectPointerEvent = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_injectTrackballEvent = (IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_pauseKeyDispatching = (IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_resumeKeyDispatching = (IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setEventDispatching = (IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_addWindowToken = (IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_removeWindowToken = (IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_addAppToken = (IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setAppGroupId = (IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_updateOrientationFromAppTokens = (IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setAppOrientation = (IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getAppOrientation = (IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_setFocusedApp = (IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_prepareAppTransition = (IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getPendingAppTransition = (IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_executeAppTransition = (IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_setAppStartingWindow = (IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setAppWillBeHidden = (IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_setAppVisibility = (IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_startAppFreezingScreen = (IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_stopAppFreezingScreen = (IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_removeAppToken = (IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_moveAppToken = (IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_moveAppTokensToTop = (IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_moveAppTokensToBottom = (IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_disableKeyguard = (IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_reenableKeyguard = (IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_exitKeyguardSecurely = (IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_inKeyguardRestrictedInputMode = (IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_getAnimationScale = (IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_getAnimationScales = (IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_setAnimationScale = (IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_setAnimationScales = (IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_getSwitchState = (IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_getSwitchStateForDevice = (IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_getScancodeState = (IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_getScancodeStateForDevice = (IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_getKeycodeState = (IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_getKeycodeStateForDevice = (IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_hasKeys = (IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_setInTouchMode = (IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_setRotation = (IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_getRotation = (IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_watchRotation = (IBinder.FIRST_CALL_TRANSACTION + 49);
}
/**
     * ===== NOTICE =====
     * The first three methods must remain the first three methods. Scripts
     * and tools rely on their transaction number to work properly.
     */// This is used for debugging

public boolean startViewServer(int port) throws android.os.RemoteException;
// Transaction #1

public boolean stopViewServer() throws android.os.RemoteException;
// Transaction #2

public boolean isViewServerRunning() throws android.os.RemoteException;
// Transaction #3

public android.view.IWindowSession openSession(com.android.internal.view.IInputMethodClient client, com.android.internal.view.IInputContext inputContext) throws android.os.RemoteException;
public boolean inputMethodClientHasFocus(com.android.internal.view.IInputMethodClient client) throws android.os.RemoteException;
// These can only be called when injecting events to your own window,
// or by holding the INJECT_EVENTS permission.

public boolean injectKeyEvent(android.view.KeyEvent ev, boolean sync) throws android.os.RemoteException;
public boolean injectPointerEvent(android.view.MotionEvent ev, boolean sync) throws android.os.RemoteException;
public boolean injectTrackballEvent(android.view.MotionEvent ev, boolean sync) throws android.os.RemoteException;
// These can only be called when holding the MANAGE_APP_TOKENS permission.

public void pauseKeyDispatching(android.os.IBinder token) throws android.os.RemoteException;
public void resumeKeyDispatching(android.os.IBinder token) throws android.os.RemoteException;
public void setEventDispatching(boolean enabled) throws android.os.RemoteException;
public void addWindowToken(android.os.IBinder token, int type) throws android.os.RemoteException;
public void removeWindowToken(android.os.IBinder token) throws android.os.RemoteException;
public void addAppToken(int addPos, android.view.IApplicationToken token, int groupId, int requestedOrientation, boolean fullscreen) throws android.os.RemoteException;
public void setAppGroupId(android.os.IBinder token, int groupId) throws android.os.RemoteException;
public android.content.res.Configuration updateOrientationFromAppTokens(android.content.res.Configuration currentConfig, android.os.IBinder freezeThisOneIfNeeded) throws android.os.RemoteException;
public void setAppOrientation(android.view.IApplicationToken token, int requestedOrientation) throws android.os.RemoteException;
public int getAppOrientation(android.view.IApplicationToken token) throws android.os.RemoteException;
public void setFocusedApp(android.os.IBinder token, boolean moveFocusNow) throws android.os.RemoteException;
public void prepareAppTransition(int transit) throws android.os.RemoteException;
public int getPendingAppTransition() throws android.os.RemoteException;
public void executeAppTransition() throws android.os.RemoteException;
public void setAppStartingWindow(android.os.IBinder token, java.lang.String pkg, int theme, java.lang.CharSequence nonLocalizedLabel, int labelRes, int icon, android.os.IBinder transferFrom, boolean createIfNeeded) throws android.os.RemoteException;
public void setAppWillBeHidden(android.os.IBinder token) throws android.os.RemoteException;
public void setAppVisibility(android.os.IBinder token, boolean visible) throws android.os.RemoteException;
public void startAppFreezingScreen(android.os.IBinder token, int configChanges) throws android.os.RemoteException;
public void stopAppFreezingScreen(android.os.IBinder token, boolean force) throws android.os.RemoteException;
public void removeAppToken(android.os.IBinder token) throws android.os.RemoteException;
public void moveAppToken(int index, android.os.IBinder token) throws android.os.RemoteException;
public void moveAppTokensToTop(java.util.List<android.os.IBinder> tokens) throws android.os.RemoteException;
public void moveAppTokensToBottom(java.util.List<android.os.IBinder> tokens) throws android.os.RemoteException;
// these require DISABLE_KEYGUARD permission

public void disableKeyguard(android.os.IBinder token, java.lang.String tag) throws android.os.RemoteException;
public void reenableKeyguard(android.os.IBinder token) throws android.os.RemoteException;
public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult callback) throws android.os.RemoteException;
public boolean inKeyguardRestrictedInputMode() throws android.os.RemoteException;
// These can only be called with the SET_ANIMATON_SCALE permission.

public float getAnimationScale(int which) throws android.os.RemoteException;
public float[] getAnimationScales() throws android.os.RemoteException;
public void setAnimationScale(int which, float scale) throws android.os.RemoteException;
public void setAnimationScales(float[] scales) throws android.os.RemoteException;
// These require the READ_INPUT_STATE permission.

public int getSwitchState(int sw) throws android.os.RemoteException;
public int getSwitchStateForDevice(int devid, int sw) throws android.os.RemoteException;
public int getScancodeState(int sw) throws android.os.RemoteException;
public int getScancodeStateForDevice(int devid, int sw) throws android.os.RemoteException;
public int getKeycodeState(int sw) throws android.os.RemoteException;
public int getKeycodeStateForDevice(int devid, int sw) throws android.os.RemoteException;
// Report whether the hardware supports the given keys; returns true if successful

public boolean hasKeys(int[] keycodes, boolean[] keyExists) throws android.os.RemoteException;
// For testing

public void setInTouchMode(boolean showFocus) throws android.os.RemoteException;
// These can only be called with the SET_ORIENTATION permission.
/**
     * Change the current screen rotation, constants as per
     * {@link android.view.Surface}.
     * @param rotation the intended rotation.
     * @param alwaysSendConfiguration Flag to force a new configuration to
     * be evaluated.  This can be used when there are other parameters in
     * configuration that are changing.
     * @param animFlags Animation flags as per {@link android.view.Surface}.
     */
public void setRotation(int rotation, boolean alwaysSendConfiguration, int animFlags) throws android.os.RemoteException;
/**
     * Retrieve the current screen orientation, constants as per
     * {@link android.view.Surface}.
     */
public int getRotation() throws android.os.RemoteException;
/**
     * Watch the rotation of the screen.  Returns the current rotation,
     * calls back when it changes.
     */
public int watchRotation(android.view.IRotationWatcher watcher) throws android.os.RemoteException;
}
