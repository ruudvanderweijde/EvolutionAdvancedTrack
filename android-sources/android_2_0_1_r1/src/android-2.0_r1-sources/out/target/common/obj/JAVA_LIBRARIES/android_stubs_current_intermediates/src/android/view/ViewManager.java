package android.view;
public interface ViewManager
{
public abstract  void addView(android.view.View view, android.view.ViewGroup.LayoutParams params);
public abstract  void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams params);
public abstract  void removeView(android.view.View view);
}
