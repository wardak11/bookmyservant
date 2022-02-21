package com.BookMyServant.service;

import com.BookMyServant.entity.TokenEntity;
import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.shared.dto.LoginDto;
import com.BookMyServant.shared.dto.RatingDto;
import com.BookMyServant.shared.dto.ReviewDto;
import com.BookMyServant.shared.dto.TokenDto;
import com.BookMyServant.shared.dto.UserDto;

public interface UserService {

	public UserEntity createduser(UserDto user);
	
	public TokenDto verification(LoginDto loginDto);
	
	public boolean logout(TokenEntity tokenentity);
	
	public ReviewDto saveReview(ReviewDto reviewdto);
    
	public RatingDto saveRating(RatingDto ratingdto); 

}
