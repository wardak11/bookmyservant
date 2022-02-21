package com.BookMyServant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BookMyServant.entity.ReviewEntity;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewEntity, Long>{

}
