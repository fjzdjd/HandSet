package com.uct.handset.entity;

/**
 * 
 * @author Administrator
 *         <P>
 *         TaskHead����ͷ��
 *         <P>
 */
public class TaskHeads {
	/** ����ID�� */
	private String TaskID;
	/** �ⷿ��� */
	private String HouseID;
	/** ���񵥷���ID�� */
	private Integer TaskType;
	/** ������� */
	private Integer TaskYear;
	/** ������ţ����꣩ */
	private Integer TaskNumber;
	/** �������� */
	private String TaskDate;
	/** �������� */
	private String TaskName;
	/** �ֿ�����Ա��� */
	private String OwerID;
	/** �ֿ�����Ա���� */
	private String OwerName;
	/** ������Ա(����Ա)��� */
	private String OperaterID;
	/** ������Ա(����Ա)���� */
	private String OperaterName;
	/** ����ִ�в��� */
	private Integer OptStep;
	/***/
	private Integer Packetnum;
	/** ����ע�� */
	private String SUMMARY;
	/** �·����ݵ�ID */
	private String BillID;
	/***/
	private String Readerid;

	/**
	 * <P>
	 * TaskHead����ͷ��
	 * <P>
	 * 
	 * @param taskID
	 * @param houseID
	 * @param taskType
	 * @param taskYear
	 * @param taskNumber
	 * @param taskDate
	 * @param taskName
	 * @param owerID
	 * @param owerName
	 * @param operaterID
	 * @param operaterName
	 * @param optStep
	 * @param packetnum
	 * @param sUMMARY
	 * @param billID
	 * @param readerid
	 */
	public TaskHeads(String taskID, String houseID, Integer taskType,
			Integer taskYear, Integer taskNumber, String taskDate,
			String taskName, String owerID, String owerName, String operaterID,
			String operaterName, Integer optStep, Integer packetnum,
			String sUMMARY, String billID, String readerid) {
		super();
		TaskID = taskID;
		HouseID = houseID;
		TaskType = taskType;
		TaskYear = taskYear;
		TaskNumber = taskNumber;
		TaskDate = taskDate;
		TaskName = taskName;
		OwerID = owerID;
		OwerName = owerName;
		OperaterID = operaterID;
		OperaterName = operaterName;
		OptStep = optStep;
		Packetnum = packetnum;
		SUMMARY = sUMMARY;
		BillID = billID;
		Readerid = readerid;
	}

	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}

	public String getHouseID() {
		return HouseID;
	}

	public void setHouseID(String houseID) {
		HouseID = houseID;
	}

	public Integer getTaskType() {
		return TaskType;
	}

	public void setTaskType(Integer taskType) {
		TaskType = taskType;
	}

	public Integer getTaskYear() {
		return TaskYear;
	}

	public void setTaskYear(Integer taskYear) {
		TaskYear = taskYear;
	}

	public Integer getTaskNumber() {
		return TaskNumber;
	}

	public void setTaskNumber(Integer taskNumber) {
		TaskNumber = taskNumber;
	}

	public String getTaskDate() {
		return TaskDate;
	}

	public void setTaskDate(String taskDate) {
		TaskDate = taskDate;
	}

	public String getTaskName() {
		return TaskName;
	}

	public void setTaskName(String taskName) {
		TaskName = taskName;
	}

	public String getOwerID() {
		return OwerID;
	}

	public void setOwerID(String owerID) {
		OwerID = owerID;
	}

	public String getOwerName() {
		return OwerName;
	}

	public void setOwerName(String owerName) {
		OwerName = owerName;
	}

	public String getOperaterID() {
		return OperaterID;
	}

	public void setOperaterID(String operaterID) {
		OperaterID = operaterID;
	}

	public String getOperaterName() {
		return OperaterName;
	}

	public void setOperaterName(String operaterName) {
		OperaterName = operaterName;
	}

	public Integer getOptStep() {
		return OptStep;
	}

	public void setOptStep(Integer optStep) {
		OptStep = optStep;
	}

	public Integer getPacketnum() {
		return Packetnum;
	}

	public void setPacketnum(Integer packetnum) {
		Packetnum = packetnum;
	}

	public String getSUMMARY() {
		return SUMMARY;
	}

	public void setSUMMARY(String sUMMARY) {
		SUMMARY = sUMMARY;
	}

	public String getBillID() {
		return BillID;
	}

	public void setBillID(String billID) {
		BillID = billID;
	}

	public String getReaderid() {
		return Readerid;
	}

	public void setReaderid(String readerid) {
		Readerid = readerid;
	}

}
