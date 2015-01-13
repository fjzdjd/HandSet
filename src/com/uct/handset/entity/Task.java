package com.uct.handset.entity;

import java.util.List;

public class Task { 
	private List<TaskHead> taskheadL;
	private List<TaskItem> taskitemL;
	public Task(List<TaskHead> taskheadL, List<TaskItem> taskitemL) {
		super();
		this.taskheadL = taskheadL;
		this.taskitemL = taskitemL;
	}
	public List<TaskHead> getTaskheadL() {
		return taskheadL;
	}
	public void setTaskheadL(List<TaskHead> taskheadL) {
		this.taskheadL = taskheadL;
	}
	public List<TaskItem> getTaskitemL() {
		return taskitemL;
	}
	public void setTaskitemL(List<TaskItem> taskitemL) {
		this.taskitemL = taskitemL;
	}
}
