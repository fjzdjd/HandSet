package com.uct.handset.entity;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 *         <P>
 *         TaskHead����ͷ��
 *         <P>
 */
@SuppressWarnings("serial")
public class TaskHead implements Serializable {
	/** ����ID�� */
	String TaskID;
	/** �ⷿ��� */
	String HouseID;
	/** ���񵥷���ID�� */
	String TaskType;
	/** ������� */
	String TaskYear;
	/** ������ţ����꣩ */
	String TaskNumber;
	/** �������� */
	String TaskDate;
	/** �������� */
	String TaskName;
	/** �ֿ�����Ա��� */
	String OwerID;
	/** �ֿ�����Ա���� */
	String OwerName;
	/** ������Ա(����Ա)�� */
	String OperaterID;
	/** ������Ա(����Ա)�� */
	String OperaterName;
	/** ����ִ�в��� */
	String OptStep;

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
	 */
	public TaskHead(String taskID, String houseID, String taskType,
			String taskYear, String taskNumber, String taskDate,
			String taskName, String owerID, String owerName, String operaterID,
			String operaterName, String optStep) {
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

	public String getTaskType() {
		return TaskType;
	}

	public void setTaskType(String taskType) {
		TaskType = taskType;
	}

	public String getTaskYear() {
		return TaskYear;
	}

	public void setTaskYear(String taskYear) {
		TaskYear = taskYear;
	}

	public String getTaskNumber() {
		return TaskNumber;
	}

	public void setTaskNumber(String taskNumber) {
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

	public String getOptStep() {
		return OptStep;
	}

	public void setOptStep(String optStep) {
		OptStep = optStep;
	}

}
