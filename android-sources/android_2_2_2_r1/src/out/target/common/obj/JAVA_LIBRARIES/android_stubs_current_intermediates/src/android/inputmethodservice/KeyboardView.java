package android.inputmethodservice;
public class KeyboardView
  extends android.view.View
  implements android.view.View.OnClickListener
{
public static interface OnKeyboardActionListener
{
public abstract  void onPress(int primaryCode);
public abstract  void onRelease(int primaryCode);
public abstract  void onKey(int primaryCode, int[] keyCodes);
public abstract  void onText(java.lang.CharSequence text);
public abstract  void swipeLeft();
public abstract  void swipeRight();
public abstract  void swipeDown();
public abstract  void swipeUp();
}
public  KeyboardView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  KeyboardView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setOnKeyboardActionListener(android.inputmethodservice.KeyboardView.OnKeyboardActionListener listener) { throw new RuntimeException("Stub!"); }
protected  android.inputmethodservice.KeyboardView.OnKeyboardActionListener getOnKeyboardActionListener() { throw new RuntimeException("Stub!"); }
public  void setKeyboard(android.inputmethodservice.Keyboard keyboard) { throw new RuntimeException("Stub!"); }
public  android.inputmethodservice.Keyboard getKeyboard() { throw new RuntimeException("Stub!"); }
public  boolean setShifted(boolean shifted) { throw new RuntimeException("Stub!"); }
public  boolean isShifted() { throw new RuntimeException("Stub!"); }
public  void setPreviewEnabled(boolean previewEnabled) { throw new RuntimeException("Stub!"); }
public  boolean isPreviewEnabled() { throw new RuntimeException("Stub!"); }
public  void setVerticalCorrection(int verticalOffset) { throw new RuntimeException("Stub!"); }
public  void setPopupParent(android.view.View v) { throw new RuntimeException("Stub!"); }
public  void setPopupOffset(int x, int y) { throw new RuntimeException("Stub!"); }
public  void setProximityCorrectionEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isProximityCorrectionEnabled() { throw new RuntimeException("Stub!"); }
public  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
public  void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
public  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void invalidateAllKeys() { throw new RuntimeException("Stub!"); }
public  void invalidateKey(int keyIndex) { throw new RuntimeException("Stub!"); }
protected  boolean onLongPress(android.inputmethodservice.Keyboard.Key popupKey) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent me) { throw new RuntimeException("Stub!"); }
protected  void swipeRight() { throw new RuntimeException("Stub!"); }
protected  void swipeLeft() { throw new RuntimeException("Stub!"); }
protected  void swipeUp() { throw new RuntimeException("Stub!"); }
protected  void swipeDown() { throw new RuntimeException("Stub!"); }
public  void closing() { throw new RuntimeException("Stub!"); }
public  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  boolean handleBack() { throw new RuntimeException("Stub!"); }
public  void onClick(android.view.View v) { throw new RuntimeException("Stub!"); }
}
