package android.os;
public abstract class AsyncTask<Params, Progress, Result>
{
public static enum Status
{
FINISHED(),
PENDING(),
RUNNING();
}
public  AsyncTask() { throw new RuntimeException("Stub!"); }
public final  android.os.AsyncTask.Status getStatus() { throw new RuntimeException("Stub!"); }
protected abstract  Result doInBackground(Params... params);
protected  void onPreExecute() { throw new RuntimeException("Stub!"); }
protected  void onPostExecute(Result result) { throw new RuntimeException("Stub!"); }
protected  void onProgressUpdate(Progress... values) { throw new RuntimeException("Stub!"); }
protected  void onCancelled() { throw new RuntimeException("Stub!"); }
public final  boolean isCancelled() { throw new RuntimeException("Stub!"); }
public final  boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); }
public final  Result get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException { throw new RuntimeException("Stub!"); }
public final  Result get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
public final  android.os.AsyncTask<Params, Progress, Result> execute(Params... params) { throw new RuntimeException("Stub!"); }
protected final  void publishProgress(Progress... values) { throw new RuntimeException("Stub!"); }
}
