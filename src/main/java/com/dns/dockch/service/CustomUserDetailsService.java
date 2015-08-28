package com.dns.dockch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dns.dockch.entity.SecurityUser;
import com.dns.dockch.entity.User;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserService userService;
	

	
	@Override
	public UserDetails loadUserByUsername(String userName)throws UsernameNotFoundException {
		 User user = userService.getUserByUserName(userName);
		 SecurityUser sUser = new SecurityUser(user);
		 
		return sUser;
	}

}