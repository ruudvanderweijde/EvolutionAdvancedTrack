package android.app.backup;
public interface BackupHelper
{
public abstract  void performBackup(android.os.ParcelFileDescriptor oldState, android.app.backup.BackupDataOutput data, android.os.ParcelFileDescriptor newState);
public abstract  void restoreEntity(android.app.backup.BackupDataInputStream data);
public abstract  void writeNewStateDescription(android.os.ParcelFileDescriptor newState);
}
