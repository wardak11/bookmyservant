package com.BookMyServant.entity;

import javax.persistence.*;

@Entity(name = "Worker")
public class WorkerEntity {

	@Id
	@GeneratedValue
	private int Id;
	
    @Column  
	boolean isPoliceCertified;
    
    @Column
	String addressWorker;

    @Column
    String startWorkinghour;
 
    @Column
	String endWorkingHour;
 
    @Column
	String nicWorker;
    
    @Column
	int hourlyPay;
    
    @OneToOne
    @JoinColumn(name="UserId")
    private UserEntity userid;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public UserEntity getUserid() {
		return userid;
	}

	public void setUserid(UserEntity userid) {
		this.userid = userid;
	}

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
