package android.view.animation;
public class LayoutAnimationController
{
public static class AnimationParameters
{
public  AnimationParameters() { throw new RuntimeException("Stub!"); }
public int count;
public int index;
}
public  LayoutAnimationController(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  LayoutAnimationController(android.view.animation.Animation animation) { throw new RuntimeException("Stub!"); }
public  LayoutAnimationController(android.view.animation.Animation animation, float delay) { throw new RuntimeException("Stub!"); }
public  int getOrder() { throw new RuntimeException("Stub!"); }
public  void setOrder(int order) { throw new RuntimeException("Stub!"); }
public  void setAnimation(android.content.Context context, int resourceID) { throw new RuntimeException("Stub!"); }
public  void setAnimation(android.view.animation.Animation animation) { throw new RuntimeException("Stub!"); }
public  android.view.animation.Animation getAnimation() { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.content.Context context, int resourceID) { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.view.animation.Interpolator interpolator) { throw new RuntimeException("Stub!"); }
public  android.view.animation.Interpolator getInterpolator() { throw new RuntimeException("Stub!"); }
public  float getDelay() { throw new RuntimeException("Stub!"); }
public  void setDelay(float delay) { throw new RuntimeException("Stub!"); }
public  boolean willOverlap() { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public final  android.view.animation.Animation getAnimationForView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  boolean isDone() { throw new RuntimeException("Stub!"); }
protected  long getDelayForView(android.view.View view) { throw new RuntimeException("Stub!"); }
protected  int getTransformedIndex(android.view.animation.LayoutAnimationController.AnimationParameters params) { throw new RuntimeException("Stub!"); }
public static final int ORDER_NORMAL = 0;
public static final int ORDER_REVERSE = 1;
public static final int ORDER_RANDOM = 2;
protected android.view.animation.Animation mAnimation;
protected java.util.Random mRandomizer;
protected android.view.animation.Interpolator mInterpolator;
}
