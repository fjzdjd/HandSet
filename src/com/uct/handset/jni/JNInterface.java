package com.uct.handset.jni;

/**
 * 
 * @author ZZP
 *
 */
public interface JNInterface {

	/**
	 * ��ȡ��д��ID
	 * 
	 * @return String
	 */
	public String GetReaderID();

	/**
	 * ��ȡ��д���汾��Ϣ
	 * 
	 * @return String
	 */
	public String GetReaderVersion();

	/**
	 * ��ȡ��д�������ŵ�
	 * 
	 * @return String
	 */
	public String GetReaderWorkChannel();

	/**
	 * ��ȡ��д�����书��
	 * 
	 * @return String
	 */
	public String GetReaderTxPower();

	/**
	 * ��ȡ��д���̵����
	 * 
	 * @return String
	 */
	public String GetInventoryConfig();

	/**
	 * ���ö�д�������ŵ�
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
