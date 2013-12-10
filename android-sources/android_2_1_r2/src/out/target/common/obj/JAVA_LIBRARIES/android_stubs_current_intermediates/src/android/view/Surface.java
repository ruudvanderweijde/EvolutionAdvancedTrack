package android.view;
public class Surface
  implements android.os.Parcelable
{
public static class OutOfResourcesException
  extends java.lang.Exception
{
public  OutOfResourcesException() { throw new RuntimeException("Stub!"); }
public  OutOfResourcesException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
Surface() { throw new RuntimeException("Stub!"); }
public native  boolean isValid();
public  android.graphics.Canvas lockCanvas(android.graphics.Rect dirty) throws android.view.Surface.OutOfResourcesException, java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public native  void unlockCanvasAndPost(android.graphics.Canvas canvas);
public native  void unlockCanvas(android.graphics.Canvas canvas);
public static  void setOrientation(int display, int orientation) { throw new RuntimeException("Stub!"); }
public native  void setLayer(int zorder);
public native  void setPosition(int x, int y);
public native  void setSize(int w, int h);
public native  void hide();
public native  void show();
public native  void setTransparentRegionHint(android.graphics.Region region);
public native  void setAlpha(float alpha);
public native  void setMatrix(float dsdx, float dtdx, float dsdy, float dtdy);
public native  void freeze();
public native  void unfreeze();
public native  void setFreezeTint(int tint);
public native  void setFlags(int flags, int mask);
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public native  void readFromParcel(android.os.Parcel source);
public native  void writeToParcel(android.os.Parcel dest, int flags);
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int HIDDEN = 4;
public static final int HARDWARE = 16;
public static final int GPU = 40;
public static final int SECURE = 128;
public static final int NON_PREMULTIPLIED = 256;
public static final int PUSH_BUFFERS = 512;
public static final int FX_SURFACE_NORMAL = 0;
public static final int FX_SURFACE_BLUR = 65536;
public static final int FX_SURFACE_DIM = 131072;
public static final int FX_SURFACE_MASK = 983040;
public static final int SURFACE_HIDDEN = 1;
public static final int SURFACE_FROZEN = 2;
public static final int SURACE_FROZEN = 2;
public static final int SURFACE_DITHER = 4;
public static final int SURFACE_BLUR_FREEZE = 16;
public static final int ROTATION_0 = 0;
public static final int ROTATION_90 = 1;
public static final int ROTATION_180 = 2;
public static final int ROTATION_270 = 3;
public static final android.os.Parcelable.Creator<android.view.Surface> CREATOR;
static { CREATOR = null; }
}
