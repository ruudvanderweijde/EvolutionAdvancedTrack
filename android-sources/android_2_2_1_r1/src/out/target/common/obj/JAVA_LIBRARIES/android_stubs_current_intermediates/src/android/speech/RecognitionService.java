package android.speech;
public abstract class RecognitionService
  extends android.app.Service
{
public class Callback
{
Callback() { throw new RuntimeException("Stub!"); }
public  void beginningOfSpeech() throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void bufferReceived(byte[] buffer) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void endOfSpeech() throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void error(int error) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void partialResults(android.os.Bundle partialResults) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void readyForSpeech(android.os.Bundle params) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void results(android.os.Bundle results) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void rmsChanged(float rmsdB) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
}
public  RecognitionService() { throw new RuntimeException("Stub!"); }
protected abstract  void onStartListening(android.content.Intent recognizerIntent, android.speech.RecognitionService.Callback listener);
protected abstract  void onCancel(android.speech.RecognitionService.Callback listener);
protected abstract  void onStopListening(android.speech.RecognitionService.Callback listener);
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.speech.RecognitionService";
public static final java.lang.String SERVICE_META_DATA = "android.speech";
}
