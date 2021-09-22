package com.BookMyServant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "user")
public class UserEntity {
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String userType;
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Column(nullable = false)
	private String userid;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(nullable = false, length = 150,unique= true)
	private String email;
	
	@Column(nullable = false)
	private String encryptedpassword;

	private String emailverificationtoken;
	
	@Column(nullable = false, columnDefinition = "boolean default false")
	private Boolean emailverificationstatus;
	
	@Column(nullable= false)
	private long phoneNumber;

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedpassword() {
		return encryptedpassword;
	}

	public void setEncryptedpassword(String encryptedpassword) {
		this.encryptedpassword = encryptedpassword;
	}

	public String getEmailverificationtoken() {
		return emailverificationtoken;
	}

	public void setEmailverificationtoken(String emailverificationtoken) {
		this.emailverificationtoken = emailverificationtoken;
	}

	public Boolean getEmailverificationstatus() {
		return emailverificationstatus;
	}

	public void setEmailverificationstatus(Boolean emailverificationstatus) {
		this.emailverificationstatus = emailverificationstatus;
	}





}
