package com.uct.handset.entity;

/**
 * 
 * @author Administrator
 *         <P>
 *         ShelfMAP货架货位对应表
 *         <P>
 */
public class ShelfMAP {
	/** 库房ID */
	private String Houseid;
	/** 货架编号 */
	private String ShelfID;
	/** 层数 */
	private Integer Ncolum;
	/** 列数 */
	private Integer Nlayer;
	/** 货位号 */
	private Integer LocateID;

	/**
	 * <P>
	 * ShelfMAP货架货位对应表
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
