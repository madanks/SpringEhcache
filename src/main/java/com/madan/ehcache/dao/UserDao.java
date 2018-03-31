package com.madan.ehcache.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madan.ehcache.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

	public List<User> findByName(String name);

}
