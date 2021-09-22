package com.BookMyServant.shared.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
	
	private long nic;
	private String address;
	
	
	public long getNic() {
		return nic;
	}
	public void setNic(long nic) {
		this.nic = nic;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
