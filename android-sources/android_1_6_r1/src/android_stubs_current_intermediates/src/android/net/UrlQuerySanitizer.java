package android.net;
public class UrlQuerySanitizer
{
public class ParameterValuePair
{
public  ParameterValuePair(java.lang.String parameter, java.lang.String value) { throw new RuntimeException("Stub!"); }
public java.lang.String mParameter;
public java.lang.String mValue;
}
public static interface ValueSanitizer
{
public abstract  java.lang.String sanitize(java.lang.String value);
}
public static class IllegalCharacterValueSanitizer
  implements android.net.UrlQuerySanitizer.ValueSanitizer
{
public  IllegalCharacterValueSanitizer(int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String sanitize(java.lang.String value) { throw new RuntimeException("Stub!"); }
public static final int SPACE_OK = 1;
public static final int OTHER_WHITESPACE_OK = 2;
public static final int NON_7_BIT_ASCII_OK = 4;
public static final int DQUOTE_OK = 8;
public static final int SQUOTE_OK = 16;
public static final int LT_OK = 32;
public static final int GT_OK = 64;
public static final int AMP_OK = 128;
public static final int PCT_OK = 256;
public static final int NUL_OK = 512;
public static final int SCRIPT_URL_OK = 1024;
public static final int ALL_OK = 2047;
public static final int ALL_WHITESPACE_OK = 3;
public static final int ALL_ILLEGAL = 0;
public static final int ALL_BUT_NUL_LEGAL = 1535;
public static final int ALL_BUT_WHITESPACE_LEGAL = 1532;
public static final int URL_LEGAL = 404;
public static final int URL_AND_SPACE_LEGAL = 405;
public static final int AMP_LEGAL = 128;
public static final int AMP_AND_SPACE_LEGAL = 129;
public static final int SPACE_LEGAL = 1;
public static final int ALL_BUT_NUL_AND_ANGLE_BRACKETS_LEGAL = 1439;
}
public  UrlQuerySanitizer() { throw new RuntimeException("Stub!"); }
public  UrlQuerySanitizer(java.lang.String url) { throw new RuntimeException("Stub!"); }
public  android.net.UrlQuerySanitizer.ValueSanitizer getUnregisteredParameterValueSanitizer() { throw new RuntimeException("Stub!"); }
public  void setUnregisteredParameterValueSanitizer(android.net.UrlQuerySanitizer.ValueSanitizer sanitizer) { throw new RuntimeException("Stub!"); }
public static final  android.net.UrlQuerySanitizer.ValueSanitizer getAllIllegal() { throw new RuntimeException("Stub!"); }
public static final  android.net.UrlQuerySanitizer.ValueSanitizer getAllButNulLegal() { throw new RuntimeException("Stub!"); }
public static final  android.net.UrlQuerySanitizer.ValueSanitizer getAllButWhitespaceLegal() { throw new RuntimeException("Stub!"); }
public static final  android.net.UrlQuerySanitizer.ValueSanitizer getUrlLegal() { throw new RuntimeException("Stub!"); }
public static final  android.net.UrlQuerySanitizer.ValueSanitizer getUrlAndSpaceLegal() { throw new RuntimeException("Stub!"); }
public static final  android.net.UrlQuerySanitizer.ValueSanitizer getAmpLegal() { throw new RuntimeException("Stub!"); }
public static final  android.net.UrlQuerySanitizer.ValueSanitizer getAmpAndSpaceLegal() { throw new RuntimeException("Stub!"); }
public static final  android.net.UrlQuerySanitizer.ValueSanitizer getSpaceLegal() { throw new RuntimeException("Stub!"); }
public static final  android.net.UrlQuerySanitizer.ValueSanitizer getAllButNulAndAngleBracketsLegal() { throw new RuntimeException("Stub!"); }
public  void parseUrl(java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void parseQuery(java.lang.String query) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getParameterSet() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.net.UrlQuerySanitizer.ParameterValuePair> getParameterList() { throw new RuntimeException("Stub!"); }
public  boolean hasParameter(java.lang.String parameter) { throw new RuntimeException("Stub!"); }
public  java.lang.String getValue(java.lang.String parameter) { throw new RuntimeException("Stub!"); }
public  void registerParameter(java.lang.String parameter, android.net.UrlQuerySanitizer.ValueSanitizer valueSanitizer) { throw new RuntimeException("Stub!"); }
public  void registerParameters(java.lang.String[] parameters, android.net.UrlQuerySanitizer.ValueSanitizer valueSanitizer) { throw new RuntimeException("Stub!"); }
public  void setAllowUnregisteredParamaters(boolean allowUnregisteredParamaters) { throw new RuntimeException("Stub!"); }
public  boolean getAllowUnregisteredParamaters() { throw new RuntimeException("Stub!"); }
public  void setPreferFirstRepeatedParameter(boolean preferFirstRepeatedParameter) { throw new RuntimeException("Stub!"); }
public  boolean getPreferFirstRepeatedParameter() { throw new RuntimeException("Stub!"); }
protected  void parseEntry(java.lang.String parameter, java.lang.String value) { throw new RuntimeException("Stub!"); }
protected  void addSanitizedEntry(java.lang.String parameter, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.net.UrlQuerySanitizer.ValueSanitizer getValueSanitizer(java.lang.String parameter) { throw new RuntimeException("Stub!"); }
public  android.net.UrlQuerySanitizer.ValueSanitizer getEffectiveValueSanitizer(java.lang.String parameter) { throw new RuntimeException("Stub!"); }
public  java.lang.String unescape(java.lang.String string) { throw new RuntimeException("Stub!"); }
protected  boolean isHexDigit(char c) { throw new RuntimeException("Stub!"); }
protected  int decodeHexDigit(char c) { throw new RuntimeException("Stub!"); }
protected  void clear() { throw new RuntimeException("Stub!"); }
}
