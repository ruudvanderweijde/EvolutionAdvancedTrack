package android.os;
public class PatternMatcher
  implements android.os.Parcelable
{
public  PatternMatcher(java.lang.String pattern, int type) { throw new RuntimeException("Stub!"); }
public  PatternMatcher(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public final  int getType() { throw new RuntimeException("Stub!"); }
public  boolean match(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final int PATTERN_LITERAL = 0;
public static final int PATTERN_PREFIX = 1;
public static final int PATTERN_SIMPLE_GLOB = 2;
public static final android.os.Parcelable.Creator<android.os.PatternMatcher> CREATOR;
static { CREATOR = null; }
}
