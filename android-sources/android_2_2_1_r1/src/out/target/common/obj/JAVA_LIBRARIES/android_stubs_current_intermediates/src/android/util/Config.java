package android.util;
public final class Config
{
public  Config() { throw new RuntimeException("Stub!"); }
public static final boolean DEBUG;
public static final boolean RELEASE;
public static final boolean PROFILE = false;
public static final boolean LOGV = false;
public static final boolean LOGD = true;
static { DEBUG = false; RELEASE = false; }
}
