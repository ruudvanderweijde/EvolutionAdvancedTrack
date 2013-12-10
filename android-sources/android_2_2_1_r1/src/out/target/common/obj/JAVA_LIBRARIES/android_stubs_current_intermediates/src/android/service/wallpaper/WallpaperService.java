package android.service.wallpaper;
public abstract class WallpaperService
  extends android.app.Service
{
public class Engine
{
public  Engine() { throw new RuntimeException("Stub!"); }
public  android.view.SurfaceHolder getSurfaceHolder() { throw new RuntimeException("Stub!"); }
public  int getDesiredMinimumWidth() { throw new RuntimeException("Stub!"); }
public  int getDesiredMinimumHeight() { throw new RuntimeException("Stub!"); }
public  boolean isVisible() { throw new RuntimeException("Stub!"); }
public  boolean isPreview() { throw new RuntimeException("Stub!"); }
public  void setTouchEventsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void onCreate(android.view.SurfaceHolder surfaceHolder) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  void onVisibilityChanged(boolean visible) { throw new RuntimeException("Stub!"); }
public  void onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep, int xPixelOffset, int yPixelOffset) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle onCommand(java.lang.String action, int x, int y, int z, android.os.Bundle extras, boolean resultRequested) { throw new RuntimeException("Stub!"); }
public  void onDesiredSizeChanged(int desiredWidth, int desiredHeight) { throw new RuntimeException("Stub!"); }
public  void onSurfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) { throw new RuntimeException("Stub!"); }
public  void onSurfaceCreated(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public  void onSurfaceDestroyed(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
}
public  WallpaperService() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  android.service.wallpaper.WallpaperService.Engine onCreateEngine();
public static final java.lang.String SERVICE_INTERFACE = "android.service.wallpaper.WallpaperService";
public static final java.lang.String SERVICE_META_DATA = "android.service.wallpaper";
}
