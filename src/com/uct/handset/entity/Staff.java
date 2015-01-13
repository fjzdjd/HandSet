package com.uct.handset.entity;

import java.io.Serializable;

/**
 * Staff系统用户表
 * 
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public class Staff implements Serializable {
	/** 操作员编号 */
	private String StaffID;

	/**
	 * 用户名
	 */
	private String Name;
	/**
	 * 密码
	 */
	private String Password;

	/**
	 * 账号的活动状态
	 */
	private Integer State;

	/**
	 * 角色编号
	 */
	private String sRoleID;

	/**
	 * <P>
	 * Staff系统用户表
	 * <P>
	 * 
	 * @param staffID
	 * @param name
	 * @param password
	 * @param state
	 * @param sRoleID
	 */
	public Staff(String staffID, String name, String password, Integer state,
			String sRoleID) {
		this.StaffID = staffID;
		this.Name = name;
		this.Password = password;
		this.State = state;
		this.sRoleID = sRoleID;
	}

	public String getStaffID() {
		return StaffID;
	}

	public void setStaffID(String staffID) {
		StaffID = staffID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Integer getState() {
		return State;
	}

	public void setState(Integer state) {
		State = state;
	}

	public String getsRoleID() {
		return sRoleID;
	}

	public void setsRoleID(String sRoleID) {
		this.sRoleID = sRoleID;
	}

}
