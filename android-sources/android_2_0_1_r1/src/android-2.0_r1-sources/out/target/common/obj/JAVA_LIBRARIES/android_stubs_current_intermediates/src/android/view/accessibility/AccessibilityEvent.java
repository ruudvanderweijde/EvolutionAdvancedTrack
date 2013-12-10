package android.view.accessibility;
public final class AccessibilityEvent
  implements android.os.Parcelable
{
AccessibilityEvent() { throw new RuntimeException("Stub!"); }
public  boolean isChecked() { throw new RuntimeException("Stub!"); }
public  void setChecked(boolean isChecked) { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean isEnabled) { throw new RuntimeException("Stub!"); }
public  boolean isPassword() { throw new RuntimeException("Stub!"); }
public  void setPassword(boolean isPassword) { throw new RuntimeException("Stub!"); }
public  void setFullScreen(boolean isFullScreen) { throw new RuntimeException("Stub!"); }
public  boolean isFullScreen() { throw new RuntimeException("Stub!"); }
public  int getEventType() { throw new RuntimeException("Stub!"); }
public  void setEventType(int eventType) { throw new RuntimeException("Stub!"); }
public  int getItemCount() { throw new RuntimeException("Stub!"); }
public  void setItemCount(int itemCount) { throw new RuntimeException("Stub!"); }
public  int getCurrentItemIndex() { throw new RuntimeException("Stub!"); }
public  void setCurrentItemIndex(int currentItemIndex) { throw new RuntimeException("Stub!"); }
public  int getFromIndex() { throw new RuntimeException("Stub!"); }
public  void setFromIndex(int fromIndex) { throw new RuntimeException("Stub!"); }
public  int getAddedCount() { throw new RuntimeException("Stub!"); }
public  void setAddedCount(int addedCount) { throw new RuntimeException("Stub!"); }
public  int getRemovedCount() { throw new RuntimeException("Stub!"); }
public  void setRemovedCount(int removedCount) { throw new RuntimeException("Stub!"); }
public  long getEventTime() { throw new RuntimeException("Stub!"); }
public  void setEventTime(long eventTime) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getClassName() { throw new RuntimeException("Stub!"); }
public  void setClassName(java.lang.CharSequence className) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getPackageName() { throw new RuntimeException("Stub!"); }
public  void setPackageName(java.lang.CharSequence packageName) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.CharSequence> getText() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getBeforeText() { throw new RuntimeException("Stub!"); }
public  void setBeforeText(java.lang.CharSequence beforeText) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
public  void setContentDescription(java.lang.CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable getParcelableData() { throw new RuntimeException("Stub!"); }
public  void setParcelableData(android.os.Parcelable parcelableData) { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityEvent obtain(int eventType) { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityEvent obtain() { throw new RuntimeException("Stub!"); }
public  void recycle() { throw new RuntimeException("Stub!"); }
public  void initFromParcel(android.os.Parcel parcel) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int INVALID_POSITION = -1;
public static final int MAX_TEXT_LENGTH = 500;
public static final int TYPE_VIEW_CLICKED = 1;
public static final int TYPE_VIEW_LONG_CLICKED = 2;
public static final int TYPE_VIEW_SELECTED = 4;
public static final int TYPE_VIEW_FOCUSED = 8;
public static final int TYPE_VIEW_TEXT_CHANGED = 16;
public static final int TYPE_WINDOW_STATE_CHANGED = 32;
public static final int TYPE_NOTIFICATION_STATE_CHANGED = 64;
public static final int TYPES_ALL_MASK = -1;
public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityEvent> CREATOR;
static { CREATOR = null; }
}
