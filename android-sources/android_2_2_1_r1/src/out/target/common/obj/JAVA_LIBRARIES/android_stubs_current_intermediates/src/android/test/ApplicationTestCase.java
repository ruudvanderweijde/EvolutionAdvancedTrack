package android.test;
public abstract class ApplicationTestCase<T extends android.app.Application>
  extends android.test.AndroidTestCase
{
public  ApplicationTestCase(java.lang.Class<T> applicationClass) { throw new RuntimeException("Stub!"); }
public  T getApplication() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
protected final  void createApplication() { throw new RuntimeException("Stub!"); }
protected final  void terminateApplication() { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  android.content.Context getSystemContext() { throw new RuntimeException("Stub!"); }
public final  void testApplicationTestCaseSetUpProperly() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
}
