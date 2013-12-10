package android.hardware;
public class Camera
{
public static interface PreviewCallback
{
public abstract  void onPreviewFrame(byte[] data, android.hardware.Camera camera);
}
public static interface AutoFocusCallback
{
public abstract  void onAutoFocus(boolean success, android.hardware.Camera camera);
}
public static interface ShutterCallback
{
public abstract  void onShutter();
}
public static interface PictureCallback
{
public abstract  void onPictureTaken(byte[] data, android.hardware.Camera camera);
}
public static interface ErrorCallback
{
public abstract  void onError(int error, android.hardware.Camera camera);
}
public class Size
{
public  Size(int w, int h) { throw new RuntimeException("Stub!"); }
public int width;
public int height;
}
public class Parameters
{
Parameters() { throw new RuntimeException("Stub!"); }
public  java.lang.String flatten() { throw new RuntimeException("Stub!"); }
public  void unflatten(java.lang.String flattened) { throw new RuntimeException("Stub!"); }
public  void remove(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void set(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void set(java.lang.String key, int value) { throw new RuntimeException("Stub!"); }
public  java.lang.String get(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int getInt(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void setPreviewSize(int width, int height) { throw new RuntimeException("Stub!"); }
public  android.hardware.Camera.Size getPreviewSize() { throw new RuntimeException("Stub!"); }
public  void setPreviewFrameRate(int fps) { throw new RuntimeException("Stub!"); }
public  int getPreviewFrameRate() { throw new RuntimeException("Stub!"); }
public  void setPreviewFormat(int pixel_format) { throw new RuntimeException("Stub!"); }
public  int getPreviewFormat() { throw new RuntimeException("Stub!"); }
public  void setPictureSize(int width, int height) { throw new RuntimeException("Stub!"); }
public  android.hardware.Camera.Size getPictureSize() { throw new RuntimeException("Stub!"); }
public  void setPictureFormat(int pixel_format) { throw new RuntimeException("Stub!"); }
public  int getPictureFormat() { throw new RuntimeException("Stub!"); }
}
Camera() { throw new RuntimeException("Stub!"); }
public static  android.hardware.Camera open() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public final  void release() { throw new RuntimeException("Stub!"); }
public final  void setPreviewDisplay(android.view.SurfaceHolder holder) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final native  void startPreview();
public final native  void stopPreview();
public final  void setPreviewCallback(android.hardware.Camera.PreviewCallback cb) { throw new RuntimeException("Stub!"); }
public final  void setOneShotPreviewCallback(android.hardware.Camera.PreviewCallback cb) { throw new RuntimeException("Stub!"); }
public final  void autoFocus(android.hardware.Camera.AutoFocusCallback cb) { throw new RuntimeException("Stub!"); }
public final  void takePicture(android.hardware.Camera.ShutterCallback shutter, android.hardware.Camera.PictureCallback raw, android.hardware.Camera.PictureCallback jpeg) { throw new RuntimeException("Stub!"); }
public final  void setErrorCallback(android.hardware.Camera.ErrorCallback cb) { throw new RuntimeException("Stub!"); }
public  void setParameters(android.hardware.Camera.Parameters params) { throw new RuntimeException("Stub!"); }
public  android.hardware.Camera.Parameters getParameters() { throw new RuntimeException("Stub!"); }
public static final int CAMERA_ERROR_UNKNOWN = 1;
public static final int CAMERA_ERROR_SERVER_DIED = 100;
}
