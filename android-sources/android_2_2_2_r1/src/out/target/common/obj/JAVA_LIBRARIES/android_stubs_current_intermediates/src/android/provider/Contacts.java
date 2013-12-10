package android.provider;
@java.lang.Deprecated()
public class Contacts
{
@java.lang.Deprecated()
public static interface SettingsColumns
{
public static final java.lang.String _SYNC_ACCOUNT = "_sync_account";
public static final java.lang.String _SYNC_ACCOUNT_TYPE = "_sync_account_type";
public static final java.lang.String KEY = "key";
public static final java.lang.String VALUE = "value";
}
@java.lang.Deprecated()
public static final class Settings
  implements android.provider.BaseColumns, android.provider.Contacts.SettingsColumns
{
Settings() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getSetting(android.content.ContentResolver cr, java.lang.String account, java.lang.String key) { throw new RuntimeException("Stub!"); }
public static  void setSetting(android.content.ContentResolver cr, java.lang.String account, java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_DIRECTORY = "settings";
public static final java.lang.String DEFAULT_SORT_ORDER = "key ASC";
public static final java.lang.String SYNC_EVERYTHING = "syncEverything";
static { CONTENT_URI = null; }
}
@java.lang.Deprecated()
public static interface PeopleColumns
{
public static final java.lang.String NAME = "name";
public static final java.lang.String PHONETIC_NAME = "phonetic_name";
public static final java.lang.String DISPLAY_NAME = "display_name";
public static final java.lang.String NOTES = "notes";
public static final java.lang.String TIMES_CONTACTED = "times_contacted";
public static final java.lang.String LAST_TIME_CONTACTED = "last_time_contacted";
public static final java.lang.String CUSTOM_RINGTONE = "custom_ringtone";
public static final java.lang.String SEND_TO_VOICEMAIL = "send_to_voicemail";
public static final java.lang.String STARRED = "starred";
public static final java.lang.String PHOTO_VERSION = "photo_version";
}
@java.lang.Deprecated()
public static final class People
  implements android.provider.BaseColumns, android.provider.Contacts.PeopleColumns, android.provider.Contacts.PhonesColumns, android.provider.Contacts.PresenceColumns
{
@java.lang.Deprecated()
public static final class Phones
  implements android.provider.BaseColumns, android.provider.Contacts.PhonesColumns, android.provider.Contacts.PeopleColumns
{
Phones() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "phones";
public static final java.lang.String DEFAULT_SORT_ORDER = "number ASC";
}
@java.lang.Deprecated()
public static final class ContactMethods
  implements android.provider.BaseColumns, android.provider.Contacts.ContactMethodsColumns, android.provider.Contacts.PeopleColumns
{
ContactMethods() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "contact_methods";
public static final java.lang.String DEFAULT_SORT_ORDER = "data ASC";
}
@java.lang.Deprecated()
public static class Extensions
  implements android.provider.BaseColumns, android.provider.Contacts.ExtensionsColumns
{
Extensions() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "extensions";
public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
public static final java.lang.String PERSON_ID = "person";
}
People() { throw new RuntimeException("Stub!"); }
public static  void markAsContacted(android.content.ContentResolver resolver, long personId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri addToMyContactsGroup(android.content.ContentResolver resolver, long personId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri addToGroup(android.content.ContentResolver resolver, long personId, java.lang.String groupName) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri addToGroup(android.content.ContentResolver resolver, long personId, long groupId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri createPersonInMyContactsGroup(android.content.ContentResolver resolver, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public static  android.database.Cursor queryGroups(android.content.ContentResolver resolver, long person) { throw new RuntimeException("Stub!"); }
public static  void setPhotoData(android.content.ContentResolver cr, android.net.Uri person, byte[] data) { throw new RuntimeException("Stub!"); }
public static  java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver cr, android.net.Uri person) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap loadContactPhoto(android.content.Context context, android.net.Uri person, int placeholderImageResource, android.graphics.BitmapFactory.Options options) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri CONTENT_FILTER_URI;
public static final android.net.Uri DELETED_CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/person";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/person";
public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
public static final java.lang.String PRIMARY_PHONE_ID = "primary_phone";
public static final java.lang.String PRIMARY_EMAIL_ID = "primary_email";
public static final java.lang.String PRIMARY_ORGANIZATION_ID = "primary_organization";
static { CONTENT_URI = null; CONTENT_FILTER_URI = null; DELETED_CONTENT_URI = null; }
}
@java.lang.Deprecated()
public static interface GroupsColumns
{
public static final java.lang.String NAME = "name";
public static final java.lang.String NOTES = "notes";
public static final java.lang.String SHOULD_SYNC = "should_sync";
public static final java.lang.String SYSTEM_ID = "system_id";
}
@java.lang.Deprecated()
public static final class Groups
  implements android.provider.BaseColumns, android.provider.Contacts.GroupsColumns
{
Groups() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri DELETED_CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroup";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroup";
public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
public static final java.lang.String GROUP_ANDROID_STARRED = "Starred in Android";
public static final java.lang.String GROUP_MY_CONTACTS = "Contacts";
static { CONTENT_URI = null; DELETED_CONTENT_URI = null; }
}
@java.lang.Deprecated()
public static interface PhonesColumns
{
public static final java.lang.String TYPE = "type";
public static final int TYPE_CUSTOM = 0;
public static final int TYPE_HOME = 1;
public static final int TYPE_MOBILE = 2;
public static final int TYPE_WORK = 3;
public static final int TYPE_FAX_WORK = 4;
public static final int TYPE_FAX_HOME = 5;
public static final int TYPE_PAGER = 6;
public static final int TYPE_OTHER = 7;
public static final java.lang.String LABEL = "label";
public static final java.lang.String NUMBER = "number";
public static final java.lang.String NUMBER_KEY = "number_key";
public static final java.lang.String ISPRIMARY = "isprimary";
}
@java.lang.Deprecated()
public static final class Phones
  implements android.provider.BaseColumns, android.provider.Contacts.PhonesColumns, android.provider.Contacts.PeopleColumns
{
Phones() { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getDisplayLabel(android.content.Context context, int type, java.lang.CharSequence label, java.lang.CharSequence[] labelArray) { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getDisplayLabel(android.content.Context context, int type, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri CONTENT_FILTER_URL;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/phone";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone";
public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
public static final java.lang.String PERSON_ID = "person";
static { CONTENT_URI = null; CONTENT_FILTER_URL = null; }
}
@java.lang.Deprecated()
public static final class GroupMembership
  implements android.provider.BaseColumns, android.provider.Contacts.GroupsColumns
{
GroupMembership() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri RAW_CONTENT_URI;
public static final java.lang.String CONTENT_DIRECTORY = "groupmembership";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroupmembership";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroupmembership";
public static final java.lang.String DEFAULT_SORT_ORDER = "group_id ASC";
public static final java.lang.String GROUP_ID = "group_id";
public static final java.lang.String GROUP_SYNC_ID = "group_sync_id";
public static final java.lang.String GROUP_SYNC_ACCOUNT = "group_sync_account";
public static final java.lang.String GROUP_SYNC_ACCOUNT_TYPE = "group_sync_account_type";
public static final java.lang.String PERSON_ID = "person";
static { CONTENT_URI = null; RAW_CONTENT_URI = null; }
}
@java.lang.Deprecated()
public static interface ContactMethodsColumns
{
public static final java.lang.String KIND = "kind";
public static final java.lang.String TYPE = "type";
public static final int TYPE_CUSTOM = 0;
public static final int TYPE_HOME = 1;
public static final int TYPE_WORK = 2;
public static final int TYPE_OTHER = 3;
public static final java.lang.String LABEL = "label";
public static final java.lang.String DATA = "data";
public static final java.lang.String AUX_DATA = "aux_data";
public static final java.lang.String ISPRIMARY = "isprimary";
}
@java.lang.Deprecated()
public static final class ContactMethods
  implements android.provider.BaseColumns, android.provider.Contacts.ContactMethodsColumns, android.provider.Contacts.PeopleColumns
{
ContactMethods() { throw new RuntimeException("Stub!"); }
public static  java.lang.String encodePredefinedImProtocol(int protocol) { throw new RuntimeException("Stub!"); }
public static  java.lang.String encodeCustomImProtocol(java.lang.String protocolString) { throw new RuntimeException("Stub!"); }
public static  java.lang.Object decodeImProtocol(java.lang.String encodedString) { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getDisplayLabel(android.content.Context context, int kind, int type, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public  void addPostalLocation(android.content.Context context, long postalId, double latitude, double longitude) { throw new RuntimeException("Stub!"); }
public static final java.lang.String POSTAL_LOCATION_LATITUDE = "data";
public static final java.lang.String POSTAL_LOCATION_LONGITUDE = "aux_data";
public static final int PROTOCOL_AIM = 0;
public static final int PROTOCOL_MSN = 1;
public static final int PROTOCOL_YAHOO = 2;
public static final int PROTOCOL_SKYPE = 3;
public static final int PROTOCOL_QQ = 4;
public static final int PROTOCOL_GOOGLE_TALK = 5;
public static final int PROTOCOL_ICQ = 6;
public static final int PROTOCOL_JABBER = 7;
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri CONTENT_EMAIL_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact-methods";
public static final java.lang.String CONTENT_EMAIL_TYPE = "vnd.android.cursor.dir/email";
public static final java.lang.String CONTENT_POSTAL_TYPE = "vnd.android.cursor.dir/postal-address";
public static final java.lang.String CONTENT_EMAIL_ITEM_TYPE = "vnd.android.cursor.item/email";
public static final java.lang.String CONTENT_POSTAL_ITEM_TYPE = "vnd.android.cursor.item/postal-address";
public static final java.lang.String CONTENT_IM_ITEM_TYPE = "vnd.android.cursor.item/jabber-im";
public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
public static final java.lang.String PERSON_ID = "person";
static { CONTENT_URI = null; CONTENT_EMAIL_URI = null; }
}
@java.lang.Deprecated()
public static interface PresenceColumns
{
public static final java.lang.String PRIORITY = "priority";
public static final java.lang.String PRESENCE_STATUS = "mode";
public static final int OFFLINE = 0;
public static final int INVISIBLE = 1;
public static final int AWAY = 2;
public static final int IDLE = 3;
public static final int DO_NOT_DISTURB = 4;
public static final int AVAILABLE = 5;
public static final java.lang.String PRESENCE_CUSTOM_STATUS = "status";
public static final java.lang.String IM_PROTOCOL = "im_protocol";
public static final java.lang.String IM_HANDLE = "im_handle";
public static final java.lang.String IM_ACCOUNT = "im_account";
}
@java.lang.Deprecated()
public static interface OrganizationColumns
{
public static final java.lang.String TYPE = "type";
public static final int TYPE_CUSTOM = 0;
public static final int TYPE_WORK = 1;
public static final int TYPE_OTHER = 2;
public static final java.lang.String LABEL = "label";
public static final java.lang.String COMPANY = "company";
public static final java.lang.String TITLE = "title";
public static final java.lang.String PERSON_ID = "person";
public static final java.lang.String ISPRIMARY = "isprimary";
}
@java.lang.Deprecated()
public static final class Organizations
  implements android.provider.BaseColumns, android.provider.Contacts.OrganizationColumns
{
Organizations() { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getDisplayLabel(android.content.Context context, int type, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_DIRECTORY = "organizations";
public static final java.lang.String DEFAULT_SORT_ORDER = "company, title, isprimary ASC";
static { CONTENT_URI = null; }
}
@java.lang.Deprecated()
public static interface PhotosColumns
{
public static final java.lang.String LOCAL_VERSION = "local_version";
public static final java.lang.String PERSON_ID = "person";
public static final java.lang.String DOWNLOAD_REQUIRED = "download_required";
public static final java.lang.String EXISTS_ON_SERVER = "exists_on_server";
public static final java.lang.String SYNC_ERROR = "sync_error";
public static final java.lang.String DATA = "data";
}
@java.lang.Deprecated()
public static final class Photos
  implements android.provider.BaseColumns, android.provider.Contacts.PhotosColumns
{
Photos() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_DIRECTORY = "photo";
public static final java.lang.String DEFAULT_SORT_ORDER = "person ASC";
static { CONTENT_URI = null; }
}
@java.lang.Deprecated()
public static interface ExtensionsColumns
{
public static final java.lang.String NAME = "name";
public static final java.lang.String VALUE = "value";
}
@java.lang.Deprecated()
public static final class Extensions
  implements android.provider.BaseColumns, android.provider.Contacts.ExtensionsColumns
{
Extensions() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact_extensions";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_extensions";
public static final java.lang.String DEFAULT_SORT_ORDER = "person, name ASC";
public static final java.lang.String PERSON_ID = "person";
static { CONTENT_URI = null; }
}
@java.lang.Deprecated()
public static final class Intents
{
@java.lang.Deprecated()
public static final class UI
{
public  UI() { throw new RuntimeException("Stub!"); }
public static final java.lang.String LIST_DEFAULT = "com.android.contacts.action.LIST_DEFAULT";
public static final java.lang.String LIST_GROUP_ACTION = "com.android.contacts.action.LIST_GROUP";
public static final java.lang.String GROUP_NAME_EXTRA_KEY = "com.android.contacts.extra.GROUP";
public static final java.lang.String LIST_ALL_CONTACTS_ACTION = "com.android.contacts.action.LIST_ALL_CONTACTS";
public static final java.lang.String LIST_CONTACTS_WITH_PHONES_ACTION = "com.android.contacts.action.LIST_CONTACTS_WITH_PHONES";
public static final java.lang.String LIST_STARRED_ACTION = "com.android.contacts.action.LIST_STARRED";
public static final java.lang.String LIST_FREQUENT_ACTION = "com.android.contacts.action.LIST_FREQUENT";
public static final java.lang.String LIST_STREQUENT_ACTION = "com.android.contacts.action.LIST_STREQUENT";
public static final java.lang.String TITLE_EXTRA_KEY = "com.android.contacts.extra.TITLE_EXTRA";
public static final java.lang.String FILTER_CONTACTS_ACTION = "com.android.contacts.action.FILTER_CONTACTS";
public static final java.lang.String FILTER_TEXT_EXTRA_KEY = "com.android.contacts.extra.FILTER_TEXT";
}
@java.lang.Deprecated()
public static final class Insert
{
public  Insert() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION = "android.intent.action.INSERT";
public static final java.lang.String FULL_MODE = "full_mode";
public static final java.lang.String NAME = "name";
public static final java.lang.String PHONETIC_NAME = "phonetic_name";
public static final java.lang.String COMPANY = "company";
public static final java.lang.String JOB_TITLE = "job_title";
public static final java.lang.String NOTES = "notes";
public static final java.lang.String PHONE = "phone";
public static final java.lang.String PHONE_TYPE = "phone_type";
public static final java.lang.String PHONE_ISPRIMARY = "phone_isprimary";
public static final java.lang.String SECONDARY_PHONE = "secondary_phone";
public static final java.lang.String SECONDARY_PHONE_TYPE = "secondary_phone_type";
public static final java.lang.String TERTIARY_PHONE = "tertiary_phone";
public static final java.lang.String TERTIARY_PHONE_TYPE = "tertiary_phone_type";
public static final java.lang.String EMAIL = "email";
public static final java.lang.String EMAIL_TYPE = "email_type";
public static final java.lang.String EMAIL_ISPRIMARY = "email_isprimary";
public static final java.lang.String SECONDARY_EMAIL = "secondary_email";
public static final java.lang.String SECONDARY_EMAIL_TYPE = "secondary_email_type";
public static final java.lang.String TERTIARY_EMAIL = "tertiary_email";
public static final java.lang.String TERTIARY_EMAIL_TYPE = "tertiary_email_type";
public static final java.lang.String POSTAL = "postal";
public static final java.lang.String POSTAL_TYPE = "postal_type";
public static final java.lang.String POSTAL_ISPRIMARY = "postal_isprimary";
public static final java.lang.String IM_HANDLE = "im_handle";
public static final java.lang.String IM_PROTOCOL = "im_protocol";
public static final java.lang.String IM_ISPRIMARY = "im_isprimary";
}
public  Intents() { throw new RuntimeException("Stub!"); }
public static final java.lang.String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";
public static final java.lang.String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";
public static final java.lang.String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";
public static final java.lang.String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";
public static final java.lang.String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";
public static final java.lang.String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";
public static final java.lang.String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";
}
Contacts() { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUTHORITY = "contacts";
public static final android.net.Uri CONTENT_URI;
public static final int KIND_EMAIL = 1;
public static final int KIND_POSTAL = 2;
public static final int KIND_IM = 3;
public static final int KIND_ORGANIZATION = 4;
public static final int KIND_PHONE = 5;
static { CONTENT_URI = null; }
}
