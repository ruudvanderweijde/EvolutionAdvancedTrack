package android.app;
public class KeyguardManager
{
public class KeyguardLock
{
KeyguardLock() { throw new RuntimeException("Stub!"); }
public  void disableKeyguard() { throw new RuntimeException("Stub!"); }
public  void reenableKeyguard() { throw new RuntimeException("Stub!"); }
}
public static interface OnKeyguardExitResult
{
public abstract  void onKeyguardExitResult(boolean success);
}
KeyguardManager() { throw new RuntimeException("Stub!"); }
public  android.app.KeyguardManager.KeyguardLock newKeyguardLock(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  boolean inKeyguardRestrictedInputMode() { throw new RuntimeException("Stub!"); }
public  void exitKeyguardSecurely(android.app.KeyguardManager.OnKeyguardExitResult callback) { throw new RuntimeException("Stub!"); }
}
