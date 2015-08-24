package com.dns.dockch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dns.dockch.dao.IUserDAO;
import com.dns.dockch.entity.SecurityUser;
import com.dns.dockch.entity.User;

@Service
public class UserService {
	
	@Autowired
	IUserDAO userRepo;

	public User getUserByUserName(String userName) {
		User user =  userRepo.findByEmail(userName);
		return user;
	}
	
	

}
