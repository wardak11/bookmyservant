package com.BookMyServant.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.entity.WorkerEntity;
import com.BookMyServant.shared.dto.IteratorAllWorker;
import com.BookMyServant.shared.dto.WorkerDto;
import java.util.List;


public interface WorkerService {

	public  WorkerDto createWorker (WorkerDto wrokerdto,UserEntity userid);
	
	public List<WorkerEntity> getWorker() ;
}
