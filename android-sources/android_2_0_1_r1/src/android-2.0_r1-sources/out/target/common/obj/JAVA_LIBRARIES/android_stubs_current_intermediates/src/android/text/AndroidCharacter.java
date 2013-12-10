package android.text;
public class AndroidCharacter
{
public  AndroidCharacter() { throw new RuntimeException("Stub!"); }
public static native  void getDirectionalities(char[] src, byte[] dest, int count);
public static native  boolean mirror(char[] text, int start, int count);
public static native  char getMirror(char ch);
}
