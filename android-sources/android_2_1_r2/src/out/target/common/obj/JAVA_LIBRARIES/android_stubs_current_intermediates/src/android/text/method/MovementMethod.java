package android.text.method;
public interface MovementMethod
{
public abstract  void initialize(android.widget.TextView widget, android.text.Spannable text);
public abstract  boolean onKeyDown(android.widget.TextView widget, android.text.Spannable text, int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyUp(android.widget.TextView widget, android.text.Spannable text, int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyOther(android.widget.TextView view, android.text.Spannable text, android.view.KeyEvent event);
public abstract  void onTakeFocus(android.widget.TextView widget, android.text.Spannable text, int direction);
public abstract  boolean onTrackballEvent(android.widget.TextView widget, android.text.Spannable text, android.view.MotionEvent event);
public abstract  boolean onTouchEvent(android.widget.TextView widget, android.text.Spannable text, android.view.MotionEvent event);
public abstract  boolean canSelectArbitrarily();
}
