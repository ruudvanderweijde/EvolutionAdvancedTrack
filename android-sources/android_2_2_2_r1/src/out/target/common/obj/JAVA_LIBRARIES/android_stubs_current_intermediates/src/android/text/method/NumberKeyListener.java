package android.text.method;
public abstract class NumberKeyListener
  extends android.text.method.BaseKeyListener
  implements android.text.InputFilter
{
public  NumberKeyListener() { throw new RuntimeException("Stub!"); }
protected abstract  char[] getAcceptedChars();
protected  int lookup(android.view.KeyEvent event, android.text.Spannable content) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
protected static  boolean ok(char[] accept, char c) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(android.view.View view, android.text.Editable content, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
}
