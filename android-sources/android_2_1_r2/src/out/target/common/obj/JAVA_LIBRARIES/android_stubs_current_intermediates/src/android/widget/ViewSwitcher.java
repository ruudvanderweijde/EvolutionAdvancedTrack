package android.widget;
public class ViewSwitcher
  extends android.widget.ViewAnimator
{
public static interface ViewFactory
{
public abstract  android.view.View makeView();
}
public  ViewSwitcher(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null); throw new RuntimeException("Stub!"); }
public  ViewSwitcher(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null); throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  android.view.View getNextView() { throw new RuntimeException("Stub!"); }
public  void setFactory(android.widget.ViewSwitcher.ViewFactory factory) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
}
