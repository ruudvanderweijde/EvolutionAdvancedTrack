package android.provider;
public final class Settings
{
public static class SettingNotFoundException
  extends android.util.AndroidException
{
public  SettingNotFoundException(java.lang.String msg) { throw new RuntimeException("Stub!"); }
}
public static class NameValueTable
  implements android.provider.BaseColumns
{
public  NameValueTable() { throw new RuntimeException("Stub!"); }
protected static  boolean putString(android.content.ContentResolver resolver, android.net.Uri uri, java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriFor(android.net.Uri uri, java.lang.String name) { throw new RuntimeException("Stub!"); }
public static final java.lang.String NAME = "name";
public static final java.lang.String VALUE = "value";
}
public static final class System
  extends android.provider.Settings.NameValueTable
{
public  System() { throw new RuntimeException("Stub!"); }
public static synchronized  java.lang.String getString(android.content.ContentResolver resolver, java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  boolean putString(android.content.ContentResolver resolver, java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriFor(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name, int def) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putInt(android.content.ContentResolver cr, java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name, long def) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putLong(android.content.ContentResolver cr, java.lang.String name, long value) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name, float def) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putFloat(android.content.ContentResolver cr, java.lang.String name, float value) { throw new RuntimeException("Stub!"); }
public static  void getConfiguration(android.content.ContentResolver cr, android.content.res.Configuration outConfig) { throw new RuntimeException("Stub!"); }
public static  boolean putConfiguration(android.content.ContentResolver cr, android.content.res.Configuration config) { throw new RuntimeException("Stub!"); }
public static  boolean getShowGTalkServiceStatus(android.content.ContentResolver cr) { throw new RuntimeException("Stub!"); }
public static  void setShowGTalkServiceStatus(android.content.ContentResolver cr, boolean flag) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SYS_PROP_SETTING_VERSION = "sys.settings_system_version";
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String STAY_ON_WHILE_PLUGGED_IN = "stay_on_while_plugged_in";
public static final java.lang.String END_BUTTON_BEHAVIOR = "end_button_behavior";
public static final java.lang.String AIRPLANE_MODE_ON = "airplane_mode_on";
public static final java.lang.String RADIO_BLUETOOTH = "bluetooth";
public static final java.lang.String RADIO_WIFI = "wifi";
public static final java.lang.String RADIO_CELL = "cell";
public static final java.lang.String AIRPLANE_MODE_RADIOS = "airplane_mode_radios";
public static final java.lang.String WIFI_SLEEP_POLICY = "wifi_sleep_policy";
public static final int WIFI_SLEEP_POLICY_DEFAULT = 0;
public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = 1;
public static final int WIFI_SLEEP_POLICY_NEVER = 2;
public static final java.lang.String WIFI_USE_STATIC_IP = "wifi_use_static_ip";
public static final java.lang.String WIFI_STATIC_IP = "wifi_static_ip";
public static final java.lang.String WIFI_STATIC_GATEWAY = "wifi_static_gateway";
public static final java.lang.String WIFI_STATIC_NETMASK = "wifi_static_netmask";
public static final java.lang.String WIFI_STATIC_DNS1 = "wifi_static_dns1";
public static final java.lang.String WIFI_STATIC_DNS2 = "wifi_static_dns2";
public static final java.lang.String BLUETOOTH_DISCOVERABILITY = "bluetooth_discoverability";
public static final java.lang.String BLUETOOTH_DISCOVERABILITY_TIMEOUT = "bluetooth_discoverability_timeout";
public static final java.lang.String LOCK_PATTERN_ENABLED = "lock_pattern_autolock";
public static final java.lang.String LOCK_PATTERN_VISIBLE = "lock_pattern_visible_pattern";
public static final java.lang.String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = "lock_pattern_tactile_feedback_enabled";
public static final java.lang.String NEXT_ALARM_FORMATTED = "next_alarm_formatted";
public static final java.lang.String FONT_SCALE = "font_scale";
public static final java.lang.String DEBUG_APP = "debug_app";
public static final java.lang.String WAIT_FOR_DEBUGGER = "wait_for_debugger";
public static final java.lang.String DIM_SCREEN = "dim_screen";
public static final java.lang.String SCREEN_OFF_TIMEOUT = "screen_off_timeout";
public static final java.lang.String SCREEN_BRIGHTNESS = "screen_brightness";
public static final java.lang.String SHOW_PROCESSES = "show_processes";
public static final java.lang.String ALWAYS_FINISH_ACTIVITIES = "always_finish_activities";
public static final java.lang.String MODE_RINGER = "mode_ringer";
public static final java.lang.String MODE_RINGER_STREAMS_AFFECTED = "mode_ringer_streams_affected";
public static final java.lang.String MUTE_STREAMS_AFFECTED = "mute_streams_affected";
public static final java.lang.String VIBRATE_ON = "vibrate_on";
public static final java.lang.String VOLUME_RING = "volume_ring";
public static final java.lang.String VOLUME_SYSTEM = "volume_system";
public static final java.lang.String VOLUME_VOICE = "volume_voice";
public static final java.lang.String VOLUME_MUSIC = "volume_music";
public static final java.lang.String VOLUME_ALARM = "volume_alarm";
public static final java.lang.String VOLUME_NOTIFICATION = "volume_notification";
public static final java.lang.String[] VOLUME_SETTINGS = null;
public static final java.lang.String APPEND_FOR_LAST_AUDIBLE = "_last_audible";
public static final java.lang.String RINGTONE = "ringtone";
public static final android.net.Uri DEFAULT_RINGTONE_URI;
public static final java.lang.String NOTIFICATION_SOUND = "notification_sound";
public static final android.net.Uri DEFAULT_NOTIFICATION_URI;
public static final java.lang.String ALARM_ALERT = "alarm_alert";
public static final android.net.Uri DEFAULT_ALARM_ALERT_URI;
public static final java.lang.String TEXT_AUTO_REPLACE = "auto_replace";
public static final java.lang.String TEXT_AUTO_CAPS = "auto_caps";
public static final java.lang.String TEXT_AUTO_PUNCTUATE = "auto_punctuate";
public static final java.lang.String TEXT_SHOW_PASSWORD = "show_password";
public static final java.lang.String SHOW_GTALK_SERVICE_STATUS = "SHOW_GTALK_SERVICE_STATUS";
public static final java.lang.String WALLPAPER_ACTIVITY = "wallpaper_activity";
public static final java.lang.String AUTO_TIME = "auto_time";
public static final java.lang.String TIME_12_24 = "time_12_24";
public static final java.lang.String DATE_FORMAT = "date_format";
public static final java.lang.String SETUP_WIZARD_HAS_RUN = "setup_wizard_has_run";
public static final java.lang.String WINDOW_ANIMATION_SCALE = "window_animation_scale";
public static final java.lang.String TRANSITION_ANIMATION_SCALE = "transition_animation_scale";
public static final java.lang.String ACCELEROMETER_ROTATION = "accelerometer_rotation";
public static final java.lang.String DTMF_TONE_WHEN_DIALING = "dtmf_tone";
public static final java.lang.String SOUND_EFFECTS_ENABLED = "sound_effects_enabled";
public static final java.lang.String HAPTIC_FEEDBACK_ENABLED = "haptic_feedback_enabled";
public static final java.lang.String SHOW_WEB_SUGGESTIONS = "show_web_suggestions";
public static final java.lang.String ADB_ENABLED = "adb_enabled";
public static final java.lang.String ANDROID_ID = "android_id";
public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";
public static final java.lang.String DATA_ROAMING = "data_roaming";
public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";
public static final java.lang.String HTTP_PROXY = "http_proxy";
public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";
public static final java.lang.String LOGGING_ID = "logging_id";
public static final java.lang.String NETWORK_PREFERENCE = "network_preference";
public static final java.lang.String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";
public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";
public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";
public static final java.lang.String SETTINGS_CLASSNAME = "settings_classname";
public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";
public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
public static final java.lang.String WIFI_ON = "wifi_on";
public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";
public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";
public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";
public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";
public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";
public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";
public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";
static { CONTENT_URI = null; DEFAULT_RINGTONE_URI = null; DEFAULT_NOTIFICATION_URI = null; DEFAULT_ALARM_ALERT_URI = null; }
}
public static final class Secure
  extends android.provider.Settings.NameValueTable
{
public  Secure() { throw new RuntimeException("Stub!"); }
public static synchronized  java.lang.String getString(android.content.ContentResolver resolver, java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  boolean putString(android.content.ContentResolver resolver, java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriFor(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name, int def) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putInt(android.content.ContentResolver cr, java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name, long def) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putLong(android.content.ContentResolver cr, java.lang.String name, long value) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name, float def) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putFloat(android.content.ContentResolver cr, java.lang.String name, float value) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SYS_PROP_SETTING_VERSION = "sys.settings_secure_version";
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String ADB_ENABLED = "adb_enabled";
public static final java.lang.String ALLOW_MOCK_LOCATION = "mock_location";
public static final java.lang.String ANDROID_ID = "android_id";
public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";
public static final java.lang.String DATA_ROAMING = "data_roaming";
public static final java.lang.String DEFAULT_INPUT_METHOD = "default_input_method";
public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";
public static final java.lang.String ENABLED_INPUT_METHODS = "enabled_input_methods";
public static final java.lang.String HTTP_PROXY = "http_proxy";
public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";
public static final java.lang.String LOGGING_ID = "logging_id";
public static final java.lang.String NETWORK_PREFERENCE = "network_preference";
public static final java.lang.String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";
public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";
public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";
public static final java.lang.String SETTINGS_CLASSNAME = "settings_classname";
public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";
public static final java.lang.String ACCESSIBILITY_ENABLED = "accessibility_enabled";
public static final java.lang.String ENABLED_ACCESSIBILITY_SERVICES = "enabled_accessibility_services";
public static final java.lang.String TTS_USE_DEFAULTS = "tts_use_defaults";
public static final java.lang.String TTS_DEFAULT_RATE = "tts_default_rate";
public static final java.lang.String TTS_DEFAULT_PITCH = "tts_default_pitch";
public static final java.lang.String TTS_DEFAULT_SYNTH = "tts_default_synth";
public static final java.lang.String TTS_DEFAULT_LANG = "tts_default_lang";
public static final java.lang.String TTS_DEFAULT_COUNTRY = "tts_default_country";
public static final java.lang.String TTS_DEFAULT_VARIANT = "tts_default_variant";
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
public static final java.lang.String WIFI_ON = "wifi_on";
public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";
public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";
public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";
public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";
public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
public static final java.lang.String WIFI_WATCHDOG_WATCH_LIST = "wifi_watchdog_watch_list";
public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";
public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";
public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";
public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
public static final java.lang.String BACKGROUND_DATA = "background_data";
static { CONTENT_URI = null; }
}
public  Settings() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_SETTINGS = "android.settings.SETTINGS";
public static final java.lang.String ACTION_APN_SETTINGS = "android.settings.APN_SETTINGS";
public static final java.lang.String ACTION_LOCATION_SOURCE_SETTINGS = "android.settings.LOCATION_SOURCE_SETTINGS";
public static final java.lang.String ACTION_WIRELESS_SETTINGS = "android.settings.WIRELESS_SETTINGS";
public static final java.lang.String ACTION_AIRPLANE_MODE_SETTINGS = "android.settings.AIRPLANE_MODE_SETTINGS";
public static final java.lang.String ACTION_ACCESSIBILITY_SETTINGS = "android.settings.ACCESSIBILITY_SETTINGS";
public static final java.lang.String ACTION_SECURITY_SETTINGS = "android.settings.SECURITY_SETTINGS";
public static final java.lang.String ACTION_PRIVACY_SETTINGS = "android.settings.PRIVACY_SETTINGS";
public static final java.lang.String ACTION_WIFI_SETTINGS = "android.settings.WIFI_SETTINGS";
public static final java.lang.String ACTION_WIFI_IP_SETTINGS = "android.settings.WIFI_IP_SETTINGS";
public static final java.lang.String ACTION_BLUETOOTH_SETTINGS = "android.settings.BLUETOOTH_SETTINGS";
public static final java.lang.String ACTION_DATE_SETTINGS = "android.settings.DATE_SETTINGS";
public static final java.lang.String ACTION_SOUND_SETTINGS = "android.settings.SOUND_SETTINGS";
public static final java.lang.String ACTION_DISPLAY_SETTINGS = "android.settings.DISPLAY_SETTINGS";
public static final java.lang.String ACTION_LOCALE_SETTINGS = "android.settings.LOCALE_SETTINGS";
public static final java.lang.String ACTION_INPUT_METHOD_SETTINGS = "android.settings.INPUT_METHOD_SETTINGS";
public static final java.lang.String ACTION_USER_DICTIONARY_SETTINGS = "android.settings.USER_DICTIONARY_SETTINGS";
public static final java.lang.String ACTION_APPLICATION_SETTINGS = "android.settings.APPLICATION_SETTINGS";
public static final java.lang.String ACTION_APPLICATION_DEVELOPMENT_SETTINGS = "android.settings.APPLICATION_DEVELOPMENT_SETTINGS";
public static final java.lang.String ACTION_QUICK_LAUNCH_SETTINGS = "android.settings.QUICK_LAUNCH_SETTINGS";
public static final java.lang.String ACTION_MANAGE_APPLICATIONS_SETTINGS = "android.settings.MANAGE_APPLICATIONS_SETTINGS";
public static final java.lang.String ACTION_SYNC_SETTINGS = "android.settings.SYNC_SETTINGS";
public static final java.lang.String ACTION_NETWORK_OPERATOR_SETTINGS = "android.settings.NETWORK_OPERATOR_SETTINGS";
public static final java.lang.String ACTION_DATA_ROAMING_SETTINGS = "android.settings.DATA_ROAMING_SETTINGS";
public static final java.lang.String ACTION_INTERNAL_STORAGE_SETTINGS = "android.settings.INTERNAL_STORAGE_SETTINGS";
public static final java.lang.String ACTION_MEMORY_CARD_SETTINGS = "android.settings.MEMORY_CARD_SETTINGS";
public static final java.lang.String AUTHORITY = "settings";
}
