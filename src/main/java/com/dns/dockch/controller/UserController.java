package com.dns.dockch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dns.dockch.dao.IUserDAO;
import com.dns.dockch.entity.User;

/**
 * @author dinusha
 *
 */
@RestController
public class UserController {

	@Autowired
	IUserDAO userRepo;

	@RequestMapping("/users")
	public Iterable<User> users() {
		Iterable<User> userList = userRepo.findAll();
		
		for (User user : userList) {
			System.out.println("userId:"+user.getUid()+" email:"+user.getEmail());
		}
		return userList;

	}

}
