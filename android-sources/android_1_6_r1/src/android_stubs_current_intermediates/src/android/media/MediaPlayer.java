package android.media;
public class MediaPlayer
{
public static interface OnPreparedListener
{
public abstract  void onPrepared(android.media.MediaPlayer mp);
}
public static interface OnCompletionListener
{
public abstract  void onCompletion(android.media.MediaPlayer mp);
}
public static interface OnBufferingUpdateListener
{
public abstract  void onBufferingUpdate(android.media.MediaPlayer mp, int percent);
}
public static interface OnSeekCompleteListener
{
public abstract  void onSeekComplete(android.media.MediaPlayer mp);
}
public static interface OnVideoSizeChangedListener
{
public abstract  void onVideoSizeChanged(android.media.MediaPlayer mp, int width, int height);
}
public static interface OnErrorListener
{
public abstract  boolean onError(android.media.MediaPlayer mp, int what, int extra);
}
public static interface OnInfoListener
{
public abstract  boolean onInfo(android.media.MediaPlayer mp, int what, int extra);
}
public  MediaPlayer() { throw new RuntimeException("Stub!"); }
public  void setDisplay(android.view.SurfaceHolder sh) { throw new RuntimeException("Stub!"); }
public static  android.media.MediaPlayer create(android.content.Context context, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  android.media.MediaPlayer create(android.content.Context context, android.net.Uri uri, android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public static  android.media.MediaPlayer create(android.content.Context context, int resid) { throw new RuntimeException("Stub!"); }
public  void setDataSource(android.content.Context context, android.net.Uri uri) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public native  void setDataSource(java.lang.String path) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public  void setDataSource(java.io.FileDescriptor fd) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public native  void setDataSource(java.io.FileDescriptor fd, long offset, long length) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public native  void prepare() throws java.io.IOException, java.lang.IllegalStateException;
public native  void prepareAsync() throws java.lang.IllegalStateException;
public  void start() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void stop() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void pause() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setWakeMode(android.content.Context context, int mode) { throw new RuntimeException("Stub!"); }
public  void setScreenOnWhilePlaying(boolean screenOn) { throw new RuntimeException("Stub!"); }
public native  int getVideoWidth();
public native  int getVideoHeight();
public native  boolean isPlaying();
public native  void seekTo(int msec) throws java.lang.IllegalStateException;
public native  int getCurrentPosition();
public native  int getDuration();
public  void release() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public native  void setAudioStreamType(int streamtype);
public native  void setLooping(boolean looping);
public native  boolean isLooping();
public native  void setVolume(float leftVolume, float rightVolume);
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnBufferingUpdateListener(android.media.MediaPlayer.OnBufferingUpdateListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnVideoSizeChangedListener(android.media.MediaPlayer.OnVideoSizeChangedListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnErrorListener(android.media.MediaPlayer.OnErrorListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnInfoListener(android.media.MediaPlayer.OnInfoListener listener) { throw new RuntimeException("Stub!"); }
public static final int MEDIA_ERROR_UNKNOWN = 1;
public static final int MEDIA_ERROR_SERVER_DIED = 100;
public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
public static final int MEDIA_INFO_UNKNOWN = 1;
public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
}
