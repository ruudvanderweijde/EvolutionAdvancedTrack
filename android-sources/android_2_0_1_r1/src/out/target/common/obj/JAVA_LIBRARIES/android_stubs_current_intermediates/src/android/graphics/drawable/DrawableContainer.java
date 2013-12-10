package android.graphics.drawable;
public class DrawableContainer
  extends android.graphics.drawable.Drawable
  implements android.graphics.drawable.Drawable.Callback
{
public abstract static class DrawableContainerState
  extends android.graphics.drawable.Drawable.ConstantState
{
DrawableContainerState() { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public final  int addChild(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
public final  int getChildCount() { throw new RuntimeException("Stub!"); }
public final  android.graphics.drawable.Drawable[] getChildren() { throw new RuntimeException("Stub!"); }
public final  void setVariablePadding(boolean variable) { throw new RuntimeException("Stub!"); }
public final  android.graphics.Rect getConstantPadding() { throw new RuntimeException("Stub!"); }
public final  void setConstantSize(boolean constant) { throw new RuntimeException("Stub!"); }
public final  boolean isConstantSize() { throw new RuntimeException("Stub!"); }
public final  int getConstantWidth() { throw new RuntimeException("Stub!"); }
public final  int getConstantHeight() { throw new RuntimeException("Stub!"); }
public final  int getConstantMinimumWidth() { throw new RuntimeException("Stub!"); }
public final  int getConstantMinimumHeight() { throw new RuntimeException("Stub!"); }
public final  int getOpacity() { throw new RuntimeException("Stub!"); }
public final  boolean isStateful() { throw new RuntimeException("Stub!"); }
public  void growArray(int oldSize, int newSize) { throw new RuntimeException("Stub!"); }
public synchronized  boolean canConstantState() { throw new RuntimeException("Stub!"); }
}
public  DrawableContainer() { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public  boolean getPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter cf) { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); }
protected  boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  int getMinimumWidth() { throw new RuntimeException("Stub!"); }
public  int getMinimumHeight() { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long when) { throw new RuntimeException("Stub!"); }
public  void unscheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what) { throw new RuntimeException("Stub!"); }
public  boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
public  boolean selectDrawable(int idx) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getCurrent() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
protected  void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState state) { throw new RuntimeException("Stub!"); }
}
