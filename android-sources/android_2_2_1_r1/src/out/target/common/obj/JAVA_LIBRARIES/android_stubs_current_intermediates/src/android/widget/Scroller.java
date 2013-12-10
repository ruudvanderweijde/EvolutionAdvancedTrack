package android.widget;
public class Scroller
{
public  Scroller(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  Scroller(android.content.Context context, android.view.animation.Interpolator interpolator) { throw new RuntimeException("Stub!"); }
public final  boolean isFinished() { throw new RuntimeException("Stub!"); }
public final  void forceFinished(boolean finished) { throw new RuntimeException("Stub!"); }
public final  int getDuration() { throw new RuntimeException("Stub!"); }
public final  int getCurrX() { throw new RuntimeException("Stub!"); }
public final  int getCurrY() { throw new RuntimeException("Stub!"); }
public final  int getStartX() { throw new RuntimeException("Stub!"); }
public final  int getStartY() { throw new RuntimeException("Stub!"); }
public final  int getFinalX() { throw new RuntimeException("Stub!"); }
public final  int getFinalY() { throw new RuntimeException("Stub!"); }
public  boolean computeScrollOffset() { throw new RuntimeException("Stub!"); }
public  void startScroll(int startX, int startY, int dx, int dy) { throw new RuntimeException("Stub!"); }
public  void startScroll(int startX, int startY, int dx, int dy, int duration) { throw new RuntimeException("Stub!"); }
public  void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) { throw new RuntimeException("Stub!"); }
public  void abortAnimation() { throw new RuntimeException("Stub!"); }
public  void extendDuration(int extend) { throw new RuntimeException("Stub!"); }
public  int timePassed() { throw new RuntimeException("Stub!"); }
public  void setFinalX(int newX) { throw new RuntimeException("Stub!"); }
public  void setFinalY(int newY) { throw new RuntimeException("Stub!"); }
}
