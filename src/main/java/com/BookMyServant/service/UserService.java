package com.BookMyServant.service;

import com.BookMyServant.entity.UserEntity;
import com.BookMyServant.shared.dto.UserDto;

public interface UserService {

	public UserEntity createduser(UserDto user);
	
}
