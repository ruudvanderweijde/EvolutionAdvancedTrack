package android.opengl;
public class GLES10Ext
{
public  GLES10Ext() { throw new RuntimeException("Stub!"); }
public static native  int glQueryMatrixxOES(int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset);
public static native  int glQueryMatrixxOES(java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent);
}
