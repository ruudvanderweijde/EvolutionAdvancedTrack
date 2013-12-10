package android.text;
public class AndroidCharacter
{
public  AndroidCharacter() { throw new RuntimeException("Stub!"); }
public static native  void getDirectionalities(char[] src, byte[] dest, int count);
public static native  int getEastAsianWidth(char input);
public static native  void getEastAsianWidths(char[] src, int start, int count, byte[] dest);
public static native  boolean mirror(char[] text, int start, int count);
public static native  char getMirror(char ch);
public static final int EAST_ASIAN_WIDTH_NEUTRAL = 0;
public static final int EAST_ASIAN_WIDTH_AMBIGUOUS = 1;
public static final int EAST_ASIAN_WIDTH_HALF_WIDTH = 2;
public static final int EAST_ASIAN_WIDTH_FULL_WIDTH = 3;
public static final int EAST_ASIAN_WIDTH_NARROW = 4;
public static final int EAST_ASIAN_WIDTH_WIDE = 5;
}
