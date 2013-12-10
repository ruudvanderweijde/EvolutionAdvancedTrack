package android.speech;
public interface RecognitionListener
{
public abstract  void onReadyForSpeech(android.os.Bundle params);
public abstract  void onBeginningOfSpeech();
public abstract  void onRmsChanged(float rmsdB);
public abstract  void onBufferReceived(byte[] buffer);
public abstract  void onEndOfSpeech();
public abstract  void onError(int error);
public abstract  void onResults(android.os.Bundle results);
public abstract  void onPartialResults(android.os.Bundle partialResults);
public abstract  void onEvent(int eventType, android.os.Bundle params);
}
