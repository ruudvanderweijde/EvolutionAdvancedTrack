/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/ISearchManager.aidl
 */
package android.app;
/** @hide */
public interface ISearchManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.ISearchManager
{
private static final java.lang.String DESCRIPTOR = "android.app.ISearchManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.ISearchManager interface,
 * generating a proxy if needed.
 */
public static android.app.ISearchManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.ISearchManager))) {
return ((android.app.ISearchManager)iin);
}
return new android.app.ISearchManager.Stub.Proxy(obj);
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
case TRANSACTION_getSearchableInfo:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
android.server.search.SearchableInfo _result = this.getSearchableInfo(_arg0, _arg1);
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
case TRANSACTION_getSearchablesInGlobalSearch:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.server.search.SearchableInfo> _result = this.getSearchablesInGlobalSearch();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getSearchablesForWebSearch:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.server.search.SearchableInfo> _result = this.getSearchablesForWebSearch();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getDefaultSearchableForWebSearch:
{
data.enforceInterface(DESCRIPTOR);
android.server.search.SearchableInfo _result = this.getDefaultSearchableForWebSearch();
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
case TRANSACTION_setDefaultWebSearch:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setDefaultWebSearch(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startSearch:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.content.ComponentName _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
boolean _arg4;
_arg4 = (0!=data.readInt());
android.app.ISearchManagerCallback _arg5;
_arg5 = android.app.ISearchManagerCallback.Stub.asInterface(data.readStrongBinder());
int _arg6;
_arg6 = data.readInt();
this.startSearch(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_triggerSearch:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.app.ISearchManagerCallback _arg3;
_arg3 = android.app.ISearchManagerCallback.Stub.asInterface(data.readStrongBinder());
int _arg4;
_arg4 = data.readInt();
this.triggerSearch(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_stopSearch:
{
data.enforceInterface(DESCRIPTOR);
this.stopSearch();
reply.writeNoException();
return true;
}
case TRANSACTION_isVisible:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isVisible();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.ISearchManager
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
public android.server.search.SearchableInfo getSearchableInfo(android.content.ComponentName launchActivity, boolean globalSearch) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.server.search.SearchableInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((launchActivity!=null)) {
_data.writeInt(1);
launchActivity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((globalSearch)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getSearchableInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.server.search.SearchableInfo.CREATOR.createFromParcel(_reply);
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
public java.util.List<android.server.search.SearchableInfo> getSearchablesInGlobalSearch() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.server.search.SearchableInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSearchablesInGlobalSearch, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.server.search.SearchableInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<android.server.search.SearchableInfo> getSearchablesForWebSearch() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.server.search.SearchableInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSearchablesForWebSearch, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.server.search.SearchableInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.server.search.SearchableInfo getDefaultSearchableForWebSearch() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.server.search.SearchableInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultSearchableForWebSearch, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.server.search.SearchableInfo.CREATOR.createFromParcel(_reply);
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
public void setDefaultWebSearch(android.content.ComponentName component) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setDefaultWebSearch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void startSearch(java.lang.String initialQuery, boolean selectInitialQuery, android.content.ComponentName launchActivity, android.os.Bundle appSearchData, boolean globalSearch, android.app.ISearchManagerCallback searchManagerCallback, int ident) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(initialQuery);
_data.writeInt(((selectInitialQuery)?(1):(0)));
if ((launchActivity!=null)) {
_data.writeInt(1);
launchActivity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((appSearchData!=null)) {
_data.writeInt(1);
appSearchData.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((globalSearch)?(1):(0)));
_data.writeStrongBinder((((searchManagerCallback!=null))?(searchManagerCallback.asBinder()):(null)));
_data.writeInt(ident);
mRemote.transact(Stub.TRANSACTION_startSearch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void triggerSearch(java.lang.String query, android.content.ComponentName launchActivity, android.os.Bundle appSearchData, android.app.ISearchManagerCallback searchManagerCallback, int ident) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(query);
if ((launchActivity!=null)) {
_data.writeInt(1);
launchActivity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((appSearchData!=null)) {
_data.writeInt(1);
appSearchData.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((searchManagerCallback!=null))?(searchManagerCallback.asBinder()):(null)));
_data.writeInt(ident);
mRemote.transact(Stub.TRANSACTION_triggerSearch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void stopSearch() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopSearch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean isVisible() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isVisible, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getSearchableInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getSearchablesInGlobalSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getSearchablesForWebSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getDefaultSearchableForWebSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setDefaultWebSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_startSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_triggerSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_stopSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_isVisible = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public android.server.search.SearchableInfo getSearchableInfo(android.content.ComponentName launchActivity, boolean globalSearch) throws android.os.RemoteException;
public java.util.List<android.server.search.SearchableInfo> getSearchablesInGlobalSearch() throws android.os.RemoteException;
public java.util.List<android.server.search.SearchableInfo> getSearchablesForWebSearch() throws android.os.RemoteException;
public android.server.search.SearchableInfo getDefaultSearchableForWebSearch() throws android.os.RemoteException;
public void setDefaultWebSearch(android.content.ComponentName component) throws android.os.RemoteException;
public void startSearch(java.lang.String initialQuery, boolean selectInitialQuery, android.content.ComponentName launchActivity, android.os.Bundle appSearchData, boolean globalSearch, android.app.ISearchManagerCallback searchManagerCallback, int ident) throws android.os.RemoteException;
public void triggerSearch(java.lang.String query, android.content.ComponentName launchActivity, android.os.Bundle appSearchData, android.app.ISearchManagerCallback searchManagerCallback, int ident) throws android.os.RemoteException;
public void stopSearch() throws android.os.RemoteException;
public boolean isVisible() throws android.os.RemoteException;
}
