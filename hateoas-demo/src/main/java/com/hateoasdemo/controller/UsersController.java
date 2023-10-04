package com.hateoasdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hateoasdemo.entity.Users;

@RestController
public class UsersController {

	@RequestMapping("getall")
	public List<Users> getAll() {
		Users u1 = new Users("Siddu", 1200l);
		Users u2 = new Users("Rani", 1000l);
		Users u3 = new Users("Siva", 1900l);
		return Arrays.asList(u1, u2, u3);

	}

	@RequestMapping("hateoas/getall")
	public List<Users> getHateoasAll() {
		Users u1 = new Users("Siddu", 1200l);
		Users u2 = new Users("Rani", 1000l);
		Users u3 = new Users("Siva", 1900l);
		Link withSelfRel = ControllerLinkBuilder.linkTo(UsersController.class).slash(u1.getName()).withSelfRel();
		u1.add(withSelfRel);
		return Arrays.asList(u1, u2, u3);

	}
}
