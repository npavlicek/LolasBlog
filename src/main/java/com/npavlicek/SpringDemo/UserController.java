package com.npavlicek.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository repository;

	@PostMapping("/create")
	public void createUser(String username, String password) {
		repository.save(new MongoUser(username, password));
	}
}
