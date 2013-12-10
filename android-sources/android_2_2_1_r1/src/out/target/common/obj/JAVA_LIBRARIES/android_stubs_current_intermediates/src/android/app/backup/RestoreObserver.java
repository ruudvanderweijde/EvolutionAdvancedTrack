package android.app.backup;
public abstract class RestoreObserver
{
public  RestoreObserver() { throw new RuntimeException("Stub!"); }
public  void restoreStarting(int numPackages) { throw new RuntimeException("Stub!"); }
public  void onUpdate(int nowBeingRestored, java.lang.String currentPackage) { throw new RuntimeException("Stub!"); }
public  void restoreFinished(int error) { throw new RuntimeException("Stub!"); }
}
