package com.BookMyServant.ui.model.request;

public class JobRequest {

	private int token;
	
	 private int workerid;
	
	    private int customerid;
	    
	    private int totalcharges;
	    
	    private int labourchages;
	    
	    private boolean status;
	    
	    private String service;

		public int getToken() {
			return token;
		}

		public void setToken(int token) {
			this.token = token;
		}

		public int getWorkerid() {
			return workerid;
		}

		public void setWorkerid(int workerid) {
			this.workerid = workerid;
		}

		public int getCustomerid() {
			return customerid;
		}

		public void setCustomerid(int customerid) {
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
