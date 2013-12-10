package android.text.method;
public abstract class ReplacementTransformationMethod
  implements android.text.method.TransformationMethod
{
public  ReplacementTransformationMethod() { throw new RuntimeException("Stub!"); }
protected abstract  char[] getOriginal();
protected abstract  char[] getReplacement();
public  java.lang.CharSequence getTransformation(java.lang.CharSequence source, android.view.View v) { throw new RuntimeException("Stub!"); }
public  void onFocusChanged(android.view.View view, java.lang.CharSequence sourceText, boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
}
