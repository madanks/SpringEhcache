package com.madan.ehcache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madan.ehcache.entity.User;
import com.madan.ehcache.service.UserService;

@RestController
@RequestMapping("/rest/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{name}")
	public List<User> searchUsers(@PathVariable("name") String name){
		return userService.getUser(name);
	}

}
