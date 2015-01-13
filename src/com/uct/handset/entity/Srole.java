package com.uct.handset.entity;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 *         <P>
 *         Sroleϵͳ��ɫ��
 *         <P>
 * 
 */
@SuppressWarnings("serial")
public class Srole implements Serializable {
	/** ϵͳ��ɫID�� */
	private String SroleID;
	/** ��ɫ���� */
	private String Name;
	/** ������������ */
	private String MaterialTypeList;
	/** ������;���� */
	private String MaterialPurposeList;
	/** �������� */
	private String MaterialLimit;
	/** �ⷿ���� */
	private String HouseList;
	/** ��ɫ���� */
	private Integer Slevel;

	/**
	 * <P>
	 * Sroleϵͳ��ɫ��
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
