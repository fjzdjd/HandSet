package com.uct.handset.entity;

/**
 * 
 * @author Administrator
 *         <P>
 *         ShelfMAP���ܻ�λ��Ӧ��
 *         <P>
 */
public class ShelfMAP {
	/** �ⷿID */
	private String Houseid;
	/** ���ܱ�� */
	private String ShelfID;
	/** ���� */
	private Integer Ncolum;
	/** ���� */
	private Integer Nlayer;
	/** ��λ�� */
	private Integer LocateID;

	/**
	 * <P>
	 * ShelfMAP���ܻ�λ��Ӧ��
	 * <P>
	 * 
	 * @param houseid
	 * @param shelfID
	 * @param ncolum
	 * @param nlayer
	 * @param locateID
	 */
	public ShelfMAP(String houseid, String shelfID, Integer ncolum,
			Integer nlayer, Integer locateID) {
		super();
		Houseid = houseid;
		ShelfID = shelfID;
		Ncolum = ncolum;
		Nlayer = nlayer;
		LocateID = locateID;
	}

	public String getHouseid() {
		return Houseid;
	}

	public void setHouseid(String houseid) {
		Houseid = houseid;
	}

	public String getShelfID() {
		return ShelfID;
	}

	public void setShelfID(String shelfID) {
		ShelfID = shelfID;
	}

	public Integer getNcolum() {
		return Ncolum;
	}

	public void setNcolum(Integer ncolum) {
		Ncolum = ncolum;
	}

	public Integer getNlayer() {
		return Nlayer;
	}

	public void setNlayer(Integer nlayer) {
		Nlayer = nlayer;
	}

	public Integer getLocateID() {
		return LocateID;
	}

	public void setLocateID(Integer locateID) {
		LocateID = locateID;
	}

}
