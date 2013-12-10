package android.widget;
@android.widget.RemoteViews.RemoteView()
public class RelativeLayout
  extends android.view.ViewGroup
{
public static class LayoutParams
  extends android.view.ViewGroup.MarginLayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  java.lang.String debug(java.lang.String output) { throw new RuntimeException("Stub!"); }
public  void addRule(int verb) { throw new RuntimeException("Stub!"); }
public  void addRule(int verb, int anchor) { throw new RuntimeException("Stub!"); }
public  int[] getRules() { throw new RuntimeException("Stub!"); }
public boolean alignWithParent;
}
public  RelativeLayout(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  RelativeLayout(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  RelativeLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setIgnoreGravity(int viewId) { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  void setHorizontalGravity(int horizontalGravity) { throw new RuntimeException("Stub!"); }
public  void setVerticalGravity(int verticalGravity) { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
public  void requestLayout() { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  android.widget.RelativeLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
public static final int TRUE = -1;
public static final int LEFT_OF = 0;
public static final int RIGHT_OF = 1;
public static final int ABOVE = 2;
public static final int BELOW = 3;
public static final int ALIGN_BASELINE = 4;
public static final int ALIGN_LEFT = 5;
public static final int ALIGN_TOP = 6;
public static final int ALIGN_RIGHT = 7;
public static final int ALIGN_BOTTOM = 8;
public static final int ALIGN_PARENT_LEFT = 9;
public static final int ALIGN_PARENT_TOP = 10;
public static final int ALIGN_PARENT_RIGHT = 11;
public static final int ALIGN_PARENT_BOTTOM = 12;
public static final int CENTER_IN_PARENT = 13;
public static final int CENTER_HORIZONTAL = 14;
public static final int CENTER_VERTICAL = 15;
}
