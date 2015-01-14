package com.uct.handset.constant;

/**
 * 
 * @author ZZP
 *         <P>
 *         JNI所使用常量,参数
 *         <P>
 *
 */
public class JNIConstant {

	/**
	 * <P>
	 * <B> 读写器工作信道:<B>
	 * <P>
	 * "ReaderWorkChannel":0
	 */
	public static final String READERWORKCHANNEL = "{0}";

	/**
	 * <P>
	 * <B>设置盘点参数<B>
	 * <P>
	 * {"WorkChannel":0, "WakePassword":[30,30,30,30], "SleepListenTime": {
	 * "SleepTime":4, "ListenTime":3, }, "Access_Q":1, "Access_N":8,
	 * "SlotWidth":500, "RecSendIndicate":0, "SendIndicate":0, "FileName":41217,
	 * "MaxInventoryTime":48}
	 */
	public static final String SETINVENTORYCONFIG = "{0,[30,30,30,30],{4,3},1,8,500,0,0,41217,48}";
}
