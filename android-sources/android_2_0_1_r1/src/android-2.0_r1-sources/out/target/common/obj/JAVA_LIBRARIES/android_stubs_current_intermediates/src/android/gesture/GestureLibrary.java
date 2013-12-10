package android.gesture;
public abstract class GestureLibrary
{
protected  GestureLibrary() { throw new RuntimeException("Stub!"); }
public abstract  boolean save();
public abstract  boolean load();
public  boolean isReadOnly() { throw new RuntimeException("Stub!"); }
public  void setOrientationStyle(int style) { throw new RuntimeException("Stub!"); }
public  int getOrientationStyle() { throw new RuntimeException("Stub!"); }
public  void setSequenceType(int type) { throw new RuntimeException("Stub!"); }
public  int getSequenceType() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getGestureEntries() { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<android.gesture.Prediction> recognize(android.gesture.Gesture gesture) { throw new RuntimeException("Stub!"); }
public  void addGesture(java.lang.String entryName, android.gesture.Gesture gesture) { throw new RuntimeException("Stub!"); }
public  void removeGesture(java.lang.String entryName, android.gesture.Gesture gesture) { throw new RuntimeException("Stub!"); }
public  void removeEntry(java.lang.String entryName) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<android.gesture.Gesture> getGestures(java.lang.String entryName) { throw new RuntimeException("Stub!"); }
protected final android.gesture.GestureStore mStore;
}
