package com.BookMyServant.service.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookMyServant.WorkerRepository;
import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.entity.WorkerEntity;
import com.BookMyServant.service.WorkerService;
import com.BookMyServant.shared.dto.IteratorAllWorker;
import com.BookMyServant.shared.dto.WorkerDto;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import java.util.List;


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
	
	public List<WorkerEntity> getWorker() {
	
		
		
		Iterable<WorkerEntity> add = workerRepository.findAll();
		
		List<WorkerEntity> result = new ArrayList<>();
	  
			
	    for (WorkerEntity str : add) {
	        result.add(str);
	    }
	    
	    
		
		return result ;
	}
	

}
