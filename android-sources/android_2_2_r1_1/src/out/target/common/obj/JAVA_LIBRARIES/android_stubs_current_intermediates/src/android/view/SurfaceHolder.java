package android.view;
public interface SurfaceHolder
{
public static class BadSurfaceTypeException
  extends java.lang.RuntimeException
{
public  BadSurfaceTypeException() { throw new RuntimeException("Stub!"); }
public  BadSurfaceTypeException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public static interface Callback
{
public abstract  void surfaceCreated(android.view.SurfaceHolder holder);
public abstract  void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height);
public abstract  void surfaceDestroyed(android.view.SurfaceHolder holder);
}
public abstract  void addCallback(android.view.SurfaceHolder.Callback callback);
public abstract  void removeCallback(android.view.SurfaceHolder.Callback callback);
public abstract  boolean isCreating();
public abstract  void setType(int type);
public abstract  void setFixedSize(int width, int height);
public abstract  void setSizeFromLayout();
public abstract  void setFormat(int format);
public abstract  void setKeepScreenOn(boolean screenOn);
public abstract  android.graphics.Canvas lockCanvas();
public abstract  android.graphics.Canvas lockCanvas(android.graphics.Rect dirty);
public abstract  void unlockCanvasAndPost(android.graphics.Canvas canvas);
public abstract  android.graphics.Rect getSurfaceFrame();
public abstract  android.view.Surface getSurface();
public static final int SURFACE_TYPE_NORMAL = 0;
public static final int SURFACE_TYPE_HARDWARE = 1;
public static final int SURFACE_TYPE_GPU = 2;
public static final int SURFACE_TYPE_PUSH_BUFFERS = 3;
}
