package com.BookMyServant;

import org.springframework.data.repository.CrudRepository;

import com.BookMyServant.entity.LocationEntity;

public interface LocationRepository extends CrudRepository<LocationEntity, Long> {

}
