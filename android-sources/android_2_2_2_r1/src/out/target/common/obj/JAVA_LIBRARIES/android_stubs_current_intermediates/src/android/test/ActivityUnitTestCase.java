package android.test;
public abstract class ActivityUnitTestCase<T extends android.app.Activity>
  extends android.test.ActivityTestCase
{
public  ActivityUnitTestCase(java.lang.Class<T> activityClass) { throw new RuntimeException("Stub!"); }
public  T getActivity() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
protected  T startActivity(android.content.Intent intent, android.os.Bundle savedInstanceState, java.lang.Object lastNonConfigurationInstance) { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  void setApplication(android.app.Application application) { throw new RuntimeException("Stub!"); }
public  void setActivityContext(android.content.Context activityContext) { throw new RuntimeException("Stub!"); }
public  int getRequestedOrientation() { throw new RuntimeException("Stub!"); }
public  android.content.Intent getStartedActivityIntent() { throw new RuntimeException("Stub!"); }
public  int getStartedActivityRequest() { throw new RuntimeException("Stub!"); }
public  boolean isFinishCalled() { throw new RuntimeException("Stub!"); }
public  int getFinishedActivityRequest() { throw new RuntimeException("Stub!"); }
}
