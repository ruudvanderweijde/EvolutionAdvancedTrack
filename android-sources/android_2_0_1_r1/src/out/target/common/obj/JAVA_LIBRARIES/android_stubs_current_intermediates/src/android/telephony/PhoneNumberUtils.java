package android.telephony;
public class PhoneNumberUtils
{
public  PhoneNumberUtils() { throw new RuntimeException("Stub!"); }
public static  boolean isISODigit(char c) { throw new RuntimeException("Stub!"); }
public static final  boolean is12Key(char c) { throw new RuntimeException("Stub!"); }
public static final  boolean isDialable(char c) { throw new RuntimeException("Stub!"); }
public static final  boolean isReallyDialable(char c) { throw new RuntimeException("Stub!"); }
public static final  boolean isNonSeparator(char c) { throw new RuntimeException("Stub!"); }
public static final  boolean isStartsPostDial(char c) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getNumberFromIntent(android.content.Intent intent, android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  java.lang.String extractNetworkPortion(java.lang.String phoneNumber) { throw new RuntimeException("Stub!"); }
public static  java.lang.String stripSeparators(java.lang.String phoneNumber) { throw new RuntimeException("Stub!"); }
public static  java.lang.String extractPostDialPortion(java.lang.String phoneNumber) { throw new RuntimeException("Stub!"); }
public static  boolean compare(java.lang.String a, java.lang.String b) { throw new RuntimeException("Stub!"); }
public static  boolean compare(android.content.Context context, java.lang.String a, java.lang.String b) { throw new RuntimeException("Stub!"); }
public static  java.lang.String toCallerIDMinMatch(java.lang.String phoneNumber) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getStrippedReversed(java.lang.String phoneNumber) { throw new RuntimeException("Stub!"); }
public static  java.lang.String stringFromStringAndTOA(java.lang.String s, int TOA) { throw new RuntimeException("Stub!"); }
public static  int toaFromString(java.lang.String s) { throw new RuntimeException("Stub!"); }
public static  java.lang.String calledPartyBCDToString(byte[] bytes, int offset, int length) { throw new RuntimeException("Stub!"); }
public static  java.lang.String calledPartyBCDFragmentToString(byte[] bytes, int offset, int length) { throw new RuntimeException("Stub!"); }
public static  boolean isWellFormedSmsAddress(java.lang.String address) { throw new RuntimeException("Stub!"); }
public static  boolean isGlobalPhoneNumber(java.lang.String phoneNumber) { throw new RuntimeException("Stub!"); }
public static  byte[] networkPortionToCalledPartyBCD(java.lang.String s) { throw new RuntimeException("Stub!"); }
public static  byte[] networkPortionToCalledPartyBCDWithLength(java.lang.String s) { throw new RuntimeException("Stub!"); }
public static  byte[] numberToCalledPartyBCD(java.lang.String number) { throw new RuntimeException("Stub!"); }
public static  java.lang.String formatNumber(java.lang.String source) { throw new RuntimeException("Stub!"); }
public static  int getFormatTypeForLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  void formatNumber(android.text.Editable text, int defaultFormattingType) { throw new RuntimeException("Stub!"); }
public static  void formatNanpNumber(android.text.Editable text) { throw new RuntimeException("Stub!"); }
public static  void formatJapaneseNumber(android.text.Editable text) { throw new RuntimeException("Stub!"); }
public static  boolean isEmergencyNumber(java.lang.String number) { throw new RuntimeException("Stub!"); }
public static  java.lang.String convertKeypadLettersToDigits(java.lang.String input) { throw new RuntimeException("Stub!"); }
public static final char PAUSE = 44;
public static final char WAIT = 59;
public static final char WILD = 78;
public static final int TOA_International = 145;
public static final int TOA_Unknown = 129;
public static final int FORMAT_UNKNOWN = 0;
public static final int FORMAT_NANP = 1;
public static final int FORMAT_JAPAN = 2;
}
