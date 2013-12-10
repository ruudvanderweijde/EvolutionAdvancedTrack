package android.text;
public interface SpanWatcher
  extends android.text.NoCopySpan
{
public abstract  void onSpanAdded(android.text.Spannable text, java.lang.Object what, int start, int end);
public abstract  void onSpanRemoved(android.text.Spannable text, java.lang.Object what, int start, int end);
public abstract  void onSpanChanged(android.text.Spannable text, java.lang.Object what, int ostart, int oend, int nstart, int nend);
}
