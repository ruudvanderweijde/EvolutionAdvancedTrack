package android.text.method;
public class MultiTapKeyListener
  extends android.text.method.BaseKeyListener
  implements android.text.SpanWatcher
{
public  MultiTapKeyListener(android.text.method.TextKeyListener.Capitalize cap, boolean autotext) { throw new RuntimeException("Stub!"); }
public static  android.text.method.MultiTapKeyListener getInstance(boolean autotext, android.text.method.TextKeyListener.Capitalize cap) { throw new RuntimeException("Stub!"); }
public  int getInputType() { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(android.view.View view, android.text.Editable content, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onSpanChanged(android.text.Spannable buf, java.lang.Object what, int s, int e, int start, int stop) { throw new RuntimeException("Stub!"); }
public  void onSpanAdded(android.text.Spannable s, java.lang.Object what, int start, int end) { throw new RuntimeException("Stub!"); }
public  void onSpanRemoved(android.text.Spannable s, java.lang.Object what, int start, int end) { throw new RuntimeException("Stub!"); }
}
