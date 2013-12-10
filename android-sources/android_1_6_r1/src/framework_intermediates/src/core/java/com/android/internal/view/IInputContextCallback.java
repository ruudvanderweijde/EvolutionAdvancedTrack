/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/view/IInputContextCallback.aidl
 */
package com.android.internal.view;
import java.lang.CharSequence;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.view.inputmethod.ExtractedText;
/**
 * {@hide}
 */
public interface IInputContextCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputContextCallback
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputContextCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IInputContextCallback interface,
 * generating a proxy if needed.
 */
public static com.android.internal.view.IInputContextCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.view.IInputContextCallback))) {
return ((com.android.internal.view.IInputContextCallback)iin);
}
return new com.android.internal.view.IInputContextCallback.Stub.Proxy(obj);
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
case TRANSACTION_setTextBeforeCursor:
{
data.enforceInterface(DESCRIPTOR);
java.lang.CharSequence _arg0;
if ((0!=data.readInt())) {
_arg0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.setTextBeforeCursor(_arg0, _arg1);
return true;
}
case TRANSACTION_setTextAfterCursor:
{
data.enforceInterface(DESCRIPTOR);
java.lang.CharSequence _arg0;
if ((0!=data.readInt())) {
_arg0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.setTextAfterCursor(_arg0, _arg1);
return true;
}
case TRANSACTION_setCursorCapsMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setCursorCapsMode(_arg0, _arg1);
return true;
}
case TRANSACTION_setExtractedText:
{
data.enforceInterface(DESCRIPTOR);
android.view.inputmethod.ExtractedText _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.inputmethod.ExtractedText.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.setExtractedText(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.view.IInputContextCallback
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
public void setTextBeforeCursor(java.lang.CharSequence textBeforeCursor, int seq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((textBeforeCursor!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(textBeforeCursor, _data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(seq);
mRemote.transact(Stub.TRANSACTION_setTextBeforeCursor, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void setTextAfterCursor(java.lang.CharSequence textAfterCursor, int seq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((textAfterCursor!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(textAfterCursor, _data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(seq);
mRemote.transact(Stub.TRANSACTION_setTextAfterCursor, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void setCursorCapsMode(int capsMode, int seq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(capsMode);
_data.writeInt(seq);
mRemote.transact(Stub.TRANSACTION_setCursorCapsMode, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void setExtractedText(android.view.inputmethod.ExtractedText extractedText, int seq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((extractedText!=null)) {
_data.writeInt(1);
extractedText.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(seq);
mRemote.transact(Stub.TRANSACTION_setExtractedText, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setTextBeforeCursor = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setTextAfterCursor = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setCursorCapsMode = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setExtractedText = (IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void setTextBeforeCursor(java.lang.CharSequence textBeforeCursor, int seq) throws android.os.RemoteException;
public void setTextAfterCursor(java.lang.CharSequence textAfterCursor, int seq) throws android.os.RemoteException;
public void setCursorCapsMode(int capsMode, int seq) throws android.os.RemoteException;
public void setExtractedText(android.view.inputmethod.ExtractedText extractedText, int seq) throws android.os.RemoteException;
}
