package android.view.inputmethod;
public class InputConnectionWrapper
  implements android.view.inputmethod.InputConnection
{
public  InputConnectionWrapper(android.view.inputmethod.InputConnection target, boolean mutable) { throw new RuntimeException("Stub!"); }
public  void setTarget(android.view.inputmethod.InputConnection target) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTextBeforeCursor(int n, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTextAfterCursor(int n, int flags) { throw new RuntimeException("Stub!"); }
public  int getCursorCapsMode(int reqModes) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest request, int flags) { throw new RuntimeException("Stub!"); }
public  boolean deleteSurroundingText(int leftLength, int rightLength) { throw new RuntimeException("Stub!"); }
public  boolean setComposingText(java.lang.CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); }
public  boolean finishComposingText() { throw new RuntimeException("Stub!"); }
public  boolean commitText(java.lang.CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); }
public  boolean commitCompletion(android.view.inputmethod.CompletionInfo text) { throw new RuntimeException("Stub!"); }
public  boolean setSelection(int start, int end) { throw new RuntimeException("Stub!"); }
public  boolean performEditorAction(int editorAction) { throw new RuntimeException("Stub!"); }
public  boolean performContextMenuAction(int id) { throw new RuntimeException("Stub!"); }
public  boolean beginBatchEdit() { throw new RuntimeException("Stub!"); }
public  boolean endBatchEdit() { throw new RuntimeException("Stub!"); }
public  boolean sendKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean clearMetaKeyStates(int states) { throw new RuntimeException("Stub!"); }
public  boolean reportFullscreenMode(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean performPrivateCommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
}
