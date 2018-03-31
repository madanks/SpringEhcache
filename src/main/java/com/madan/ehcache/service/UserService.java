package com.madan.ehcache.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.madan.ehcache.dao.UserDao;
import com.madan.ehcache.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	@Cacheable(value="myUserCache", key="#name")
	public List<User> getUser(String name) {
		System.out.println("Retriving date from db -->inside getuser method");
		return userDao.findByName(name);
	}

	
}
