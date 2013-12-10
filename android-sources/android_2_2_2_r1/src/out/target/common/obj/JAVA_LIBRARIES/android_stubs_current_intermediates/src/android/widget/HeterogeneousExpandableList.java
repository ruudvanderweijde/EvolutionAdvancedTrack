package android.widget;
public interface HeterogeneousExpandableList
{
public abstract  int getGroupType(int groupPosition);
public abstract  int getChildType(int groupPosition, int childPosition);
public abstract  int getGroupTypeCount();
public abstract  int getChildTypeCount();
}
