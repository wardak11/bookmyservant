package com.BookMyServant.service.implementation;

import java.security.SecureRandom;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookMyServant.CustomerRepository;
import com.BookMyServant.entity.CustomerEntity;
import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.service.CustomerService;
import com.BookMyServant.shared.dto.CustomerDto;
import com.BookMyServant.shared.dto.UserDto;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	

		@Autowired CustomerRepository customerrepository; 
		
		
		//@Override
		//public CustomerDto createdCustomer(CustomerDto customer) {
			
//			CustomerEntity customerEntity = new CustomerEntity();
//			UserEntity userEntity = new UserEntity();
//			
//			//int userid;
//	        //userid	=	userEntity.getId();
//			BeanUtils.copyProperties(customer, customerEntity);
//			
//			customerEntity.setUserid(userEntity);
//			
//			CustomerEntity storedCustomerDetails= customerrepository.save(customerEntity); 
//			
//			
			
			
		//	return null ;
//		}


		@Override
		public CustomerDto createdCustomer(CustomerDto customer, UserEntity user) {
			
			CustomerEntity customerEntity = new CustomerEntity();
			
			//int userid;
	        //userid	=	userEntity.getId();
			BeanUtils.copyProperties(customer, customerEntity);
			
			customerEntity.setUserid(user);
			
			CustomerEntity storedCustomerDetails= customerrepository.save(customerEntity); 
		
	          return null;
		
		}
		
		
		
		}


