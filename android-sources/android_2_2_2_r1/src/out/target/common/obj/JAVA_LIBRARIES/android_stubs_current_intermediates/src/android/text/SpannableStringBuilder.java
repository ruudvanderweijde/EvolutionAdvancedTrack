package android.text;
public class SpannableStringBuilder
  implements java.lang.CharSequence, android.text.GetChars, android.text.Spannable, android.text.Editable, java.lang.Appendable
{
public  SpannableStringBuilder() { throw new RuntimeException("Stub!"); }
public  SpannableStringBuilder(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  SpannableStringBuilder(java.lang.CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
public static  android.text.SpannableStringBuilder valueOf(java.lang.CharSequence source) { throw new RuntimeException("Stub!"); }
public  char charAt(int where) { throw new RuntimeException("Stub!"); }
public  int length() { throw new RuntimeException("Stub!"); }
public  android.text.SpannableStringBuilder insert(int where, java.lang.CharSequence tb, int start, int end) { throw new RuntimeException("Stub!"); }
public  android.text.SpannableStringBuilder insert(int where, java.lang.CharSequence tb) { throw new RuntimeException("Stub!"); }
public  android.text.SpannableStringBuilder delete(int start, int end) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  void clearSpans() { throw new RuntimeException("Stub!"); }
public  android.text.SpannableStringBuilder append(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  android.text.SpannableStringBuilder append(java.lang.CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
public  android.text.SpannableStringBuilder append(char text) { throw new RuntimeException("Stub!"); }
public  android.text.SpannableStringBuilder replace(int start, int end, java.lang.CharSequence tb) { throw new RuntimeException("Stub!"); }
public  android.text.SpannableStringBuilder replace(int start, int end, java.lang.CharSequence tb, int tbstart, int tbend) { throw new RuntimeException("Stub!"); }
public  void setSpan(java.lang.Object what, int start, int end, int flags) { throw new RuntimeException("Stub!"); }
public  void removeSpan(java.lang.Object what) { throw new RuntimeException("Stub!"); }
public  int getSpanStart(java.lang.Object what) { throw new RuntimeException("Stub!"); }
public  int getSpanEnd(java.lang.Object what) { throw new RuntimeException("Stub!"); }
public  int getSpanFlags(java.lang.Object what) { throw new RuntimeException("Stub!"); }
public <T> T[] getSpans(int queryStart, int queryEnd, java.lang.Class<T> kind) { throw new RuntimeException("Stub!"); }
public  int nextSpanTransition(int start, int limit, java.lang.Class kind) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence subSequence(int start, int end) { throw new RuntimeException("Stub!"); }
public  void getChars(int start, int end, char[] dest, int destoff) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void setFilters(android.text.InputFilter[] filters) { throw new RuntimeException("Stub!"); }
public  android.text.InputFilter[] getFilters() { throw new RuntimeException("Stub!"); }
}
