package com.uct.handset.entity;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 *         <P>
 *         Srole系统角色表
 *         <P>
 * 
 */
@SuppressWarnings("serial")
public class Srole implements Serializable {
	/** 系统角色ID表 */
	private String SroleID;
	/** 角色名称 */
	private String Name;
	/** 物资类型限制 */
	private String MaterialTypeList;
	/** 物资用途限制 */
	private String MaterialPurposeList;
	/** 物资限制 */
	private String MaterialLimit;
	/** 库房限制 */
	private String HouseList;
	/** 角色级别 */
	private Integer Slevel;

	/**
	 * <P>
	 * Srole系统角色表
	 * <P>
	 * 
	 * @param sroleID
	 * @param name
	 * @param materialTypeList
	 * @param materialPurposeList
	 * @param materialLimit
	 * @param houseList
	 * @param slevel
	 */
	public Srole(String sroleID, String name, String materialTypeList,
			String materialPurposeList, String materialLimit, String houseList,
			Integer slevel) {
		SroleID = sroleID;
		Name = name;
		MaterialTypeList = materialTypeList;
		MaterialPurposeList = materialPurposeList;
		MaterialLimit = materialLimit;
		HouseList = houseList;
		Slevel = slevel;
	}

	public String getSroleID() {
		return SroleID;
	}

	public void setSroleID(String sroleID) {
		SroleID = sroleID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMaterialTypeList() {
		return MaterialTypeList;
	}

	public void setMaterialTypeList(String materialTypeList) {
		MaterialTypeList = materialTypeList;
	}

	public String getMaterialPurposeList() {
		return MaterialPurposeList;
	}

	public void setMaterialPurposeList(String materialPurposeList) {
		MaterialPurposeList = materialPurposeList;
	}

	public String getMaterialLimit() {
		return MaterialLimit;
	}

	public void setMaterialLimit(String materialLimit) {
		MaterialLimit = materialLimit;
	}

	public String getHouseList() {
		return HouseList;
	}

	public void setHouseList(String houseList) {
		HouseList = houseList;
	}

	public Integer getSlevel() {
		return Slevel;
	}

	public void setSlevel(Integer slevel) {
		Slevel = slevel;
	}

}
