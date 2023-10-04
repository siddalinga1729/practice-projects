package com.pautoiddemooi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pautoiddemooi.entity.User;
import com.pautoiddemooi.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/user")
	public String saveUser(@RequestBody User user) {
		userRepo.save(user);
		return "Success";
	}
}
