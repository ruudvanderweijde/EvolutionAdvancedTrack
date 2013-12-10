package android.net;
public class SSLCertificateSocketFactory
  extends javax.net.ssl.SSLSocketFactory
{
public  SSLCertificateSocketFactory(int handshakeTimeoutMillis) { throw new RuntimeException("Stub!"); }
public static  javax.net.SocketFactory getDefault(int handshakeTimeoutMillis) { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLSocketFactory getDefault(int handshakeTimeoutMillis, android.net.SSLSessionCache cache) { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLSocketFactory getInsecure(int handshakeTimeoutMillis, android.net.SSLSessionCache cache) { throw new RuntimeException("Stub!"); }
public static  org.apache.http.conn.ssl.SSLSocketFactory getHttpSocketFactory(int handshakeTimeoutMillis, android.net.SSLSessionCache cache) { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket(java.net.Socket k, java.lang.String host, int port, boolean close) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket(java.net.InetAddress addr, int port, java.net.InetAddress localAddr, int localPort) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket(java.net.InetAddress addr, int port) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket(java.lang.String host, int port, java.net.InetAddress localAddr, int localPort) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket(java.lang.String host, int port) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getDefaultCipherSuites() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getSupportedCipherSuites() { throw new RuntimeException("Stub!"); }
}
