package com.BookMyServant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name= "Review")
public class ReviewEntity {


    @Id
    @GeneratedValue
    private int Id;
	
	@OneToOne
    @JoinColumn(name="UserId")
    private UserEntity userid;
	

    @Column
    private String review;


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


	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}
    
}
