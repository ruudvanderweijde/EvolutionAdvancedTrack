package android.widget;
public class ZoomButtonsController
  implements android.view.View.OnTouchListener
{
public static interface OnZoomListener
{
public abstract  void onVisibilityChanged(boolean visible);
public abstract  void onZoom(boolean zoomIn);
}
public  ZoomButtonsController(android.view.View ownerView) { throw new RuntimeException("Stub!"); }
public  void setZoomInEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setZoomOutEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setZoomSpeed(long speed) { throw new RuntimeException("Stub!"); }
public  void setOnZoomListener(android.widget.ZoomButtonsController.OnZoomListener listener) { throw new RuntimeException("Stub!"); }
public  void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
public  boolean isAutoDismissed() { throw new RuntimeException("Stub!"); }
public  void setAutoDismissed(boolean autoDismiss) { throw new RuntimeException("Stub!"); }
public  boolean isVisible() { throw new RuntimeException("Stub!"); }
public  void setVisible(boolean visible) { throw new RuntimeException("Stub!"); }
public  android.view.ViewGroup getContainer() { throw new RuntimeException("Stub!"); }
public  android.view.View getZoomControls() { throw new RuntimeException("Stub!"); }
public  boolean onTouch(android.view.View v, android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
}
