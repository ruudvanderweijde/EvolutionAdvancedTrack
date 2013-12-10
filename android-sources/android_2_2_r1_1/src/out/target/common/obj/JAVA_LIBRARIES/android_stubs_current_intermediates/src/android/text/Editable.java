package android.text;
public interface Editable
  extends java.lang.CharSequence, android.text.GetChars, android.text.Spannable, java.lang.Appendable
{
public static class Factory
{
public  Factory() { throw new RuntimeException("Stub!"); }
public static  android.text.Editable.Factory getInstance() { throw new RuntimeException("Stub!"); }
public  android.text.Editable newEditable(java.lang.CharSequence source) { throw new RuntimeException("Stub!"); }
}
public abstract  android.text.Editable replace(int st, int en, java.lang.CharSequence source, int start, int end);
public abstract  android.text.Editable replace(int st, int en, java.lang.CharSequence text);
public abstract  android.text.Editable insert(int where, java.lang.CharSequence text, int start, int end);
public abstract  android.text.Editable insert(int where, java.lang.CharSequence text);
public abstract  android.text.Editable delete(int st, int en);
public abstract  android.text.Editable append(java.lang.CharSequence text);
public abstract  android.text.Editable append(java.lang.CharSequence text, int start, int end);
public abstract  android.text.Editable append(char text);
public abstract  void clear();
public abstract  void clearSpans();
public abstract  void setFilters(android.text.InputFilter[] filters);
public abstract  android.text.InputFilter[] getFilters();
}
