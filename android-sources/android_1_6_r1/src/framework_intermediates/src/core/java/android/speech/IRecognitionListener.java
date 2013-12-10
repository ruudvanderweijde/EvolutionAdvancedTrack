/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/speech/IRecognitionListener.aidl
 */
package android.speech;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.os.Bundle;
import java.util.List;
/**
 * Listener for speech recognition events, used with RecognitionService.
 *  This gives you both the final recognition results, as well as various
 *  intermediate events that can be used to show visual feedback to the user.
 *  {@hide}
 */
public interface IRecognitionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.speech.IRecognitionListener
{
private static final java.lang.String DESCRIPTOR = "android.speech.IRecognitionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IRecognitionListener interface,
 * generating a proxy if needed.
 */
public static android.speech.IRecognitionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.speech.IRecognitionListener))) {
return ((android.speech.IRecognitionListener)iin);
}
return new android.speech.IRecognitionListener.Stub.Proxy(obj);
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
case TRANSACTION_onReadyForSpeech:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onReadyForSpeech(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onBeginningOfSpeech:
{
data.enforceInterface(DESCRIPTOR);
this.onBeginningOfSpeech();
reply.writeNoException();
return true;
}
case TRANSACTION_onRmsChanged:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
this.onRmsChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onBufferReceived:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.onBufferReceived(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onEndOfSpeech:
{
data.enforceInterface(DESCRIPTOR);
this.onEndOfSpeech();
reply.writeNoException();
return true;
}
case TRANSACTION_onError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onError(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onResults:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.speech.RecognitionResult> _arg0;
_arg0 = data.createTypedArrayList(android.speech.RecognitionResult.CREATOR);
long _arg1;
_arg1 = data.readLong();
this.onResults(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.speech.IRecognitionListener
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
/** Called when the endpointer is ready for the user to start speaking. */
public void onReadyForSpeech(android.os.Bundle noiseParams) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((noiseParams!=null)) {
_data.writeInt(1);
noiseParams.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onReadyForSpeech, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** The user has started to speak. */
public void onBeginningOfSpeech() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onBeginningOfSpeech, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** The sound level in the audio stream has changed. */
public void onRmsChanged(float rmsdB) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(rmsdB);
mRemote.transact(Stub.TRANSACTION_onRmsChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * More sound has been received. Buffer is a byte buffer containing
     * a sequence of 16-bit shorts. 
     */
public void onBufferReceived(byte[] buffer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(buffer);
mRemote.transact(Stub.TRANSACTION_onBufferReceived, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Called after the user stops speaking. */
public void onEndOfSpeech() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onEndOfSpeech, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * A network or recognition error occurred. The code is defined in
     * {@link android.speech.RecognitionResult}
     */
public void onError(int error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(error);
mRemote.transact(Stub.TRANSACTION_onError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** 
     * Called when recognition results are ready.
     * @param results: an ordered list of the most likely results (N-best list).
     * @param key: a key associated with the results. The same results can
     * be retrieved asynchronously later using the key, if available. 
     */
public void onResults(java.util.List<android.speech.RecognitionResult> results, long key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(results);
_data.writeLong(key);
mRemote.transact(Stub.TRANSACTION_onResults, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onReadyForSpeech = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onBeginningOfSpeech = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onRmsChanged = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onBufferReceived = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onEndOfSpeech = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onError = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onResults = (IBinder.FIRST_CALL_TRANSACTION + 6);
}
/** Called when the endpointer is ready for the user to start speaking. */
public void onReadyForSpeech(android.os.Bundle noiseParams) throws android.os.RemoteException;
/** The user has started to speak. */
public void onBeginningOfSpeech() throws android.os.RemoteException;
/** The sound level in the audio stream has changed. */
public void onRmsChanged(float rmsdB) throws android.os.RemoteException;
/**
     * More sound has been received. Buffer is a byte buffer containing
     * a sequence of 16-bit shorts. 
     */
public void onBufferReceived(byte[] buffer) throws android.os.RemoteException;
/** Called after the user stops speaking. */
public void onEndOfSpeech() throws android.os.RemoteException;
/**
     * A network or recognition error occurred. The code is defined in
     * {@link android.speech.RecognitionResult}
     */
public void onError(int error) throws android.os.RemoteException;
/** 
     * Called when recognition results are ready.
     * @param results: an ordered list of the most likely results (N-best list).
     * @param key: a key associated with the results. The same results can
     * be retrieved asynchronously later using the key, if available. 
     */
public void onResults(java.util.List<android.speech.RecognitionResult> results, long key) throws android.os.RemoteException;
}
