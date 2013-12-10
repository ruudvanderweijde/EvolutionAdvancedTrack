package android.text;
public abstract class LoginFilter
  implements android.text.InputFilter
{
public static class UsernameFilterGMail
  extends android.text.LoginFilter
{
public  UsernameFilterGMail() { throw new RuntimeException("Stub!"); }
public  UsernameFilterGMail(boolean appendInvalid) { throw new RuntimeException("Stub!"); }
public  boolean isAllowed(char c) { throw new RuntimeException("Stub!"); }
}
public static class UsernameFilterGeneric
  extends android.text.LoginFilter
{
public  UsernameFilterGeneric() { throw new RuntimeException("Stub!"); }
public  UsernameFilterGeneric(boolean appendInvalid) { throw new RuntimeException("Stub!"); }
public  boolean isAllowed(char c) { throw new RuntimeException("Stub!"); }
}
public static class PasswordFilterGMail
  extends android.text.LoginFilter
{
public  PasswordFilterGMail() { throw new RuntimeException("Stub!"); }
public  PasswordFilterGMail(boolean appendInvalid) { throw new RuntimeException("Stub!"); }
public  boolean isAllowed(char c) { throw new RuntimeException("Stub!"); }
}
LoginFilter() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
public  void onStart() { throw new RuntimeException("Stub!"); }
public  void onInvalidCharacter(char c) { throw new RuntimeException("Stub!"); }
public  void onStop() { throw new RuntimeException("Stub!"); }
public abstract  boolean isAllowed(char c);
}
