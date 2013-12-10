package android.text;
public interface TextWatcher
  extends android.text.NoCopySpan
{
public abstract  void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after);
public abstract  void onTextChanged(java.lang.CharSequence s, int start, int before, int count);
public abstract  void afterTextChanged(android.text.Editable s);
}
