package com.dns.dockch.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("a")
public class Admin extends User{

	
	
}
