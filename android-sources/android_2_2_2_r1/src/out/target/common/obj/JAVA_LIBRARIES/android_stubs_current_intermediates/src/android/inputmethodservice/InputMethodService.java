package android.inputmethodservice;
public class InputMethodService
  extends android.inputmethodservice.AbstractInputMethodService
{
public class InputMethodImpl
  extends android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl
{
public  InputMethodImpl() { throw new RuntimeException("Stub!"); }
public  void attachToken(android.os.IBinder token) { throw new RuntimeException("Stub!"); }
public  void bindInput(android.view.inputmethod.InputBinding binding) { throw new RuntimeException("Stub!"); }
public  void unbindInput() { throw new RuntimeException("Stub!"); }
public  void startInput(android.view.inputmethod.InputConnection ic, android.view.inputmethod.EditorInfo attribute) { throw new RuntimeException("Stub!"); }
public  void restartInput(android.view.inputmethod.InputConnection ic, android.view.inputmethod.EditorInfo attribute) { throw new RuntimeException("Stub!"); }
public  void hideSoftInput(int flags, android.os.ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); }
public  void showSoftInput(int flags, android.os.ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); }
}
public class InputMethodSessionImpl
  extends android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl
{
public  InputMethodSessionImpl() { throw new RuntimeException("Stub!"); }
public  void finishInput() { throw new RuntimeException("Stub!"); }
public  void displayCompletions(android.view.inputmethod.CompletionInfo[] completions) { throw new RuntimeException("Stub!"); }
public  void updateExtractedText(int token, android.view.inputmethod.ExtractedText text) { throw new RuntimeException("Stub!"); }
public  void updateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) { throw new RuntimeException("Stub!"); }
public  void updateCursor(android.graphics.Rect newCursor) { throw new RuntimeException("Stub!"); }
public  void appPrivateCommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
public  void toggleSoftInput(int showFlags, int hideFlags) { throw new RuntimeException("Stub!"); }
}
public static final class Insets
{
public  Insets() { throw new RuntimeException("Stub!"); }
public int contentTopInsets;
public int visibleTopInsets;
public static final int TOUCHABLE_INSETS_FRAME = 0;
public static final int TOUCHABLE_INSETS_CONTENT = 1;
public static final int TOUCHABLE_INSETS_VISIBLE = 2;
public int touchableInsets;
}
public  InputMethodService() { throw new RuntimeException("Stub!"); }
public  void setTheme(int theme) { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onInitializeInterface() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() { throw new RuntimeException("Stub!"); }
public  android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() { throw new RuntimeException("Stub!"); }
public  android.view.LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
public  android.app.Dialog getWindow() { throw new RuntimeException("Stub!"); }
public  int getMaxWidth() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputBinding getCurrentInputBinding() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputConnection getCurrentInputConnection() { throw new RuntimeException("Stub!"); }
public  boolean getCurrentInputStarted() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() { throw new RuntimeException("Stub!"); }
public  void updateFullscreenMode() { throw new RuntimeException("Stub!"); }
public  void onConfigureWindow(android.view.Window win, boolean isFullscreen, boolean isCandidatesOnly) { throw new RuntimeException("Stub!"); }
public  boolean isFullscreenMode() { throw new RuntimeException("Stub!"); }
public  boolean onEvaluateFullscreenMode() { throw new RuntimeException("Stub!"); }
public  void setExtractViewShown(boolean shown) { throw new RuntimeException("Stub!"); }
public  boolean isExtractViewShown() { throw new RuntimeException("Stub!"); }
public  void onComputeInsets(android.inputmethodservice.InputMethodService.Insets outInsets) { throw new RuntimeException("Stub!"); }
public  void updateInputViewShown() { throw new RuntimeException("Stub!"); }
public  boolean isShowInputRequested() { throw new RuntimeException("Stub!"); }
public  boolean isInputViewShown() { throw new RuntimeException("Stub!"); }
public  boolean onEvaluateInputViewShown() { throw new RuntimeException("Stub!"); }
public  void setCandidatesViewShown(boolean shown) { throw new RuntimeException("Stub!"); }
public  int getCandidatesHiddenVisibility() { throw new RuntimeException("Stub!"); }
public  void showStatusIcon(int iconResId) { throw new RuntimeException("Stub!"); }
public  void hideStatusIcon() { throw new RuntimeException("Stub!"); }
public  void switchInputMethod(java.lang.String id) { throw new RuntimeException("Stub!"); }
public  void setExtractView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void setCandidatesView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void setInputView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateExtractTextView() { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateCandidatesView() { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateInputView() { throw new RuntimeException("Stub!"); }
public  void onStartInputView(android.view.inputmethod.EditorInfo info, boolean restarting) { throw new RuntimeException("Stub!"); }
public  void onFinishInputView(boolean finishingInput) { throw new RuntimeException("Stub!"); }
public  void onStartCandidatesView(android.view.inputmethod.EditorInfo info, boolean restarting) { throw new RuntimeException("Stub!"); }
public  void onFinishCandidatesView(boolean finishingInput) { throw new RuntimeException("Stub!"); }
public  boolean onShowInputRequested(int flags, boolean configChange) { throw new RuntimeException("Stub!"); }
public  void showWindow(boolean showInput) { throw new RuntimeException("Stub!"); }
public  void hideWindow() { throw new RuntimeException("Stub!"); }
public  void onWindowShown() { throw new RuntimeException("Stub!"); }
public  void onWindowHidden() { throw new RuntimeException("Stub!"); }
public  void onBindInput() { throw new RuntimeException("Stub!"); }
public  void onUnbindInput() { throw new RuntimeException("Stub!"); }
public  void onStartInput(android.view.inputmethod.EditorInfo attribute, boolean restarting) { throw new RuntimeException("Stub!"); }
public  void onFinishInput() { throw new RuntimeException("Stub!"); }
public  void onDisplayCompletions(android.view.inputmethod.CompletionInfo[] completions) { throw new RuntimeException("Stub!"); }
public  void onUpdateExtractedText(int token, android.view.inputmethod.ExtractedText text) { throw new RuntimeException("Stub!"); }
public  void onUpdateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) { throw new RuntimeException("Stub!"); }
public  void onUpdateCursor(android.graphics.Rect newCursor) { throw new RuntimeException("Stub!"); }
public  void requestHideSelf(int flags) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyLongPress(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int count, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void onAppPrivateCommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
public  void sendDownUpKeyEvents(int keyEventCode) { throw new RuntimeException("Stub!"); }
public  boolean sendDefaultEditorAction(boolean fromEnterKey) { throw new RuntimeException("Stub!"); }
public  void sendKeyChar(char charCode) { throw new RuntimeException("Stub!"); }
public  void onExtractedSelectionChanged(int start, int end) { throw new RuntimeException("Stub!"); }
public  void onExtractedTextClicked() { throw new RuntimeException("Stub!"); }
public  void onExtractedCursorMovement(int dx, int dy) { throw new RuntimeException("Stub!"); }
public  boolean onExtractTextContextMenuItem(int id) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTextForImeAction(int imeOptions) { throw new RuntimeException("Stub!"); }
public  void onUpdateExtractingVisibility(android.view.inputmethod.EditorInfo ei) { throw new RuntimeException("Stub!"); }
public  void onUpdateExtractingViews(android.view.inputmethod.EditorInfo ei) { throw new RuntimeException("Stub!"); }
public  void onExtractingInputChanged(android.view.inputmethod.EditorInfo ei) { throw new RuntimeException("Stub!"); }
protected  void dump(java.io.FileDescriptor fd, java.io.PrintWriter fout, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
}
