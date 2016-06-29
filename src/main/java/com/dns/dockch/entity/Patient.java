package com.dns.dockch.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("p")
public class Patient extends User implements Serializable{
	
	

}
