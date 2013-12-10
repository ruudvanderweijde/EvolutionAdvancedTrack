package android.view;
public final class MotionEvent
  implements android.os.Parcelable
{
MotionEvent() { throw new RuntimeException("Stub!"); }
public static  android.view.MotionEvent obtain(long downTime, long eventTime, int action, float x, float y, float pressure, float size, int metaState, float xPrecision, float yPrecision, int deviceId, int edgeFlags) { throw new RuntimeException("Stub!"); }
public static  android.view.MotionEvent obtain(long downTime, long eventTime, int action, int pointers, float x, float y, float pressure, float size, int metaState, float xPrecision, float yPrecision, int deviceId, int edgeFlags) { throw new RuntimeException("Stub!"); }
public static  android.view.MotionEvent obtain(long downTime, long eventTime, int action, float x, float y, int metaState) { throw new RuntimeException("Stub!"); }
public static  android.view.MotionEvent obtain(android.view.MotionEvent o) { throw new RuntimeException("Stub!"); }
public static  android.view.MotionEvent obtainNoHistory(android.view.MotionEvent o) { throw new RuntimeException("Stub!"); }
public  void recycle() { throw new RuntimeException("Stub!"); }
public final  int getAction() { throw new RuntimeException("Stub!"); }
public final  int getActionMasked() { throw new RuntimeException("Stub!"); }
public final  int getActionIndex() { throw new RuntimeException("Stub!"); }
public final  long getDownTime() { throw new RuntimeException("Stub!"); }
public final  long getEventTime() { throw new RuntimeException("Stub!"); }
public final  float getX() { throw new RuntimeException("Stub!"); }
public final  float getY() { throw new RuntimeException("Stub!"); }
public final  float getPressure() { throw new RuntimeException("Stub!"); }
public final  float getSize() { throw new RuntimeException("Stub!"); }
public final  int getPointerCount() { throw new RuntimeException("Stub!"); }
public final  int getPointerId(int pointerIndex) { throw new RuntimeException("Stub!"); }
public final  int findPointerIndex(int pointerId) { throw new RuntimeException("Stub!"); }
public final  float getX(int pointerIndex) { throw new RuntimeException("Stub!"); }
public final  float getY(int pointerIndex) { throw new RuntimeException("Stub!"); }
public final  float getPressure(int pointerIndex) { throw new RuntimeException("Stub!"); }
public final  float getSize(int pointerIndex) { throw new RuntimeException("Stub!"); }
public final  int getMetaState() { throw new RuntimeException("Stub!"); }
public final  float getRawX() { throw new RuntimeException("Stub!"); }
public final  float getRawY() { throw new RuntimeException("Stub!"); }
public final  float getXPrecision() { throw new RuntimeException("Stub!"); }
public final  float getYPrecision() { throw new RuntimeException("Stub!"); }
public final  int getHistorySize() { throw new RuntimeException("Stub!"); }
public final  long getHistoricalEventTime(int pos) { throw new RuntimeException("Stub!"); }
public final  float getHistoricalX(int pos) { throw new RuntimeException("Stub!"); }
public final  float getHistoricalY(int pos) { throw new RuntimeException("Stub!"); }
public final  float getHistoricalPressure(int pos) { throw new RuntimeException("Stub!"); }
public final  float getHistoricalSize(int pos) { throw new RuntimeException("Stub!"); }
public final  float getHistoricalX(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); }
public final  float getHistoricalY(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); }
public final  float getHistoricalPressure(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); }
public final  float getHistoricalSize(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); }
public final  int getDeviceId() { throw new RuntimeException("Stub!"); }
public final  int getEdgeFlags() { throw new RuntimeException("Stub!"); }
public final  void setEdgeFlags(int flags) { throw new RuntimeException("Stub!"); }
public final  void setAction(int action) { throw new RuntimeException("Stub!"); }
public final  void offsetLocation(float deltaX, float deltaY) { throw new RuntimeException("Stub!"); }
public final  void setLocation(float x, float y) { throw new RuntimeException("Stub!"); }
public final  void addBatch(long eventTime, float x, float y, float pressure, float size, int metaState) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final int ACTION_MASK = 255;
public static final int ACTION_DOWN = 0;
public static final int ACTION_UP = 1;
public static final int ACTION_MOVE = 2;
public static final int ACTION_CANCEL = 3;
public static final int ACTION_OUTSIDE = 4;
public static final int ACTION_POINTER_DOWN = 5;
public static final int ACTION_POINTER_UP = 6;
public static final int ACTION_POINTER_INDEX_MASK = 65280;
public static final int ACTION_POINTER_INDEX_SHIFT = 8;
public static final int ACTION_POINTER_1_DOWN = 5;
public static final int ACTION_POINTER_2_DOWN = 261;
public static final int ACTION_POINTER_3_DOWN = 517;
public static final int ACTION_POINTER_1_UP = 6;
public static final int ACTION_POINTER_2_UP = 262;
public static final int ACTION_POINTER_3_UP = 518;
public static final int ACTION_POINTER_ID_MASK = 65280;
public static final int ACTION_POINTER_ID_SHIFT = 8;
public static final int EDGE_TOP = 1;
public static final int EDGE_BOTTOM = 2;
public static final int EDGE_LEFT = 4;
public static final int EDGE_RIGHT = 8;
public static final android.os.Parcelable.Creator<android.view.MotionEvent> CREATOR;
static { CREATOR = null; }
}
