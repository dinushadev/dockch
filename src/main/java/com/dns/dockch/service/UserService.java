package com.dns.dockch.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dns.dockch.dao.IUserDAO;
import com.dns.dockch.entity.SecurityUser;
import com.dns.dockch.entity.User;

@Service
public class UserService {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	IUserDAO userRepo;

	public User getUserByUserName(String userName) {
		User user =  userRepo.findByEmail(userName);
		return user;
	}

	public User createUser(User user) {
	  	User saveUser =userRepo.save(user);
		
		return saveUser;
	}
	
	

}
