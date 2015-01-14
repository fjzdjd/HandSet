package com.uct.handset.jni;

/**
 * 
 * @author ZZP
 *
 */
public class JNIOperateImpl implements JNInterface {

	/** 获得jni操作对象 */
	private JNIProtocolLayer operateJNI = new JNIProtocolLayer();

	@Override
	public String GetReaderID() {
		String result = JNInitParameter.INIT_VALUE;
		try {
			result = operateJNI.GetReaderID();
		} catch (Exception e) {
		}

		return result;
	}

	@Override
	public String GetReaderVersion() {
		String result = JNInitParameter.INIT_VALUE;
		try {
			result = operateJNI.GetReaderVersion();
		} catch (Exception e) {
		}

		return result;
	}

	@Override
	public String GetReaderWorkChannel() {

		String result = JNInitParameter.INIT_VALUE;
		try {
			result = operateJNI.GetReaderWorkChannel();
		} catch (Exception e) {
		}

		return result;
	}

	@Override
	public String GetReaderTxPower() {
		String result = JNInitParameter.INIT_VALUE;
		try {
			result = operateJNI.GetReaderTxPower();
		} catch (Exception e) {
		}

		return result;

	}

	@Override
	public String GetInventoryConfig() {

		String result = JNInitParameter.INIT_VALUE;
		try {
			result = operateJNI.GetInventoryConfig();
		} catch (Exception e) {
		}

		return result;
	}

	@Override
	public String SetReaderWorkChannel(String parameter) {
		String result = JNInitParameter.INIT_VALUE;
		try {
			result = operateJNI.SetReaderWorkChannel(parameter);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public String SetReaderTxPower(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SetInventoryConfig(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Inventory(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Surveilance(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ReadBinaryFile(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ReadRecordFile(String paraameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SearchRecordFile(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SelectFile(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ListFolder(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BroadcastData(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String RequestRandom(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SleepAllTag(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SleepAllTagExceptOneKind(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SleepAllTagExceptOne(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SetSurVeilanceConfig(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String EnableSensor(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SetFileValidate(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String WriteBinaryFile(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String WriteRecordFile(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DestoryTag(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdatePWD(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String WakeUpTag(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetLastErrorStr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void EventReport(String parameter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DefSurveilanceCallBack(String paramer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DefInventoryCallBack(String paramer) {
		// TODO Auto-generated method stub

	}

}
