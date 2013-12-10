package android.gesture;
public class Gesture
  implements android.os.Parcelable
{
public  Gesture() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<android.gesture.GestureStroke> getStrokes() { throw new RuntimeException("Stub!"); }
public  int getStrokesCount() { throw new RuntimeException("Stub!"); }
public  void addStroke(android.gesture.GestureStroke stroke) { throw new RuntimeException("Stub!"); }
public  float getLength() { throw new RuntimeException("Stub!"); }
public  android.graphics.RectF getBoundingBox() { throw new RuntimeException("Stub!"); }
public  android.graphics.Path toPath() { throw new RuntimeException("Stub!"); }
public  android.graphics.Path toPath(android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public  android.graphics.Path toPath(int width, int height, int edge, int numSample) { throw new RuntimeException("Stub!"); }
public  android.graphics.Path toPath(android.graphics.Path path, int width, int height, int edge, int numSample) { throw new RuntimeException("Stub!"); }
public  long getID() { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap toBitmap(int width, int height, int edge, int numSample, int color) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap toBitmap(int width, int height, int inset, int color) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.gesture.Gesture> CREATOR;
static { CREATOR = null; }
}
