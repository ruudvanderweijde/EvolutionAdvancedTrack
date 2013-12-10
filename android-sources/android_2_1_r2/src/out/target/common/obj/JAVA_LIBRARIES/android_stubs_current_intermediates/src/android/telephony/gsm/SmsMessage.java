package android.telephony.gsm;
@java.lang.Deprecated()
public class SmsMessage
{
@java.lang.Deprecated()
public static enum MessageClass
{
CLASS_0(),
CLASS_1(),
CLASS_2(),
CLASS_3(),
UNKNOWN();
}
@java.lang.Deprecated()
public static class SubmitPdu
{
public  SubmitPdu() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public byte[] encodedScAddress = null;
public byte[] encodedMessage = null;
}
public  SmsMessage() { throw new RuntimeException("Stub!"); }
public static  android.telephony.gsm.SmsMessage createFromPdu(byte[] pdu) { throw new RuntimeException("Stub!"); }
public static  int getTPLayerLengthForPDU(java.lang.String pdu) { throw new RuntimeException("Stub!"); }
public static  int[] calculateLength(java.lang.CharSequence messageBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); }
public static  int[] calculateLength(java.lang.String messageBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); }
public static  android.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String scAddress, java.lang.String destinationAddress, java.lang.String message, boolean statusReportRequested) { throw new RuntimeException("Stub!"); }
public static  android.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String scAddress, java.lang.String destinationAddress, short destinationPort, byte[] data, boolean statusReportRequested) { throw new RuntimeException("Stub!"); }
public  java.lang.String getServiceCenterAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOriginatingAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayOriginatingAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMessageBody() { throw new RuntimeException("Stub!"); }
public  android.telephony.gsm.SmsMessage.MessageClass getMessageClass() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayMessageBody() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPseudoSubject() { throw new RuntimeException("Stub!"); }
public  long getTimestampMillis() { throw new RuntimeException("Stub!"); }
public  boolean isEmail() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEmailBody() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEmailFrom() { throw new RuntimeException("Stub!"); }
public  int getProtocolIdentifier() { throw new RuntimeException("Stub!"); }
public  boolean isReplace() { throw new RuntimeException("Stub!"); }
public  boolean isCphsMwiMessage() { throw new RuntimeException("Stub!"); }
public  boolean isMWIClearMessage() { throw new RuntimeException("Stub!"); }
public  boolean isMWISetMessage() { throw new RuntimeException("Stub!"); }
public  boolean isMwiDontStore() { throw new RuntimeException("Stub!"); }
public  byte[] getUserData() { throw new RuntimeException("Stub!"); }
public  byte[] getPdu() { throw new RuntimeException("Stub!"); }
public  int getStatusOnSim() { throw new RuntimeException("Stub!"); }
public  int getIndexOnSim() { throw new RuntimeException("Stub!"); }
public  int getStatus() { throw new RuntimeException("Stub!"); }
public  boolean isStatusReportMessage() { throw new RuntimeException("Stub!"); }
public  boolean isReplyPathPresent() { throw new RuntimeException("Stub!"); }
public static final int ENCODING_UNKNOWN = 0;
public static final int ENCODING_7BIT = 1;
public static final int ENCODING_8BIT = 2;
public static final int ENCODING_16BIT = 3;
public static final int MAX_USER_DATA_BYTES = 140;
public static final int MAX_USER_DATA_SEPTETS = 160;
public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;
}
