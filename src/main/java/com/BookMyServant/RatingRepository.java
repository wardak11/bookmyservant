package com.BookMyServant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BookMyServant.entity.RatingEntity;

@Repository
public interface RatingRepository extends CrudRepository<RatingEntity, Long> {

}
