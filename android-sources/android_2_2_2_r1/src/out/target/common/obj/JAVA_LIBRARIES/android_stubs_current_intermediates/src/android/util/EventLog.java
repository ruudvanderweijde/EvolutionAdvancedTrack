package android.util;
public class EventLog
{
public static final class Event
{
Event() { throw new RuntimeException("Stub!"); }
public  int getProcessId() { throw new RuntimeException("Stub!"); }
public  int getThreadId() { throw new RuntimeException("Stub!"); }
public  long getTimeNanos() { throw new RuntimeException("Stub!"); }
public  int getTag() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.Object getData() { throw new RuntimeException("Stub!"); }
}
public  EventLog() { throw new RuntimeException("Stub!"); }
public static native  int writeEvent(int tag, int value);
public static native  int writeEvent(int tag, long value);
public static native  int writeEvent(int tag, java.lang.String str);
public static native  int writeEvent(int tag, java.lang.Object... list);
public static native  void readEvents(int[] tags, java.util.Collection<android.util.EventLog.Event> output) throws java.io.IOException;
public static  java.lang.String getTagName(int tag) { throw new RuntimeException("Stub!"); }
public static  int getTagCode(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
