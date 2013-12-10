package android.app;
public class WallpaperManager
{
WallpaperManager() { throw new RuntimeException("Stub!"); }
public static  android.app.WallpaperManager getInstance(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDrawable() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable peekDrawable() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getFastDrawable() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable peekFastDrawable() { throw new RuntimeException("Stub!"); }
public  android.app.WallpaperInfo getWallpaperInfo() { throw new RuntimeException("Stub!"); }
public  void setResource(int resid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setBitmap(android.graphics.Bitmap bitmap) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setStream(java.io.InputStream data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getDesiredMinimumWidth() { throw new RuntimeException("Stub!"); }
public  int getDesiredMinimumHeight() { throw new RuntimeException("Stub!"); }
public  void suggestDesiredDimensions(int minimumWidth, int minimumHeight) { throw new RuntimeException("Stub!"); }
public  void setWallpaperOffsets(android.os.IBinder windowToken, float xOffset, float yOffset) { throw new RuntimeException("Stub!"); }
public  void setWallpaperOffsetSteps(float xStep, float yStep) { throw new RuntimeException("Stub!"); }
public  void sendWallpaperCommand(android.os.IBinder windowToken, java.lang.String action, int x, int y, int z, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void clearWallpaperOffsets(android.os.IBinder windowToken) { throw new RuntimeException("Stub!"); }
public  void clear() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";
public static final java.lang.String COMMAND_TAP = "android.wallpaper.tap";
public static final java.lang.String COMMAND_DROP = "android.home.drop";
}
