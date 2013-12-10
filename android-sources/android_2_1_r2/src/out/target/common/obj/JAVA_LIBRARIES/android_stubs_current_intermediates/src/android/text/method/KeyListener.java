package android.text.method;
public interface KeyListener
{
public abstract  int getInputType();
public abstract  boolean onKeyDown(android.view.View view, android.text.Editable text, int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyUp(android.view.View view, android.text.Editable text, int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyOther(android.view.View view, android.text.Editable text, android.view.KeyEvent event);
public abstract  void clearMetaKeyState(android.view.View view, android.text.Editable content, int states);
}
