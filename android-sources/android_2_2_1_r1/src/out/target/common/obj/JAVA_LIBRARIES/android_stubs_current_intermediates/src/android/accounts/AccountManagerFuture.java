package android.accounts;
public interface AccountManagerFuture<V>
{
public abstract  boolean cancel(boolean mayInterruptIfRunning);
public abstract  boolean isCancelled();
public abstract  boolean isDone();
public abstract  V getResult() throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException;
public abstract  V getResult(long timeout, java.util.concurrent.TimeUnit unit) throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException;
}
