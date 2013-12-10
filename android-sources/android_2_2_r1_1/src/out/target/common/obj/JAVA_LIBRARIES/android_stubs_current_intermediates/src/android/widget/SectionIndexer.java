package android.widget;
public interface SectionIndexer
{
public abstract  java.lang.Object[] getSections();
public abstract  int getPositionForSection(int section);
public abstract  int getSectionForPosition(int position);
}
