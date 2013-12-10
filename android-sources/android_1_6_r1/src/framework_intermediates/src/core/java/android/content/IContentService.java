/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/content/IContentService.aidl
 */
package android.content;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.net.Uri;
import android.os.Bundle;
import android.database.IContentObserver;
/**
 * @hide
 */
public interface IContentService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.IContentService
{
private static final java.lang.String DESCRIPTOR = "android.content.IContentService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IContentService interface,
 * generating a proxy if needed.
 */
public static android.content.IContentService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.IContentService))) {
return ((android.content.IContentService)iin);
}
return new android.content.IContentService.Stub.Proxy(obj);
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
case TRANSACTION_registerContentObserver:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
android.database.IContentObserver _arg2;
_arg2 = android.database.IContentObserver.Stub.asInterface(data.readStrongBinder());
this.registerContentObserver(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterContentObserver:
{
data.enforceInterface(DESCRIPTOR);
android.database.IContentObserver _arg0;
_arg0 = android.database.IContentObserver.Stub.asInterface(data.readStrongBinder());
this.unregisterContentObserver(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyChange:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.database.IContentObserver _arg1;
_arg1 = android.database.IContentObserver.Stub.asInterface(data.readStrongBinder());
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _arg3;
_arg3 = (0!=data.readInt());
this.notifyChange(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_startSync:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.startSync(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelSync:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.cancelSync(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getSyncProviderAutomatically:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.getSyncProviderAutomatically(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setSyncProviderAutomatically:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setSyncProviderAutomatically(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setListenForNetworkTickles:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setListenForNetworkTickles(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getListenForNetworkTickles:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getListenForNetworkTickles();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSyncActive:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isSyncActive(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveSync:
{
data.enforceInterface(DESCRIPTOR);
android.content.ActiveSyncInfo _result = this.getActiveSync();
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
case TRANSACTION_getStatusByAuthority:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.SyncStatusInfo _result = this.getStatusByAuthority(_arg0);
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
case TRANSACTION_isAuthorityPending:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isAuthorityPending(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addStatusChangeListener:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ISyncStatusObserver _arg1;
_arg1 = android.content.ISyncStatusObserver.Stub.asInterface(data.readStrongBinder());
this.addStatusChangeListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeStatusChangeListener:
{
data.enforceInterface(DESCRIPTOR);
android.content.ISyncStatusObserver _arg0;
_arg0 = android.content.ISyncStatusObserver.Stub.asInterface(data.readStrongBinder());
this.removeStatusChangeListener(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.IContentService
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
public void registerContentObserver(android.net.Uri uri, boolean notifyForDescendentsn, android.database.IContentObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((uri!=null)) {
_data.writeInt(1);
uri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((notifyForDescendentsn)?(1):(0)));
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerContentObserver, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void unregisterContentObserver(android.database.IContentObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterContentObserver, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void notifyChange(android.net.Uri uri, android.database.IContentObserver observer, boolean observerWantsSelfNotifications, boolean syncToNetwork) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((uri!=null)) {
_data.writeInt(1);
uri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
_data.writeInt(((observerWantsSelfNotifications)?(1):(0)));
_data.writeInt(((syncToNetwork)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyChange, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void startSync(android.net.Uri url, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((url!=null)) {
_data.writeInt(1);
url.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void cancelSync(android.net.Uri uri) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((uri!=null)) {
_data.writeInt(1);
uri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_cancelSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Check if the provider should be synced when a network tickle is received
     * @param providerName the provider whose setting we are querying
     * @return true of the provider should be synced when a network tickle is received
     */
public boolean getSyncProviderAutomatically(java.lang.String providerName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(providerName);
mRemote.transact(Stub.TRANSACTION_getSyncProviderAutomatically, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set whether or not the provider is synced when it receives a network tickle.
     *
     * @param providerName the provider whose behavior is being controlled
     * @param sync true if the provider should be synced when tickles are received for it
     */
public void setSyncProviderAutomatically(java.lang.String providerName, boolean sync) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(providerName);
_data.writeInt(((sync)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setSyncProviderAutomatically, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setListenForNetworkTickles(boolean flag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((flag)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setListenForNetworkTickles, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean getListenForNetworkTickles() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getListenForNetworkTickles, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns true if there is currently a sync operation for the given
     * account or authority in the pending list, or actively being processed.
     */
public boolean isSyncActive(java.lang.String account, java.lang.String authority) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(account);
_data.writeString(authority);
mRemote.transact(Stub.TRANSACTION_isSyncActive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.content.ActiveSyncInfo getActiveSync() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ActiveSyncInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSync, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ActiveSyncInfo.CREATOR.createFromParcel(_reply);
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
/**
     * Returns the status that matches the authority. If there are multiples accounts for
     * the authority, the one with the latest "lastSuccessTime" status is returned.
     * @param authority the authority whose row should be selected
     * @return the SyncStatusInfo for the authority, or null if none exists
     */
public android.content.SyncStatusInfo getStatusByAuthority(java.lang.String authority) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.SyncStatusInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(authority);
mRemote.transact(Stub.TRANSACTION_getStatusByAuthority, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.SyncStatusInfo.CREATOR.createFromParcel(_reply);
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
/**
     * Return true if the pending status is true of any matching authorities.
     */
public boolean isAuthorityPending(java.lang.String account, java.lang.String authority) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(account);
_data.writeString(authority);
mRemote.transact(Stub.TRANSACTION_isAuthorityPending, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void addStatusChangeListener(int mask, android.content.ISyncStatusObserver callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mask);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addStatusChangeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void removeStatusChangeListener(android.content.ISyncStatusObserver callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeStatusChangeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerContentObserver = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterContentObserver = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_notifyChange = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startSync = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_cancelSync = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getSyncProviderAutomatically = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setSyncProviderAutomatically = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setListenForNetworkTickles = (IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getListenForNetworkTickles = (IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_isSyncActive = (IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getActiveSync = (IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getStatusByAuthority = (IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_isAuthorityPending = (IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_addStatusChangeListener = (IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_removeStatusChangeListener = (IBinder.FIRST_CALL_TRANSACTION + 14);
}
public void registerContentObserver(android.net.Uri uri, boolean notifyForDescendentsn, android.database.IContentObserver observer) throws android.os.RemoteException;
public void unregisterContentObserver(android.database.IContentObserver observer) throws android.os.RemoteException;
public void notifyChange(android.net.Uri uri, android.database.IContentObserver observer, boolean observerWantsSelfNotifications, boolean syncToNetwork) throws android.os.RemoteException;
public void startSync(android.net.Uri url, android.os.Bundle extras) throws android.os.RemoteException;
public void cancelSync(android.net.Uri uri) throws android.os.RemoteException;
/**
     * Check if the provider should be synced when a network tickle is received
     * @param providerName the provider whose setting we are querying
     * @return true of the provider should be synced when a network tickle is received
     */
public boolean getSyncProviderAutomatically(java.lang.String providerName) throws android.os.RemoteException;
/**
     * Set whether or not the provider is synced when it receives a network tickle.
     *
     * @param providerName the provider whose behavior is being controlled
     * @param sync true if the provider should be synced when tickles are received for it
     */
public void setSyncProviderAutomatically(java.lang.String providerName, boolean sync) throws android.os.RemoteException;
public void setListenForNetworkTickles(boolean flag) throws android.os.RemoteException;
public boolean getListenForNetworkTickles() throws android.os.RemoteException;
/**
     * Returns true if there is currently a sync operation for the given
     * account or authority in the pending list, or actively being processed.
     */
public boolean isSyncActive(java.lang.String account, java.lang.String authority) throws android.os.RemoteException;
public android.content.ActiveSyncInfo getActiveSync() throws android.os.RemoteException;
/**
     * Returns the status that matches the authority. If there are multiples accounts for
     * the authority, the one with the latest "lastSuccessTime" status is returned.
     * @param authority the authority whose row should be selected
     * @return the SyncStatusInfo for the authority, or null if none exists
     */
public android.content.SyncStatusInfo getStatusByAuthority(java.lang.String authority) throws android.os.RemoteException;
/**
     * Return true if the pending status is true of any matching authorities.
     */
public boolean isAuthorityPending(java.lang.String account, java.lang.String authority) throws android.os.RemoteException;
public void addStatusChangeListener(int mask, android.content.ISyncStatusObserver callback) throws android.os.RemoteException;
public void removeStatusChangeListener(android.content.ISyncStatusObserver callback) throws android.os.RemoteException;
}
