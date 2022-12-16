package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbllogin")
public class Login {

	// instance variable
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lId;
	private String userName;
	private String password;
	private String userType;

	// Default constructor
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized constructor
	public Login(Integer lId, String userName, String password, String userType) {
		super();
		this.lId = lId;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}

	// Getters and setters
	public Integer getlId() {
		return lId;
	}

	public void setlId(Integer lId) {
		this.lId = lId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	// Override toString method
	@Override
	public String toString() {
		return "Login [lId=" + lId + ", userName=" + userName + ", password=" + password + ", userType=" + userType
				+ "]";
	}

}
