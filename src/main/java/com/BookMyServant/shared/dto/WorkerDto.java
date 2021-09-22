package com.BookMyServant.shared.dto;

public class WorkerDto {

	boolean isPoliceCertified;

	String addressWorker;

	String startWorkinghour;
 
	String endWorkingHour;
 
	String nicWorker;
 
	int hourlyPay;

	public boolean isPoliceCertified() {
		return isPoliceCertified;
	}

	public void setPoliceCertified(boolean isPoliceCertified) {
		this.isPoliceCertified = isPoliceCertified;
	}


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
 
 
 
	
	
}
