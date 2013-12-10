package android.media;
public class ExifInterface
{
public  ExifInterface(java.lang.String filename) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getAttribute(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  int getAttributeInt(java.lang.String tag, int defaultValue) { throw new RuntimeException("Stub!"); }
public  double getAttributeDouble(java.lang.String tag, double defaultValue) { throw new RuntimeException("Stub!"); }
public  void setAttribute(java.lang.String tag, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void saveAttributes() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean hasThumbnail() { throw new RuntimeException("Stub!"); }
public  byte[] getThumbnail() { throw new RuntimeException("Stub!"); }
public  boolean getLatLong(float[] output) { throw new RuntimeException("Stub!"); }
public static final java.lang.String TAG_ORIENTATION = "Orientation";
public static final java.lang.String TAG_DATETIME = "DateTime";
public static final java.lang.String TAG_MAKE = "Make";
public static final java.lang.String TAG_MODEL = "Model";
public static final java.lang.String TAG_FLASH = "Flash";
public static final java.lang.String TAG_IMAGE_WIDTH = "ImageWidth";
public static final java.lang.String TAG_IMAGE_LENGTH = "ImageLength";
public static final java.lang.String TAG_GPS_LATITUDE = "GPSLatitude";
public static final java.lang.String TAG_GPS_LONGITUDE = "GPSLongitude";
public static final java.lang.String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
public static final java.lang.String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
public static final java.lang.String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
public static final java.lang.String TAG_GPS_DATESTAMP = "GPSDateStamp";
public static final java.lang.String TAG_WHITE_BALANCE = "WhiteBalance";
public static final java.lang.String TAG_FOCAL_LENGTH = "FocalLength";
public static final java.lang.String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
public static final int ORIENTATION_UNDEFINED = 0;
public static final int ORIENTATION_NORMAL = 1;
public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
public static final int ORIENTATION_ROTATE_180 = 3;
public static final int ORIENTATION_FLIP_VERTICAL = 4;
public static final int ORIENTATION_TRANSPOSE = 5;
public static final int ORIENTATION_ROTATE_90 = 6;
public static final int ORIENTATION_TRANSVERSE = 7;
public static final int ORIENTATION_ROTATE_270 = 8;
public static final int WHITEBALANCE_AUTO = 0;
public static final int WHITEBALANCE_MANUAL = 1;
}
