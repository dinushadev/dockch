package com.dns.dockch.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "utype", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("p")
public class User implements Serializable{

	public User() {
	}
	
	
	
	public User(String email, String pass, String roles, String fistName,
			String lastName, String contactNo) {
		super();
		this.email = email;
		this.pass = pass;
		this.roles = roles;
		this.fistName = fistName;
		this.lastName = lastName;
		this.contactNo = contactNo;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long uid;

	@Column(unique=true)
	private String email;

	private String pass;

	private String roles;

	private String fistName;

	private String lastName;
	
	private String contactNo;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
