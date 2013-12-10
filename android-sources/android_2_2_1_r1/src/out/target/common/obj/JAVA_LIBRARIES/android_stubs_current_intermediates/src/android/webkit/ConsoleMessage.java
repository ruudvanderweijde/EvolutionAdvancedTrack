package android.webkit;
public class ConsoleMessage
{
public static enum MessageLevel
{
DEBUG(),
ERROR(),
LOG(),
TIP(),
WARNING();
}
public  ConsoleMessage(java.lang.String message, java.lang.String sourceId, int lineNumber, android.webkit.ConsoleMessage.MessageLevel msgLevel) { throw new RuntimeException("Stub!"); }
public  android.webkit.ConsoleMessage.MessageLevel messageLevel() { throw new RuntimeException("Stub!"); }
public  java.lang.String message() { throw new RuntimeException("Stub!"); }
public  java.lang.String sourceId() { throw new RuntimeException("Stub!"); }
public  int lineNumber() { throw new RuntimeException("Stub!"); }
}
