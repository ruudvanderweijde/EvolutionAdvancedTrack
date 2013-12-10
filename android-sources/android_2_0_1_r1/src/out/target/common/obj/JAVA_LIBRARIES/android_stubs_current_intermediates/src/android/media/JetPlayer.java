package android.media;
public class JetPlayer
{
public static interface OnJetEventListener
{
public abstract  void onJetEvent(android.media.JetPlayer player, short segment, byte track, byte channel, byte controller, byte value);
public abstract  void onJetUserIdUpdate(android.media.JetPlayer player, int userId, int repeatCount);
public abstract  void onJetNumQueuedSegmentUpdate(android.media.JetPlayer player, int nbSegments);
public abstract  void onJetPauseUpdate(android.media.JetPlayer player, int paused);
}
JetPlayer() { throw new RuntimeException("Stub!"); }
public static  android.media.JetPlayer getJetPlayer() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public static  int getMaxTracks() { throw new RuntimeException("Stub!"); }
public  boolean loadJetFile(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  boolean loadJetFile(android.content.res.AssetFileDescriptor afd) { throw new RuntimeException("Stub!"); }
public  boolean closeJetFile() { throw new RuntimeException("Stub!"); }
public  boolean play() { throw new RuntimeException("Stub!"); }
public  boolean pause() { throw new RuntimeException("Stub!"); }
public  boolean queueJetSegment(int segmentNum, int libNum, int repeatCount, int transpose, int muteFlags, byte userID) { throw new RuntimeException("Stub!"); }
public  boolean queueJetSegmentMuteArray(int segmentNum, int libNum, int repeatCount, int transpose, boolean[] muteArray, byte userID) { throw new RuntimeException("Stub!"); }
public  boolean setMuteFlags(int muteFlags, boolean sync) { throw new RuntimeException("Stub!"); }
public  boolean setMuteArray(boolean[] muteArray, boolean sync) { throw new RuntimeException("Stub!"); }
public  boolean setMuteFlag(int trackId, boolean muteFlag, boolean sync) { throw new RuntimeException("Stub!"); }
public  boolean triggerClip(int clipId) { throw new RuntimeException("Stub!"); }
public  boolean clearQueue() { throw new RuntimeException("Stub!"); }
public  void setEventListener(android.media.JetPlayer.OnJetEventListener listener) { throw new RuntimeException("Stub!"); }
public  void setEventListener(android.media.JetPlayer.OnJetEventListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
}
