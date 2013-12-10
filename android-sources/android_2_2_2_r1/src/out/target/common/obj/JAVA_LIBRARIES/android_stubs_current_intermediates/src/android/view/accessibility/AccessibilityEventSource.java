package android.view.accessibility;
public interface AccessibilityEventSource
{
public abstract  void sendAccessibilityEvent(int eventType);
public abstract  void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent event);
}
