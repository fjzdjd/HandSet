package com.uct.handset.jni;

/**
 * 
 * @author ZZP
 *
 */
public interface JNInterface {

	/**
	 * 获取读写器ID
	 * 
	 * @return String
	 */
	public String GetReaderID();

	/**
	 * 获取读写器版本信息
	 * 
	 * @return String
	 */
	public String GetReaderVersion();

	/**
	 * 获取读写器工作信道
	 * 
	 * @return String
	 */
	public String GetReaderWorkChannel();

	/**
	 * 获取读写器发射功率
	 * 
	 * @return String
	 */
	public String GetReaderTxPower();

	/**
	 * 获取读写器盘点参数
	 * 
	 * @return String
	 */
	public String GetInventoryConfig();

	/**
	 * 设置读写器工作信道
	 * 
	 * @param ReaderWorkChannel
	 * 
	 * @return String
	 */
	public String SetReaderWorkChannel(String ReaderWorkChannel);

	public String SetReaderTxPower(String parameter);

	public String SetInventoryConfig(String parameter);

	public String Inventory(String parameter);

	public String Surveilance(String parameter);

	public String ReadBinaryFile(String parameter);

	public String ReadRecordFile(String paraameter);

	public String SearchRecordFile(String parameter);

	public String SelectFile(String parameter);

	public String ListFolder(String parameter);

	public String BroadcastData(String parameter);

	public String RequestRandom(String parameter);

	public String SleepAllTag(String parameter);

	public String SleepAllTagExceptOneKind(String parameter);

	public String SleepAllTagExceptOne(String parameter);

	public String SetSurVeilanceConfig(String parameter);

	public String EnableSensor(String parameter);

	public String SetFileValidate(String parameter);

	public String WriteBinaryFile(String parameter);

	public String WriteRecordFile(String parameter);

	public String DestoryTag(String parameter);

	public String UpdatePWD(String parameter);

	public String WakeUpTag(String parameter);

	public String GetLastErrorStr();

	public void EventReport(String parameter);

	public void DefSurveilanceCallBack(String paramer);

	public void DefInventoryCallBack(String paramer);
}
