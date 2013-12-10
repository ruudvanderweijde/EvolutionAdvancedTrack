/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/INetworkManagementService.aidl
 */
package android.os;
/**
 * @hide
 */
public interface INetworkManagementService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.INetworkManagementService
{
private static final java.lang.String DESCRIPTOR = "android.os.INetworkManagementService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.INetworkManagementService interface,
 * generating a proxy if needed.
 */
public static android.os.INetworkManagementService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.INetworkManagementService))) {
return ((android.os.INetworkManagementService)iin);
}
return new android.os.INetworkManagementService.Stub.Proxy(obj);
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
case TRANSACTION_registerObserver:
{
data.enforceInterface(DESCRIPTOR);
android.net.INetworkManagementEventObserver _arg0;
_arg0 = android.net.INetworkManagementEventObserver.Stub.asInterface(data.readStrongBinder());
this.registerObserver(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterObserver:
{
data.enforceInterface(DESCRIPTOR);
android.net.INetworkManagementEventObserver _arg0;
_arg0 = android.net.INetworkManagementEventObserver.Stub.asInterface(data.readStrongBinder());
this.unregisterObserver(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_listInterfaces:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.listInterfaces();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getInterfaceConfig:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.net.InterfaceConfiguration _result = this.getInterfaceConfig(_arg0);
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
case TRANSACTION_setInterfaceConfig:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.net.InterfaceConfiguration _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.InterfaceConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setInterfaceConfig(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
this.shutdown();
reply.writeNoException();
return true;
}
case TRANSACTION_getIpForwardingEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getIpForwardingEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setIpForwardingEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setIpForwardingEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startTethering:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _arg0;
_arg0 = data.createStringArray();
this.startTethering(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_stopTethering:
{
data.enforceInterface(DESCRIPTOR);
this.stopTethering();
reply.writeNoException();
return true;
}
case TRANSACTION_isTetheringStarted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isTetheringStarted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_tetherInterface:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.tetherInterface(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_untetherInterface:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.untetherInterface(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_listTetheredInterfaces:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.listTetheredInterfaces();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_setDnsForwarders:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _arg0;
_arg0 = data.createStringArray();
this.setDnsForwarders(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDnsForwarders:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getDnsForwarders();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_enableNat:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.enableNat(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_disableNat:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.disableNat(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_listTtys:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.listTtys();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_attachPppd:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
this.attachPppd(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_detachPppd:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.detachPppd(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startUsbRNDIS:
{
data.enforceInterface(DESCRIPTOR);
this.startUsbRNDIS();
reply.writeNoException();
return true;
}
case TRANSACTION_stopUsbRNDIS:
{
data.enforceInterface(DESCRIPTOR);
this.stopUsbRNDIS();
reply.writeNoException();
return true;
}
case TRANSACTION_isUsbRNDISStarted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isUsbRNDISStarted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startAccessPoint:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.WifiConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.WifiConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.startAccessPoint(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_stopAccessPoint:
{
data.enforceInterface(DESCRIPTOR);
this.stopAccessPoint();
reply.writeNoException();
return true;
}
case TRANSACTION_setAccessPoint:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.WifiConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.WifiConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.setAccessPoint(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getInterfaceTxCounter:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _result = this.getInterfaceTxCounter(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getInterfaceRxCounter:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _result = this.getInterfaceRxCounter(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setInterfaceThrottle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setInterfaceThrottle(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getInterfaceRxThrottle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getInterfaceRxThrottle(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getInterfaceTxThrottle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getInterfaceTxThrottle(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.INetworkManagementService
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
     ** GENERAL
     *//**
     * Register an observer to receive events
     */
public void registerObserver(android.net.INetworkManagementEventObserver obs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((obs!=null))?(obs.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerObserver, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Unregister an observer from receiving events.
     */
public void unregisterObserver(android.net.INetworkManagementEventObserver obs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((obs!=null))?(obs.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterObserver, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns a list of currently known network interfaces
     */
public java.lang.String[] listInterfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listInterfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Retrieves the specified interface config
     *
     */
public android.net.InterfaceConfiguration getInterfaceConfig(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.InterfaceConfiguration _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getInterfaceConfig, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.InterfaceConfiguration.CREATOR.createFromParcel(_reply);
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
     * Sets the configuration of the specified interface
     */
public void setInterfaceConfig(java.lang.String iface, android.net.InterfaceConfiguration cfg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
if ((cfg!=null)) {
_data.writeInt(1);
cfg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setInterfaceConfig, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Shuts down the service
     */
public void shutdown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     ** TETHERING RELATED
     *//**
     * Returns true if IP forwarding is enabled
     */
public boolean getIpForwardingEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getIpForwardingEnabled, _data, _reply, 0);
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
     * Enables/Disables IP Forwarding
     */
public void setIpForwardingEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setIpForwardingEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Start tethering services with the specified dhcp server range
     * arg is a set of start end pairs defining the ranges.
     */
public void startTethering(java.lang.String[] dhcpRanges) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringArray(dhcpRanges);
mRemote.transact(Stub.TRANSACTION_startTethering, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Stop currently running tethering services
     */
public void stopTethering() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopTethering, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns true if tethering services are started
     */
public boolean isTetheringStarted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isTetheringStarted, _data, _reply, 0);
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
     * Tethers the specified interface
     */
public void tetherInterface(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_tetherInterface, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Untethers the specified interface
     */
public void untetherInterface(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_untetherInterface, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns a list of currently tethered interfaces
     */
public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listTetheredInterfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets the list of DNS forwarders (in order of priority)
     */
public void setDnsForwarders(java.lang.String[] dns) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringArray(dns);
mRemote.transact(Stub.TRANSACTION_setDnsForwarders, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns the list of DNS fowarders (in order of priority)
     */
public java.lang.String[] getDnsForwarders() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDnsForwarders, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     *  Enables Network Address Translation between two interfaces.
     *  The address and netmask of the external interface is used for
     *  the NAT'ed network.
     */
public void enableNat(java.lang.String internalInterface, java.lang.String externalInterface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(internalInterface);
_data.writeString(externalInterface);
mRemote.transact(Stub.TRANSACTION_enableNat, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     *  Disables Network Address Translation between two interfaces.
     */
public void disableNat(java.lang.String internalInterface, java.lang.String externalInterface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(internalInterface);
_data.writeString(externalInterface);
mRemote.transact(Stub.TRANSACTION_disableNat, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     ** PPPD
     *//**
     * Returns the list of currently known TTY devices on the system
     */
public java.lang.String[] listTtys() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listTtys, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Attaches a PPP server daemon to the specified TTY with the specified
     * local/remote addresses.
     */
public void attachPppd(java.lang.String tty, java.lang.String localAddr, java.lang.String remoteAddr, java.lang.String dns1Addr, java.lang.String dns2Addr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(tty);
_data.writeString(localAddr);
_data.writeString(remoteAddr);
_data.writeString(dns1Addr);
_data.writeString(dns2Addr);
mRemote.transact(Stub.TRANSACTION_attachPppd, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Detaches a PPP server daemon from the specified TTY.
     */
public void detachPppd(java.lang.String tty) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(tty);
mRemote.transact(Stub.TRANSACTION_detachPppd, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Turn on USB RNDIS support - this will turn off thinks like adb/mass-storage
     */
public void startUsbRNDIS() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startUsbRNDIS, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Turn off USB RNDIS support
     */
public void stopUsbRNDIS() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopUsbRNDIS, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Check the status of USB RNDIS support
     */
public boolean isUsbRNDISStarted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isUsbRNDISStarted, _data, _reply, 0);
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
     * Start Wifi Access Point
     */
public void startAccessPoint(android.net.wifi.WifiConfiguration wifiConfig, java.lang.String wlanIface, java.lang.String softapIface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((wifiConfig!=null)) {
_data.writeInt(1);
wifiConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(wlanIface);
_data.writeString(softapIface);
mRemote.transact(Stub.TRANSACTION_startAccessPoint, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Stop Wifi Access Point
     */
public void stopAccessPoint() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopAccessPoint, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Set Access Point config
     */
public void setAccessPoint(android.net.wifi.WifiConfiguration wifiConfig, java.lang.String wlanIface, java.lang.String softapIface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((wifiConfig!=null)) {
_data.writeInt(1);
wifiConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(wlanIface);
_data.writeString(softapIface);
mRemote.transact(Stub.TRANSACTION_setAccessPoint, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Read number of bytes sent over an interface
     */
public long getInterfaceTxCounter(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getInterfaceTxCounter, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Read number of bytes received over an interface
     */
public long getInterfaceRxCounter(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getInterfaceRxCounter, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Configures bandwidth throttling on an interface
     */
public void setInterfaceThrottle(java.lang.String iface, int rxKbps, int txKbps) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
_data.writeInt(rxKbps);
_data.writeInt(txKbps);
mRemote.transact(Stub.TRANSACTION_setInterfaceThrottle, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns the currently configured RX throttle values
     * for the specified interface
     */
public int getInterfaceRxThrottle(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getInterfaceRxThrottle, _data, _reply, 0);
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
     * Returns the currently configured TX throttle values
     * for the specified interface
     */
public int getInterfaceTxThrottle(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getInterfaceTxThrottle, _data, _reply, 0);
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
static final int TRANSACTION_registerObserver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterObserver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_listInterfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getInterfaceConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setInterfaceConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getIpForwardingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setIpForwardingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_startTethering = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_stopTethering = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_isTetheringStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_tetherInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_untetherInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_listTetheredInterfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setDnsForwarders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getDnsForwarders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_enableNat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_disableNat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_listTtys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_attachPppd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_detachPppd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_startUsbRNDIS = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_stopUsbRNDIS = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_isUsbRNDISStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_startAccessPoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_stopAccessPoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_setAccessPoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getInterfaceTxCounter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getInterfaceRxCounter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_setInterfaceThrottle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getInterfaceRxThrottle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getInterfaceTxThrottle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
}
/**
     ** GENERAL
     *//**
     * Register an observer to receive events
     */
public void registerObserver(android.net.INetworkManagementEventObserver obs) throws android.os.RemoteException;
/**
     * Unregister an observer from receiving events.
     */
public void unregisterObserver(android.net.INetworkManagementEventObserver obs) throws android.os.RemoteException;
/**
     * Returns a list of currently known network interfaces
     */
public java.lang.String[] listInterfaces() throws android.os.RemoteException;
/**
     * Retrieves the specified interface config
     *
     */
public android.net.InterfaceConfiguration getInterfaceConfig(java.lang.String iface) throws android.os.RemoteException;
/**
     * Sets the configuration of the specified interface
     */
public void setInterfaceConfig(java.lang.String iface, android.net.InterfaceConfiguration cfg) throws android.os.RemoteException;
/**
     * Shuts down the service
     */
public void shutdown() throws android.os.RemoteException;
/**
     ** TETHERING RELATED
     *//**
     * Returns true if IP forwarding is enabled
     */
public boolean getIpForwardingEnabled() throws android.os.RemoteException;
/**
     * Enables/Disables IP Forwarding
     */
public void setIpForwardingEnabled(boolean enabled) throws android.os.RemoteException;
/**
     * Start tethering services with the specified dhcp server range
     * arg is a set of start end pairs defining the ranges.
     */
public void startTethering(java.lang.String[] dhcpRanges) throws android.os.RemoteException;
/**
     * Stop currently running tethering services
     */
public void stopTethering() throws android.os.RemoteException;
/**
     * Returns true if tethering services are started
     */
public boolean isTetheringStarted() throws android.os.RemoteException;
/**
     * Tethers the specified interface
     */
public void tetherInterface(java.lang.String iface) throws android.os.RemoteException;
/**
     * Untethers the specified interface
     */
public void untetherInterface(java.lang.String iface) throws android.os.RemoteException;
/**
     * Returns a list of currently tethered interfaces
     */
public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException;
/**
     * Sets the list of DNS forwarders (in order of priority)
     */
public void setDnsForwarders(java.lang.String[] dns) throws android.os.RemoteException;
/**
     * Returns the list of DNS fowarders (in order of priority)
     */
public java.lang.String[] getDnsForwarders() throws android.os.RemoteException;
/**
     *  Enables Network Address Translation between two interfaces.
     *  The address and netmask of the external interface is used for
     *  the NAT'ed network.
     */
public void enableNat(java.lang.String internalInterface, java.lang.String externalInterface) throws android.os.RemoteException;
/**
     *  Disables Network Address Translation between two interfaces.
     */
public void disableNat(java.lang.String internalInterface, java.lang.String externalInterface) throws android.os.RemoteException;
/**
     ** PPPD
     *//**
     * Returns the list of currently known TTY devices on the system
     */
public java.lang.String[] listTtys() throws android.os.RemoteException;
/**
     * Attaches a PPP server daemon to the specified TTY with the specified
     * local/remote addresses.
     */
public void attachPppd(java.lang.String tty, java.lang.String localAddr, java.lang.String remoteAddr, java.lang.String dns1Addr, java.lang.String dns2Addr) throws android.os.RemoteException;
/**
     * Detaches a PPP server daemon from the specified TTY.
     */
public void detachPppd(java.lang.String tty) throws android.os.RemoteException;
/**
     * Turn on USB RNDIS support - this will turn off thinks like adb/mass-storage
     */
public void startUsbRNDIS() throws android.os.RemoteException;
/**
     * Turn off USB RNDIS support
     */
public void stopUsbRNDIS() throws android.os.RemoteException;
/**
     * Check the status of USB RNDIS support
     */
public boolean isUsbRNDISStarted() throws android.os.RemoteException;
/**
     * Start Wifi Access Point
     */
public void startAccessPoint(android.net.wifi.WifiConfiguration wifiConfig, java.lang.String wlanIface, java.lang.String softapIface) throws android.os.RemoteException;
/**
     * Stop Wifi Access Point
     */
public void stopAccessPoint() throws android.os.RemoteException;
/**
     * Set Access Point config
     */
public void setAccessPoint(android.net.wifi.WifiConfiguration wifiConfig, java.lang.String wlanIface, java.lang.String softapIface) throws android.os.RemoteException;
/**
     * Read number of bytes sent over an interface
     */
public long getInterfaceTxCounter(java.lang.String iface) throws android.os.RemoteException;
/**
     * Read number of bytes received over an interface
     */
public long getInterfaceRxCounter(java.lang.String iface) throws android.os.RemoteException;
/**
     * Configures bandwidth throttling on an interface
     */
public void setInterfaceThrottle(java.lang.String iface, int rxKbps, int txKbps) throws android.os.RemoteException;
/**
     * Returns the currently configured RX throttle values
     * for the specified interface
     */
public int getInterfaceRxThrottle(java.lang.String iface) throws android.os.RemoteException;
/**
     * Returns the currently configured TX throttle values
     * for the specified interface
     */
public int getInterfaceTxThrottle(java.lang.String iface) throws android.os.RemoteException;
}
