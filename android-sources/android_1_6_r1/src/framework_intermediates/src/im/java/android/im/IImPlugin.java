/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/im/java/android/im/IImPlugin.aidl
 */
package android.im;
import java.lang.String;
import java.util.Map;
import java.util.List;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
/**
 * @hide
 */
public interface IImPlugin extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.im.IImPlugin
{
private static final java.lang.String DESCRIPTOR = "android.im.IImPlugin";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IImPlugin interface,
 * generating a proxy if needed.
 */
public static android.im.IImPlugin asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.im.IImPlugin))) {
return ((android.im.IImPlugin)iin);
}
return new android.im.IImPlugin.Stub.Proxy(obj);
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
case TRANSACTION_onStart:
{
data.enforceInterface(DESCRIPTOR);
this.onStart();
reply.writeNoException();
return true;
}
case TRANSACTION_onStop:
{
data.enforceInterface(DESCRIPTOR);
this.onStop();
reply.writeNoException();
return true;
}
case TRANSACTION_signIn:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.signIn(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_signOut:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.signOut(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getResourcePackageNameForProvider:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getResourcePackageNameForProvider(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getResourceMapForProvider:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.Map _result = this.getResourceMapForProvider(_arg0);
reply.writeNoException();
reply.writeMap(_result);
return true;
}
case TRANSACTION_getSupportedProviders:
{
data.enforceInterface(DESCRIPTOR);
java.util.List _result = this.getSupportedProviders();
reply.writeNoException();
reply.writeList(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.im.IImPlugin
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
     * Notify the plugin the front door activity is created. This gives the plugin a chance to
     * start its own servics, etc.
     */
public void onStart() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onStart, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notify the plugin the front door activity is stopping.
     */
public void onStop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onStop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Sign in to the service for the account passed in.
     *
     * @param account the account id for the accont to be signed into.
     */
public void signIn(long account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(account);
mRemote.transact(Stub.TRANSACTION_signIn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Sign out of the service for the account passed in.
     *
     * @param account the account id for the accont to be signed out of.
     */
public void signOut(long account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(account);
mRemote.transact(Stub.TRANSACTION_signOut, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns the package name used to load the resources for the given provider name.
     *
     * @return The package name to load the resourcs for the given provider.
     */
public java.lang.String getResourcePackageNameForProvider(java.lang.String providerName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(providerName);
mRemote.transact(Stub.TRANSACTION_getResourcePackageNameForProvider, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns a map of branding resources for the given provider. The keys are defined
     * in {@link android.im.BrandingResourceIDs}. The values are the resource identifiers generated
     * by the aapt tool.
     *
     * @return The map of branding resources for the given provider.
     */
public java.util.Map getResourceMapForProvider(java.lang.String providerName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.Map _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(providerName);
mRemote.transact(Stub.TRANSACTION_getResourceMapForProvider, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readHashMap(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Returns a list of supported IM providers.
     *
     * @return a List of supported providers.
     */
public java.util.List getSupportedProviders() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSupportedProviders, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_onStart = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onStop = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_signIn = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_signOut = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getResourcePackageNameForProvider = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getResourceMapForProvider = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getSupportedProviders = (IBinder.FIRST_CALL_TRANSACTION + 6);
}
/**
     * Notify the plugin the front door activity is created. This gives the plugin a chance to
     * start its own servics, etc.
     */
public void onStart() throws android.os.RemoteException;
/**
     * Notify the plugin the front door activity is stopping.
     */
public void onStop() throws android.os.RemoteException;
/**
     * Sign in to the service for the account passed in.
     *
     * @param account the account id for the accont to be signed into.
     */
public void signIn(long account) throws android.os.RemoteException;
/**
     * Sign out of the service for the account passed in.
     *
     * @param account the account id for the accont to be signed out of.
     */
public void signOut(long account) throws android.os.RemoteException;
/**
     * Returns the package name used to load the resources for the given provider name.
     *
     * @return The package name to load the resourcs for the given provider.
     */
public java.lang.String getResourcePackageNameForProvider(java.lang.String providerName) throws android.os.RemoteException;
/**
     * Returns a map of branding resources for the given provider. The keys are defined
     * in {@link android.im.BrandingResourceIDs}. The values are the resource identifiers generated
     * by the aapt tool.
     *
     * @return The map of branding resources for the given provider.
     */
public java.util.Map getResourceMapForProvider(java.lang.String providerName) throws android.os.RemoteException;
/*
     * Returns a list of supported IM providers.
     *
     * @return a List of supported providers.
     */
public java.util.List getSupportedProviders() throws android.os.RemoteException;
}
