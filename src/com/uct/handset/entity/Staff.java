package com.uct.handset.entity;

import java.io.Serializable;

/**
 * Staffϵͳ�û���
 * 
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public class Staff implements Serializable {
	/** ����Ա��� */
	private String StaffID;

	/**
	 * �û���
	 */
	private String Name;
	/**
	 * ����
	 */
	private String Password;

	/**
	 * �˺ŵĻ״̬
	 */
	private Integer State;

	/**
	 * ��ɫ���
	 */
	private String sRoleID;

	/**
	 * <P>
	 * Staffϵͳ�û���
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
