package com.BookMyServant;

import org.springframework.data.repository.CrudRepository;

import com.BookMyServant.entity.WorkerEntity;

public interface WorkerRepository extends CrudRepository<WorkerEntity, Long> {
	
	
	
}
