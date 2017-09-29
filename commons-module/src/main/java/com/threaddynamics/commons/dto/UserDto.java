package com.threaddynamics.commons.dto;

import java.util.List;

public class UserDto {

	private Long userId;

	private String firstName;

	private String lastName;

	private String emailAddress;

	private AddressDto address;

	private String department;

	private List<TaskDto> userTasks;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<TaskDto> getUserTasks() {
		return userTasks;
	}

	public void setUserTasks(List<TaskDto> userTasks) {
		this.userTasks = userTasks;
	}

}
