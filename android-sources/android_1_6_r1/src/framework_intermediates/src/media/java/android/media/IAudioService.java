/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/IAudioService.aidl
 */
package android.media;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
/**
 * {@hide}
 */
public interface IAudioService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.IAudioService
{
private static final java.lang.String DESCRIPTOR = "android.media.IAudioService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IAudioService interface,
 * generating a proxy if needed.
 */
public static android.media.IAudioService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.IAudioService))) {
return ((android.media.IAudioService)iin);
}
return new android.media.IAudioService.Stub.Proxy(obj);
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
case TRANSACTION_adjustVolume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.adjustVolume(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_adjustSuggestedStreamVolume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.adjustSuggestedStreamVolume(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_adjustStreamVolume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.adjustStreamVolume(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setStreamVolume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setStreamVolume(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setStreamSolo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
this.setStreamSolo(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setStreamMute:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
this.setStreamMute(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getStreamVolume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getStreamVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getStreamMaxVolume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getStreamMaxVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setRingerMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setRingerMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getRingerMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRingerMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setVibrateSetting:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setVibrateSetting(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getVibrateSetting:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getVibrateSetting(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_shouldVibrate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.shouldVibrate(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setMicrophoneMute:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setMicrophoneMute(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isMicrophoneMute:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isMicrophoneMute();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setRouting:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setRouting(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getRouting:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getRouting(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isMusicActive:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isMusicActive();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setParameter:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setParameter(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_playSoundEffect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.playSoundEffect(_arg0);
return true;
}
case TRANSACTION_playSoundEffectVolume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
this.playSoundEffectVolume(_arg0, _arg1);
return true;
}
case TRANSACTION_loadSoundEffects:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.loadSoundEffects();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unloadSoundEffects:
{
data.enforceInterface(DESCRIPTOR);
this.unloadSoundEffects();
return true;
}
case TRANSACTION_reloadAudioSettings:
{
data.enforceInterface(DESCRIPTOR);
this.reloadAudioSettings();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.IAudioService
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
public void adjustVolume(int direction, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(direction);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_adjustVolume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void adjustSuggestedStreamVolume(int direction, int suggestedStreamType, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(direction);
_data.writeInt(suggestedStreamType);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_adjustSuggestedStreamVolume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void adjustStreamVolume(int streamType, int direction, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamType);
_data.writeInt(direction);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_adjustStreamVolume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setStreamVolume(int streamType, int index, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamType);
_data.writeInt(index);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_setStreamVolume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setStreamSolo(int streamType, boolean state, android.os.IBinder cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamType);
_data.writeInt(((state)?(1):(0)));
_data.writeStrongBinder(cb);
mRemote.transact(Stub.TRANSACTION_setStreamSolo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setStreamMute(int streamType, boolean state, android.os.IBinder cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamType);
_data.writeInt(((state)?(1):(0)));
_data.writeStrongBinder(cb);
mRemote.transact(Stub.TRANSACTION_setStreamMute, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getStreamVolume(int streamType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamType);
mRemote.transact(Stub.TRANSACTION_getStreamVolume, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getStreamMaxVolume(int streamType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamType);
mRemote.transact(Stub.TRANSACTION_getStreamMaxVolume, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setRingerMode(int ringerMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(ringerMode);
mRemote.transact(Stub.TRANSACTION_setRingerMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getRingerMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRingerMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setVibrateSetting(int vibrateType, int vibrateSetting) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(vibrateType);
_data.writeInt(vibrateSetting);
mRemote.transact(Stub.TRANSACTION_setVibrateSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getVibrateSetting(int vibrateType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(vibrateType);
mRemote.transact(Stub.TRANSACTION_getVibrateSetting, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean shouldVibrate(int vibrateType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(vibrateType);
mRemote.transact(Stub.TRANSACTION_shouldVibrate, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setMicrophoneMute(boolean on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((on)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMicrophoneMute, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean isMicrophoneMute() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isMicrophoneMute, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setMode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setRouting(int mode, int routes, int mask) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
_data.writeInt(routes);
_data.writeInt(mask);
mRemote.transact(Stub.TRANSACTION_setRouting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getRouting(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_getRouting, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean isMusicActive() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isMusicActive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setParameter(java.lang.String key, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setParameter, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void playSoundEffect(int effectType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(effectType);
mRemote.transact(Stub.TRANSACTION_playSoundEffect, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void playSoundEffectVolume(int effectType, float volume) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(effectType);
_data.writeFloat(volume);
mRemote.transact(Stub.TRANSACTION_playSoundEffectVolume, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public boolean loadSoundEffects() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_loadSoundEffects, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void unloadSoundEffects() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_unloadSoundEffects, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void reloadAudioSettings() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reloadAudioSettings, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_adjustVolume = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_adjustSuggestedStreamVolume = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_adjustStreamVolume = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setStreamVolume = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setStreamSolo = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setStreamMute = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getStreamVolume = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getStreamMaxVolume = (IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setRingerMode = (IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getRingerMode = (IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setVibrateSetting = (IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getVibrateSetting = (IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_shouldVibrate = (IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setMicrophoneMute = (IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_isMicrophoneMute = (IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_setMode = (IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getMode = (IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setRouting = (IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getRouting = (IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_isMusicActive = (IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setParameter = (IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_playSoundEffect = (IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_playSoundEffectVolume = (IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_loadSoundEffects = (IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_unloadSoundEffects = (IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_reloadAudioSettings = (IBinder.FIRST_CALL_TRANSACTION + 25);
}
public void adjustVolume(int direction, int flags) throws android.os.RemoteException;
public void adjustSuggestedStreamVolume(int direction, int suggestedStreamType, int flags) throws android.os.RemoteException;
public void adjustStreamVolume(int streamType, int direction, int flags) throws android.os.RemoteException;
public void setStreamVolume(int streamType, int index, int flags) throws android.os.RemoteException;
public void setStreamSolo(int streamType, boolean state, android.os.IBinder cb) throws android.os.RemoteException;
public void setStreamMute(int streamType, boolean state, android.os.IBinder cb) throws android.os.RemoteException;
public int getStreamVolume(int streamType) throws android.os.RemoteException;
public int getStreamMaxVolume(int streamType) throws android.os.RemoteException;
public void setRingerMode(int ringerMode) throws android.os.RemoteException;
public int getRingerMode() throws android.os.RemoteException;
public void setVibrateSetting(int vibrateType, int vibrateSetting) throws android.os.RemoteException;
public int getVibrateSetting(int vibrateType) throws android.os.RemoteException;
public boolean shouldVibrate(int vibrateType) throws android.os.RemoteException;
public void setMicrophoneMute(boolean on) throws android.os.RemoteException;
public boolean isMicrophoneMute() throws android.os.RemoteException;
public void setMode(int mode) throws android.os.RemoteException;
public int getMode() throws android.os.RemoteException;
public void setRouting(int mode, int routes, int mask) throws android.os.RemoteException;
public int getRouting(int mode) throws android.os.RemoteException;
public boolean isMusicActive() throws android.os.RemoteException;
public void setParameter(java.lang.String key, java.lang.String value) throws android.os.RemoteException;
public void playSoundEffect(int effectType) throws android.os.RemoteException;
public void playSoundEffectVolume(int effectType, float volume) throws android.os.RemoteException;
public boolean loadSoundEffects() throws android.os.RemoteException;
public void unloadSoundEffects() throws android.os.RemoteException;
public void reloadAudioSettings() throws android.os.RemoteException;
}
