package android.accounts;
public class AccountManager
{
AccountManager() { throw new RuntimeException("Stub!"); }
public static  android.accounts.AccountManager get(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPassword(android.accounts.Account account) { throw new RuntimeException("Stub!"); }
public  java.lang.String getUserData(android.accounts.Account account, java.lang.String key) { throw new RuntimeException("Stub!"); }
public  android.accounts.AuthenticatorDescription[] getAuthenticatorTypes() { throw new RuntimeException("Stub!"); }
public  android.accounts.Account[] getAccounts() { throw new RuntimeException("Stub!"); }
public  android.accounts.Account[] getAccountsByType(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<java.lang.Boolean> hasFeatures(android.accounts.Account account, java.lang.String[] features, android.accounts.AccountManagerCallback<java.lang.Boolean> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<android.accounts.Account[]> getAccountsByTypeAndFeatures(java.lang.String type, java.lang.String[] features, android.accounts.AccountManagerCallback<android.accounts.Account[]> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean addAccountExplicitly(android.accounts.Account account, java.lang.String password, android.os.Bundle userdata) { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<java.lang.Boolean> removeAccount(android.accounts.Account account, android.accounts.AccountManagerCallback<java.lang.Boolean> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void invalidateAuthToken(java.lang.String accountType, java.lang.String authToken) { throw new RuntimeException("Stub!"); }
public  java.lang.String peekAuthToken(android.accounts.Account account, java.lang.String authTokenType) { throw new RuntimeException("Stub!"); }
public  void setPassword(android.accounts.Account account, java.lang.String password) { throw new RuntimeException("Stub!"); }
public  void clearPassword(android.accounts.Account account) { throw new RuntimeException("Stub!"); }
public  void setUserData(android.accounts.Account account, java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setAuthToken(android.accounts.Account account, java.lang.String authTokenType, java.lang.String authToken) { throw new RuntimeException("Stub!"); }
public  java.lang.String blockingGetAuthToken(android.accounts.Account account, java.lang.String authTokenType, boolean notifyAuthFailure) throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<android.os.Bundle> getAuthToken(android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options, android.app.Activity activity, android.accounts.AccountManagerCallback<android.os.Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<android.os.Bundle> getAuthToken(android.accounts.Account account, java.lang.String authTokenType, boolean notifyAuthFailure, android.accounts.AccountManagerCallback<android.os.Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<android.os.Bundle> addAccount(java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, android.os.Bundle addAccountOptions, android.app.Activity activity, android.accounts.AccountManagerCallback<android.os.Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<android.os.Bundle> confirmCredentials(android.accounts.Account account, android.os.Bundle options, android.app.Activity activity, android.accounts.AccountManagerCallback<android.os.Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<android.os.Bundle> updateCredentials(android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options, android.app.Activity activity, android.accounts.AccountManagerCallback<android.os.Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<android.os.Bundle> editProperties(java.lang.String accountType, android.app.Activity activity, android.accounts.AccountManagerCallback<android.os.Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.accounts.AccountManagerFuture<android.os.Bundle> getAuthTokenByFeatures(java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] features, android.app.Activity activity, android.os.Bundle addAccountOptions, android.os.Bundle getAuthTokenOptions, android.accounts.AccountManagerCallback<android.os.Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void addOnAccountsUpdatedListener(android.accounts.OnAccountsUpdateListener listener, android.os.Handler handler, boolean updateImmediately) { throw new RuntimeException("Stub!"); }
public  void removeOnAccountsUpdatedListener(android.accounts.OnAccountsUpdateListener listener) { throw new RuntimeException("Stub!"); }
public static final int ERROR_CODE_REMOTE_EXCEPTION = 1;
public static final int ERROR_CODE_NETWORK_ERROR = 3;
public static final int ERROR_CODE_CANCELED = 4;
public static final int ERROR_CODE_INVALID_RESPONSE = 5;
public static final int ERROR_CODE_UNSUPPORTED_OPERATION = 6;
public static final int ERROR_CODE_BAD_ARGUMENTS = 7;
public static final int ERROR_CODE_BAD_REQUEST = 8;
public static final java.lang.String KEY_ACCOUNT_NAME = "authAccount";
public static final java.lang.String KEY_ACCOUNT_TYPE = "accountType";
public static final java.lang.String KEY_AUTHTOKEN = "authtoken";
public static final java.lang.String KEY_INTENT = "intent";
public static final java.lang.String KEY_PASSWORD = "password";
public static final java.lang.String KEY_ACCOUNTS = "accounts";
public static final java.lang.String KEY_ACCOUNT_AUTHENTICATOR_RESPONSE = "accountAuthenticatorResponse";
public static final java.lang.String KEY_ACCOUNT_MANAGER_RESPONSE = "accountManagerResponse";
public static final java.lang.String KEY_AUTHENTICATOR_TYPES = "authenticator_types";
public static final java.lang.String KEY_AUTH_FAILED_MESSAGE = "authFailedMessage";
public static final java.lang.String KEY_AUTH_TOKEN_LABEL = "authTokenLabelKey";
public static final java.lang.String KEY_BOOLEAN_RESULT = "booleanResult";
public static final java.lang.String KEY_ERROR_CODE = "errorCode";
public static final java.lang.String KEY_ERROR_MESSAGE = "errorMessage";
public static final java.lang.String KEY_USERDATA = "userdata";
public static final java.lang.String ACTION_AUTHENTICATOR_INTENT = "android.accounts.AccountAuthenticator";
public static final java.lang.String AUTHENTICATOR_META_DATA_NAME = "android.accounts.AccountAuthenticator";
public static final java.lang.String AUTHENTICATOR_ATTRIBUTES_NAME = "account-authenticator";
public static final java.lang.String LOGIN_ACCOUNTS_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_CHANGED";
}
