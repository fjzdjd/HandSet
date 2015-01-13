package com.uct.handset.entity;

/**
 * @author ZZP
 *         <p>
 *         HouseMeta库房信息表
 *         <P>
 */
public class HouseMeta {
	/** 库房编号 */
	private String HouseID;
	/** 库房名称 */
	private String HouseName;
	/** 单位编码 */
	private String UnitCode;
	/** 单位图片 */
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
