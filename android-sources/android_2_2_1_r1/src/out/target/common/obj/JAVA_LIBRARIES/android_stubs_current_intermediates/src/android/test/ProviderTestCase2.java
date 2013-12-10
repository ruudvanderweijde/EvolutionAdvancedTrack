package android.test;
public abstract class ProviderTestCase2<T extends android.content.ContentProvider>
  extends android.test.AndroidTestCase
{
public  ProviderTestCase2(java.lang.Class<T> providerClass, java.lang.String providerAuthority) { throw new RuntimeException("Stub!"); }
public  T getProvider() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  android.test.mock.MockContentResolver getMockContentResolver() { throw new RuntimeException("Stub!"); }
public  android.test.IsolatedContext getMockContext() { throw new RuntimeException("Stub!"); }
public static <T extends android.content.ContentProvider> android.content.ContentResolver newResolverWithContentProviderFromSql(android.content.Context targetContext, java.lang.String filenamePrefix, java.lang.Class<T> providerClass, java.lang.String authority, java.lang.String databaseName, int databaseVersion, java.lang.String sql) throws java.lang.IllegalAccessException, java.lang.InstantiationException { throw new RuntimeException("Stub!"); }
}
