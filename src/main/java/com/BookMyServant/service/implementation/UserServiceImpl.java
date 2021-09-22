package com.BookMyServant.service.implementation;


import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookMyServant.service.*;
import com.BookMyServant.entity.*;
import com.BookMyServant.shared.dto.*;
import com.BookMyServant.*;

@Service
@Transactional
public class UserServiceImpl implements UserService {


	@Autowired
	UserRepository userrepository;
	
	//@Autowired
	 // Utils utils;
	
	//@Autowired
//	BCryptPasswordEncoder bcryptpasswrdencoder;
	
	
	public UserEntity createduser(UserDto user) {

		
	//	UserEntity storeduserdetails = userrepository.findByEmail(user.getEmail());
	//	 if(storeduserdetails != null) throw new RuntimeException("record already exist");
		
		UserEntity userentity = new UserEntity();
	    BeanUtils.copyProperties(user, userentity);
	    
	    userentity.setEncryptedpassword("test");
	    userentity.setUserid("tesing");
	      	
		UserEntity storeduserDetails = userrepository.save(userentity);
		

		
		return storeduserDetails;

		
		
	}

	
	
}
