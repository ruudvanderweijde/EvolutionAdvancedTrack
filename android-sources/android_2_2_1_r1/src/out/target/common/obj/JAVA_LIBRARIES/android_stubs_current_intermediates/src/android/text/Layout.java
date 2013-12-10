package android.text;
public abstract class Layout
{
public static class Directions
{
Directions() { throw new RuntimeException("Stub!"); }
}
public static enum Alignment
{
ALIGN_CENTER(),
ALIGN_NORMAL(),
ALIGN_OPPOSITE();
}
protected  Layout(java.lang.CharSequence text, android.text.TextPaint paint, int width, android.text.Layout.Alignment align, float spacingMult, float spacingAdd) { throw new RuntimeException("Stub!"); }
public static  float getDesiredWidth(java.lang.CharSequence source, android.text.TextPaint paint) { throw new RuntimeException("Stub!"); }
public static  float getDesiredWidth(java.lang.CharSequence source, int start, int end, android.text.TextPaint paint) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas c) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas c, android.graphics.Path highlight, android.graphics.Paint highlightPaint, int cursorOffsetVertical) { throw new RuntimeException("Stub!"); }
public final  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public final  android.text.TextPaint getPaint() { throw new RuntimeException("Stub!"); }
public final  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getEllipsizedWidth() { throw new RuntimeException("Stub!"); }
public final  void increaseWidthTo(int wid) { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public final  android.text.Layout.Alignment getAlignment() { throw new RuntimeException("Stub!"); }
public final  float getSpacingMultiplier() { throw new RuntimeException("Stub!"); }
public final  float getSpacingAdd() { throw new RuntimeException("Stub!"); }
public abstract  int getLineCount();
public  int getLineBounds(int line, android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public abstract  int getLineTop(int line);
public abstract  int getLineDescent(int line);
public abstract  int getLineStart(int line);
public abstract  int getParagraphDirection(int line);
public abstract  boolean getLineContainsTab(int line);
public abstract  android.text.Layout.Directions getLineDirections(int line);
public abstract  int getTopPadding();
public abstract  int getBottomPadding();
public  float getPrimaryHorizontal(int offset) { throw new RuntimeException("Stub!"); }
public  float getSecondaryHorizontal(int offset) { throw new RuntimeException("Stub!"); }
public  float getLineLeft(int line) { throw new RuntimeException("Stub!"); }
public  float getLineRight(int line) { throw new RuntimeException("Stub!"); }
public  float getLineMax(int line) { throw new RuntimeException("Stub!"); }
public  float getLineWidth(int line) { throw new RuntimeException("Stub!"); }
public  int getLineForVertical(int vertical) { throw new RuntimeException("Stub!"); }
public  int getLineForOffset(int offset) { throw new RuntimeException("Stub!"); }
public  int getOffsetForHorizontal(int line, float horiz) { throw new RuntimeException("Stub!"); }
public final  int getLineEnd(int line) { throw new RuntimeException("Stub!"); }
public  int getLineVisibleEnd(int line) { throw new RuntimeException("Stub!"); }
public final  int getLineBottom(int line) { throw new RuntimeException("Stub!"); }
public final  int getLineBaseline(int line) { throw new RuntimeException("Stub!"); }
public final  int getLineAscent(int line) { throw new RuntimeException("Stub!"); }
public  int getOffsetToLeftOf(int offset) { throw new RuntimeException("Stub!"); }
public  int getOffsetToRightOf(int offset) { throw new RuntimeException("Stub!"); }
public  void getCursorPath(int point, android.graphics.Path dest, java.lang.CharSequence editingBuffer) { throw new RuntimeException("Stub!"); }
public  void getSelectionPath(int start, int end, android.graphics.Path dest) { throw new RuntimeException("Stub!"); }
public final  android.text.Layout.Alignment getParagraphAlignment(int line) { throw new RuntimeException("Stub!"); }
public final  int getParagraphLeft(int line) { throw new RuntimeException("Stub!"); }
public final  int getParagraphRight(int line) { throw new RuntimeException("Stub!"); }
protected final  boolean isSpanned() { throw new RuntimeException("Stub!"); }
public abstract  int getEllipsisStart(int line);
public abstract  int getEllipsisCount(int line);
public static final int DIR_LEFT_TO_RIGHT = 1;
public static final int DIR_RIGHT_TO_LEFT = -1;
}
