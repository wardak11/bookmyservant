package com.BookMyServant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.*;

@Entity(name= "Customer")
public class CustomerEntity {
	

	     @Id
	     @GeneratedValue
	     private int Id;
	     
	     @OneToOne
	     @JoinColumn(name="UserId")
	     private UserEntity userid;
	     
	     @Column
	     private long nic;
	     
	     @Column
	     private String address;

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


