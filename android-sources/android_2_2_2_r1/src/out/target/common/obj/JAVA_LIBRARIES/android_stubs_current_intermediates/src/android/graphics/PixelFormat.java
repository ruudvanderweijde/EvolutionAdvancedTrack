package android.graphics;
public class PixelFormat
{
public  PixelFormat() { throw new RuntimeException("Stub!"); }
public static native  void getPixelFormatInfo(int format, android.graphics.PixelFormat info);
public static  boolean formatHasAlpha(int format) { throw new RuntimeException("Stub!"); }
public static final int UNKNOWN = 0;
public static final int TRANSLUCENT = -3;
public static final int TRANSPARENT = -2;
public static final int OPAQUE = -1;
public static final int RGBA_8888 = 1;
public static final int RGBX_8888 = 2;
public static final int RGB_888 = 3;
public static final int RGB_565 = 4;
public static final int RGBA_5551 = 6;
public static final int RGBA_4444 = 7;
public static final int A_8 = 8;
public static final int L_8 = 9;
public static final int LA_88 = 10;
public static final int RGB_332 = 11;
public static final int YCbCr_422_SP = 16;
public static final int YCbCr_420_SP = 17;
public static final int YCbCr_422_I = 20;
public static final int JPEG = 256;
public int bytesPerPixel;
public int bitsPerPixel;
}
