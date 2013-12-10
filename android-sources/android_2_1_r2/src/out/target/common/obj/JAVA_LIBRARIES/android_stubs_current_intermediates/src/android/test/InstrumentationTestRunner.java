package android.test;
public class InstrumentationTestRunner
  extends android.app.Instrumentation
  implements android.test.TestSuiteProvider
{
public  InstrumentationTestRunner() { throw new RuntimeException("Stub!"); }
public  void onCreate(android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
protected  android.test.AndroidTestRunner getAndroidTestRunner() { throw new RuntimeException("Stub!"); }
public  void onStart() { throw new RuntimeException("Stub!"); }
public  junit.framework.TestSuite getTestSuite() { throw new RuntimeException("Stub!"); }
public  junit.framework.TestSuite getAllTests() { throw new RuntimeException("Stub!"); }
public  java.lang.ClassLoader getLoader() { throw new RuntimeException("Stub!"); }
public static final java.lang.String REPORT_VALUE_ID = "InstrumentationTestRunner";
public static final java.lang.String REPORT_KEY_NUM_TOTAL = "numtests";
public static final java.lang.String REPORT_KEY_NUM_CURRENT = "current";
public static final java.lang.String REPORT_KEY_NAME_CLASS = "class";
public static final java.lang.String REPORT_KEY_NAME_TEST = "test";
public static final int REPORT_VALUE_RESULT_START = 1;
public static final int REPORT_VALUE_RESULT_OK = 0;
public static final int REPORT_VALUE_RESULT_ERROR = -1;
public static final int REPORT_VALUE_RESULT_FAILURE = -2;
public static final java.lang.String REPORT_KEY_STACK = "stack";
}
