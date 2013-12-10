package android.view.inputmethod;
public class EditorInfo
  implements android.text.InputType, android.os.Parcelable
{
public  EditorInfo() { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public int inputType;
public static final int IME_MASK_ACTION = 255;
public static final int IME_ACTION_UNSPECIFIED = 0;
public static final int IME_ACTION_NONE = 1;
public static final int IME_ACTION_GO = 2;
public static final int IME_ACTION_SEARCH = 3;
public static final int IME_ACTION_SEND = 4;
public static final int IME_ACTION_NEXT = 5;
public static final int IME_ACTION_DONE = 6;
public static final int IME_FLAG_NO_EXTRACT_UI = 268435456;
public static final int IME_FLAG_NO_ACCESSORY_ACTION = 536870912;
public static final int IME_FLAG_NO_ENTER_ACTION = 1073741824;
public static final int IME_NULL = 0;
public int imeOptions;
public java.lang.String privateImeOptions;
public java.lang.CharSequence actionLabel;
public int actionId;
public int initialSelStart;
public int initialSelEnd;
public int initialCapsMode;
public java.lang.CharSequence hintText;
public java.lang.CharSequence label;
public java.lang.String packageName;
public int fieldId;
public java.lang.String fieldName;
public android.os.Bundle extras;
public static final android.os.Parcelable.Creator<android.view.inputmethod.EditorInfo> CREATOR;
static { CREATOR = null; }
}
