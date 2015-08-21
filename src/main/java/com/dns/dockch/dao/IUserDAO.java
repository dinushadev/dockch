package com.dns.dockch.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dns.dockch.entity.User;

public interface IUserDAO extends CrudRepository<User, Long>{

	
	List<User> findByEmail(String email);
}
