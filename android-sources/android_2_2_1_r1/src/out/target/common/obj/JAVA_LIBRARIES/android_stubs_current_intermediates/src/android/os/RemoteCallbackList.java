package android.os;
public class RemoteCallbackList<E extends android.os.IInterface>
{
public  RemoteCallbackList() { throw new RuntimeException("Stub!"); }
public  boolean register(E callback) { throw new RuntimeException("Stub!"); }
public  boolean register(E callback, java.lang.Object cookie) { throw new RuntimeException("Stub!"); }
public  boolean unregister(E callback) { throw new RuntimeException("Stub!"); }
public  void kill() { throw new RuntimeException("Stub!"); }
public  void onCallbackDied(E callback) { throw new RuntimeException("Stub!"); }
public  void onCallbackDied(E callback, java.lang.Object cookie) { throw new RuntimeException("Stub!"); }
public  int beginBroadcast() { throw new RuntimeException("Stub!"); }
public  E getBroadcastItem(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getBroadcastCookie(int index) { throw new RuntimeException("Stub!"); }
public  void finishBroadcast() { throw new RuntimeException("Stub!"); }
}
