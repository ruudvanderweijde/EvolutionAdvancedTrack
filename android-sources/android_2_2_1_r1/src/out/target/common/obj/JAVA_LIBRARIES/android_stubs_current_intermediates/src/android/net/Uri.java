package android.net;
public abstract class Uri
  implements android.os.Parcelable, java.lang.Comparable<android.net.Uri>
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder scheme(java.lang.String scheme) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder opaquePart(java.lang.String opaquePart) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder encodedOpaquePart(java.lang.String opaquePart) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder authority(java.lang.String authority) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder encodedAuthority(java.lang.String authority) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder path(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder encodedPath(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder appendPath(java.lang.String newSegment) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder appendEncodedPath(java.lang.String newSegment) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder query(java.lang.String query) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder encodedQuery(java.lang.String query) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder fragment(java.lang.String fragment) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder encodedFragment(java.lang.String fragment) { throw new RuntimeException("Stub!"); }
public  android.net.Uri.Builder appendQueryParameter(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.net.Uri build() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
Uri() { throw new RuntimeException("Stub!"); }
public abstract  boolean isHierarchical();
public  boolean isOpaque() { throw new RuntimeException("Stub!"); }
public abstract  boolean isRelative();
public  boolean isAbsolute() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getScheme();
public abstract  java.lang.String getSchemeSpecificPart();
public abstract  java.lang.String getEncodedSchemeSpecificPart();
public abstract  java.lang.String getAuthority();
public abstract  java.lang.String getEncodedAuthority();
public abstract  java.lang.String getUserInfo();
public abstract  java.lang.String getEncodedUserInfo();
public abstract  java.lang.String getHost();
public abstract  int getPort();
public abstract  java.lang.String getPath();
public abstract  java.lang.String getEncodedPath();
public abstract  java.lang.String getQuery();
public abstract  java.lang.String getEncodedQuery();
public abstract  java.lang.String getFragment();
public abstract  java.lang.String getEncodedFragment();
public abstract  java.util.List<java.lang.String> getPathSegments();
public abstract  java.lang.String getLastPathSegment();
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int compareTo(android.net.Uri other) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String toString();
public abstract  android.net.Uri.Builder buildUpon();
public static  android.net.Uri parse(java.lang.String uriString) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri fromFile(java.io.File file) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri fromParts(java.lang.String scheme, java.lang.String ssp, java.lang.String fragment) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getQueryParameters(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.String getQueryParameter(java.lang.String key) { throw new RuntimeException("Stub!"); }
public static  void writeToParcel(android.os.Parcel out, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  java.lang.String encode(java.lang.String s) { throw new RuntimeException("Stub!"); }
public static  java.lang.String encode(java.lang.String s, java.lang.String allow) { throw new RuntimeException("Stub!"); }
public static  java.lang.String decode(java.lang.String s) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri withAppendedPath(android.net.Uri baseUri, java.lang.String pathSegment) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri EMPTY;
public static final android.os.Parcelable.Creator<android.net.Uri> CREATOR;
static { EMPTY = null; CREATOR = null; }
}
