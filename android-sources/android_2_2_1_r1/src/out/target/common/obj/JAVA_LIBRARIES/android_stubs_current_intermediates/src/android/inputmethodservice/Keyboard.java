package android.inputmethodservice;
public class Keyboard
{
public static class Row
{
public  Row(android.inputmethodservice.Keyboard parent) { throw new RuntimeException("Stub!"); }
public  Row(android.content.res.Resources res, android.inputmethodservice.Keyboard parent, android.content.res.XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
public int defaultWidth;
public int defaultHeight;
public int defaultHorizontalGap;
public int verticalGap;
public int rowEdgeFlags;
public int mode;
}
public static class Key
{
public  Key(android.inputmethodservice.Keyboard.Row parent) { throw new RuntimeException("Stub!"); }
public  Key(android.content.res.Resources res, android.inputmethodservice.Keyboard.Row parent, int x, int y, android.content.res.XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
public  void onPressed() { throw new RuntimeException("Stub!"); }
public  void onReleased(boolean inside) { throw new RuntimeException("Stub!"); }
public  boolean isInside(int x, int y) { throw new RuntimeException("Stub!"); }
public  int squaredDistanceFrom(int x, int y) { throw new RuntimeException("Stub!"); }
public  int[] getCurrentDrawableState() { throw new RuntimeException("Stub!"); }
public int[] codes = null;
public java.lang.CharSequence label;
public android.graphics.drawable.Drawable icon;
public android.graphics.drawable.Drawable iconPreview;
public int width;
public int height;
public int gap;
public boolean sticky;
public int x;
public int y;
public boolean pressed;
public boolean on;
public java.lang.CharSequence text;
public java.lang.CharSequence popupCharacters;
public int edgeFlags;
public boolean modifier;
public int popupResId;
public boolean repeatable;
}
public  Keyboard(android.content.Context context, int xmlLayoutResId) { throw new RuntimeException("Stub!"); }
public  Keyboard(android.content.Context context, int xmlLayoutResId, int modeId) { throw new RuntimeException("Stub!"); }
public  Keyboard(android.content.Context context, int layoutTemplateResId, java.lang.CharSequence characters, int columns, int horizontalPadding) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.inputmethodservice.Keyboard.Key> getKeys() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.inputmethodservice.Keyboard.Key> getModifierKeys() { throw new RuntimeException("Stub!"); }
protected  int getHorizontalGap() { throw new RuntimeException("Stub!"); }
protected  void setHorizontalGap(int gap) { throw new RuntimeException("Stub!"); }
protected  int getVerticalGap() { throw new RuntimeException("Stub!"); }
protected  void setVerticalGap(int gap) { throw new RuntimeException("Stub!"); }
protected  int getKeyHeight() { throw new RuntimeException("Stub!"); }
protected  void setKeyHeight(int height) { throw new RuntimeException("Stub!"); }
protected  int getKeyWidth() { throw new RuntimeException("Stub!"); }
protected  void setKeyWidth(int width) { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  int getMinWidth() { throw new RuntimeException("Stub!"); }
public  boolean setShifted(boolean shiftState) { throw new RuntimeException("Stub!"); }
public  boolean isShifted() { throw new RuntimeException("Stub!"); }
public  int getShiftKeyIndex() { throw new RuntimeException("Stub!"); }
public  int[] getNearestKeys(int x, int y) { throw new RuntimeException("Stub!"); }
protected  android.inputmethodservice.Keyboard.Row createRowFromXml(android.content.res.Resources res, android.content.res.XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
protected  android.inputmethodservice.Keyboard.Key createKeyFromXml(android.content.res.Resources res, android.inputmethodservice.Keyboard.Row parent, int x, int y, android.content.res.XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
public static final int EDGE_LEFT = 1;
public static final int EDGE_RIGHT = 2;
public static final int EDGE_TOP = 4;
public static final int EDGE_BOTTOM = 8;
public static final int KEYCODE_SHIFT = -1;
public static final int KEYCODE_MODE_CHANGE = -2;
public static final int KEYCODE_CANCEL = -3;
public static final int KEYCODE_DONE = -4;
public static final int KEYCODE_DELETE = -5;
public static final int KEYCODE_ALT = -6;
}
