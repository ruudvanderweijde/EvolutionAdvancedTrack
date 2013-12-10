package android.database;
public abstract class Observable<T>
{
public  Observable() { throw new RuntimeException("Stub!"); }
public  void registerObserver(T observer) { throw new RuntimeException("Stub!"); }
public  void unregisterObserver(T observer) { throw new RuntimeException("Stub!"); }
public  void unregisterAll() { throw new RuntimeException("Stub!"); }
protected final java.util.ArrayList<T> mObservers;
}
