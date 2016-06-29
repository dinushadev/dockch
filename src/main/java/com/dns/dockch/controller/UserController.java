package com.dns.dockch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dns.dockch.dao.IAdminDAO;
import com.dns.dockch.dao.IDocDAO;
import com.dns.dockch.dao.IPatientDAO;
import com.dns.dockch.dao.IUserDAO;
import com.dns.dockch.entity.Admin;
import com.dns.dockch.entity.Doctor;
import com.dns.dockch.entity.Patient;
import com.dns.dockch.entity.User;


/**
 * @author dinusha
 *
 */
@RestController
public class UserController {
	
	 private static final Logger LOG = LoggerFactory.getLogger(UserController.class);


	@Autowired
	IUserDAO userRepo;
	
	@Autowired
	IDocDAO docRepo;
	
	@Autowired
	IPatientDAO patientRepo;
	
	@Autowired
	IAdminDAO adminRepo;

	@RequestMapping("/users")
	public Iterable<User> users() {
		Iterable<User> userList = userRepo.findAll();
		
		for (User user : userList) {
			LOG.debug("userId:"+user.getUid()+" email:"+user.getEmail());
		}
		return userList;

	}
	
	@RequestMapping("/doctors")
	public Iterable<Doctor> doctors() {
		Iterable<Doctor> docList = docRepo.findAll();
		
		for (User user : docList) {
			LOG.debug("userId:"+user.getUid()+" email:"+user.getEmail());
		}
		return docList;

	}
	
	@RequestMapping("/patients")
	public Iterable<Patient> patients() {
		Iterable<Patient> patientList = patientRepo.findAll();
		
		for (User user : patientList) {
			LOG.debug("userId:"+user.getUid()+" email:"+user.getEmail());
		}
		return patientList;

	}
	
	@RequestMapping("/admins")
	public Iterable<Admin> admins() {
		Iterable<Admin> patientList = adminRepo.findAll();
		
		for (User user : patientList) {
			LOG.debug("userId:"+user.getUid()+" email:"+user.getEmail());
		}
		return patientList;

	}
}
