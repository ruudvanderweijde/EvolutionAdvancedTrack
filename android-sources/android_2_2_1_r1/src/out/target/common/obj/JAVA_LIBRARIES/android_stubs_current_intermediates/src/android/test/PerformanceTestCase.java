package android.test;
public interface PerformanceTestCase
{
public static interface Intermediates
{
public abstract  void setInternalIterations(int count);
public abstract  void startTiming(boolean realTime);
public abstract  void addIntermediate(java.lang.String name);
public abstract  void addIntermediate(java.lang.String name, long timeInNS);
public abstract  void finishTiming(boolean realTime);
}
public abstract  int startPerformance(android.test.PerformanceTestCase.Intermediates intermediates);
public abstract  boolean isPerformanceOnly();
}
