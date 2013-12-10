package android.text.util;
public class Linkify
{
public static interface MatchFilter
{
public abstract  boolean acceptMatch(java.lang.CharSequence s, int start, int end);
}
public static interface TransformFilter
{
public abstract  java.lang.String transformUrl(java.util.regex.Matcher match, java.lang.String url);
}
public  Linkify() { throw new RuntimeException("Stub!"); }
public static final  boolean addLinks(android.text.Spannable text, int mask) { throw new RuntimeException("Stub!"); }
public static final  boolean addLinks(android.widget.TextView text, int mask) { throw new RuntimeException("Stub!"); }
public static final  void addLinks(android.widget.TextView text, java.util.regex.Pattern pattern, java.lang.String scheme) { throw new RuntimeException("Stub!"); }
public static final  void addLinks(android.widget.TextView text, java.util.regex.Pattern p, java.lang.String scheme, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) { throw new RuntimeException("Stub!"); }
public static final  boolean addLinks(android.text.Spannable text, java.util.regex.Pattern pattern, java.lang.String scheme) { throw new RuntimeException("Stub!"); }
public static final  boolean addLinks(android.text.Spannable s, java.util.regex.Pattern p, java.lang.String scheme, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) { throw new RuntimeException("Stub!"); }
public static final int WEB_URLS = 1;
public static final int EMAIL_ADDRESSES = 2;
public static final int PHONE_NUMBERS = 4;
public static final int MAP_ADDRESSES = 8;
public static final int ALL = 15;
public static final android.text.util.Linkify.MatchFilter sUrlMatchFilter;
public static final android.text.util.Linkify.MatchFilter sPhoneNumberMatchFilter;
public static final android.text.util.Linkify.TransformFilter sPhoneNumberTransformFilter;
static { sUrlMatchFilter = null; sPhoneNumberMatchFilter = null; sPhoneNumberTransformFilter = null; }
}
