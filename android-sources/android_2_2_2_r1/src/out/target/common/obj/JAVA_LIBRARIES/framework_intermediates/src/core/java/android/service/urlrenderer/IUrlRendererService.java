/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/urlrenderer/IUrlRendererService.aidl
 */
package android.service.urlrenderer;
/**
 * {@hide}
 */
public interface IUrlRendererService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.urlrenderer.IUrlRendererService
{
private static final java.lang.String DESCRIPTOR = "android.service.urlrenderer.IUrlRendererService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.urlrenderer.IUrlRendererService interface,
 * generating a proxy if needed.
 */
public static android.service.urlrenderer.IUrlRendererService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.urlrenderer.IUrlRendererService))) {
return ((android.service.urlrenderer.IUrlRendererService)iin);
}
return new android.service.urlrenderer.IUrlRendererService.Stub.Proxy(obj);
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
case TRANSACTION_render:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.service.urlrenderer.IUrlRendererCallback _arg3;
_arg3 = android.service.urlrenderer.IUrlRendererCallback.Stub.asInterface(data.readStrongBinder());
this.render(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.urlrenderer.IUrlRendererService
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
public void render(java.util.List<java.lang.String> urls, int width, int height, android.service.urlrenderer.IUrlRendererCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(urls);
_data.writeInt(width);
_data.writeInt(height);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_render, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_render = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void render(java.util.List<java.lang.String> urls, int width, int height, android.service.urlrenderer.IUrlRendererCallback cb) throws android.os.RemoteException;
}
