package android.view.inputmethod;
public interface InputConnection
{
public abstract  java.lang.CharSequence getTextBeforeCursor(int n, int flags);
public abstract  java.lang.CharSequence getTextAfterCursor(int n, int flags);
public abstract  int getCursorCapsMode(int reqModes);
public abstract  android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest request, int flags);
public abstract  boolean deleteSurroundingText(int leftLength, int rightLength);
public abstract  boolean setComposingText(java.lang.CharSequence text, int newCursorPosition);
public abstract  boolean finishComposingText();
public abstract  boolean commitText(java.lang.CharSequence text, int newCursorPosition);
public abstract  boolean commitCompletion(android.view.inputmethod.CompletionInfo text);
public abstract  boolean setSelection(int start, int end);
public abstract  boolean performEditorAction(int editorAction);
public abstract  boolean performContextMenuAction(int id);
public abstract  boolean beginBatchEdit();
public abstract  boolean endBatchEdit();
public abstract  boolean sendKeyEvent(android.view.KeyEvent event);
public abstract  boolean clearMetaKeyStates(int states);
public abstract  boolean reportFullscreenMode(boolean enabled);
public abstract  boolean performPrivateCommand(java.lang.String action, android.os.Bundle data);
public static final int GET_TEXT_WITH_STYLES = 1;
public static final int GET_EXTRACTED_TEXT_MONITOR = 1;
}
