package com.uct.handset.entity;

/**
 * 
 * @author Administrator
 *         <p>
 *         MaterialPacket物资信息表
 *         <p>
 */
public class MaterialPacket {
	/** 物资上标签EPC编码 */
	private String EPCTag;
	/** 物资名称 */
	private String Name;
	/** 包装单位名称 */
	private String UnitName;
	/** 重量 */
	private Integer Weight;
	/** 单价 */
	private String Price;
	/** 开始存储事件 */
	private String StoreTime;
	/** 生产日期 */
	private String DProduct;
	/** 保质期 */
	private String Duration;
	/** 备注 */
	private String MemoText;
	/** 物资图片 */
	private String Picture;
	/** 负责人ID */
	private String KepperID;
	/** 负责人名称 */
	private String KepperName;
	/** 物资种类 */
	private String MaterialType;
	/** 物资用途 */
	private String MaterialPurpose;
	/** 物资状态 */
	private Integer State;
	/** 库房ID */
	private String HouseID;
	/** 货架ID */
	private String ShelfID;
	/** 货位ID */
	private Integer LocateID;
	/** 是否拆包 */
	private Integer Unwrap;
	/** 生产厂家代码 */
	private String Factorycode;
	/** 生产厂家名称 */
	private String FactoryName;
	/** 子物资的数码 */
	private Integer AMOUNT;

	/**
	 * <P>
	 * 物资信息表
	 * <P>
	 * 
	 * @param ePCTag
	 * @param name
	 * @param unitName
	 * @param weight
	 * @param price
	 * @param storeTime
	 * @param dProduct
	 * @param duration
	 * @param memoText
	 * @param picture
	 * @param kepperID
	 * @param kepperName
	 * @param materialType
	 * @param materialPurpose
	 * @param state
	 * @param houseID
	 * @param shelfID
	 * @param locateID
	 * @param unwrap
	 * @param factorycode
	 * @param factoryName
	 * @param aMOUNT
	 */
	public MaterialPacket(String ePCTag, String name, String unitName,
			Integer weight, String price, String storeTime, String dProduct,
			String duration, String memoText, String picture, String kepperID,
			String kepperName, String materialType, String materialPurpose,
			Integer state, String houseID, String shelfID, Integer locateID,
			Integer unwrap, String factorycode, String factoryName,
			Integer aMOUNT) {
		super();
		EPCTag = ePCTag;
		Name = name;
		UnitName = unitName;
		Weight = weight;
		Price = price;
		StoreTime = storeTime;
		DProduct = dProduct;
		Duration = duration;
		MemoText = memoText;
		Picture = picture;
		KepperID = kepperID;
		KepperName = kepperName;
		MaterialType = materialType;
		MaterialPurpose = materialPurpose;
		State = state;
		HouseID = houseID;
		ShelfID = shelfID;
		LocateID = locateID;
		Unwrap = unwrap;
		Factorycode = factorycode;
		FactoryName = factoryName;
		AMOUNT = aMOUNT;
	}

	public String getEPCTag() {
		return EPCTag;
	}

	public void setEPCTag(String ePCTag) {
		EPCTag = ePCTag;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUnitName() {
		return UnitName;
	}

	public void setUnitName(String unitName) {
		UnitName = unitName;
	}

	public Integer getWeight() {
		return Weight;
	}

	public void setWeight(Integer weight) {
		Weight = weight;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getStoreTime() {
		return StoreTime;
	}

	public void setStoreTime(String storeTime) {
		StoreTime = storeTime;
	}

	public String getDProduct() {
		return DProduct;
	}

	public void setDProduct(String dProduct) {
		DProduct = dProduct;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public String getMemoText() {
		return MemoText;
	}

	public void setMemoText(String memoText) {
		MemoText = memoText;
	}

	public String getPicture() {
		return Picture;
	}

	public void setPicture(String picture) {
		Picture = picture;
	}

	public String getKepperID() {
		return KepperID;
	}

	public void setKepperID(String kepperID) {
		KepperID = kepperID;
	}

	public String getKepperName() {
		return KepperName;
	}

	public void setKepperName(String kepperName) {
		KepperName = kepperName;
	}

	public String getMaterialType() {
		return MaterialType;
	}

	public void setMaterialType(String materialType) {
		MaterialType = materialType;
	}

	public String getMaterialPurpose() {
		return MaterialPurpose;
	}

	public void setMaterialPurpose(String materialPurpose) {
		MaterialPurpose = materialPurpose;
	}

	public Integer getState() {
		return State;
	}

	public void setState(Integer state) {
		State = state;
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

	public Integer getUnwrap() {
		return Unwrap;
	}

	public void setUnwrap(Integer unwrap) {
		Unwrap = unwrap;
	}

	public String getFactorycode() {
		return Factorycode;
	}

	public void setFactorycode(String factorycode) {
		Factorycode = factorycode;
	}

	public String getFactoryName() {
		return FactoryName;
	}

	public void setFactoryName(String factoryName) {
		FactoryName = factoryName;
	}

	public Integer getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(Integer aMOUNT) {
		AMOUNT = aMOUNT;
	}

}
