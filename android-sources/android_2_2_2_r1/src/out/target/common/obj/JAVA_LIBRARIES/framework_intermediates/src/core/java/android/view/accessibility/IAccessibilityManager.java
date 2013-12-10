/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/view/accessibility/IAccessibilityManager.aidl
 */
package android.view.accessibility;
/**
 * Interface implemented by the AccessibilityManagerService called by
 * the AccessibilityMasngers.
 *
 * @hide
 */
public interface IAccessibilityManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IAccessibilityManager
{
private static final java.lang.String DESCRIPTOR = "android.view.accessibility.IAccessibilityManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.accessibility.IAccessibilityManager interface,
 * generating a proxy if needed.
 */
public static android.view.accessibility.IAccessibilityManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.accessibility.IAccessibilityManager))) {
return ((android.view.accessibility.IAccessibilityManager)iin);
}
return new android.view.accessibility.IAccessibilityManager.Stub.Proxy(obj);
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
case TRANSACTION_addClient:
{
data.enforceInterface(DESCRIPTOR);
android.view.accessibility.IAccessibilityManagerClient _arg0;
_arg0 = android.view.accessibility.IAccessibilityManagerClient.Stub.asInterface(data.readStrongBinder());
this.addClient(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendAccessibilityEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.accessibility.AccessibilityEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.accessibility.AccessibilityEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.sendAccessibilityEvent(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAccessibilityServiceList:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.content.pm.ServiceInfo> _result = this.getAccessibilityServiceList();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_interrupt:
{
data.enforceInterface(DESCRIPTOR);
this.interrupt();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.accessibility.IAccessibilityManager
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
public void addClient(android.view.accessibility.IAccessibilityManagerClient client) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addClient, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent uiEvent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((uiEvent!=null)) {
_data.writeInt(1);
uiEvent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendAccessibilityEvent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<android.content.pm.ServiceInfo> getAccessibilityServiceList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ServiceInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAccessibilityServiceList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ServiceInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void interrupt() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_interrupt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_addClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_sendAccessibilityEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getAccessibilityServiceList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_interrupt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void addClient(android.view.accessibility.IAccessibilityManagerClient client) throws android.os.RemoteException;
public boolean sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent uiEvent) throws android.os.RemoteException;
public java.util.List<android.content.pm.ServiceInfo> getAccessibilityServiceList() throws android.os.RemoteException;
public void interrupt() throws android.os.RemoteException;
}
