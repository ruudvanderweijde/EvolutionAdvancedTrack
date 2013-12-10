package android.net.http;
public class SslCertificate
{
public class DName
{
public  DName(java.lang.String dName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUName() { throw new RuntimeException("Stub!"); }
}
public  SslCertificate(java.lang.String issuedTo, java.lang.String issuedBy, java.lang.String validNotBefore, java.lang.String validNotAfter) { throw new RuntimeException("Stub!"); }
public  SslCertificate(java.lang.String issuedTo, java.lang.String issuedBy, java.util.Date validNotBefore, java.util.Date validNotAfter) { throw new RuntimeException("Stub!"); }
public  SslCertificate(java.security.cert.X509Certificate certificate) { throw new RuntimeException("Stub!"); }
public static  android.os.Bundle saveState(android.net.http.SslCertificate certificate) { throw new RuntimeException("Stub!"); }
public static  android.net.http.SslCertificate restoreState(android.os.Bundle bundle) { throw new RuntimeException("Stub!"); }
public  java.util.Date getValidNotBeforeDate() { throw new RuntimeException("Stub!"); }
public  java.lang.String getValidNotBefore() { throw new RuntimeException("Stub!"); }
public  java.util.Date getValidNotAfterDate() { throw new RuntimeException("Stub!"); }
public  java.lang.String getValidNotAfter() { throw new RuntimeException("Stub!"); }
public  android.net.http.SslCertificate.DName getIssuedTo() { throw new RuntimeException("Stub!"); }
public  android.net.http.SslCertificate.DName getIssuedBy() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
