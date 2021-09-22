package com.BookMyServant.service.implementation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookMyServant.WorkerRepository;
import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.entity.WorkerEntity;
import com.BookMyServant.service.WorkerService;
import com.BookMyServant.shared.dto.WorkerDto;

@Service
public class WorkerServiceImpl implements WorkerService{
	
	@Autowired WorkerRepository workerRepository;

	@Override
	public WorkerDto createWorker(WorkerDto wrokerdto, UserEntity userid) {

		WorkerEntity workerentity  = new WorkerEntity();
		 
		BeanUtils.copyProperties(wrokerdto, workerentity);
		workerentity.setUserid(userid);
		
		WorkerEntity storedworker = workerRepository.save(workerentity);
		
		return null;
	}

}
