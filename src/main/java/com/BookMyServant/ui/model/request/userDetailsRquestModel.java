package com.BookMyServant.ui.model.request;

public class userDetailsRquestModel {
	
	private String userType;
	private String name;
	private String email;
	private String password;
	private long phoneNumber;
	private long nic;
	private String address;
	private boolean isPoliceCertified;

	private String addressWorker;

    private	String startWorkinghour;
 
	private String endWorkingHour;
 
	private String nicWorker;
 
    private	int hourlyPay;

	public String getAddressWorker() {
		return addressWorker;
	}

	public void setAddressWorker(String addressWorker) {
		this.addressWorker = addressWorker;
	}

	public String getNicWorker() {
		return nicWorker;
	}

	public void setNicWorker(String nicWorker) {
		this.nicWorker = nicWorker;
	}

	public boolean isPoliceCertified() {
		return isPoliceCertified;
	}

	public void setPoliceCertified(boolean isPoliceCertified) {
		this.isPoliceCertified = isPoliceCertified;
	}

	

	public String getStartWorkinghour() {
		return startWorkinghour;
	}

	public void setStartWorkinghour(String startWorkinghour) {
		this.startWorkinghour = startWorkinghour;
	}

	public String getEndWorkingHour() {
		return endWorkingHour;
	}

	public void setEndWorkingHour(String endWorkingHour) {
		this.endWorkingHour = endWorkingHour;
	}

	public int getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
 
 
	
	
	public long getNic() {
		return nic;
	}
	public void setNic(long nic) {
		this.nic = nic;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhone_number(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	

}
