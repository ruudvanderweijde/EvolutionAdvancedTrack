package android.media;
public class AudioRecord
{
public static interface OnRecordPositionUpdateListener
{
public abstract  void onMarkerReached(android.media.AudioRecord recorder);
public abstract  void onPeriodicNotification(android.media.AudioRecord recorder);
}
public  AudioRecord(int audioSource, int sampleRateInHz, int channelConfig, int audioFormat, int bufferSizeInBytes) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  int getSampleRate() { throw new RuntimeException("Stub!"); }
public  int getAudioSource() { throw new RuntimeException("Stub!"); }
public  int getAudioFormat() { throw new RuntimeException("Stub!"); }
public  int getChannelConfiguration() { throw new RuntimeException("Stub!"); }
public  int getChannelCount() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  int getRecordingState() { throw new RuntimeException("Stub!"); }
public  int getNotificationMarkerPosition() { throw new RuntimeException("Stub!"); }
public  int getPositionNotificationPeriod() { throw new RuntimeException("Stub!"); }
public static  int getMinBufferSize(int sampleRateInHz, int channelConfig, int audioFormat) { throw new RuntimeException("Stub!"); }
public  void startRecording() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void stop() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int read(byte[] audioData, int offsetInBytes, int sizeInBytes) { throw new RuntimeException("Stub!"); }
public  int read(short[] audioData, int offsetInShorts, int sizeInShorts) { throw new RuntimeException("Stub!"); }
public  int read(java.nio.ByteBuffer audioBuffer, int sizeInBytes) { throw new RuntimeException("Stub!"); }
public  void setRecordPositionUpdateListener(android.media.AudioRecord.OnRecordPositionUpdateListener listener) { throw new RuntimeException("Stub!"); }
public  void setRecordPositionUpdateListener(android.media.AudioRecord.OnRecordPositionUpdateListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  int setNotificationMarkerPosition(int markerInFrames) { throw new RuntimeException("Stub!"); }
public  int setPositionNotificationPeriod(int periodInFrames) { throw new RuntimeException("Stub!"); }
public static final int STATE_UNINITIALIZED = 0;
public static final int STATE_INITIALIZED = 1;
public static final int RECORDSTATE_STOPPED = 1;
public static final int RECORDSTATE_RECORDING = 3;
public static final int SUCCESS = 0;
public static final int ERROR = -1;
public static final int ERROR_BAD_VALUE = -2;
public static final int ERROR_INVALID_OPERATION = -3;
}
