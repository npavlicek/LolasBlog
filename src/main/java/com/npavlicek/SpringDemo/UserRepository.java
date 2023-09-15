package com.npavlicek.SpringDemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends MongoRepository<MongoUser, String> {
	MongoUser findByUsername(@Param("username") String username);
}
