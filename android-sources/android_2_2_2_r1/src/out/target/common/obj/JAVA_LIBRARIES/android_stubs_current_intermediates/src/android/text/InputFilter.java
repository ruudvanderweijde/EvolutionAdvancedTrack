package android.text;
public interface InputFilter
{
public static class AllCaps
  implements android.text.InputFilter
{
public  AllCaps() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
}
public static class LengthFilter
  implements android.text.InputFilter
{
public  LengthFilter(int max) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
}
public abstract  java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend);
}
