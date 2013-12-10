/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/speech/IRecognitionService.aidl
 */
package android.speech;
// A Service interface to speech recognition. Call startListening when
// you want to begin capturing audio; RecognitionService will automatically
// determine when the user has finished speaking, stream the audio to the
// recognition servers, and notify you when results are ready.
/** {@hide} */
public interface IRecognitionService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.speech.IRecognitionService
{
private static final java.lang.String DESCRIPTOR = "android.speech.IRecognitionService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.speech.IRecognitionService interface,
 * generating a proxy if needed.
 */
public static android.speech.IRecognitionService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.speech.IRecognitionService))) {
return ((android.speech.IRecognitionService)iin);
}
return new android.speech.IRecognitionService.Stub.Proxy(obj);
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
case TRANSACTION_startListening:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.speech.IRecognitionListener _arg1;
_arg1 = android.speech.IRecognitionListener.Stub.asInterface(data.readStrongBinder());
this.startListening(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getRecognitionResults:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.util.List<android.speech.RecognitionResult> _result = this.getRecognitionResults(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_cancel:
{
data.enforceInterface(DESCRIPTOR);
this.cancel();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.speech.IRecognitionService
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
// Start listening for speech. Can only call this from one thread at once.
// see RecognizerIntent.java for constants used to specify the intent.

public void startListening(android.content.Intent recognizerIntent, android.speech.IRecognitionListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((recognizerIntent!=null)) {
_data.writeInt(1);
recognizerIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startListening, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public java.util.List<android.speech.RecognitionResult> getRecognitionResults(long key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.speech.RecognitionResult> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(key);
mRemote.transact(Stub.TRANSACTION_getRecognitionResults, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.speech.RecognitionResult.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void cancel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_startListening = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getRecognitionResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_cancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
// Start listening for speech. Can only call this from one thread at once.
// see RecognizerIntent.java for constants used to specify the intent.

public void startListening(android.content.Intent recognizerIntent, android.speech.IRecognitionListener listener) throws android.os.RemoteException;
public java.util.List<android.speech.RecognitionResult> getRecognitionResults(long key) throws android.os.RemoteException;
public void cancel() throws android.os.RemoteException;
}
