package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblregistartion")
public class Registration {
	// instances variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uId;
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String address;
	private Long phoneNumber;
	// Object-Oriented class Model --FK
	private Integer lId;
	@JoinColumn(name = "lId", insertable = false, updatable = false)
	@ManyToOne
	private Login login;

	// Default constructor
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized constructor
	public Registration(Integer uId, String firstName, String lastName, Integer age, String gender, String address,
			Long phoneNumber, Integer lId, Login login) {
		super();
		this.uId = uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.lId = lId;
		this.login = login;
	}

	// Override toString method
	@Override
	public String toString() {
		return "Registration [uId=" + uId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber + ", lId=" + lId
				+ ", login=" + login + "]";
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getlId() {
		return lId;
	}

	public void setlId(Integer lId) {
		this.lId = lId;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	

}
