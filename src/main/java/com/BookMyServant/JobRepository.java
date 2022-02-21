package com.BookMyServant;

import org.springframework.data.repository.CrudRepository;

import com.BookMyServant.entity.JobEntity;

public interface JobRepository extends CrudRepository<JobEntity, Long> {

}
