package com.BookMyServant.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1928296124172110006L;
	
	private String userType;
	private long id;
	private String userid;
	private String name;
	private String email;
	private String password;
	private long phoneNumber;
	private String encryptedpassword;
	private String emailverificationtoken ;
	private boolean emailverificationstatus = false;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public boolean isEmailverificationstatus() {
		return emailverificationstatus;
	}
	public void setEmailverificationstatus(boolean emailverificationstatus) {
		this.emailverificationstatus = emailverificationstatus;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
