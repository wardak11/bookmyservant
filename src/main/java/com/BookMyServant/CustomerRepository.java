package com.BookMyServant;

import org.springframework.data.repository.CrudRepository;

import com.BookMyServant.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity,Long> {

}
