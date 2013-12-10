package android.util;
public interface AttributeSet
{
public abstract  int getAttributeCount();
public abstract  java.lang.String getAttributeName(int index);
public abstract  java.lang.String getAttributeValue(int index);
public abstract  java.lang.String getAttributeValue(java.lang.String namespace, java.lang.String name);
public abstract  java.lang.String getPositionDescription();
public abstract  int getAttributeNameResource(int index);
public abstract  int getAttributeListValue(java.lang.String namespace, java.lang.String attribute, java.lang.String[] options, int defaultValue);
public abstract  boolean getAttributeBooleanValue(java.lang.String namespace, java.lang.String attribute, boolean defaultValue);
public abstract  int getAttributeResourceValue(java.lang.String namespace, java.lang.String attribute, int defaultValue);
public abstract  int getAttributeIntValue(java.lang.String namespace, java.lang.String attribute, int defaultValue);
public abstract  int getAttributeUnsignedIntValue(java.lang.String namespace, java.lang.String attribute, int defaultValue);
public abstract  float getAttributeFloatValue(java.lang.String namespace, java.lang.String attribute, float defaultValue);
public abstract  int getAttributeListValue(int index, java.lang.String[] options, int defaultValue);
public abstract  boolean getAttributeBooleanValue(int index, boolean defaultValue);
public abstract  int getAttributeResourceValue(int index, int defaultValue);
public abstract  int getAttributeIntValue(int index, int defaultValue);
public abstract  int getAttributeUnsignedIntValue(int index, int defaultValue);
public abstract  float getAttributeFloatValue(int index, float defaultValue);
public abstract  java.lang.String getIdAttribute();
public abstract  java.lang.String getClassAttribute();
public abstract  int getIdAttributeResourceValue(int defaultValue);
public abstract  int getStyleAttribute();
}
