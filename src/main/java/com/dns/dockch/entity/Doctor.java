package com.dns.dockch.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("d")
public class Doctor extends User{
	
	private String specility;

	public String getSpecility() {
		return specility;
	}

	public void setSpecility(String specility) {
		this.specility = specility;
	}
	
	

}
