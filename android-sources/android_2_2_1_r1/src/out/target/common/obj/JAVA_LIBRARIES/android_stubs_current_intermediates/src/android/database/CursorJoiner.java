package android.database;
public final class CursorJoiner
  implements java.util.Iterator<android.database.CursorJoiner.Result>, java.lang.Iterable<android.database.CursorJoiner.Result>
{
public static enum Result
{
BOTH(),
LEFT(),
RIGHT();
}
public  CursorJoiner(android.database.Cursor cursorLeft, java.lang.String[] columnNamesLeft, android.database.Cursor cursorRight, java.lang.String[] columnNamesRight) { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<android.database.CursorJoiner.Result> iterator() { throw new RuntimeException("Stub!"); }
public  boolean hasNext() { throw new RuntimeException("Stub!"); }
public  android.database.CursorJoiner.Result next() { throw new RuntimeException("Stub!"); }
public  void remove() { throw new RuntimeException("Stub!"); }
}
