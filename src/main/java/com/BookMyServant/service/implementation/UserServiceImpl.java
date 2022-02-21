package com.BookMyServant.service.implementation;


import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.BookMyServant.service.*;
import com.BookMyServant.entity.*;
import com.BookMyServant.shared.dto.*;
import com.BookMyServant.*;

@Service
@Transactional
public class UserServiceImpl implements UserService {


	@Autowired
	UserRepository userrepository;
	
	@Autowired
	TokenRepository tokenrepository;
	
	@Autowired
	ReviewRepository reviewrepository;
	
	@Autowired
	RatingRepository ratingrepository;
	
	public UserEntity createduser(UserDto user) {

		
	//	UserEntity storeduserdetails = userrepository.findByEmail(user.getEmail());
	//	 if(storeduserdetails != null) throw new RuntimeException("record already exist");
		
		UserEntity userentity = new UserEntity();
	    BeanUtils.copyProperties(user, userentity);
	    
	   // userentity.setEncryptedpassword("test");
	    userentity.setUserid("tesing");
	      	
		UserEntity storeduserDetails = userrepository.save(userentity);
		

		
		return storeduserDetails;

	
	}
	
	
	public String randomStringGenerator() {
		
		 final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	     SecureRandom rnd = new SecureRandom();
		
	     StringBuilder sb = new StringBuilder(10);
	     for(int i = 0; i < 10; i++)
	        sb.append(AB.charAt(rnd.nextInt(AB.length())));
	     
	     return sb.toString();
	     
	}
	
	public TokenDto verification(LoginDto loginDto) {
		
		UserEntity userentity = new UserEntity();
		
	String loginEmail = loginDto.getEmail();
	Iterator<UserEntity> ite = userrepository.findAll().iterator();
		
		String em;
		//boolean flag;
		//String ttoken;
		
		while (ite.hasNext()) { 
         em =   ite.next().getEmail();
		
         if(loginEmail.equalsIgnoreCase(em)) {
        	 TokenEntity te = new TokenEntity();
        	 te.setToken(randomStringGenerator());

        	TokenEntity storedtoken= tokenrepository.save(te); 

        	TokenDto tokendto = new TokenDto();
        	 BeanUtils.copyProperties(storedtoken,tokendto );
        	 
        	 return tokendto ;
        	 
        	 }
		}
         return null;
	}
	

	public boolean logout(TokenEntity tokenentity){
	
		String em;
		
		Iterator<TokenEntity> ite = tokenrepository.findAll().iterator();
		
		while (ite.hasNext()) { 
	         em =   ite.next().getToken();
	  
	         if(tokenentity.getToken().equalsIgnoreCase(em)) {
	        	 tokenrepository.delete(tokenentity);
	        	 return true;
	         }
	
		}
	return false;
}
	
	
	public ReviewDto saveReview(ReviewDto reviewdto) {
		
		ReviewEntity reviewentity = new ReviewEntity();
		
		BeanUtils.copyProperties(reviewdto, reviewentity);
		
		Optional<UserEntity> user = userrepository.findById(reviewdto.getUserid());
		
		UserEntity foo = null; 
		
		if (user.isPresent()) {
		     foo = user.get();}
		
		reviewentity.setUserid(foo);
		ReviewEntity storedreview = reviewrepository.save(reviewentity);
		
		BeanUtils.copyProperties(storedreview, reviewdto);
		
		return reviewdto;
	}
	
	
	
	
	public RatingDto saveRating(RatingDto ratingdto) {
		
		RatingEntity ratingentity = new RatingEntity();
		BeanUtils.copyProperties(ratingdto, ratingentity);
		
Optional<UserEntity> user = userrepository.findById(ratingdto.getUserid());
		
		UserEntity foo = null; 
		
		if (user.isPresent()) {
		     foo = user.get();}
		
		ratingentity.setUserid(foo);
		RatingEntity storedrating = ratingrepository.save(ratingentity);
		
		BeanUtils.copyProperties(storedrating, ratingdto);
		
		
		
		return ratingdto;
	}
	
}
	


