package com.dns.dockch.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("d")
public class Doctor extends User implements Serializable{
	
	
	public Doctor() {

	}
	
	
	public Doctor(String specility,String email, String pass, String roles, String fistName,
			String lastName, String contactNo) {
		super();
		this.specility = specility;
		this.setEmail( email);
		this.setPass(pass);
		this.setRoles( roles);
		this.setFistName ( fistName);
		this.setLastName ( lastName);
		this.setContactNo (contactNo);
	}

	private String specility;

	public String getSpecility() {
		return specility;
	}

	public void setSpecility(String specility) {
		this.specility = specility;
	}
	
	

}
