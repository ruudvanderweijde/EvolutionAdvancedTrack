package android.graphics;
public class RectF
  implements android.os.Parcelable
{
public  RectF() { throw new RuntimeException("Stub!"); }
public  RectF(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
public  RectF(android.graphics.RectF r) { throw new RuntimeException("Stub!"); }
public  RectF(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public final  float width() { throw new RuntimeException("Stub!"); }
public final  float height() { throw new RuntimeException("Stub!"); }
public final  float centerX() { throw new RuntimeException("Stub!"); }
public final  float centerY() { throw new RuntimeException("Stub!"); }
public  void setEmpty() { throw new RuntimeException("Stub!"); }
public  void set(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
public  void set(android.graphics.RectF src) { throw new RuntimeException("Stub!"); }
public  void set(android.graphics.Rect src) { throw new RuntimeException("Stub!"); }
public  void offset(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  void offsetTo(float newLeft, float newTop) { throw new RuntimeException("Stub!"); }
public  void inset(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  boolean contains(float x, float y) { throw new RuntimeException("Stub!"); }
public  boolean contains(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
public  boolean contains(android.graphics.RectF r) { throw new RuntimeException("Stub!"); }
public  boolean intersect(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
public  boolean intersect(android.graphics.RectF r) { throw new RuntimeException("Stub!"); }
public  boolean setIntersect(android.graphics.RectF a, android.graphics.RectF b) { throw new RuntimeException("Stub!"); }
public  boolean intersects(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
public static  boolean intersects(android.graphics.RectF a, android.graphics.RectF b) { throw new RuntimeException("Stub!"); }
public  void round(android.graphics.Rect dst) { throw new RuntimeException("Stub!"); }
public  void roundOut(android.graphics.Rect dst) { throw new RuntimeException("Stub!"); }
public  void union(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
public  void union(android.graphics.RectF r) { throw new RuntimeException("Stub!"); }
public  void union(float x, float y) { throw new RuntimeException("Stub!"); }
public  void sort() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public float left;
public float top;
public float right;
public float bottom;
public static final android.os.Parcelable.Creator<android.graphics.RectF> CREATOR;
static { CREATOR = null; }
}
