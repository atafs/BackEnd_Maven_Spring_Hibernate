package com.americoLib.annotation;

import javax.persistence.Column;
import javax.persistence.Id;

public class JavaAnnotation_01 {
	// ATTRIBUTES
	@Id
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	// GETTERS AND SETTERS
	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName + " from getter";
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
