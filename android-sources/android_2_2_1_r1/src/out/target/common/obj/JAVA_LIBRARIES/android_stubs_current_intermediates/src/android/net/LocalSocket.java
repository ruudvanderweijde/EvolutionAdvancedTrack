package android.net;
public class LocalSocket
{
public  LocalSocket() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void connect(android.net.LocalSocketAddress endpoint) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void bind(android.net.LocalSocketAddress bindpoint) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.net.LocalSocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getInputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getOutputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void shutdownInput() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void shutdownOutput() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setReceiveBufferSize(int size) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getReceiveBufferSize() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSoTimeout(int n) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getSoTimeout() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSendBufferSize(int n) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getSendBufferSize() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.net.LocalSocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); }
public synchronized  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public synchronized  boolean isBound() { throw new RuntimeException("Stub!"); }
public  boolean isOutputShutdown() { throw new RuntimeException("Stub!"); }
public  boolean isInputShutdown() { throw new RuntimeException("Stub!"); }
public  void connect(android.net.LocalSocketAddress endpoint, int timeout) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setFileDescriptorsForSend(java.io.FileDescriptor[] fds) { throw new RuntimeException("Stub!"); }
public  java.io.FileDescriptor[] getAncillaryFileDescriptors() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.net.Credentials getPeerCredentials() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
}
