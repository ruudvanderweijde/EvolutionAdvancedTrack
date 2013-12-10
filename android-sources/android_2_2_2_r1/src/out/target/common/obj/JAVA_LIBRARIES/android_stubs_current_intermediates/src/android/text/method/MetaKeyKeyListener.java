package android.text.method;
public abstract class MetaKeyKeyListener
{
public  MetaKeyKeyListener() { throw new RuntimeException("Stub!"); }
public static  void resetMetaState(android.text.Spannable text) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(java.lang.CharSequence text, int meta) { throw new RuntimeException("Stub!"); }
public static  void adjustMetaAfterKeypress(android.text.Spannable content) { throw new RuntimeException("Stub!"); }
public static  boolean isMetaTracker(java.lang.CharSequence text, java.lang.Object what) { throw new RuntimeException("Stub!"); }
public static  boolean isSelectingMetaTracker(java.lang.CharSequence text, java.lang.Object what) { throw new RuntimeException("Stub!"); }
protected static  void resetLockedMeta(android.text.Spannable content) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(android.view.View view, android.text.Editable content, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(android.view.View view, android.text.Editable content, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void clearMetaKeyState(android.view.View view, android.text.Editable content, int states) { throw new RuntimeException("Stub!"); }
public static  void clearMetaKeyState(android.text.Editable content, int states) { throw new RuntimeException("Stub!"); }
public static  long resetLockedMeta(long state) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(long state) { throw new RuntimeException("Stub!"); }
public static final  int getMetaState(long state, int meta) { throw new RuntimeException("Stub!"); }
public static  long adjustMetaAfterKeypress(long state) { throw new RuntimeException("Stub!"); }
public static  long handleKeyDown(long state, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public static  long handleKeyUp(long state, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  long clearMetaKeyState(long state, int which) { throw new RuntimeException("Stub!"); }
public static final int META_SHIFT_ON = 1;
public static final int META_ALT_ON = 2;
public static final int META_SYM_ON = 4;
public static final int META_CAP_LOCKED = 256;
public static final int META_ALT_LOCKED = 512;
public static final int META_SYM_LOCKED = 1024;
}
