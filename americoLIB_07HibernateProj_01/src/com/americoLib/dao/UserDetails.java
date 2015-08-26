package com.americoLib.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//DAO CLASS
@Entity 
@Table (name="USER_DETAILS")
public class UserDetails {
	
	//ATTRIBUTES
	@Id 
	private int userId;
	private String userName;
	
	@Temporal (TemporalType.TIME)
	private Date joinedDate;
	private String address;
	private String description;
	
	//CONSTRUCTOR (overload)
	public UserDetails(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public UserDetails() {
		this(0, "");
	}

	//GETTERS AND SETTERS
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName + " from getter";
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
