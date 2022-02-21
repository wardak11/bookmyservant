package com.BookMyServant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="job")
public class JobEntity {

	@Id
    @GeneratedValue
    private int Id;
	 
    @OneToOne
    @JoinColumn(name="workerId")
    private WorkerEntity workerid;

    @OneToOne
    @JoinColumn(name="customerId")
    private CustomerEntity customerid;
    
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name="tokenid") private TokenEntity tokenid;
	 */
    
    public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public WorkerEntity getWorkerid() {
		return workerid;
	}

	public void setWorkerid(WorkerEntity workerid) {
		this.workerid = workerid;
	}

	public CustomerEntity getCustomerid() {
		return customerid;
	}

	public void setCustomerid(CustomerEntity customerid) {
		this.customerid = customerid;
	}

/*	public TokenEntity getTokenid() {
		return tokenid;
	}

	public void setTokenid(TokenEntity tokenid) {
		this.tokenid = tokenid;
	} */

	public int getTotalcharges() {
		return totalcharges;
	}

	public void setTotalcharges(int totalcharges) {
		this.totalcharges = totalcharges;
	}

	public int getLabourchages() {
		return labourchages;
	}

	public void setLabourchages(int labourchages) {
		this.labourchages = labourchages;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	private int totalcharges;
    
    private int labourchages;
    
    private boolean status;
    
    private String service;
    
	
}
