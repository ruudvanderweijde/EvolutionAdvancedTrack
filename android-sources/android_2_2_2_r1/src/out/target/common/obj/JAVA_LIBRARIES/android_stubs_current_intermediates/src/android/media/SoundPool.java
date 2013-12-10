package android.media;
public class SoundPool
{
public static interface OnLoadCompleteListener
{
public abstract  void onLoadComplete(android.media.SoundPool soundPool, int sampleId, int status);
}
public  SoundPool(int maxStreams, int streamType, int srcQuality) { throw new RuntimeException("Stub!"); }
public  int load(java.lang.String path, int priority) { throw new RuntimeException("Stub!"); }
public  int load(android.content.Context context, int resId, int priority) { throw new RuntimeException("Stub!"); }
public  int load(android.content.res.AssetFileDescriptor afd, int priority) { throw new RuntimeException("Stub!"); }
public  int load(java.io.FileDescriptor fd, long offset, long length, int priority) { throw new RuntimeException("Stub!"); }
public final native  boolean unload(int soundID);
public final native  int play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate);
public final native  void pause(int streamID);
public final native  void resume(int streamID);
public final native  void autoPause();
public final native  void autoResume();
public final native  void stop(int streamID);
public final native  void setVolume(int streamID, float leftVolume, float rightVolume);
public final native  void setPriority(int streamID, int priority);
public final native  void setLoop(int streamID, int loop);
public final native  void setRate(int streamID, float rate);
public  void setOnLoadCompleteListener(android.media.SoundPool.OnLoadCompleteListener listener) { throw new RuntimeException("Stub!"); }
public final native  void release();
protected  void finalize() { throw new RuntimeException("Stub!"); }
}
