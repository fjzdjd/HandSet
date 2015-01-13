package com.uct.handset.jni;

/**
 * 
 * @author ZZP
 *
 */
public class JNIProtocolLayer {

	/**
	 * ����JNI���ṩ��SO�ļ�
	 */
	static {
		try {
			System.loadLibrary("ProtocolParseLayer");
		} catch (UnsatisfiedLinkError e) {
		}
	}

	/**
	 * ��ȡ��д��ID
	 * 
	 * @return "ErrorCode": UINT16, "RID": [UINT8,UINT8,UINT8]
	 */
	public native String GetReaderID();

	/**
	 * 2.2.��ȡ��д���汾��Ϣ
	 * 
	 * @return string
	 */
	public native String GetReaderVersion();

	/**
	 * 2.3.��ȡ��д�������ŵ�
	 * 
	 * @return string
	 */
	public native String GetReaderWorkChannel();

	/**
	 * 2.4.��ȡ��д�����书��
	 * 
	 * @return string
	 */
	public native String GetReaderTxPower();

	/**
	 * 2.5.��ȡ��д���̵����
	 * 
	 * @return string
	 */
	public native String GetInventoryConfig();

	/**
	 * ���ö�д�������ŵ�
	 * 
	 * @param string
	 *            ReaderWorkChannel
	 * 
	 * @return string
	 */
	public native String SetReaderWorkChannel(String parameter);

	/**
	 * 3.2.���ö�д����Ƶ����
	 * 
	 * @param string
	 *            RfTxPower
	 * @return String
	 */
	public native String SetReaderTxPower(String parameter);

	/**
	 * 3.3.���ö�д���̵����
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
