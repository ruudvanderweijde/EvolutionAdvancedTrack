package android.text.style;
public abstract class ClickableSpan
  extends android.text.style.CharacterStyle
  implements android.text.style.UpdateAppearance
{
public  ClickableSpan() { throw new RuntimeException("Stub!"); }
public abstract  void onClick(android.view.View widget);
public  void updateDrawState(android.text.TextPaint ds) { throw new RuntimeException("Stub!"); }
}
