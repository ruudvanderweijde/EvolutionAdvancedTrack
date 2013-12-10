package android.view;
public class KeyEvent
  implements android.os.Parcelable
{
public static interface Callback
{
public abstract  boolean onKeyDown(int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyUp(int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyMultiple(int keyCode, int count, android.view.KeyEvent event);
}
public  KeyEvent(int action, int code) { throw new RuntimeException("Stub!"); }
public  KeyEvent(long downTime, long eventTime, int action, int code, int repeat) { throw new RuntimeException("Stub!"); }
public  KeyEvent(long downTime, long eventTime, int action, int code, int repeat, int metaState) { throw new RuntimeException("Stub!"); }
public  KeyEvent(long downTime, long eventTime, int action, int code, int repeat, int metaState, int device, int scancode) { throw new RuntimeException("Stub!"); }
public  KeyEvent(long downTime, long eventTime, int action, int code, int repeat, int metaState, int device, int scancode, int flags) { throw new RuntimeException("Stub!"); }
public  KeyEvent(long time, java.lang.String characters, int device, int flags) { throw new RuntimeException("Stub!"); }
public  KeyEvent(android.view.KeyEvent origEvent) { throw new RuntimeException("Stub!"); }
public  KeyEvent(android.view.KeyEvent origEvent, long eventTime, int newRepeat) { throw new RuntimeException("Stub!"); }
public static  int getMaxKeyCode() { throw new RuntimeException("Stub!"); }
public static  int getDeadChar(int accent, int c) { throw new RuntimeException("Stub!"); }
public static  android.view.KeyEvent changeTimeRepeat(android.view.KeyEvent event, long eventTime, int newRepeat) { throw new RuntimeException("Stub!"); }
public static  android.view.KeyEvent changeAction(android.view.KeyEvent event, int action) { throw new RuntimeException("Stub!"); }
public static  android.view.KeyEvent changeFlags(android.view.KeyEvent event, int flags) { throw new RuntimeException("Stub!"); }
public final  boolean isSystem() { throw new RuntimeException("Stub!"); }
public final  int getMetaState() { throw new RuntimeException("Stub!"); }
public final  int getFlags() { throw new RuntimeException("Stub!"); }
public static  boolean isModifierKey(int keyCode) { throw new RuntimeException("Stub!"); }
public final  boolean isAltPressed() { throw new RuntimeException("Stub!"); }
public final  boolean isShiftPressed() { throw new RuntimeException("Stub!"); }
public final  boolean isSymPressed() { throw new RuntimeException("Stub!"); }
public final  int getAction() { throw new RuntimeException("Stub!"); }
public final  int getKeyCode() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getCharacters() { throw new RuntimeException("Stub!"); }
public final  int getScanCode() { throw new RuntimeException("Stub!"); }
public final  int getRepeatCount() { throw new RuntimeException("Stub!"); }
public final  long getDownTime() { throw new RuntimeException("Stub!"); }
public final  long getEventTime() { throw new RuntimeException("Stub!"); }
public final  int getDeviceId() { throw new RuntimeException("Stub!"); }
public  char getDisplayLabel() { throw new RuntimeException("Stub!"); }
public  int getUnicodeChar() { throw new RuntimeException("Stub!"); }
public  int getUnicodeChar(int meta) { throw new RuntimeException("Stub!"); }
public  boolean getKeyData(android.view.KeyCharacterMap.KeyData results) { throw new RuntimeException("Stub!"); }
public  char getMatch(char[] chars) { throw new RuntimeException("Stub!"); }
public  char getMatch(char[] chars, int modifiers) { throw new RuntimeException("Stub!"); }
public  char getNumber() { throw new RuntimeException("Stub!"); }
public  boolean isPrintingKey() { throw new RuntimeException("Stub!"); }
public final  boolean dispatch(android.view.KeyEvent.Callback receiver) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final int KEYCODE_UNKNOWN = 0;
public static final int KEYCODE_SOFT_LEFT = 1;
public static final int KEYCODE_SOFT_RIGHT = 2;
public static final int KEYCODE_HOME = 3;
public static final int KEYCODE_BACK = 4;
public static final int KEYCODE_CALL = 5;
public static final int KEYCODE_ENDCALL = 6;
public static final int KEYCODE_0 = 7;
public static final int KEYCODE_1 = 8;
public static final int KEYCODE_2 = 9;
public static final int KEYCODE_3 = 10;
public static final int KEYCODE_4 = 11;
public static final int KEYCODE_5 = 12;
public static final int KEYCODE_6 = 13;
public static final int KEYCODE_7 = 14;
public static final int KEYCODE_8 = 15;
public static final int KEYCODE_9 = 16;
public static final int KEYCODE_STAR = 17;
public static final int KEYCODE_POUND = 18;
public static final int KEYCODE_DPAD_UP = 19;
public static final int KEYCODE_DPAD_DOWN = 20;
public static final int KEYCODE_DPAD_LEFT = 21;
public static final int KEYCODE_DPAD_RIGHT = 22;
public static final int KEYCODE_DPAD_CENTER = 23;
public static final int KEYCODE_VOLUME_UP = 24;
public static final int KEYCODE_VOLUME_DOWN = 25;
public static final int KEYCODE_POWER = 26;
public static final int KEYCODE_CAMERA = 27;
public static final int KEYCODE_CLEAR = 28;
public static final int KEYCODE_A = 29;
public static final int KEYCODE_B = 30;
public static final int KEYCODE_C = 31;
public static final int KEYCODE_D = 32;
public static final int KEYCODE_E = 33;
public static final int KEYCODE_F = 34;
public static final int KEYCODE_G = 35;
public static final int KEYCODE_H = 36;
public static final int KEYCODE_I = 37;
public static final int KEYCODE_J = 38;
public static final int KEYCODE_K = 39;
public static final int KEYCODE_L = 40;
public static final int KEYCODE_M = 41;
public static final int KEYCODE_N = 42;
public static final int KEYCODE_O = 43;
public static final int KEYCODE_P = 44;
public static final int KEYCODE_Q = 45;
public static final int KEYCODE_R = 46;
public static final int KEYCODE_S = 47;
public static final int KEYCODE_T = 48;
public static final int KEYCODE_U = 49;
public static final int KEYCODE_V = 50;
public static final int KEYCODE_W = 51;
public static final int KEYCODE_X = 52;
public static final int KEYCODE_Y = 53;
public static final int KEYCODE_Z = 54;
public static final int KEYCODE_COMMA = 55;
public static final int KEYCODE_PERIOD = 56;
public static final int KEYCODE_ALT_LEFT = 57;
public static final int KEYCODE_ALT_RIGHT = 58;
public static final int KEYCODE_SHIFT_LEFT = 59;
public static final int KEYCODE_SHIFT_RIGHT = 60;
public static final int KEYCODE_TAB = 61;
public static final int KEYCODE_SPACE = 62;
public static final int KEYCODE_SYM = 63;
public static final int KEYCODE_EXPLORER = 64;
public static final int KEYCODE_ENVELOPE = 65;
public static final int KEYCODE_ENTER = 66;
public static final int KEYCODE_DEL = 67;
public static final int KEYCODE_GRAVE = 68;
public static final int KEYCODE_MINUS = 69;
public static final int KEYCODE_EQUALS = 70;
public static final int KEYCODE_LEFT_BRACKET = 71;
public static final int KEYCODE_RIGHT_BRACKET = 72;
public static final int KEYCODE_BACKSLASH = 73;
public static final int KEYCODE_SEMICOLON = 74;
public static final int KEYCODE_APOSTROPHE = 75;
public static final int KEYCODE_SLASH = 76;
public static final int KEYCODE_AT = 77;
public static final int KEYCODE_NUM = 78;
public static final int KEYCODE_HEADSETHOOK = 79;
public static final int KEYCODE_FOCUS = 80;
public static final int KEYCODE_PLUS = 81;
public static final int KEYCODE_MENU = 82;
public static final int KEYCODE_NOTIFICATION = 83;
public static final int KEYCODE_SEARCH = 84;
public static final int KEYCODE_MEDIA_PLAY_PAUSE = 85;
public static final int KEYCODE_MEDIA_STOP = 86;
public static final int KEYCODE_MEDIA_NEXT = 87;
public static final int KEYCODE_MEDIA_PREVIOUS = 88;
public static final int KEYCODE_MEDIA_REWIND = 89;
public static final int KEYCODE_MEDIA_FAST_FORWARD = 90;
public static final int KEYCODE_MUTE = 91;
public static final int MAX_KEYCODE = 84;
public static final int ACTION_DOWN = 0;
public static final int ACTION_UP = 1;
public static final int ACTION_MULTIPLE = 2;
public static final int META_ALT_ON = 2;
public static final int META_ALT_LEFT_ON = 16;
public static final int META_ALT_RIGHT_ON = 32;
public static final int META_SHIFT_ON = 1;
public static final int META_SHIFT_LEFT_ON = 64;
public static final int META_SHIFT_RIGHT_ON = 128;
public static final int META_SYM_ON = 4;
public static final int FLAG_WOKE_HERE = 1;
public static final int FLAG_SOFT_KEYBOARD = 2;
public static final int FLAG_KEEP_TOUCH_MODE = 4;
public static final int FLAG_FROM_SYSTEM = 8;
public static final int FLAG_EDITOR_ACTION = 16;
public static final android.os.Parcelable.Creator<android.view.KeyEvent> CREATOR;
static { CREATOR = null; }
}
