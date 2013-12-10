package android.provider;
@java.lang.SuppressWarnings(value={"unused"})
public final class ContactsContract
{
public static final class SyncState
  implements android.provider.SyncStateContract.Columns
{
SyncState() { throw new RuntimeException("Stub!"); }
public static  byte[] get(android.content.ContentProviderClient provider, android.accounts.Account account) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public static  android.util.Pair<android.net.Uri, byte[]> getWithUri(android.content.ContentProviderClient provider, android.accounts.Account account) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public static  void set(android.content.ContentProviderClient provider, android.accounts.Account account, byte[] data) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public static  android.content.ContentProviderOperation newSetOperation(android.accounts.Account account, byte[] data) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "syncstate";
public static final android.net.Uri CONTENT_URI;
static { CONTENT_URI = null; }
}
protected static interface BaseSyncColumns
{
public static final java.lang.String SYNC1 = "sync1";
public static final java.lang.String SYNC2 = "sync2";
public static final java.lang.String SYNC3 = "sync3";
public static final java.lang.String SYNC4 = "sync4";
}
protected static interface SyncColumns
  extends android.provider.ContactsContract.BaseSyncColumns
{
public static final java.lang.String ACCOUNT_NAME = "account_name";
public static final java.lang.String ACCOUNT_TYPE = "account_type";
public static final java.lang.String SOURCE_ID = "sourceid";
public static final java.lang.String VERSION = "version";
public static final java.lang.String DIRTY = "dirty";
}
protected static interface ContactOptionsColumns
{
public static final java.lang.String TIMES_CONTACTED = "times_contacted";
public static final java.lang.String LAST_TIME_CONTACTED = "last_time_contacted";
public static final java.lang.String STARRED = "starred";
public static final java.lang.String CUSTOM_RINGTONE = "custom_ringtone";
public static final java.lang.String SEND_TO_VOICEMAIL = "send_to_voicemail";
}
protected static interface ContactsColumns
{
public static final java.lang.String DISPLAY_NAME = "display_name";
public static final java.lang.String PHOTO_ID = "photo_id";
public static final java.lang.String IN_VISIBLE_GROUP = "in_visible_group";
public static final java.lang.String HAS_PHONE_NUMBER = "has_phone_number";
public static final java.lang.String LOOKUP_KEY = "lookup";
}
protected static interface ContactStatusColumns
{
public static final java.lang.String CONTACT_PRESENCE = "contact_presence";
public static final java.lang.String CONTACT_STATUS = "contact_status";
public static final java.lang.String CONTACT_STATUS_TIMESTAMP = "contact_status_ts";
public static final java.lang.String CONTACT_STATUS_RES_PACKAGE = "contact_status_res_package";
public static final java.lang.String CONTACT_STATUS_LABEL = "contact_status_label";
public static final java.lang.String CONTACT_STATUS_ICON = "contact_status_icon";
}
public static class Contacts
  implements android.provider.BaseColumns, android.provider.ContactsContract.ContactsColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.ContactStatusColumns
{
public static final class Data
  implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumns
{
Data() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "data";
}
public static final class AggregationSuggestions
  implements android.provider.BaseColumns, android.provider.ContactsContract.ContactsColumns
{
AggregationSuggestions() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "suggestions";
}
public static final class Photo
  implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumns
{
Photo() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "photo";
}
Contacts() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getLookupUri(android.content.ContentResolver resolver, android.net.Uri contactUri) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getLookupUri(long contactId, java.lang.String lookupKey) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri lookupContact(android.content.ContentResolver resolver, android.net.Uri lookupUri) { throw new RuntimeException("Stub!"); }
public static  void markAsContacted(android.content.ContentResolver resolver, long contactId) { throw new RuntimeException("Stub!"); }
public static  java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver cr, android.net.Uri contactUri) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri CONTENT_LOOKUP_URI;
public static final android.net.Uri CONTENT_VCARD_URI;
public static final android.net.Uri CONTENT_FILTER_URI;
public static final android.net.Uri CONTENT_STREQUENT_URI;
public static final android.net.Uri CONTENT_STREQUENT_FILTER_URI;
public static final android.net.Uri CONTENT_GROUP_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact";
public static final java.lang.String CONTENT_VCARD_TYPE = "text/x-vcard";
static { CONTENT_URI = null; CONTENT_LOOKUP_URI = null; CONTENT_VCARD_URI = null; CONTENT_FILTER_URI = null; CONTENT_STREQUENT_URI = null; CONTENT_STREQUENT_FILTER_URI = null; CONTENT_GROUP_URI = null; }
}
protected static interface RawContactsColumns
{
public static final java.lang.String CONTACT_ID = "contact_id";
public static final java.lang.String AGGREGATION_MODE = "aggregation_mode";
public static final java.lang.String DELETED = "deleted";
}
public static final class RawContacts
  implements android.provider.BaseColumns, android.provider.ContactsContract.RawContactsColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.SyncColumns
{
public static final class Data
  implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumns
{
Data() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "data";
}
public static final class Entity
  implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumns
{
Entity() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_DIRECTORY = "entity";
public static final java.lang.String DATA_ID = "data_id";
}
RawContacts() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContactLookupUri(android.content.ContentResolver resolver, android.net.Uri rawContactUri) { throw new RuntimeException("Stub!"); }
public static  android.content.EntityIterator newEntityIterator(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/raw_contact";
public static final int AGGREGATION_MODE_DEFAULT = 0;
public static final int AGGREGATION_MODE_IMMEDIATE = 1;
public static final int AGGREGATION_MODE_SUSPENDED = 2;
public static final int AGGREGATION_MODE_DISABLED = 3;
static { CONTENT_URI = null; }
}
protected static interface StatusColumns
{
public static final java.lang.String PRESENCE = "mode";
public static final java.lang.String PRESENCE_STATUS = "mode";
public static final int OFFLINE = 0;
public static final int INVISIBLE = 1;
public static final int AWAY = 2;
public static final int IDLE = 3;
public static final int DO_NOT_DISTURB = 4;
public static final int AVAILABLE = 5;
public static final java.lang.String STATUS = "status";
public static final java.lang.String PRESENCE_CUSTOM_STATUS = "status";
public static final java.lang.String STATUS_TIMESTAMP = "status_ts";
public static final java.lang.String STATUS_RES_PACKAGE = "status_res_package";
public static final java.lang.String STATUS_LABEL = "status_label";
public static final java.lang.String STATUS_ICON = "status_icon";
}
protected static interface DataColumns
{
public static final java.lang.String MIMETYPE = "mimetype";
public static final java.lang.String RAW_CONTACT_ID = "raw_contact_id";
public static final java.lang.String IS_PRIMARY = "is_primary";
public static final java.lang.String IS_SUPER_PRIMARY = "is_super_primary";
public static final java.lang.String DATA_VERSION = "data_version";
public static final java.lang.String DATA1 = "data1";
public static final java.lang.String DATA2 = "data2";
public static final java.lang.String DATA3 = "data3";
public static final java.lang.String DATA4 = "data4";
public static final java.lang.String DATA5 = "data5";
public static final java.lang.String DATA6 = "data6";
public static final java.lang.String DATA7 = "data7";
public static final java.lang.String DATA8 = "data8";
public static final java.lang.String DATA9 = "data9";
public static final java.lang.String DATA10 = "data10";
public static final java.lang.String DATA11 = "data11";
public static final java.lang.String DATA12 = "data12";
public static final java.lang.String DATA13 = "data13";
public static final java.lang.String DATA14 = "data14";
public static final java.lang.String DATA15 = "data15";
public static final java.lang.String SYNC1 = "data_sync1";
public static final java.lang.String SYNC2 = "data_sync2";
public static final java.lang.String SYNC3 = "data_sync3";
public static final java.lang.String SYNC4 = "data_sync4";
}
protected static interface DataColumnsWithJoins
  extends android.provider.BaseColumns, android.provider.ContactsContract.DataColumns, android.provider.ContactsContract.StatusColumns, android.provider.ContactsContract.RawContactsColumns, android.provider.ContactsContract.ContactsColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.ContactStatusColumns
{
}
public static final class Data
  implements android.provider.ContactsContract.DataColumnsWithJoins
{
Data() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContactLookupUri(android.content.ContentResolver resolver, android.net.Uri dataUri) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/data";
static { CONTENT_URI = null; }
}
public static final class RawContactsEntity
  implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumns, android.provider.ContactsContract.RawContactsColumns
{
RawContactsEntity() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact_entity";
public static final java.lang.String DATA_ID = "data_id";
static { CONTENT_URI = null; }
}
protected static interface PhoneLookupColumns
{
public static final java.lang.String NUMBER = "number";
public static final java.lang.String TYPE = "type";
public static final java.lang.String LABEL = "label";
}
public static final class PhoneLookup
  implements android.provider.BaseColumns, android.provider.ContactsContract.PhoneLookupColumns, android.provider.ContactsContract.ContactsColumns, android.provider.ContactsContract.ContactOptionsColumns
{
PhoneLookup() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_FILTER_URI;
static { CONTENT_FILTER_URI = null; }
}
protected static interface PresenceColumns
{
public static final java.lang.String DATA_ID = "presence_data_id";
public static final java.lang.String PROTOCOL = "protocol";
public static final java.lang.String CUSTOM_PROTOCOL = "custom_protocol";
public static final java.lang.String IM_HANDLE = "im_handle";
public static final java.lang.String IM_ACCOUNT = "im_account";
}
public static class StatusUpdates
  implements android.provider.ContactsContract.StatusColumns, android.provider.ContactsContract.PresenceColumns
{
StatusUpdates() { throw new RuntimeException("Stub!"); }
public static final  int getPresenceIconResourceId(int status) { throw new RuntimeException("Stub!"); }
public static final  int getPresencePrecedence(int status) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/status-update";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/status-update";
static { CONTENT_URI = null; }
}
@java.lang.Deprecated()
public static final class Presence
  extends android.provider.ContactsContract.StatusUpdates
{
public  Presence() { throw new RuntimeException("Stub!"); }
}
public static final class CommonDataKinds
{
public static interface BaseTypes
{
public static final int TYPE_CUSTOM = 0;
}
protected static interface CommonColumns
  extends android.provider.ContactsContract.CommonDataKinds.BaseTypes
{
public static final java.lang.String DATA = "data1";
public static final java.lang.String TYPE = "data2";
public static final java.lang.String LABEL = "data3";
}
public static final class StructuredName
  implements android.provider.ContactsContract.DataColumnsWithJoins
{
StructuredName() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/name";
public static final java.lang.String DISPLAY_NAME = "data1";
public static final java.lang.String GIVEN_NAME = "data2";
public static final java.lang.String FAMILY_NAME = "data3";
public static final java.lang.String PREFIX = "data4";
public static final java.lang.String MIDDLE_NAME = "data5";
public static final java.lang.String SUFFIX = "data6";
public static final java.lang.String PHONETIC_GIVEN_NAME = "data7";
public static final java.lang.String PHONETIC_MIDDLE_NAME = "data8";
public static final java.lang.String PHONETIC_FAMILY_NAME = "data9";
}
public static final class Nickname
  implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns
{
Nickname() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/nickname";
public static final int TYPE_DEFAULT = 1;
public static final int TYPE_OTHER_NAME = 2;
public static final int TYPE_MAINDEN_NAME = 3;
public static final int TYPE_SHORT_NAME = 4;
public static final int TYPE_INITIALS = 5;
public static final java.lang.String NAME = "data1";
}
public static final class Phone
  implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns
{
Phone() { throw new RuntimeException("Stub!"); }
public static final  int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getTypeLabel(android.content.res.Resources res, int type, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone_v2";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/phone_v2";
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri CONTENT_FILTER_URI;
public static final int TYPE_HOME = 1;
public static final int TYPE_MOBILE = 2;
public static final int TYPE_WORK = 3;
public static final int TYPE_FAX_WORK = 4;
public static final int TYPE_FAX_HOME = 5;
public static final int TYPE_PAGER = 6;
public static final int TYPE_OTHER = 7;
public static final int TYPE_CALLBACK = 8;
public static final int TYPE_CAR = 9;
public static final int TYPE_COMPANY_MAIN = 10;
public static final int TYPE_ISDN = 11;
public static final int TYPE_MAIN = 12;
public static final int TYPE_OTHER_FAX = 13;
public static final int TYPE_RADIO = 14;
public static final int TYPE_TELEX = 15;
public static final int TYPE_TTY_TDD = 16;
public static final int TYPE_WORK_MOBILE = 17;
public static final int TYPE_WORK_PAGER = 18;
public static final int TYPE_ASSISTANT = 19;
public static final int TYPE_MMS = 20;
public static final java.lang.String NUMBER = "data1";
static { CONTENT_URI = null; CONTENT_FILTER_URI = null; }
}
public static final class Email
  implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns
{
Email() { throw new RuntimeException("Stub!"); }
public static final  int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getTypeLabel(android.content.res.Resources res, int type, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/email_v2";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/email_v2";
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri CONTENT_LOOKUP_URI;
public static final android.net.Uri CONTENT_FILTER_URI;
public static final int TYPE_HOME = 1;
public static final int TYPE_WORK = 2;
public static final int TYPE_OTHER = 3;
public static final int TYPE_MOBILE = 4;
public static final java.lang.String DISPLAY_NAME = "data4";
static { CONTENT_URI = null; CONTENT_LOOKUP_URI = null; CONTENT_FILTER_URI = null; }
}
public static final class StructuredPostal
  implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns
{
StructuredPostal() { throw new RuntimeException("Stub!"); }
public static final  int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getTypeLabel(android.content.res.Resources res, int type, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/postal-address_v2";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/postal-address_v2";
public static final android.net.Uri CONTENT_URI;
public static final int TYPE_HOME = 1;
public static final int TYPE_WORK = 2;
public static final int TYPE_OTHER = 3;
public static final java.lang.String FORMATTED_ADDRESS = "data1";
public static final java.lang.String STREET = "data4";
public static final java.lang.String POBOX = "data5";
public static final java.lang.String NEIGHBORHOOD = "data6";
public static final java.lang.String CITY = "data7";
public static final java.lang.String REGION = "data8";
public static final java.lang.String POSTCODE = "data9";
public static final java.lang.String COUNTRY = "data10";
static { CONTENT_URI = null; }
}
public static final class Im
  implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns
{
Im() { throw new RuntimeException("Stub!"); }
public static final  int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getTypeLabel(android.content.res.Resources res, int type, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public static final  int getProtocolLabelResource(int type) { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getProtocolLabel(android.content.res.Resources res, int type, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/im";
public static final int TYPE_HOME = 1;
public static final int TYPE_WORK = 2;
public static final int TYPE_OTHER = 3;
public static final java.lang.String PROTOCOL = "data5";
public static final java.lang.String CUSTOM_PROTOCOL = "data6";
public static final int PROTOCOL_CUSTOM = -1;
public static final int PROTOCOL_AIM = 0;
public static final int PROTOCOL_MSN = 1;
public static final int PROTOCOL_YAHOO = 2;
public static final int PROTOCOL_SKYPE = 3;
public static final int PROTOCOL_QQ = 4;
public static final int PROTOCOL_GOOGLE_TALK = 5;
public static final int PROTOCOL_ICQ = 6;
public static final int PROTOCOL_JABBER = 7;
public static final int PROTOCOL_NETMEETING = 8;
}
public static final class Organization
  implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns
{
Organization() { throw new RuntimeException("Stub!"); }
public static final  int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
public static final  java.lang.CharSequence getTypeLabel(android.content.res.Resources res, int type, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/organization";
public static final int TYPE_WORK = 1;
public static final int TYPE_OTHER = 2;
public static final java.lang.String COMPANY = "data1";
public static final java.lang.String TITLE = "data4";
public static final java.lang.String DEPARTMENT = "data5";
public static final java.lang.String JOB_DESCRIPTION = "data6";
public static final java.lang.String SYMBOL = "data7";
public static final java.lang.String PHONETIC_NAME = "data8";
public static final java.lang.String OFFICE_LOCATION = "data9";
}
public static final class Relation
  implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns
{
Relation() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/relation";
public static final int TYPE_ASSISTANT = 1;
public static final int TYPE_BROTHER = 2;
public static final int TYPE_CHILD = 3;
public static final int TYPE_DOMESTIC_PARTNER = 4;
public static final int TYPE_FATHER = 5;
public static final int TYPE_FRIEND = 6;
public static final int TYPE_MANAGER = 7;
public static final int TYPE_MOTHER = 8;
public static final int TYPE_PARENT = 9;
public static final int TYPE_PARTNER = 10;
public static final int TYPE_REFERRED_BY = 11;
public static final int TYPE_RELATIVE = 12;
public static final int TYPE_SISTER = 13;
public static final int TYPE_SPOUSE = 14;
public static final java.lang.String NAME = "data1";
}
public static final class Event
  implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns
{
Event() { throw new RuntimeException("Stub!"); }
public static  int getTypeResource(java.lang.Integer type) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_event";
public static final int TYPE_ANNIVERSARY = 1;
public static final int TYPE_OTHER = 2;
public static final int TYPE_BIRTHDAY = 3;
public static final java.lang.String START_DATE = "data1";
}
public static final class Photo
  implements android.provider.ContactsContract.DataColumnsWithJoins
{
Photo() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/photo";
public static final java.lang.String PHOTO = "data15";
}
public static final class Note
  implements android.provider.ContactsContract.DataColumnsWithJoins
{
Note() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/note";
public static final java.lang.String NOTE = "data1";
}
public static final class GroupMembership
  implements android.provider.ContactsContract.DataColumnsWithJoins
{
GroupMembership() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group_membership";
public static final java.lang.String GROUP_ROW_ID = "data1";
public static final java.lang.String GROUP_SOURCE_ID = "group_sourceid";
}
public static final class Website
  implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns
{
Website() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/website";
public static final int TYPE_HOMEPAGE = 1;
public static final int TYPE_BLOG = 2;
public static final int TYPE_PROFILE = 3;
public static final int TYPE_HOME = 4;
public static final int TYPE_WORK = 5;
public static final int TYPE_FTP = 6;
public static final int TYPE_OTHER = 7;
public static final java.lang.String URL = "data1";
}
CommonDataKinds() { throw new RuntimeException("Stub!"); }
}
protected static interface GroupsColumns
{
public static final java.lang.String TITLE = "title";
public static final java.lang.String NOTES = "notes";
public static final java.lang.String SYSTEM_ID = "system_id";
public static final java.lang.String SUMMARY_COUNT = "summ_count";
public static final java.lang.String SUMMARY_WITH_PHONES = "summ_phones";
public static final java.lang.String GROUP_VISIBLE = "group_visible";
public static final java.lang.String DELETED = "deleted";
public static final java.lang.String SHOULD_SYNC = "should_sync";
}
public static final class Groups
  implements android.provider.BaseColumns, android.provider.ContactsContract.GroupsColumns, android.provider.ContactsContract.SyncColumns
{
Groups() { throw new RuntimeException("Stub!"); }
public static  android.content.EntityIterator newEntityIterator(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri CONTENT_SUMMARY_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/group";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group";
static { CONTENT_URI = null; CONTENT_SUMMARY_URI = null; }
}
public static final class AggregationExceptions
  implements android.provider.BaseColumns
{
AggregationExceptions() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/aggregation_exception";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/aggregation_exception";
public static final java.lang.String TYPE = "type";
public static final int TYPE_AUTOMATIC = 0;
public static final int TYPE_KEEP_TOGETHER = 1;
public static final int TYPE_KEEP_SEPARATE = 2;
public static final java.lang.String RAW_CONTACT_ID1 = "raw_contact_id1";
public static final java.lang.String RAW_CONTACT_ID2 = "raw_contact_id2";
static { CONTENT_URI = null; }
}
protected static interface SettingsColumns
{
public static final java.lang.String ACCOUNT_NAME = "account_name";
public static final java.lang.String ACCOUNT_TYPE = "account_type";
public static final java.lang.String SHOULD_SYNC = "should_sync";
public static final java.lang.String UNGROUPED_VISIBLE = "ungrouped_visible";
public static final java.lang.String ANY_UNSYNCED = "any_unsynced";
public static final java.lang.String UNGROUPED_COUNT = "summ_count";
public static final java.lang.String UNGROUPED_WITH_PHONES = "summ_phones";
}
public static final class Settings
  implements android.provider.ContactsContract.SettingsColumns
{
Settings() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/setting";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/setting";
static { CONTENT_URI = null; }
}
public static final class QuickContact
{
public  QuickContact() { throw new RuntimeException("Stub!"); }
public static  void showQuickContact(android.content.Context context, android.view.View target, android.net.Uri lookupUri, int mode, java.lang.String[] excludeMimes) { throw new RuntimeException("Stub!"); }
public static  void showQuickContact(android.content.Context context, android.graphics.Rect target, android.net.Uri lookupUri, int mode, java.lang.String[] excludeMimes) { throw new RuntimeException("Stub!"); }
public static final int MODE_SMALL = 1;
public static final int MODE_MEDIUM = 2;
public static final int MODE_LARGE = 3;
}
public static final class Intents
{
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
public  ContactsContract() { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUTHORITY = "com.android.contacts";
public static final android.net.Uri AUTHORITY_URI;
public static final java.lang.String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
static { AUTHORITY_URI = null; }
}
