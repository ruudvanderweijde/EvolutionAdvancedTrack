package android.widget;
public class GridView
  extends android.widget.AbsListView
{
public  GridView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  GridView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  GridView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  android.widget.ListAdapter getAdapter() { throw new RuntimeException("Stub!"); }
public  void setAdapter(android.widget.ListAdapter adapter) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void attachLayoutAnimationParameters(android.view.View child, android.view.ViewGroup.LayoutParams params, int index, int count) { throw new RuntimeException("Stub!"); }
protected  void layoutChildren() { throw new RuntimeException("Stub!"); }
public  void setSelection(int position) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  void setHorizontalSpacing(int horizontalSpacing) { throw new RuntimeException("Stub!"); }
public  void setVerticalSpacing(int verticalSpacing) { throw new RuntimeException("Stub!"); }
public  void setStretchMode(int stretchMode) { throw new RuntimeException("Stub!"); }
public  int getStretchMode() { throw new RuntimeException("Stub!"); }
public  void setColumnWidth(int columnWidth) { throw new RuntimeException("Stub!"); }
public  void setNumColumns(int numColumns) { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
public static final int NO_STRETCH = 0;
public static final int STRETCH_SPACING = 1;
public static final int STRETCH_COLUMN_WIDTH = 2;
public static final int STRETCH_SPACING_UNIFORM = 3;
public static final int AUTO_FIT = -1;
}
