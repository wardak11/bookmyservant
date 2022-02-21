package com.BookMyServant.service.implementation;

import java.util.Optional;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookMyServant.LocationRepository;
import com.BookMyServant.UserRepository;
import com.BookMyServant.entity.LocationEntity;
import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.entity.WorkerEntity;
import com.BookMyServant.service.LocationService;
import com.BookMyServant.shared.dto.LocationDto;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired LocationRepository locationreposotory;
	
	@Autowired UserRepository userrepository;

	@Override
	public LocationDto createlocation(LocationDto locationdto) {
		
		LocationEntity locationentity = new LocationEntity();
		
		BeanUtils.copyProperties(locationdto, locationentity);
		
Optional<UserEntity> user = userrepository.findById(locationdto.getUserid());
		
		UserEntity foo = null; 
		
		if (user.isPresent()) {
		     foo = user.get();}
		
		locationentity.setUserid(foo);
		
		LocationEntity storedlocation = locationreposotory.save(locationentity);
		
		BeanUtils.copyProperties(storedlocation, locationdto);
		
		
		return locationdto;
	}
	
	
	
	
	
}
