package android.text;
 abstract class SpannableStringInternal
{
SpannableStringInternal() { throw new RuntimeException("Stub!"); }
public final  int length() { throw new RuntimeException("Stub!"); }
public final  char charAt(int i) { throw new RuntimeException("Stub!"); }
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  void getChars(int start, int end, char[] dest, int off) { throw new RuntimeException("Stub!"); }
public  int getSpanStart(java.lang.Object what) { throw new RuntimeException("Stub!"); }
public  int getSpanEnd(java.lang.Object what) { throw new RuntimeException("Stub!"); }
public  int getSpanFlags(java.lang.Object what) { throw new RuntimeException("Stub!"); }
public <T> T[] getSpans(int queryStart, int queryEnd, java.lang.Class<T> kind) { throw new RuntimeException("Stub!"); }
public  int nextSpanTransition(int start, int limit, java.lang.Class kind) { throw new RuntimeException("Stub!"); }
}
