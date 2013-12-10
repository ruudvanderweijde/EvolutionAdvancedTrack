package android.test;
@java.lang.Deprecated()
public abstract class ProviderTestCase<T extends android.content.ContentProvider>
  extends android.test.InstrumentationTestCase
{
public  ProviderTestCase(java.lang.Class<T> providerClass, java.lang.String providerAuthority) { throw new RuntimeException("Stub!"); }
public  T getProvider() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  android.test.mock.MockContentResolver getMockContentResolver() { throw new RuntimeException("Stub!"); }
public  android.test.IsolatedContext getMockContext() { throw new RuntimeException("Stub!"); }
public static <T extends android.content.ContentProvider> android.content.ContentResolver newResolverWithContentProviderFromSql(android.content.Context targetContext, java.lang.Class<T> providerClass, java.lang.String authority, java.lang.String databaseName, int databaseVersion, java.lang.String sql) throws java.lang.IllegalAccessException, java.lang.InstantiationException { throw new RuntimeException("Stub!"); }
}
