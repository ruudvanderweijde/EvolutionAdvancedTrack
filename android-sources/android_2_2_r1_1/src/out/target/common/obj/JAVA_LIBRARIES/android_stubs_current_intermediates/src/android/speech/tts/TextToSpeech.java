package android.speech.tts;
public class TextToSpeech
{
public static interface OnInitListener
{
public abstract  void onInit(int status);
}
public static interface OnUtteranceCompletedListener
{
public abstract  void onUtteranceCompleted(java.lang.String utteranceId);
}
public class Engine
{
public  Engine() { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_STREAM = 3;
public static final int CHECK_VOICE_DATA_PASS = 1;
public static final int CHECK_VOICE_DATA_FAIL = 0;
public static final int CHECK_VOICE_DATA_BAD_DATA = -1;
public static final int CHECK_VOICE_DATA_MISSING_DATA = -2;
public static final int CHECK_VOICE_DATA_MISSING_VOLUME = -3;
public static final java.lang.String ACTION_INSTALL_TTS_DATA = "android.speech.tts.engine.INSTALL_TTS_DATA";
public static final java.lang.String ACTION_TTS_DATA_INSTALLED = "android.speech.tts.engine.TTS_DATA_INSTALLED";
public static final java.lang.String ACTION_CHECK_TTS_DATA = "android.speech.tts.engine.CHECK_TTS_DATA";
public static final java.lang.String EXTRA_VOICE_DATA_ROOT_DIRECTORY = "dataRoot";
public static final java.lang.String EXTRA_VOICE_DATA_FILES = "dataFiles";
public static final java.lang.String EXTRA_VOICE_DATA_FILES_INFO = "dataFilesInfo";
public static final java.lang.String EXTRA_AVAILABLE_VOICES = "availableVoices";
public static final java.lang.String EXTRA_UNAVAILABLE_VOICES = "unavailableVoices";
public static final java.lang.String EXTRA_CHECK_VOICE_DATA_FOR = "checkVoiceDataFor";
public static final java.lang.String EXTRA_TTS_DATA_INSTALLED = "dataInstalled";
public static final java.lang.String KEY_PARAM_STREAM = "streamType";
public static final java.lang.String KEY_PARAM_UTTERANCE_ID = "utteranceId";
}
public  TextToSpeech(android.content.Context context, android.speech.tts.TextToSpeech.OnInitListener listener) { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
public  int addSpeech(java.lang.String text, java.lang.String packagename, int resourceId) { throw new RuntimeException("Stub!"); }
public  int addSpeech(java.lang.String text, java.lang.String filename) { throw new RuntimeException("Stub!"); }
public  int addEarcon(java.lang.String earcon, java.lang.String packagename, int resourceId) { throw new RuntimeException("Stub!"); }
public  int addEarcon(java.lang.String earcon, java.lang.String filename) { throw new RuntimeException("Stub!"); }
public  int speak(java.lang.String text, int queueMode, java.util.HashMap<java.lang.String, java.lang.String> params) { throw new RuntimeException("Stub!"); }
public  int playEarcon(java.lang.String earcon, int queueMode, java.util.HashMap<java.lang.String, java.lang.String> params) { throw new RuntimeException("Stub!"); }
public  int playSilence(long durationInMs, int queueMode, java.util.HashMap<java.lang.String, java.lang.String> params) { throw new RuntimeException("Stub!"); }
public  boolean isSpeaking() { throw new RuntimeException("Stub!"); }
public  int stop() { throw new RuntimeException("Stub!"); }
public  int setSpeechRate(float speechRate) { throw new RuntimeException("Stub!"); }
public  int setPitch(float pitch) { throw new RuntimeException("Stub!"); }
public  int setLanguage(java.util.Locale loc) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLanguage() { throw new RuntimeException("Stub!"); }
public  int isLanguageAvailable(java.util.Locale loc) { throw new RuntimeException("Stub!"); }
public  int synthesizeToFile(java.lang.String text, java.util.HashMap<java.lang.String, java.lang.String> params, java.lang.String filename) { throw new RuntimeException("Stub!"); }
public  int setOnUtteranceCompletedListener(android.speech.tts.TextToSpeech.OnUtteranceCompletedListener listener) { throw new RuntimeException("Stub!"); }
public  int setEngineByPackageName(java.lang.String enginePackageName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDefaultEngine() { throw new RuntimeException("Stub!"); }
public  boolean areDefaultsEnforced() { throw new RuntimeException("Stub!"); }
public static final int SUCCESS = 0;
public static final int ERROR = -1;
public static final int QUEUE_FLUSH = 0;
public static final int QUEUE_ADD = 1;
public static final int LANG_COUNTRY_VAR_AVAILABLE = 2;
public static final int LANG_COUNTRY_AVAILABLE = 1;
public static final int LANG_AVAILABLE = 0;
public static final int LANG_MISSING_DATA = -1;
public static final int LANG_NOT_SUPPORTED = -2;
public static final java.lang.String ACTION_TTS_QUEUE_PROCESSING_COMPLETED = "android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED";
}
