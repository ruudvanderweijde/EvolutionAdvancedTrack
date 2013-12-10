package android.widget;
public class RadioGroup
  extends android.widget.LinearLayout
{
public static class LayoutParams
  extends android.widget.LinearLayout.LayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h) { super((android.view.ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h, float initWeight) { super((android.view.ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams p) { super((android.view.ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super((android.view.ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!"); }
protected  void setBaseAttributes(android.content.res.TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!"); }
}
public static interface OnCheckedChangeListener
{
public abstract  void onCheckedChanged(android.widget.RadioGroup group, int checkedId);
}
public  RadioGroup(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null); throw new RuntimeException("Stub!"); }
public  RadioGroup(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null); throw new RuntimeException("Stub!"); }
public  void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); }
protected  void onFinishInflate() { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void check(int id) { throw new RuntimeException("Stub!"); }
public  int getCheckedRadioButtonId() { throw new RuntimeException("Stub!"); }
public  void clearCheck() { throw new RuntimeException("Stub!"); }
public  void setOnCheckedChangeListener(android.widget.RadioGroup.OnCheckedChangeListener listener) { throw new RuntimeException("Stub!"); }
public  android.widget.RadioGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
}
