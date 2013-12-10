package android.opengl;
public class GLU
{
public  GLU() { throw new RuntimeException("Stub!"); }
public static  java.lang.String gluErrorString(int error) { throw new RuntimeException("Stub!"); }
public static  void gluLookAt(javax.microedition.khronos.opengles.GL10 gl, float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX, float upY, float upZ) { throw new RuntimeException("Stub!"); }
public static  void gluOrtho2D(javax.microedition.khronos.opengles.GL10 gl, float left, float right, float bottom, float top) { throw new RuntimeException("Stub!"); }
public static  void gluPerspective(javax.microedition.khronos.opengles.GL10 gl, float fovy, float aspect, float zNear, float zFar) { throw new RuntimeException("Stub!"); }
public static  int gluProject(float objX, float objY, float objZ, float[] model, int modelOffset, float[] project, int projectOffset, int[] view, int viewOffset, float[] win, int winOffset) { throw new RuntimeException("Stub!"); }
public static  int gluUnProject(float winX, float winY, float winZ, float[] model, int modelOffset, float[] project, int projectOffset, int[] view, int viewOffset, float[] obj, int objOffset) { throw new RuntimeException("Stub!"); }
}
