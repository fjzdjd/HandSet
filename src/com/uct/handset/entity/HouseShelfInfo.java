package com.uct.handset.entity;

/**
 * 
 * @author Administrator
 *         <P>
 *         HouseShelfInfo�ⷿ������Ϣ��
 *         <P>
 */
public class HouseShelfInfo {
	/** �ⷿID */
	private String HouseID;
	/** ����ID */
	private String ShelfID;
	/** �������� */
	private String ShelfName;
	/** �������� */
	private String ShelfType;
	/** �������� */
	private Integer Ncolumns;
	/** ���ܲ��� */
	private Integer Nlayers;
	/** ����ͼƬ */
	private String Picture;

	public HouseShelfInfo(String houseID, String shelfID, String shelfName,
			String shelfType, Integer ncolumns, Integer nlayers, String picture) {
		super();
		HouseID = houseID;
		ShelfID = shelfID;
		ShelfName = shelfName;
		ShelfType = shelfType;
		Ncolumns = ncolumns;
		Nlayers = nlayers;
		Picture = picture;
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

	public String getShelfName() {
		return ShelfName;
	}

	public void setShelfName(String shelfName) {
		ShelfName = shelfName;
	}

	public String getShelfType() {
		return ShelfType;
	}

	public void setShelfType(String shelfType) {
		ShelfType = shelfType;
	}

	public Integer getNcolumns() {
		return Ncolumns;
	}

	public void setNcolumns(Integer ncolumns) {
		Ncolumns = ncolumns;
	}

	public Integer getNlayers() {
		return Nlayers;
	}

	public void setNlayers(Integer nlayers) {
		Nlayers = nlayers;
	}

	public String getPicture() {
		return Picture;
	}

	public void setPicture(String picture) {
		Picture = picture;
	}

}
