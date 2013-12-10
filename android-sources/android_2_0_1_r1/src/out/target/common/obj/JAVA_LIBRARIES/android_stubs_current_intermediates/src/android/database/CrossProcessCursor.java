package android.database;
public interface CrossProcessCursor
  extends android.database.Cursor
{
public abstract  android.database.CursorWindow getWindow();
public abstract  void fillWindow(int pos, android.database.CursorWindow winow);
public abstract  boolean onMove(int oldPosition, int newPosition);
}
