package android.os;
public final class Debug
{
public static class MemoryInfo
  implements android.os.Parcelable
{
public  MemoryInfo() { throw new RuntimeException("Stub!"); }
public  int getTotalPss() { throw new RuntimeException("Stub!"); }
public  int getTotalPrivateDirty() { throw new RuntimeException("Stub!"); }
public  int getTotalSharedDirty() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public int dalvikPss;
public int dalvikPrivateDirty;
public int dalvikSharedDirty;
public int nativePss;
public int nativePrivateDirty;
public int nativeSharedDirty;
public int otherPss;
public int otherPrivateDirty;
public int otherSharedDirty;
public static final android.os.Parcelable.Creator<android.os.Debug.MemoryInfo> CREATOR;
static { CREATOR = null; }
}
public static class InstructionCount
{
public  InstructionCount() { throw new RuntimeException("Stub!"); }
public  boolean resetAndStart() { throw new RuntimeException("Stub!"); }
public  boolean collect() { throw new RuntimeException("Stub!"); }
public  int globalTotal() { throw new RuntimeException("Stub!"); }
public  int globalMethodInvocations() { throw new RuntimeException("Stub!"); }
}
Debug() { throw new RuntimeException("Stub!"); }
public static  void waitForDebugger() { throw new RuntimeException("Stub!"); }
public static  boolean waitingForDebugger() { throw new RuntimeException("Stub!"); }
public static  boolean isDebuggerConnected() { throw new RuntimeException("Stub!"); }
public static  void changeDebugPort(int port) { throw new RuntimeException("Stub!"); }
public static  void startNativeTracing() { throw new RuntimeException("Stub!"); }
public static  void stopNativeTracing() { throw new RuntimeException("Stub!"); }
public static  void enableEmulatorTraceOutput() { throw new RuntimeException("Stub!"); }
public static  void startMethodTracing() { throw new RuntimeException("Stub!"); }
public static  void startMethodTracing(java.lang.String traceName) { throw new RuntimeException("Stub!"); }
public static  void startMethodTracing(java.lang.String traceName, int bufferSize) { throw new RuntimeException("Stub!"); }
public static  void startMethodTracing(java.lang.String traceName, int bufferSize, int flags) { throw new RuntimeException("Stub!"); }
public static  void stopMethodTracing() { throw new RuntimeException("Stub!"); }
public static  long threadCpuTimeNanos() { throw new RuntimeException("Stub!"); }
public static  void startAllocCounting() { throw new RuntimeException("Stub!"); }
public static  void stopAllocCounting() { throw new RuntimeException("Stub!"); }
public static  int getGlobalAllocCount() { throw new RuntimeException("Stub!"); }
public static  int getGlobalAllocSize() { throw new RuntimeException("Stub!"); }
public static  int getGlobalFreedCount() { throw new RuntimeException("Stub!"); }
public static  int getGlobalFreedSize() { throw new RuntimeException("Stub!"); }
public static  int getGlobalClassInitCount() { throw new RuntimeException("Stub!"); }
public static  int getGlobalClassInitTime() { throw new RuntimeException("Stub!"); }
public static  int getGlobalExternalAllocCount() { throw new RuntimeException("Stub!"); }
public static  int getGlobalExternalAllocSize() { throw new RuntimeException("Stub!"); }
public static  int getGlobalExternalFreedCount() { throw new RuntimeException("Stub!"); }
public static  int getGlobalExternalFreedSize() { throw new RuntimeException("Stub!"); }
public static  int getGlobalGcInvocationCount() { throw new RuntimeException("Stub!"); }
public static  int getThreadAllocCount() { throw new RuntimeException("Stub!"); }
public static  int getThreadAllocSize() { throw new RuntimeException("Stub!"); }
public static  int getThreadExternalAllocCount() { throw new RuntimeException("Stub!"); }
public static  int getThreadExternalAllocSize() { throw new RuntimeException("Stub!"); }
public static  int getThreadGcInvocationCount() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalAllocCount() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalAllocSize() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalFreedCount() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalFreedSize() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalClassInitCount() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalClassInitTime() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalExternalAllocCount() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalExternalAllocSize() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalExternalFreedCount() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalExternalFreedSize() { throw new RuntimeException("Stub!"); }
public static  void resetGlobalGcInvocationCount() { throw new RuntimeException("Stub!"); }
public static  void resetThreadAllocCount() { throw new RuntimeException("Stub!"); }
public static  void resetThreadAllocSize() { throw new RuntimeException("Stub!"); }
public static  void resetThreadExternalAllocCount() { throw new RuntimeException("Stub!"); }
public static  void resetThreadExternalAllocSize() { throw new RuntimeException("Stub!"); }
public static  void resetThreadGcInvocationCount() { throw new RuntimeException("Stub!"); }
public static  void resetAllCounts() { throw new RuntimeException("Stub!"); }
public static native  long getNativeHeapSize();
public static native  long getNativeHeapAllocatedSize();
public static native  long getNativeHeapFreeSize();
public static native  void getMemoryInfo(android.os.Debug.MemoryInfo memoryInfo);
public static  int setAllocationLimit(int limit) { throw new RuntimeException("Stub!"); }
public static  int setGlobalAllocationLimit(int limit) { throw new RuntimeException("Stub!"); }
public static  void printLoadedClasses(int flags) { throw new RuntimeException("Stub!"); }
public static  int getLoadedClassCount() { throw new RuntimeException("Stub!"); }
public static  void dumpHprofData(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static native  int getBinderSentTransactions();
public static native  int getBinderReceivedTransactions();
public static final native  int getBinderLocalObjectCount();
public static final native  int getBinderProxyObjectCount();
public static final native  int getBinderDeathObjectCount();
public static  boolean dumpService(java.lang.String name, java.io.FileDescriptor fd, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public static final int TRACE_COUNT_ALLOCS = 1;
public static final int SHOW_FULL_DETAIL = 1;
public static final int SHOW_CLASSLOADER = 2;
public static final int SHOW_INITIALIZED = 4;
}
