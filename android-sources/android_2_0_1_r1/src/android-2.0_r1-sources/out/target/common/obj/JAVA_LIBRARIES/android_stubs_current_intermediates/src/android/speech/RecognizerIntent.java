package android.speech;
public class RecognizerIntent
{
RecognizerIntent() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_RECOGNIZE_SPEECH = "android.speech.action.RECOGNIZE_SPEECH";
public static final java.lang.String ACTION_WEB_SEARCH = "android.speech.action.WEB_SEARCH";
public static final java.lang.String EXTRA_LANGUAGE_MODEL = "android.speech.extra.LANGUAGE_MODEL";
public static final java.lang.String LANGUAGE_MODEL_FREE_FORM = "free_form";
public static final java.lang.String LANGUAGE_MODEL_WEB_SEARCH = "web_search";
public static final java.lang.String EXTRA_PROMPT = "android.speech.extra.PROMPT";
public static final java.lang.String EXTRA_LANGUAGE = "android.speech.extra.LANGUAGE";
public static final java.lang.String EXTRA_MAX_RESULTS = "android.speech.extra.MAX_RESULTS";
public static final java.lang.String EXTRA_RESULTS_PENDINGINTENT = "android.speech.extra.RESULTS_PENDINGINTENT";
public static final java.lang.String EXTRA_RESULTS_PENDINGINTENT_BUNDLE = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE";
public static final int RESULT_NO_MATCH = 1;
public static final int RESULT_CLIENT_ERROR = 2;
public static final int RESULT_SERVER_ERROR = 3;
public static final int RESULT_NETWORK_ERROR = 4;
public static final int RESULT_AUDIO_ERROR = 5;
public static final java.lang.String EXTRA_RESULTS = "android.speech.extra.RESULTS";
}
