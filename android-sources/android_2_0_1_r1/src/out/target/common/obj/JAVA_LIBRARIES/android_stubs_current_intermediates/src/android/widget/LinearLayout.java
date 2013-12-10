package android.widget;
@android.widget.RemoteViews.RemoteView()
public class LinearLayout
  extends android.view.ViewGroup
{
public static class LayoutParams
  extends android.view.ViewGroup.MarginLayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int width, int height) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int width, int height, float weight) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams p) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  java.lang.String debug(java.lang.String output) { throw new RuntimeException("Stub!"); }
public float weight;
public int gravity;
}
public  LinearLayout(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  LinearLayout(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  boolean isBaselineAligned() { throw new RuntimeException("Stub!"); }
public  void setBaselineAligned(boolean baselineAligned) { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
public  int getBaselineAlignedChildIndex() { throw new RuntimeException("Stub!"); }
public  void setBaselineAlignedChildIndex(int i) { throw new RuntimeException("Stub!"); }
public  float getWeightSum() { throw new RuntimeException("Stub!"); }
public  void setWeightSum(float weightSum) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  void setOrientation(int orientation) { throw new RuntimeException("Stub!"); }
public  int getOrientation() { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  void setHorizontalGravity(int horizontalGravity) { throw new RuntimeException("Stub!"); }
public  void setVerticalGravity(int verticalGravity) { throw new RuntimeException("Stub!"); }
public  android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
protected  android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public static final int HORIZONTAL = 0;
public static final int VERTICAL = 1;
}
