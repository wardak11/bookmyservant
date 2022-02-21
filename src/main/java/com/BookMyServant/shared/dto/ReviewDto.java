package com.BookMyServant.shared.dto;

public class ReviewDto {

	private String Review;

	private int userid;
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getReview() {
		return Review;
	}

	public void setReview(String review) {
		Review = review;
	}
}
