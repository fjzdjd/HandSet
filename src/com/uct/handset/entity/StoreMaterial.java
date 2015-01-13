package com.uct.handset.entity;

/**
 * <P>
 * StoreMaterial仓储物资分布表
 * <P>
 * 
 * @author Administrator
 * 
 */
public class StoreMaterial {

	/** 库房ID */
	private String HouseID;
	/** 货架ID */
	private String SHELFID;
	/** 货位ID */
	private Integer LOCATEID;
	/** 物资EPC编码 */
	private String EPCTAG;
	private Integer Actualnum;
	private String Packetid;

	/**
	 * <P>
	 * StoreMaterial仓储物资分布表
	 * <P>
	 * 
	 * @param houseID
	 * @param sHELFID
	 * @param lOCATEID
	 * @param ePCTAG
	 * @param actualnum
	 * @param packetid
	 */
	public StoreMaterial(String houseID, String sHELFID, Integer lOCATEID,
			String ePCTAG, Integer actualnum, String packetid) {
		super();
		HouseID = houseID;
		SHELFID = sHELFID;
		LOCATEID = lOCATEID;
		EPCTAG = ePCTAG;
		Actualnum = actualnum;
		Packetid = packetid;
	}

	public String getHouseID() {
		return HouseID;
	}

	public void setHouseID(String houseID) {
		HouseID = houseID;
	}

	public String getSHELFID() {
		return SHELFID;
	}

	public void setSHELFID(String sHELFID) {
		SHELFID = sHELFID;
	}

	public Integer getLOCATEID() {
		return LOCATEID;
	}

	public void setLOCATEID(Integer lOCATEID) {
		LOCATEID = lOCATEID;
	}

	public String getEPCTAG() {
		return EPCTAG;
	}

	public void setEPCTAG(String ePCTAG) {
		EPCTAG = ePCTAG;
	}

	public Integer getActualnum() {
		return Actualnum;
	}

	public void setActualnum(Integer actualnum) {
		Actualnum = actualnum;
	}

	public String getPacketid() {
		return Packetid;
	}

	public void setPacketid(String packetid) {
		Packetid = packetid;
	}

}
