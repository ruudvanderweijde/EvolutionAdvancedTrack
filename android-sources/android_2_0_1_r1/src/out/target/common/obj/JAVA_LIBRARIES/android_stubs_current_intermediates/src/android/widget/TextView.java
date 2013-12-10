package android.widget;
@android.widget.RemoteViews.RemoteView()
public class TextView
  extends android.view.View
  implements android.view.ViewTreeObserver.OnPreDrawListener
{
public static interface OnEditorActionListener
{
public abstract  boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event);
}
public static class SavedState
  extends android.view.View.BaseSavedState
{
SavedState() { super((android.os.Parcelable)null); throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.widget.TextView.SavedState> CREATOR;
static { CREATOR = null; }
}
public static enum BufferType
{
EDITABLE(),
NORMAL(),
SPANNABLE();
}
public  TextView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  TextView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  TextView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setTypeface(android.graphics.Typeface tf, int style) { throw new RuntimeException("Stub!"); }
protected  boolean getDefaultEditable() { throw new RuntimeException("Stub!"); }
protected  android.text.method.MovementMethod getDefaultMovementMethod() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public  int length() { throw new RuntimeException("Stub!"); }
public  android.text.Editable getEditableText() { throw new RuntimeException("Stub!"); }
public  int getLineHeight() { throw new RuntimeException("Stub!"); }
public final  android.text.Layout getLayout() { throw new RuntimeException("Stub!"); }
public final  android.text.method.KeyListener getKeyListener() { throw new RuntimeException("Stub!"); }
public  void setKeyListener(android.text.method.KeyListener input) { throw new RuntimeException("Stub!"); }
public final  android.text.method.MovementMethod getMovementMethod() { throw new RuntimeException("Stub!"); }
public final  void setMovementMethod(android.text.method.MovementMethod movement) { throw new RuntimeException("Stub!"); }
public final  android.text.method.TransformationMethod getTransformationMethod() { throw new RuntimeException("Stub!"); }
public final  void setTransformationMethod(android.text.method.TransformationMethod method) { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingTop() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingBottom() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingLeft() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingRight() { throw new RuntimeException("Stub!"); }
public  int getExtendedPaddingTop() { throw new RuntimeException("Stub!"); }
public  int getExtendedPaddingBottom() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingLeft() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingRight() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingTop() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingBottom() { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawables(android.graphics.drawable.Drawable left, android.graphics.drawable.Drawable top, android.graphics.drawable.Drawable right, android.graphics.drawable.Drawable bottom) { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable left, android.graphics.drawable.Drawable top, android.graphics.drawable.Drawable right, android.graphics.drawable.Drawable bottom) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable[] getCompoundDrawables() { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawablePadding(int pad) { throw new RuntimeException("Stub!"); }
public  int getCompoundDrawablePadding() { throw new RuntimeException("Stub!"); }
public  void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public final  int getAutoLinkMask() { throw new RuntimeException("Stub!"); }
public  void setTextAppearance(android.content.Context context, int resid) { throw new RuntimeException("Stub!"); }
public  float getTextSize() { throw new RuntimeException("Stub!"); }
public  void setTextSize(float size) { throw new RuntimeException("Stub!"); }
public  void setTextSize(int unit, float size) { throw new RuntimeException("Stub!"); }
public  float getTextScaleX() { throw new RuntimeException("Stub!"); }
public  void setTextScaleX(float size) { throw new RuntimeException("Stub!"); }
public  void setTypeface(android.graphics.Typeface tf) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface getTypeface() { throw new RuntimeException("Stub!"); }
public  void setTextColor(int color) { throw new RuntimeException("Stub!"); }
public  void setTextColor(android.content.res.ColorStateList colors) { throw new RuntimeException("Stub!"); }
public final  android.content.res.ColorStateList getTextColors() { throw new RuntimeException("Stub!"); }
public final  int getCurrentTextColor() { throw new RuntimeException("Stub!"); }
public  void setHighlightColor(int color) { throw new RuntimeException("Stub!"); }
public  void setShadowLayer(float radius, float dx, float dy, int color) { throw new RuntimeException("Stub!"); }
public  android.text.TextPaint getPaint() { throw new RuntimeException("Stub!"); }
public final  void setAutoLinkMask(int mask) { throw new RuntimeException("Stub!"); }
public final  void setLinksClickable(boolean whether) { throw new RuntimeException("Stub!"); }
public final  boolean getLinksClickable() { throw new RuntimeException("Stub!"); }
public  android.text.style.URLSpan[] getUrls() { throw new RuntimeException("Stub!"); }
public final  void setHintTextColor(int color) { throw new RuntimeException("Stub!"); }
public final  void setHintTextColor(android.content.res.ColorStateList colors) { throw new RuntimeException("Stub!"); }
public final  android.content.res.ColorStateList getHintTextColors() { throw new RuntimeException("Stub!"); }
public final  int getCurrentHintTextColor() { throw new RuntimeException("Stub!"); }
public final  void setLinkTextColor(int color) { throw new RuntimeException("Stub!"); }
public final  void setLinkTextColor(android.content.res.ColorStateList colors) { throw new RuntimeException("Stub!"); }
public final  android.content.res.ColorStateList getLinkTextColors() { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  int getGravity() { throw new RuntimeException("Stub!"); }
public  int getPaintFlags() { throw new RuntimeException("Stub!"); }
public  void setPaintFlags(int flags) { throw new RuntimeException("Stub!"); }
public  void setHorizontallyScrolling(boolean whether) { throw new RuntimeException("Stub!"); }
public  void setMinLines(int minlines) { throw new RuntimeException("Stub!"); }
public  void setMinHeight(int minHeight) { throw new RuntimeException("Stub!"); }
public  void setMaxLines(int maxlines) { throw new RuntimeException("Stub!"); }
public  void setMaxHeight(int maxHeight) { throw new RuntimeException("Stub!"); }
public  void setLines(int lines) { throw new RuntimeException("Stub!"); }
public  void setHeight(int pixels) { throw new RuntimeException("Stub!"); }
public  void setMinEms(int minems) { throw new RuntimeException("Stub!"); }
public  void setMinWidth(int minpixels) { throw new RuntimeException("Stub!"); }
public  void setMaxEms(int maxems) { throw new RuntimeException("Stub!"); }
public  void setMaxWidth(int maxpixels) { throw new RuntimeException("Stub!"); }
public  void setEms(int ems) { throw new RuntimeException("Stub!"); }
public  void setWidth(int pixels) { throw new RuntimeException("Stub!"); }
public  void setLineSpacing(float add, float mult) { throw new RuntimeException("Stub!"); }
public final  void append(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  void append(java.lang.CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  void setFreezesText(boolean freezesText) { throw new RuntimeException("Stub!"); }
public  boolean getFreezesText() { throw new RuntimeException("Stub!"); }
public final  void setEditableFactory(android.text.Editable.Factory factory) { throw new RuntimeException("Stub!"); }
public final  void setSpannableFactory(android.text.Spannable.Factory factory) { throw new RuntimeException("Stub!"); }
public final  void setText(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public final  void setTextKeepState(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  void setText(java.lang.CharSequence text, android.widget.TextView.BufferType type) { throw new RuntimeException("Stub!"); }
public final  void setText(char[] text, int start, int len) { throw new RuntimeException("Stub!"); }
public final  void setTextKeepState(java.lang.CharSequence text, android.widget.TextView.BufferType type) { throw new RuntimeException("Stub!"); }
public final  void setText(int resid) { throw new RuntimeException("Stub!"); }
public final  void setText(int resid, android.widget.TextView.BufferType type) { throw new RuntimeException("Stub!"); }
public final  void setHint(java.lang.CharSequence hint) { throw new RuntimeException("Stub!"); }
public final  void setHint(int resid) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getHint() { throw new RuntimeException("Stub!"); }
public  void setInputType(int type) { throw new RuntimeException("Stub!"); }
public  void setRawInputType(int type) { throw new RuntimeException("Stub!"); }
public  int getInputType() { throw new RuntimeException("Stub!"); }
public  void setImeOptions(int imeOptions) { throw new RuntimeException("Stub!"); }
public  int getImeOptions() { throw new RuntimeException("Stub!"); }
public  void setImeActionLabel(java.lang.CharSequence label, int actionId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getImeActionLabel() { throw new RuntimeException("Stub!"); }
public  int getImeActionId() { throw new RuntimeException("Stub!"); }
public  void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener l) { throw new RuntimeException("Stub!"); }
public  void onEditorAction(int actionCode) { throw new RuntimeException("Stub!"); }
public  void setPrivateImeOptions(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPrivateImeOptions() { throw new RuntimeException("Stub!"); }
public  void setInputExtras(int xmlResId) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getInputExtras(boolean create) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getError() { throw new RuntimeException("Stub!"); }
public  void setError(java.lang.CharSequence error) { throw new RuntimeException("Stub!"); }
public  void setError(java.lang.CharSequence error, android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
protected  boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  void setFilters(android.text.InputFilter[] filters) { throw new RuntimeException("Stub!"); }
public  android.text.InputFilter[] getFilters() { throw new RuntimeException("Stub!"); }
public  boolean onPreDraw() { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
protected  boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); }
protected  int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  int getTopPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  int getRightPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  boolean verifyDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void getFocusedRect(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  int getLineCount() { throw new RuntimeException("Stub!"); }
public  int getLineBounds(int line, android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) { throw new RuntimeException("Stub!"); }
public  boolean extractText(android.view.inputmethod.ExtractedTextRequest request, android.view.inputmethod.ExtractedText outText) { throw new RuntimeException("Stub!"); }
public  void setExtractedText(android.view.inputmethod.ExtractedText text) { throw new RuntimeException("Stub!"); }
public  void onCommitCompletion(android.view.inputmethod.CompletionInfo text) { throw new RuntimeException("Stub!"); }
public  void beginBatchEdit() { throw new RuntimeException("Stub!"); }
public  void endBatchEdit() { throw new RuntimeException("Stub!"); }
public  void onBeginBatchEdit() { throw new RuntimeException("Stub!"); }
public  void onEndBatchEdit() { throw new RuntimeException("Stub!"); }
public  boolean onPrivateIMECommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
public  void setIncludeFontPadding(boolean includepad) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
public  boolean bringPointIntoView(int offset) { throw new RuntimeException("Stub!"); }
public  boolean moveCursorToVisibleOffset() { throw new RuntimeException("Stub!"); }
public  void computeScroll() { throw new RuntimeException("Stub!"); }
public  void debug(int depth) { throw new RuntimeException("Stub!"); }
public  int getSelectionStart() { throw new RuntimeException("Stub!"); }
public  int getSelectionEnd() { throw new RuntimeException("Stub!"); }
public  boolean hasSelection() { throw new RuntimeException("Stub!"); }
public  void setSingleLine() { throw new RuntimeException("Stub!"); }
public  void setSingleLine(boolean singleLine) { throw new RuntimeException("Stub!"); }
public  void setEllipsize(android.text.TextUtils.TruncateAt where) { throw new RuntimeException("Stub!"); }
public  void setMarqueeRepeatLimit(int marqueeLimit) { throw new RuntimeException("Stub!"); }
public  android.text.TextUtils.TruncateAt getEllipsize() { throw new RuntimeException("Stub!"); }
public  void setSelectAllOnFocus(boolean selectAllOnFocus) { throw new RuntimeException("Stub!"); }
public  void setCursorVisible(boolean visible) { throw new RuntimeException("Stub!"); }
protected  void onTextChanged(java.lang.CharSequence text, int start, int before, int after) { throw new RuntimeException("Stub!"); }
protected  void onSelectionChanged(int selStart, int selEnd) { throw new RuntimeException("Stub!"); }
public  void addTextChangedListener(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
public  void removeTextChangedListener(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
public  void onStartTemporaryDetach() { throw new RuntimeException("Stub!"); }
public  void onFinishTemporaryDetach() { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
public  void clearComposingText() { throw new RuntimeException("Stub!"); }
public  void setSelected(boolean selected) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean didTouchFocusSelect() { throw new RuntimeException("Stub!"); }
public  void cancelLongPress() { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void setScroller(android.widget.Scroller s) { throw new RuntimeException("Stub!"); }
protected  float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
protected  float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
public static  android.content.res.ColorStateList getTextColors(android.content.Context context, android.content.res.TypedArray attrs) { throw new RuntimeException("Stub!"); }
public static  int getTextColor(android.content.Context context, android.content.res.TypedArray attrs, int def) { throw new RuntimeException("Stub!"); }
public  boolean onKeyShortcut(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
protected  void onCreateContextMenu(android.view.ContextMenu menu) { throw new RuntimeException("Stub!"); }
public  boolean isInputMethodTarget() { throw new RuntimeException("Stub!"); }
public  boolean onTextContextMenuItem(int id) { throw new RuntimeException("Stub!"); }
public  boolean performLongClick() { throw new RuntimeException("Stub!"); }
}
