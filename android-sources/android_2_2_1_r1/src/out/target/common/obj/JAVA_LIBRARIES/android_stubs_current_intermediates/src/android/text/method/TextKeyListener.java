package android.text.method;
public class TextKeyListener
  extends android.text.method.BaseKeyListener
  implements android.text.SpanWatcher
{
public static enum Capitalize
{
CHARACTERS(),
NONE(),
SENTENCES(),
WORDS();
}
public  TextKeyListener(android.text.method.TextKeyListener.Capitalize cap, boolean autotext) { throw new RuntimeException("Stub!"); }
public static  android.text.method.TextKeyListener getInstance(boolean autotext, android.text.method.TextKeyListener.Capitalize cap) { throw new RuntimeException("Stub!"); }
public static  android.text.method.TextKeyListener getInstance() { throw new RuntimeException("Stub!"); }
public static  boolean shouldCap(android.text.method.TextKeyListener.Capitalize cap, java.lang.CharSequence cs, int off) { throw new RuntimeException("Stub!"); }
public  int getInputType() { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(android.view.View view, android.text.Editable content, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(android.view.View view, android.text.Editable content, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyOther(android.view.View view, android.text.Editable content, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public static  void clear(android.text.Editable e) { throw new RuntimeException("Stub!"); }
public  void onSpanAdded(android.text.Spannable s, java.lang.Object what, int start, int end) { throw new RuntimeException("Stub!"); }
public  void onSpanRemoved(android.text.Spannable s, java.lang.Object what, int start, int end) { throw new RuntimeException("Stub!"); }
public  void onSpanChanged(android.text.Spannable s, java.lang.Object what, int start, int end, int st, int en) { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
}
