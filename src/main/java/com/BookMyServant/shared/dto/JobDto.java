package com.BookMyServant.shared.dto;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.BookMyServant.entity.CustomerEntity;
import com.BookMyServant.entity.WorkerEntity;

public class JobDto {
	
	private long token;
	
	 private long workerid;
	
	    private long customerid;
	    
	    private int totalcharges;
	    
	    private int labourchages;
	    
	    private boolean status;
	    
	    private String service;

		public long getToken() {
			return token;
		}

		public void setToken(long token) {
			this.token = token;
		}

		public long getWorkerid() {
			return workerid;
		}

		public void setWorkerid(long workerid) {
			this.workerid = workerid;
		}

		public long getCustomerid() {
			return customerid;
		}

		public void setCustomerid(long customerid) {
			this.customerid = customerid;
		}

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
	    
	    
	    

}
