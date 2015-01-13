package com.uct.handset.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OperateLog implements Serializable{ 
	private String taskID;
	private Integer opestep;
	public OperateLog(String taskID, Integer opestep) {
		super();
		this.taskID = taskID;
		this.opestep = opestep;
	}
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public Integer getOpestep() {
		return opestep;
	}
	public void setOpestep(Integer opestep) {
		this.opestep = opestep;
	}
	
}
