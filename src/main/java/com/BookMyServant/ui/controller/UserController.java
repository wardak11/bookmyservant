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

import com.BookMyServant.shared.dto.*;
import com.BookMyServant.ui.model.response.*;
import com.BookMyServant.ui.model.request.*;
import com.BookMyServant.entity.TokenEntity;
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
	
	@Autowired
	JobService jobservice;
	
	@Autowired LocationService locationservice;
	
	
	@GetMapping("/login")
	public TokenResponse loginUser(@RequestBody UserLoginRequestModel userlogin) {
		
		
		LoginDto logindto = new LoginDto();
		BeanUtils.copyProperties(userlogin, logindto);
		
	       TokenDto storedtoken = userservice.verification(logindto);
	       
	       TokenResponse tokenresponse = new TokenResponse();
	       
	       BeanUtils.copyProperties(storedtoken,tokenresponse);
	       if(tokenresponse == null) 
	    	   throw new NullPointerException("user is not registered");
	    		
	    	   

		return tokenresponse  ;

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
		
	
	@DeleteMapping("/logout")
	public boolean deleteUser(@RequestBody TokenRequestModel tokendetails) {

		TokenEntity tokenentity = new TokenEntity();
		BeanUtils.copyProperties(tokendetails, tokenentity);
		
		boolean tokenresponse = userservice.logout(tokenentity);
		
		
		return tokenresponse;
	}
		
		@PostMapping("/review")
		public ReviewResponse review(@RequestBody ReviewRequestModel reviewdetails) {
			ReviewDto reviewdto = new ReviewDto();
			
			BeanUtils.copyProperties(reviewdetails, reviewdto);
		
			ReviewResponse reviewresponse= new ReviewResponse();
			
			reviewdto = userservice.saveReview(reviewdto);
			BeanUtils.copyProperties(reviewdto, reviewresponse);
			
			return reviewresponse;
		}

		@PostMapping("/rating")
		public RatingResponse rating(@RequestBody RatingRequest ratingrequest) {
			
			RatingDto ratingdto = new RatingDto();
			BeanUtils.copyProperties(ratingrequest, ratingdto);
			
			RatingResponse ratingresponse = new RatingResponse();
			
			ratingdto =userservice.saveRating(ratingdto);
			BeanUtils.copyProperties(ratingdto, ratingresponse);
			
			
			return ratingresponse;
		}
		
		@PostMapping("/job")
			public JobResponse job(@RequestBody JobRequest jobrequest) {
			
			JobDto jobdto = new JobDto();
			BeanUtils.copyProperties(jobrequest, jobdto);
			
			jobdto = jobservice.saveJob(jobdto);
			
			JobResponse jr = new JobResponse();
			
			BeanUtils.copyProperties(jobdto, jr);
			
			return jr;
		}
		
		@PutMapping("/map")
		public LocationResponse map(@RequestBody LocationRequest locationrequest) {
			LocationDto locationdto = new LocationDto();
			
			BeanUtils.copyProperties(locationrequest, locationdto);
			
			locationdto = locationservice.createlocation(locationdto);
			
			LocationResponse lr = new LocationResponse();
			
			BeanUtils.copyProperties(locationdto, lr);
			
			return lr;
		
		}
		
		
		@PostMapping("/calculation")
		public Fare calculation(@RequestBody CalculationRequest calcirequest) {
			
			return null;
		}
		
		
		
		
       @GetMapping("/aws")
       public String awsdeploy() {
    	   
    	   return "successfully done";
       }
       
       
       


}

