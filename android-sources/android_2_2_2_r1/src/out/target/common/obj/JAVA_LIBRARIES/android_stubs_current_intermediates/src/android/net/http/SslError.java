package android.net.http;
public class SslError
{
public  SslError(int error, android.net.http.SslCertificate certificate) { throw new RuntimeException("Stub!"); }
public  SslError(int error, java.security.cert.X509Certificate certificate) { throw new RuntimeException("Stub!"); }
public  android.net.http.SslCertificate getCertificate() { throw new RuntimeException("Stub!"); }
public  boolean addError(int error) { throw new RuntimeException("Stub!"); }
public  boolean hasError(int error) { throw new RuntimeException("Stub!"); }
public  int getPrimaryError() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int SSL_NOTYETVALID = 0;
public static final int SSL_EXPIRED = 1;
public static final int SSL_IDMISMATCH = 2;
public static final int SSL_UNTRUSTED = 3;
public static final int SSL_MAX_ERROR = 4;
}
