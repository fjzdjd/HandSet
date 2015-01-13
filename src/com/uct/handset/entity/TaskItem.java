package com.uct.handset.entity;

/**
 * 
 * @author Administrator
 *         <P>
 *         TaskItem�������
 *         <P>
 */
public class TaskItem {
	/** ����ID�� */
	private String TaskID;
	/** �������ڲ����(ͬһ���ڰ��Ŵ�����) */
	private String ItemNum;
	/** ����EPC���� */
	private String EPCCode;
	/** �������� */
	private String MaterialName;
	/** ��װ��� */
	private String PacketCode;
	/** �����������UnWrap��ʾ��������ʾʵ�ʲ�����ϸ��������Ŀ�����UnWrap��ʾδ��������ʾ��������(���������ǰ���)�� */
	private Integer ActualNum;
	/** ������־�����\����\�̿� */
	private Integer OperType;
	/** �ⷿID */
	private String HouseID;
	/** ����ID */
	private String ShelfID;
	/** ��λ�� */
	private Integer LocateID;
	/** �Ƿ��� */
	private Integer UnWrap;

	/**
	 * <P>
	 * TaskItem�������
	 * <P>
	 * 
	 * @param taskID
	 * @param itemNum
	 * @param ePCCode
	 * @param materialName
	 * @param packetCode
	 * @param actualNum
	 * @param operType
	 * @param houseID
	 * @param shelfID
	 * @param locateID
	 * @param unWrap
	 */
	public TaskItem(String taskID, String itemNum, String ePCCode,
			String materialName, String packetCode, Integer actualNum,
			Integer operType, String houseID, String shelfID, Integer locateID,
			Integer unWrap) {
		super();
		TaskID = taskID;
		ItemNum = itemNum;
		EPCCode = ePCCode;
		MaterialName = materialName;
		PacketCode = packetCode;
		ActualNum = actualNum;
		OperType = operType;
		HouseID = houseID;
		ShelfID = shelfID;
		LocateID = locateID;
		UnWrap = unWrap;
	}

	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}

	public String getItemNum() {
		return ItemNum;
	}

	public void setItemNum(String itemNum) {
		ItemNum = itemNum;
	}

	public String getEPCCode() {
		return EPCCode;
	}

	public void setEPCCode(String ePCCode) {
		EPCCode = ePCCode;
	}

	public String getMaterialName() {
		return MaterialName;
	}

	public void setMaterialName(String materialName) {
		MaterialName = materialName;
	}

	public String getPacketCode() {
		return PacketCode;
	}

	public void setPacketCode(String packetCode) {
		PacketCode = packetCode;
	}

	public Integer getActualNum() {
		return ActualNum;
	}

	public void setActualNum(Integer actualNum) {
		ActualNum = actualNum;
	}

	public Integer getOperType() {
		return OperType;
	}

	public void setOperType(Integer operType) {
		OperType = operType;
	}

	public String getHouseID() {
		return HouseID;
	}

	public void setHouseID(String houseID) {
		HouseID = houseID;
	}

	public String getShelfID() {
		return ShelfID;
	}

	public void setShelfID(String shelfID) {
		ShelfID = shelfID;
	}

	public Integer getLocateID() {
		return LocateID;
	}

	public void setLocateID(Integer locateID) {
		LocateID = locateID;
	}

	public Integer getUnWrap() {
		return UnWrap;
	}

	public void setUnWrap(Integer unWrap) {
		UnWrap = unWrap;
	}

}
