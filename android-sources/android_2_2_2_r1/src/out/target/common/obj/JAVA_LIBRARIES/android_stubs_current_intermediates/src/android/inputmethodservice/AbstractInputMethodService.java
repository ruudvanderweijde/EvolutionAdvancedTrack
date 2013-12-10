package android.inputmethodservice;
public abstract class AbstractInputMethodService
  extends android.app.Service
  implements android.view.KeyEvent.Callback
{
public abstract class AbstractInputMethodImpl
  implements android.view.inputmethod.InputMethod
{
public  AbstractInputMethodImpl() { throw new RuntimeException("Stub!"); }
public  void createSession(android.view.inputmethod.InputMethod.SessionCallback callback) { throw new RuntimeException("Stub!"); }
public  void setSessionEnabled(android.view.inputmethod.InputMethodSession session, boolean enabled) { throw new RuntimeException("Stub!"); }
public  void revokeSession(android.view.inputmethod.InputMethodSession session) { throw new RuntimeException("Stub!"); }
}
public abstract class AbstractInputMethodSessionImpl
  implements android.view.inputmethod.InputMethodSession
{
public  AbstractInputMethodSessionImpl() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isRevoked() { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void revokeSelf() { throw new RuntimeException("Stub!"); }
public  void dispatchKeyEvent(int seq, android.view.KeyEvent event, android.view.inputmethod.InputMethodSession.EventCallback callback) { throw new RuntimeException("Stub!"); }
public  void dispatchTrackballEvent(int seq, android.view.MotionEvent event, android.view.inputmethod.InputMethodSession.EventCallback callback) { throw new RuntimeException("Stub!"); }
}
public  AbstractInputMethodService() { throw new RuntimeException("Stub!"); }
public  android.view.KeyEvent.DispatcherState getKeyDispatcherState() { throw new RuntimeException("Stub!"); }
public abstract  android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface();
public abstract  android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface();
protected  void dump(java.io.FileDescriptor fd, java.io.PrintWriter fout, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
}
