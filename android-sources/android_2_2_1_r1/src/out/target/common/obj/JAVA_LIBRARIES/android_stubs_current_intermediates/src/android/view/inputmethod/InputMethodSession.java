package android.view.inputmethod;
public interface InputMethodSession
{
public static interface EventCallback
{
public abstract  void finishedEvent(int seq, boolean handled);
}
public abstract  void finishInput();
public abstract  void updateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd);
public abstract  void updateCursor(android.graphics.Rect newCursor);
public abstract  void displayCompletions(android.view.inputmethod.CompletionInfo[] completions);
public abstract  void updateExtractedText(int token, android.view.inputmethod.ExtractedText text);
public abstract  void dispatchKeyEvent(int seq, android.view.KeyEvent event, android.view.inputmethod.InputMethodSession.EventCallback callback);
public abstract  void dispatchTrackballEvent(int seq, android.view.MotionEvent event, android.view.inputmethod.InputMethodSession.EventCallback callback);
public abstract  void appPrivateCommand(java.lang.String action, android.os.Bundle data);
public abstract  void toggleSoftInput(int showFlags, int hideFlags);
}
