package android.graphics;
public class Region
  implements android.os.Parcelable
{
public static enum Op
{
DIFFERENCE(),
INTERSECT(),
REPLACE(),
REVERSE_DIFFERENCE(),
UNION(),
XOR();
}
public  Region() { throw new RuntimeException("Stub!"); }
public  Region(android.graphics.Region region) { throw new RuntimeException("Stub!"); }
public  Region(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  Region(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setEmpty() { throw new RuntimeException("Stub!"); }
public  boolean set(android.graphics.Region region) { throw new RuntimeException("Stub!"); }
public  boolean set(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  boolean set(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  boolean setPath(android.graphics.Path path, android.graphics.Region clip) { throw new RuntimeException("Stub!"); }
public native  boolean isEmpty();
public native  boolean isRect();
public native  boolean isComplex();
public  android.graphics.Rect getBounds() { throw new RuntimeException("Stub!"); }
public  boolean getBounds(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  android.graphics.Path getBoundaryPath() { throw new RuntimeException("Stub!"); }
public  boolean getBoundaryPath(android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public native  boolean contains(int x, int y);
public  boolean quickContains(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public native  boolean quickContains(int left, int top, int right, int bottom);
public  boolean quickReject(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public native  boolean quickReject(int left, int top, int right, int bottom);
public native  boolean quickReject(android.graphics.Region rgn);
public  void translate(int dx, int dy) { throw new RuntimeException("Stub!"); }
public native  void translate(int dx, int dy, android.graphics.Region dst);
public final  boolean union(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  boolean op(android.graphics.Rect r, android.graphics.Region.Op op) { throw new RuntimeException("Stub!"); }
public  boolean op(int left, int top, int right, int bottom, android.graphics.Region.Op op) { throw new RuntimeException("Stub!"); }
public  boolean op(android.graphics.Region region, android.graphics.Region.Op op) { throw new RuntimeException("Stub!"); }
public  boolean op(android.graphics.Rect rect, android.graphics.Region region, android.graphics.Region.Op op) { throw new RuntimeException("Stub!"); }
public  boolean op(android.graphics.Region region1, android.graphics.Region region2, android.graphics.Region.Op op) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel p, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.graphics.Region> CREATOR;
static { CREATOR = null; }
}
