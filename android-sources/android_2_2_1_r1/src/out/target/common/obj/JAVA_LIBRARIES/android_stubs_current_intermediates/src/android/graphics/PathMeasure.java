package android.graphics;
public class PathMeasure
{
public  PathMeasure() { throw new RuntimeException("Stub!"); }
public  PathMeasure(android.graphics.Path path, boolean forceClosed) { throw new RuntimeException("Stub!"); }
public  void setPath(android.graphics.Path path, boolean forceClosed) { throw new RuntimeException("Stub!"); }
public  float getLength() { throw new RuntimeException("Stub!"); }
public  boolean getPosTan(float distance, float[] pos, float[] tan) { throw new RuntimeException("Stub!"); }
public  boolean getMatrix(float distance, android.graphics.Matrix matrix, int flags) { throw new RuntimeException("Stub!"); }
public  boolean getSegment(float startD, float stopD, android.graphics.Path dst, boolean startWithMoveTo) { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public  boolean nextContour() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int POSITION_MATRIX_FLAG = 1;
public static final int TANGENT_MATRIX_FLAG = 2;
}
