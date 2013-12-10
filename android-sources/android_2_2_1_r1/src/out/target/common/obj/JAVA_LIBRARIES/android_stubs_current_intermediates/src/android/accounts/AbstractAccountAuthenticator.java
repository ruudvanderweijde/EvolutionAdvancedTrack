package android.accounts;
public abstract class AbstractAccountAuthenticator
{
public  AbstractAccountAuthenticator(android.content.Context context) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder getIBinder() { throw new RuntimeException("Stub!"); }
public abstract  android.os.Bundle editProperties(android.accounts.AccountAuthenticatorResponse response, java.lang.String accountType);
public abstract  android.os.Bundle addAccount(android.accounts.AccountAuthenticatorResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, android.os.Bundle options) throws android.accounts.NetworkErrorException;
public abstract  android.os.Bundle confirmCredentials(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, android.os.Bundle options) throws android.accounts.NetworkErrorException;
public abstract  android.os.Bundle getAuthToken(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.accounts.NetworkErrorException;
public abstract  java.lang.String getAuthTokenLabel(java.lang.String authTokenType);
public abstract  android.os.Bundle updateCredentials(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.accounts.NetworkErrorException;
public abstract  android.os.Bundle hasFeatures(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String[] features) throws android.accounts.NetworkErrorException;
public  android.os.Bundle getAccountRemovalAllowed(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account) throws android.accounts.NetworkErrorException { throw new RuntimeException("Stub!"); }
}
