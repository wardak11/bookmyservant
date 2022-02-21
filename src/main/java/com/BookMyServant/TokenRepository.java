package com.BookMyServant;

import org.springframework.data.repository.CrudRepository;

import com.BookMyServant.entity.TokenEntity;

public interface TokenRepository extends CrudRepository<TokenEntity, Long> {

	TokenEntity deleteUserByToken(String token);
}
