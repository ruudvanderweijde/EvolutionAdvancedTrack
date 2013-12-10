package android.webkit;
@java.lang.Deprecated()
public class Plugin
{
public static interface PreferencesClickHandler
{
public abstract  void handleClickEvent(android.content.Context context);
}
public  Plugin(java.lang.String name, java.lang.String path, java.lang.String fileName, java.lang.String description) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public  java.lang.String getFileName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDescription() { throw new RuntimeException("Stub!"); }
public  void setName(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void setPath(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  void setFileName(java.lang.String fileName) { throw new RuntimeException("Stub!"); }
public  void setDescription(java.lang.String description) { throw new RuntimeException("Stub!"); }
public  void setClickHandler(android.webkit.Plugin.PreferencesClickHandler handler) { throw new RuntimeException("Stub!"); }
public  void dispatchClickEvent(android.content.Context context) { throw new RuntimeException("Stub!"); }
}
