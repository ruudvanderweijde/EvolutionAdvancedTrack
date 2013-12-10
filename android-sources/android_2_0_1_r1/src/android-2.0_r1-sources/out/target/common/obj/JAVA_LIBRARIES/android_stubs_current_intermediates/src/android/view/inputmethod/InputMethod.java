package android.view.inputmethod;
public interface InputMethod
{
public static interface SessionCallback
{
public abstract  void sessionCreated(android.view.inputmethod.InputMethodSession session);
}
public abstract  void attachToken(android.os.IBinder token);
public abstract  void bindInput(android.view.inputmethod.InputBinding binding);
public abstract  void unbindInput();
public abstract  void startInput(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo info);
public abstract  void restartInput(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo attribute);
public abstract  void createSession(android.view.inputmethod.InputMethod.SessionCallback callback);
public abstract  void setSessionEnabled(android.view.inputmethod.InputMethodSession session, boolean enabled);
public abstract  void revokeSession(android.view.inputmethod.InputMethodSession session);
public abstract  void showSoftInput(int flags, android.os.ResultReceiver resultReceiver);
public abstract  void hideSoftInput(int flags, android.os.ResultReceiver resultReceiver);
public static final java.lang.String SERVICE_INTERFACE = "android.view.InputMethod";
public static final java.lang.String SERVICE_META_DATA = "android.view.im";
public static final int SHOW_EXPLICIT = 1;
public static final int SHOW_FORCED = 2;
}
