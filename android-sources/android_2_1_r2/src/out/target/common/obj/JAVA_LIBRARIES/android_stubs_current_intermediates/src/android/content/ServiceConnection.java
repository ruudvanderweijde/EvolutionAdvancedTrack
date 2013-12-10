package android.content;
public interface ServiceConnection
{
public abstract  void onServiceConnected(android.content.ComponentName name, android.os.IBinder service);
public abstract  void onServiceDisconnected(android.content.ComponentName name);
}
