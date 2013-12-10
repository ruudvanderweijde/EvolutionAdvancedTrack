package android.view;
public class KeyCharacterMap
{
public static class KeyData
{
public  KeyData() { throw new RuntimeException("Stub!"); }
public static final int META_LENGTH = 4;
public char displayLabel;
public char number;
public char[] meta = null;
}
KeyCharacterMap() { throw new RuntimeException("Stub!"); }
public static  android.view.KeyCharacterMap load(int keyboard) { throw new RuntimeException("Stub!"); }
public  int get(int keyCode, int meta) { throw new RuntimeException("Stub!"); }
public  char getNumber(int keyCode) { throw new RuntimeException("Stub!"); }
public  char getMatch(int keyCode, char[] chars) { throw new RuntimeException("Stub!"); }
public  char getMatch(int keyCode, char[] chars, int modifiers) { throw new RuntimeException("Stub!"); }
public  char getDisplayLabel(int keyCode) { throw new RuntimeException("Stub!"); }
public static  int getDeadChar(int accent, int c) { throw new RuntimeException("Stub!"); }
public  boolean getKeyData(int keyCode, android.view.KeyCharacterMap.KeyData results) { throw new RuntimeException("Stub!"); }
public  android.view.KeyEvent[] getEvents(char[] chars) { throw new RuntimeException("Stub!"); }
public  boolean isPrintingKey(int keyCode) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  int getKeyboardType() { throw new RuntimeException("Stub!"); }
public static  boolean deviceHasKey(int keyCode) { throw new RuntimeException("Stub!"); }
public static  boolean[] deviceHasKeys(int[] keyCodes) { throw new RuntimeException("Stub!"); }
public static final int BUILT_IN_KEYBOARD = 0;
public static final int NUMERIC = 1;
public static final int PREDICTIVE = 2;
public static final int ALPHA = 3;
public static final char HEX_INPUT = 61184;
public static final char PICKER_DIALOG_INPUT = 61185;
public static final int COMBINING_ACCENT = -2147483648;
public static final int COMBINING_ACCENT_MASK = 2147483647;
}
