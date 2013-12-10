package android.view.animation;
public class GridLayoutAnimationController
  extends android.view.animation.LayoutAnimationController
{
public static class AnimationParameters
  extends android.view.animation.LayoutAnimationController.AnimationParameters
{
public  AnimationParameters() { throw new RuntimeException("Stub!"); }
public int column;
public int row;
public int columnsCount;
public int rowsCount;
}
public  GridLayoutAnimationController(android.content.Context context, android.util.AttributeSet attrs) { super((android.view.animation.Animation)null,0); throw new RuntimeException("Stub!"); }
public  GridLayoutAnimationController(android.view.animation.Animation animation) { super((android.view.animation.Animation)null,0); throw new RuntimeException("Stub!"); }
public  GridLayoutAnimationController(android.view.animation.Animation animation, float columnDelay, float rowDelay) { super((android.view.animation.Animation)null,0); throw new RuntimeException("Stub!"); }
public  float getColumnDelay() { throw new RuntimeException("Stub!"); }
public  void setColumnDelay(float columnDelay) { throw new RuntimeException("Stub!"); }
public  float getRowDelay() { throw new RuntimeException("Stub!"); }
public  void setRowDelay(float rowDelay) { throw new RuntimeException("Stub!"); }
public  int getDirection() { throw new RuntimeException("Stub!"); }
public  void setDirection(int direction) { throw new RuntimeException("Stub!"); }
public  int getDirectionPriority() { throw new RuntimeException("Stub!"); }
public  void setDirectionPriority(int directionPriority) { throw new RuntimeException("Stub!"); }
public  boolean willOverlap() { throw new RuntimeException("Stub!"); }
protected  long getDelayForView(android.view.View view) { throw new RuntimeException("Stub!"); }
public static final int DIRECTION_LEFT_TO_RIGHT = 0;
public static final int DIRECTION_RIGHT_TO_LEFT = 1;
public static final int DIRECTION_TOP_TO_BOTTOM = 0;
public static final int DIRECTION_BOTTOM_TO_TOP = 2;
public static final int DIRECTION_HORIZONTAL_MASK = 1;
public static final int DIRECTION_VERTICAL_MASK = 2;
public static final int PRIORITY_NONE = 0;
public static final int PRIORITY_COLUMN = 1;
public static final int PRIORITY_ROW = 2;
}
