package com.uct.handset.entity;

/**
 * <P>
 * StoreMaterial�ִ����ʷֲ���
 * <P>
 * 
 * @author Administrator
 * 
 */
public class StoreMaterial {

	/** �ⷿID */
	private String HouseID;
	/** ����ID */
	private String SHELFID;
	/** ��λID */
	private Integer LOCATEID;
	/** ����EPC���� */
	private String EPCTAG;
	private Integer Actualnum;
	private String Packetid;

	/**
	 * <P>
	 * StoreMaterial�ִ����ʷֲ���
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
