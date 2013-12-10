package android.text;
public interface Spannable
  extends android.text.Spanned
{
public static class Factory
{
public  Factory() { throw new RuntimeException("Stub!"); }
public static  android.text.Spannable.Factory getInstance() { throw new RuntimeException("Stub!"); }
public  android.text.Spannable newSpannable(java.lang.CharSequence source) { throw new RuntimeException("Stub!"); }
}
public abstract  void setSpan(java.lang.Object what, int start, int end, int flags);
public abstract  void removeSpan(java.lang.Object what);
}
