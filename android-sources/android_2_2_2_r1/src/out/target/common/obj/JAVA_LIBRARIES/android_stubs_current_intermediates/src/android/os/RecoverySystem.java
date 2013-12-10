package android.os;
public class RecoverySystem
{
public static interface ProgressListener
{
public abstract  void onProgress(int progress);
}
public  RecoverySystem() { throw new RuntimeException("Stub!"); }
public static  void verifyPackage(java.io.File packageFile, android.os.RecoverySystem.ProgressListener listener, java.io.File deviceCertsZipFile) throws java.io.IOException, java.security.GeneralSecurityException { throw new RuntimeException("Stub!"); }
public static  void installPackage(android.content.Context context, java.io.File packageFile) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  void rebootWipeUserData(android.content.Context context) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
