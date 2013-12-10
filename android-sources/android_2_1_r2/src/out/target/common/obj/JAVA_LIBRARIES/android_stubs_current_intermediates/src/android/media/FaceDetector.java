package android.media;
public class FaceDetector
{
public class Face
{
Face() { throw new RuntimeException("Stub!"); }
public  float confidence() { throw new RuntimeException("Stub!"); }
public  void getMidPoint(android.graphics.PointF point) { throw new RuntimeException("Stub!"); }
public  float eyesDistance() { throw new RuntimeException("Stub!"); }
public  float pose(int euler) { throw new RuntimeException("Stub!"); }
public static final float CONFIDENCE_THRESHOLD = 0.4f;
public static final int EULER_X = 0;
public static final int EULER_Y = 1;
public static final int EULER_Z = 2;
}
public  FaceDetector(int width, int height, int maxFaces) { throw new RuntimeException("Stub!"); }
public  int findFaces(android.graphics.Bitmap bitmap, android.media.FaceDetector.Face[] faces) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
