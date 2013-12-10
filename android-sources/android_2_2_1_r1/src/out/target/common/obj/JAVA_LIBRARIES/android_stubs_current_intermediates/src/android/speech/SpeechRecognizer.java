package android.speech;
public class SpeechRecognizer
{
SpeechRecognizer() { throw new RuntimeException("Stub!"); }
public static  boolean isRecognitionAvailable(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  android.speech.SpeechRecognizer createSpeechRecognizer(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  android.speech.SpeechRecognizer createSpeechRecognizer(android.content.Context context, android.content.ComponentName serviceComponent) { throw new RuntimeException("Stub!"); }
public  void setRecognitionListener(android.speech.RecognitionListener listener) { throw new RuntimeException("Stub!"); }
public  void startListening(android.content.Intent recognizerIntent) { throw new RuntimeException("Stub!"); }
public  void stopListening() { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void destroy() { throw new RuntimeException("Stub!"); }
public static final java.lang.String RESULTS_RECOGNITION = "results_recognition";
public static final int ERROR_NETWORK_TIMEOUT = 1;
public static final int ERROR_NETWORK = 2;
public static final int ERROR_AUDIO = 3;
public static final int ERROR_SERVER = 4;
public static final int ERROR_CLIENT = 5;
public static final int ERROR_SPEECH_TIMEOUT = 6;
public static final int ERROR_NO_MATCH = 7;
public static final int ERROR_RECOGNIZER_BUSY = 8;
public static final int ERROR_INSUFFICIENT_PERMISSIONS = 9;
}
