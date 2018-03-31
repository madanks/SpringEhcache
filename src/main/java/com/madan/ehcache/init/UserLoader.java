package com.madan.ehcache.init;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.madan.ehcache.dao.UserDao;
import com.madan.ehcache.entity.User;

@Component
public class UserLoader {
	@Autowired
	UserDao usersDao;

	@PostConstruct
	public void load() {
		List<User> usersList = getList();
		usersDao.saveAll(usersList);
	}

	public List<User> getList() {
		List<User> usersList = new ArrayList<>();
		usersList.add(new User("Madan", "IT", 123L));
		usersList.add(new User("Govinda", "IT", 456L));
		return usersList;
	}

}
