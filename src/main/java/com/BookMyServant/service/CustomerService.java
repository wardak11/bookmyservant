package com.BookMyServant.service;
  
import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.shared.dto.*;

public interface CustomerService {

	public CustomerDto createdCustomer(CustomerDto customer, UserEntity user);
	
}
