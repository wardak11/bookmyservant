package com.BookMyServant.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookMyServant.shared.dto.UserDto;
import com.BookMyServant.shared.dto.*;
import com.BookMyServant.ui.model.response.*;
import com.BookMyServant.ui.model.request.*;
import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.service.*;


@RestController()
@RequestMapping("user") // http://localhost:8080/_book_my_servant_1
public class UserController {

	@Autowired
	UserService userservice;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	WorkerService workerservice;
	
	@GetMapping()
	public String getUser() {

		return "get user was called";

	}

	@PostMapping
	public UserResponse createUser(@RequestBody com.BookMyServant.ui.model.request.userDetailsRquestModel userDeatils) {

        UserResponse userresponse = new UserResponse();
   
        if(userDeatils.getUserType() == null)
        	throw new NullPointerException("UserType can not be null");
        
        if(userDeatils.getEmail() == null)
        	throw new NullPointerException("Email address can not be null");
        
        if(userDeatils.getName() == null)
        	throw new NullPointerException("name can not be null");
        
        if(userDeatils.getPassword()== null)
        	throw new NullPointerException("password can not be null");
        
        if(userDeatils.getPhoneNumber() == 0)
        	throw new NullPointerException("phone number can not be null");
        
		
		UserDto userdto = new UserDto();
		BeanUtils.copyProperties(userDeatils ,userdto);
		
		UserEntity createuser = userservice.createduser(userdto);
		
		if(userDeatils.getUserType().equals("CUSTOMER")) {

				CustomerDto customerDto = new CustomerDto();
				customerDto.setNic(userDeatils.getNic());
		        customerDto.setAddress(userDeatils.getAddress());
		
			CustomerDto createCustomer = customerService.createdCustomer(customerDto, createuser);
			}
		else {
			
			WorkerDto workerdto = new WorkerDto();
			workerdto.setAddressWorker(userDeatils.getAddressWorker());
			workerdto.setPoliceCertified(userDeatils.isPoliceCertified());
			workerdto.setHourlyPay(userDeatils.getHourlyPay());
			workerdto.setNicWorker(userDeatils.getNicWorker());
			workerdto.setStartWorkinghour(userDeatils.getStartWorkinghour());
			workerdto.setEndWorkingHour(userDeatils.getEndWorkingHour());
			
			WorkerDto createdworker = workerservice.createWorker(workerdto, createuser);
		}
			
		BeanUtils.copyProperties(createuser, userresponse);
		
		return userresponse;

	}

	
	@PutMapping
	public String updateUser() {

		return "update user was called";

	}
		
	
	@DeleteMapping
	public String deleteUser() {

		return "delete user was called";

}
}
