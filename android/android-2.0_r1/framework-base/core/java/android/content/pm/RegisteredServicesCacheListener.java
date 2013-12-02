package android.content.pm;

/**
 * Listener for changes to the set of registered services managed by a RegisteredServicesCache.
 * @hide
 */
public interface RegisteredServicesCacheListener {
    /**
     * Invoked when the registered services cache changes.
     */
    void onRegisteredServicesCacheChanged();
}
