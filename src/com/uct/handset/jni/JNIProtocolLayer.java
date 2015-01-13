package com.uct.handset.jni;

/**
 * 
 * @author ZZP
 *
 */
public class JNIProtocolLayer {

	/**
	 * 关联JNI层提供的SO文件
	 */
	static {
		try {
			System.loadLibrary("ProtocolParseLayer");
		} catch (UnsatisfiedLinkError e) {
		}
	}

	/**
	 * 获取读写器ID
	 * 
	 * @return "ErrorCode": UINT16, "RID": [UINT8,UINT8,UINT8]
	 */
	public native String GetReaderID();

	/**
	 * 2.2.获取读写器版本信息
	 * 
	 * @return string
	 */
	public native String GetReaderVersion();

	/**
	 * 2.3.获取读写器工作信道
	 * 
	 * @return string
	 */
	public native String GetReaderWorkChannel();

	/**
	 * 2.4.获取读写器发射功率
	 * 
	 * @return string
	 */
	public native String GetReaderTxPower();

	/**
	 * 2.5.获取读写器盘点参数
	 * 
	 * @return string
	 */
	public native String GetInventoryConfig();

	/**
	 * 设置读写器工作信道
	 * 
	 * @param string
	 *            ReaderWorkChannel
	 * 
	 * @return string
	 */
	public native String SetReaderWorkChannel(String parameter);

	/**
	 * 3.2.设置读写器射频功率
	 * 
	 * @param string
	 *            RfTxPower
	 * @return String
	 */
	public native String SetReaderTxPower(String parameter);

	/**
	 * 3.3.设置读写器盘点参数
	 * 
	 * @param parameter
	 * @return String
	 */
	public native String SetInventoryConfig(String parameter);

	/**
	 * 
	 * @param parameter
	 * @return
	 */
	public native String Inventory(String parameter);

	public native String Surveilance(String parameter);

	public native String ReadBinaryFile(String parameter);

	public native String ReadRecordFile(String paraameter);

	public native String SearchRecordFile(String parameter);

	public native String SelectFile(String parameter);

	public native String ListFolder(String parameter);

	public native String BroadcastData(String parameter);

	public native String RequestRandom(String parameter);

	public native String SleepAllTag(String parameter);

	public native String SleepAllTagExceptOneKind(String parameter);

	public native String SleepAllTagExceptOne(String parameter);

	public native String SetSurVeilanceConfig(String parameter);

	public native String EnableSensor(String parameter);

	public native String SetFileValidate(String parameter);

	public native String WriteBinaryFile(String parameter);

	public native String WriteRecordFile(String parameter);

	public native String DestoryTag(String parameter);

	public native String UpdatePWD(String parameter);

	public native String WakeUpTag(String parameter);

	public native String GetLastErrorStr();

	/**
	 * 
	 * @param parameter
	 */
	public native void EventReport(String parameter);

	/**
	 * 
	 * @param paramer
	 */
	public void DefSurveilanceCallBack(String paramer) {
	}

	/**
	 * 
	 * @param paramer
	 */
	public void DefInventoryCallBack(String paramer) {
	}

}
