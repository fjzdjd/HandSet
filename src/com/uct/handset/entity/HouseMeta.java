package com.uct.handset.entity;

/**
 * @author ZZP
 *         <p>
 *         HouseMeta�ⷿ��Ϣ��
 *         <P>
 */
public class HouseMeta {
	/** �ⷿ��� */
	private String HouseID;
	/** �ⷿ���� */
	private String HouseName;
	/** ��λ���� */
	private String UnitCode;
	/** ��λͼƬ */
	private String Picture;

	public HouseMeta(String houseID, String houseName, String unitCode,
			String picture) {
		super();
		HouseID = houseID;
		HouseName = houseName;
		UnitCode = unitCode;
		Picture = picture;
	}

	public String getHouseID() {
		return HouseID;
	}

	public void setHouseID(String houseID) {
		HouseID = houseID;
	}

	public String getHouseName() {
		return HouseName;
	}

	public void setHouseName(String houseName) {
		HouseName = houseName;
	}

	public String getUnitCode() {
		return UnitCode;
	}

	public void setUnitCode(String unitCode) {
		UnitCode = unitCode;
	}

	public String getPicture() {
		return Picture;
	}

	public void setPicture(String picture) {
		Picture = picture;
	}

}
