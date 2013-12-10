package android.net;
public class LocalSocketAddress
{
public static enum Namespace
{
ABSTRACT(),
FILESYSTEM(),
RESERVED();
}
public  LocalSocketAddress(java.lang.String name, android.net.LocalSocketAddress.Namespace namespace) { throw new RuntimeException("Stub!"); }
public  LocalSocketAddress(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  android.net.LocalSocketAddress.Namespace getNamespace() { throw new RuntimeException("Stub!"); }
}
