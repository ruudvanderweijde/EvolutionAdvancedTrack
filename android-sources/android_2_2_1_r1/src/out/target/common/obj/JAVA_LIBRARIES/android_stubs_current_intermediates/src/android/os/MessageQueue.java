package android.os;
public class MessageQueue
{
public static interface IdleHandler
{
public abstract  boolean queueIdle();
}
MessageQueue() { throw new RuntimeException("Stub!"); }
public final  void addIdleHandler(android.os.MessageQueue.IdleHandler handler) { throw new RuntimeException("Stub!"); }
public final  void removeIdleHandler(android.os.MessageQueue.IdleHandler handler) { throw new RuntimeException("Stub!"); }
}
