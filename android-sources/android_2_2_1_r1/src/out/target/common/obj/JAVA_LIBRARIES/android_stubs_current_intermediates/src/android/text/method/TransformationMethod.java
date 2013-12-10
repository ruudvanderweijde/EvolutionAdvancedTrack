package android.text.method;
public interface TransformationMethod
{
public abstract  java.lang.CharSequence getTransformation(java.lang.CharSequence source, android.view.View view);
public abstract  void onFocusChanged(android.view.View view, java.lang.CharSequence sourceText, boolean focused, int direction, android.graphics.Rect previouslyFocusedRect);
}
