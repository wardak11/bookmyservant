package com.BookMyServant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name= "Rating")
public class RatingEntity {

	@Id
    @GeneratedValue
    private int Id;
	 
    @OneToOne
    @JoinColumn(name="UserId")
    private UserEntity userid;
    

    @Column
    private int rating;


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


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	} 
    
}
