package com.BookMyServant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="Location")
public class LocationEntity {

	@Id
    @GeneratedValue
    private int Id;
	
	private int longitude;
	private int latitude;
	
	 @OneToOne
	    @JoinColumn(name="UserId")
	    private UserEntity userid;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public UserEntity getUserid() {
		return userid;
	}

	public void setUserid(UserEntity userid) {
		this.userid = userid;
	}
	 
	 
	
}
