package android.test;
public abstract class ServiceTestCase<T extends android.app.Service>
  extends android.test.AndroidTestCase
{
public  ServiceTestCase(java.lang.Class<T> serviceClass) { throw new RuntimeException("Stub!"); }
public  T getService() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
protected  void setupService() { throw new RuntimeException("Stub!"); }
protected  void startService(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
protected  android.os.IBinder bindService(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
protected  void shutdownService() { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  void setApplication(android.app.Application application) { throw new RuntimeException("Stub!"); }
public  android.app.Application getApplication() { throw new RuntimeException("Stub!"); }
public  android.content.Context getSystemContext() { throw new RuntimeException("Stub!"); }
public  void testServiceTestCaseSetUpProperly() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
}
