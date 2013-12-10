package android.widget;
@android.widget.RemoteViews.RemoteView()
public class ImageView
  extends android.view.View
{
public static enum ScaleType
{
CENTER(),
CENTER_CROP(),
CENTER_INSIDE(),
FIT_CENTER(),
FIT_END(),
FIT_START(),
FIT_XY(),
MATRIX();
}
public  ImageView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  ImageView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  ImageView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
protected  boolean verifyDrawable(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
protected  boolean onSetAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  void setAdjustViewBounds(boolean adjustViewBounds) { throw new RuntimeException("Stub!"); }
public  void setMaxWidth(int maxWidth) { throw new RuntimeException("Stub!"); }
public  void setMaxHeight(int maxHeight) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDrawable() { throw new RuntimeException("Stub!"); }
public  void setImageResource(int resId) { throw new RuntimeException("Stub!"); }
public  void setImageURI(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  void setImageDrawable(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  void setImageBitmap(android.graphics.Bitmap bm) { throw new RuntimeException("Stub!"); }
public  void setImageState(int[] state, boolean merge) { throw new RuntimeException("Stub!"); }
public  void setSelected(boolean selected) { throw new RuntimeException("Stub!"); }
public  void setImageLevel(int level) { throw new RuntimeException("Stub!"); }
public  void setScaleType(android.widget.ImageView.ScaleType scaleType) { throw new RuntimeException("Stub!"); }
public  android.widget.ImageView.ScaleType getScaleType() { throw new RuntimeException("Stub!"); }
public  android.graphics.Matrix getImageMatrix() { throw new RuntimeException("Stub!"); }
public  void setImageMatrix(android.graphics.Matrix matrix) { throw new RuntimeException("Stub!"); }
public  int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
public final  void setColorFilter(int color, android.graphics.PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); }
public final  void setColorFilter(int color) { throw new RuntimeException("Stub!"); }
public final  void clearColorFilter() { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter cf) { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
}
