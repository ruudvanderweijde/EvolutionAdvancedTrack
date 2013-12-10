package android.media;
public class MediaRecorder
{
public final class AudioSource
{
AudioSource() { throw new RuntimeException("Stub!"); }
public static final int DEFAULT = 0;
public static final int MIC = 1;
public static final int VOICE_UPLINK = 2;
public static final int VOICE_DOWNLINK = 3;
public static final int VOICE_CALL = 4;
public static final int CAMCORDER = 5;
public static final int VOICE_RECOGNITION = 6;
}
public final class VideoSource
{
VideoSource() { throw new RuntimeException("Stub!"); }
public static final int DEFAULT = 0;
public static final int CAMERA = 1;
}
public final class OutputFormat
{
OutputFormat() { throw new RuntimeException("Stub!"); }
public static final int DEFAULT = 0;
public static final int THREE_GPP = 1;
public static final int MPEG_4 = 2;
public static final int RAW_AMR = 3;
}
public final class AudioEncoder
{
AudioEncoder() { throw new RuntimeException("Stub!"); }
public static final int DEFAULT = 0;
public static final int AMR_NB = 1;
}
public final class VideoEncoder
{
VideoEncoder() { throw new RuntimeException("Stub!"); }
public static final int DEFAULT = 0;
public static final int H263 = 1;
public static final int H264 = 2;
public static final int MPEG_4_SP = 3;
}
public static interface OnErrorListener
{
public abstract  void onError(android.media.MediaRecorder mr, int what, int extra);
}
public static interface OnInfoListener
{
public abstract  void onInfo(android.media.MediaRecorder mr, int what, int extra);
}
public  MediaRecorder() { throw new RuntimeException("Stub!"); }
public native  void setCamera(android.hardware.Camera c);
public  void setPreviewDisplay(android.view.Surface sv) { throw new RuntimeException("Stub!"); }
public native  void setAudioSource(int audio_source) throws java.lang.IllegalStateException;
public static final  int getAudioSourceMax() { throw new RuntimeException("Stub!"); }
public native  void setVideoSource(int video_source) throws java.lang.IllegalStateException;
public native  void setOutputFormat(int output_format) throws java.lang.IllegalStateException;
public native  void setVideoSize(int width, int height) throws java.lang.IllegalStateException;
public native  void setVideoFrameRate(int rate) throws java.lang.IllegalStateException;
public native  void setMaxDuration(int max_duration_ms) throws java.lang.IllegalArgumentException;
public native  void setMaxFileSize(long max_filesize_bytes) throws java.lang.IllegalArgumentException;
public native  void setAudioEncoder(int audio_encoder) throws java.lang.IllegalStateException;
public native  void setVideoEncoder(int video_encoder) throws java.lang.IllegalStateException;
public  void setOutputFile(java.io.FileDescriptor fd) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setOutputFile(java.lang.String path) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void prepare() throws java.lang.IllegalStateException, java.io.IOException { throw new RuntimeException("Stub!"); }
public native  void start() throws java.lang.IllegalStateException;
public native  void stop() throws java.lang.IllegalStateException;
public  void reset() { throw new RuntimeException("Stub!"); }
public native  int getMaxAmplitude() throws java.lang.IllegalStateException;
public  void setOnErrorListener(android.media.MediaRecorder.OnErrorListener l) { throw new RuntimeException("Stub!"); }
public  void setOnInfoListener(android.media.MediaRecorder.OnInfoListener listener) { throw new RuntimeException("Stub!"); }
public native  void release();
protected  void finalize() { throw new RuntimeException("Stub!"); }
public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;
public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
}
