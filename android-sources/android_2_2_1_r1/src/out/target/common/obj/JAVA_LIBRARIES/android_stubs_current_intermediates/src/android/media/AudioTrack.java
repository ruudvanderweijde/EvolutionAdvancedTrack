package android.media;
public class AudioTrack
{
public static interface OnPlaybackPositionUpdateListener
{
public abstract  void onMarkerReached(android.media.AudioTrack track);
public abstract  void onPeriodicNotification(android.media.AudioTrack track);
}
public  AudioTrack(int streamType, int sampleRateInHz, int channelConfig, int audioFormat, int bufferSizeInBytes, int mode) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public static  float getMinVolume() { throw new RuntimeException("Stub!"); }
public static  float getMaxVolume() { throw new RuntimeException("Stub!"); }
public  int getSampleRate() { throw new RuntimeException("Stub!"); }
public  int getPlaybackRate() { throw new RuntimeException("Stub!"); }
public  int getAudioFormat() { throw new RuntimeException("Stub!"); }
public  int getStreamType() { throw new RuntimeException("Stub!"); }
public  int getChannelConfiguration() { throw new RuntimeException("Stub!"); }
public  int getChannelCount() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  int getPlayState() { throw new RuntimeException("Stub!"); }
protected  int getNativeFrameCount() { throw new RuntimeException("Stub!"); }
public  int getNotificationMarkerPosition() { throw new RuntimeException("Stub!"); }
public  int getPositionNotificationPeriod() { throw new RuntimeException("Stub!"); }
public  int getPlaybackHeadPosition() { throw new RuntimeException("Stub!"); }
public static  int getNativeOutputSampleRate(int streamType) { throw new RuntimeException("Stub!"); }
public static  int getMinBufferSize(int sampleRateInHz, int channelConfig, int audioFormat) { throw new RuntimeException("Stub!"); }
public  void setPlaybackPositionUpdateListener(android.media.AudioTrack.OnPlaybackPositionUpdateListener listener) { throw new RuntimeException("Stub!"); }
public  void setPlaybackPositionUpdateListener(android.media.AudioTrack.OnPlaybackPositionUpdateListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  int setStereoVolume(float leftVolume, float rightVolume) { throw new RuntimeException("Stub!"); }
public  int setPlaybackRate(int sampleRateInHz) { throw new RuntimeException("Stub!"); }
public  int setNotificationMarkerPosition(int markerInFrames) { throw new RuntimeException("Stub!"); }
public  int setPositionNotificationPeriod(int periodInFrames) { throw new RuntimeException("Stub!"); }
public  int setPlaybackHeadPosition(int positionInFrames) { throw new RuntimeException("Stub!"); }
public  int setLoopPoints(int startInFrames, int endInFrames, int loopCount) { throw new RuntimeException("Stub!"); }
protected  void setState(int state) { throw new RuntimeException("Stub!"); }
public  void play() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void stop() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void pause() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void flush() { throw new RuntimeException("Stub!"); }
public  int write(byte[] audioData, int offsetInBytes, int sizeInBytes) { throw new RuntimeException("Stub!"); }
public  int write(short[] audioData, int offsetInShorts, int sizeInShorts) { throw new RuntimeException("Stub!"); }
public  int reloadStaticData() { throw new RuntimeException("Stub!"); }
public static final int PLAYSTATE_STOPPED = 1;
public static final int PLAYSTATE_PAUSED = 2;
public static final int PLAYSTATE_PLAYING = 3;
public static final int MODE_STATIC = 0;
public static final int MODE_STREAM = 1;
public static final int STATE_UNINITIALIZED = 0;
public static final int STATE_INITIALIZED = 1;
public static final int STATE_NO_STATIC_DATA = 2;
public static final int SUCCESS = 0;
public static final int ERROR = -1;
public static final int ERROR_BAD_VALUE = -2;
public static final int ERROR_INVALID_OPERATION = -3;
}
