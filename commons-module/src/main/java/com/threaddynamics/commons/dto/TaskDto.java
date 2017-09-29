package com.threaddynamics.commons.dto;

import java.util.Date;

public class TaskDto {

	private Long taskId;

	private String taskName;

	private Date createdOn;

	private Date modifiedOn;

	private String taskSla;

	private UserDto assignedTo;

	private UserDto assignedFrom;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getTaskSla() {
		return taskSla;
	}

	public void setTaskSla(String taskSla) {
		this.taskSla = taskSla;
	}

	public UserDto getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(UserDto assignedTo) {
		this.assignedTo = assignedTo;
	}

	public UserDto getAssignedFrom() {
		return assignedFrom;
	}

	public void setAssignedFrom(UserDto assignedFrom) {
		this.assignedFrom = assignedFrom;
	}

}
