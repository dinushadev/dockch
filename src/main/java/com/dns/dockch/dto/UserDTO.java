package com.dns.dockch.dto;

import com.dns.dockch.entity.User;

public class UserDTO {
	
	private Long uId;
	
	private String fistName;
	
	private String lastName;
	
	
	private String email;
	
	private String tp;

	private String pass;
	
	
	public UserDTO(User user) {
		this.uId = user.getUid();
		this.fistName = user.getFistName();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
		
	
	}



	public Long getuId() {
		return uId;
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



	public void setuId(Long uId) {
		this.uId = uId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTp() {
		return tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
