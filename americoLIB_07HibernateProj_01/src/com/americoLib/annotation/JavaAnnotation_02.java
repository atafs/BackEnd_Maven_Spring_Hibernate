package com.americoLib.annotation;

import javax.persistence.Column;
import javax.persistence.Id;

public class JavaAnnotation_02 {
	// ATTRIBUTES
	private int userId;
	private String userName;

	// GETTERS AND SETTERS
	@Id
	@Column(name = "USER_ID")
	public int getUserId() {
		return userId;
	}

	@Column(name = "USER_NAME")
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
