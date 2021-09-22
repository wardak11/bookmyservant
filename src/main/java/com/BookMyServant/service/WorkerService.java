package com.BookMyServant.service;

import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.shared.dto.WorkerDto;

public interface WorkerService {

	public  WorkerDto createWorker (WorkerDto wrokerdto,UserEntity userid);
}
