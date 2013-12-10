package android.widget;
public class PopupWindow
{
public static interface OnDismissListener
{
public abstract  void onDismiss();
}
public  PopupWindow(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { throw new RuntimeException("Stub!"); }
public  PopupWindow() { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.view.View contentView) { throw new RuntimeException("Stub!"); }
public  PopupWindow(int width, int height) { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.view.View contentView, int width, int height) { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.view.View contentView, int width, int height, boolean focusable) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getBackground() { throw new RuntimeException("Stub!"); }
public  void setBackgroundDrawable(android.graphics.drawable.Drawable background) { throw new RuntimeException("Stub!"); }
public  int getAnimationStyle() { throw new RuntimeException("Stub!"); }
public  void setIgnoreCheekPress() { throw new RuntimeException("Stub!"); }
public  void setAnimationStyle(int animationStyle) { throw new RuntimeException("Stub!"); }
public  android.view.View getContentView() { throw new RuntimeException("Stub!"); }
public  void setContentView(android.view.View contentView) { throw new RuntimeException("Stub!"); }
public  void setTouchInterceptor(android.view.View.OnTouchListener l) { throw new RuntimeException("Stub!"); }
public  boolean isFocusable() { throw new RuntimeException("Stub!"); }
public  void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
public  int getInputMethodMode() { throw new RuntimeException("Stub!"); }
public  void setInputMethodMode(int mode) { throw new RuntimeException("Stub!"); }
public  void setSoftInputMode(int mode) { throw new RuntimeException("Stub!"); }
public  int getSoftInputMode() { throw new RuntimeException("Stub!"); }
public  boolean isTouchable() { throw new RuntimeException("Stub!"); }
public  void setTouchable(boolean touchable) { throw new RuntimeException("Stub!"); }
public  boolean isOutsideTouchable() { throw new RuntimeException("Stub!"); }
public  void setOutsideTouchable(boolean touchable) { throw new RuntimeException("Stub!"); }
public  boolean isClippingEnabled() { throw new RuntimeException("Stub!"); }
public  void setClippingEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setWindowLayoutMode(int widthSpec, int heightSpec) { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  void setHeight(int height) { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  void setWidth(int width) { throw new RuntimeException("Stub!"); }
public  boolean isShowing() { throw new RuntimeException("Stub!"); }
public  void showAtLocation(android.view.View parent, int gravity, int x, int y) { throw new RuntimeException("Stub!"); }
public  void showAsDropDown(android.view.View anchor) { throw new RuntimeException("Stub!"); }
public  void showAsDropDown(android.view.View anchor, int xoff, int yoff) { throw new RuntimeException("Stub!"); }
public  boolean isAboveAnchor() { throw new RuntimeException("Stub!"); }
public  int getMaxAvailableHeight(android.view.View anchor) { throw new RuntimeException("Stub!"); }
public  int getMaxAvailableHeight(android.view.View anchor, int yOffset) { throw new RuntimeException("Stub!"); }
public  void dismiss() { throw new RuntimeException("Stub!"); }
public  void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) { throw new RuntimeException("Stub!"); }
public  void update() { throw new RuntimeException("Stub!"); }
public  void update(int width, int height) { throw new RuntimeException("Stub!"); }
public  void update(int x, int y, int width, int height) { throw new RuntimeException("Stub!"); }
public  void update(int x, int y, int width, int height, boolean force) { throw new RuntimeException("Stub!"); }
public  void update(android.view.View anchor, int width, int height) { throw new RuntimeException("Stub!"); }
public  void update(android.view.View anchor, int xoff, int yoff, int width, int height) { throw new RuntimeException("Stub!"); }
public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
public static final int INPUT_METHOD_NEEDED = 1;
public static final int INPUT_METHOD_NOT_NEEDED = 2;
}
