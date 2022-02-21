package com.BookMyServant.service.implementation;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookMyServant.CustomerRepository;
import com.BookMyServant.JobRepository;
import com.BookMyServant.TokenRepository;
import com.BookMyServant.UserRepository;
import com.BookMyServant.WorkerRepository;
import com.BookMyServant.entity.CustomerEntity;
import com.BookMyServant.entity.JobEntity;
import com.BookMyServant.entity.TokenEntity;
import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.entity.WorkerEntity;
import com.BookMyServant.service.JobService;
import com.BookMyServant.shared.dto.JobDto;

@Service
public class JobServiceImplementation implements JobService {

	
	@Autowired JobRepository jobrepository;
	

	@Autowired
	UserRepository userrepository;
	

	@Autowired
	WorkerRepository workerrepository;
	
	@Autowired
	CustomerRepository customerrepository;
	
	@Autowired
	TokenRepository tokenrepository;
	
	
	
	public JobDto saveJob(JobDto jobdto) {
		
		JobEntity jobentity = new JobEntity();
		BeanUtils.copyProperties(jobdto, jobentity);

		
Optional<WorkerEntity> worker = workerrepository.findById(jobdto.getWorkerid());
		
		WorkerEntity foo = null; 
		
		if (worker.isPresent()) {
		     foo = worker.get();}
		
		jobentity.setWorkerid(foo);
		
		
Optional<CustomerEntity> Customer = customerrepository.findById(jobdto.getCustomerid());
		
		CustomerEntity poo = null; 
		
		if (Customer.isPresent()) {
		     poo = Customer.get();}
		
		jobentity.setCustomerid(poo);
		
		
		
Optional<TokenEntity> token = tokenrepository.findById(jobdto.getToken());
		
		TokenEntity zoo = null; 
		
		if (token.isPresent()) {
		     zoo = token.get();}
		
		//jobentity.setTokenid(zoo);
		
		BeanUtils.copyProperties(jobdto, jobentity);

		JobEntity storedjob = jobrepository.save(jobentity);
		
				BeanUtils.copyProperties(storedjob, jobdto);
				
		return jobdto;
	}
	
}
