package android.accounts;
public interface AccountManagerCallback<V>
{
public abstract  void run(android.accounts.AccountManagerFuture<V> future);
}
