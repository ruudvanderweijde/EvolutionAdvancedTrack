package android.os;
public abstract class CountDownTimer
{
public  CountDownTimer(long millisInFuture, long countDownInterval) { throw new RuntimeException("Stub!"); }
public final  void cancel() { throw new RuntimeException("Stub!"); }
public final synchronized  android.os.CountDownTimer start() { throw new RuntimeException("Stub!"); }
public abstract  void onTick(long millisUntilFinished);
public abstract  void onFinish();
}
