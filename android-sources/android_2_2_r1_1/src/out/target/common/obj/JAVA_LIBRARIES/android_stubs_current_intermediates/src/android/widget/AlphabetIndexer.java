package android.widget;
public class AlphabetIndexer
  extends android.database.DataSetObserver
  implements android.widget.SectionIndexer
{
public  AlphabetIndexer(android.database.Cursor cursor, int sortedColumnIndex, java.lang.CharSequence alphabet) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] getSections() { throw new RuntimeException("Stub!"); }
public  void setCursor(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
protected  int compare(java.lang.String word, java.lang.String letter) { throw new RuntimeException("Stub!"); }
public  int getPositionForSection(int sectionIndex) { throw new RuntimeException("Stub!"); }
public  int getSectionForPosition(int position) { throw new RuntimeException("Stub!"); }
public  void onChanged() { throw new RuntimeException("Stub!"); }
public  void onInvalidated() { throw new RuntimeException("Stub!"); }
protected android.database.Cursor mDataCursor;
protected int mColumnIndex;
protected java.lang.CharSequence mAlphabet;
}
