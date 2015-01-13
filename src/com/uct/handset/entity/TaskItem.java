package com.uct.handset.entity;

/**
 * 
 * @author Administrator
 *         <P>
 *         TaskItem任务单项表
 *         <P>
 */
public class TaskItem {
	/** 任务单ID号 */
	private String TaskID;
	/** 任务项内部序号(同一单内安排次序用) */
	private String ItemNum;
	/** 物资EPC编码 */
	private String EPCCode;
	/** 物资名称 */
	private String MaterialName;
	/** 包装编号 */
	private String PacketCode;
	/** 操作数，如果UnWrap标示拆包，则表示实际操作的细类物资数目，如果UnWrap标示未拆包，则表示物流数量(箱数或者是包数)。 */
	private Integer ActualNum;
	/** 操作标志，入库\出库\盘库 */
	private Integer OperType;
	/** 库房ID */
	private String HouseID;
	/** 货架ID */
	private String ShelfID;
	/** 货位号 */
	private Integer LocateID;
	/** 是否拆包 */
	private Integer UnWrap;

	/**
	 * <P>
	 * TaskItem任务单项表
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
