package com.dns.dockch.dto;

import com.dns.dockch.entity.Admin;
import com.dns.dockch.entity.MediCenter;

public class MedCenterDTO {
	
	private Long mid;
	
	private String name;
	
	private String email;
	
	private String tp;
	
	private Integer prov;
	
	private Integer dis;
	
	private String desc;
	
	private UserDTO admin;

	public MedCenterDTO(MediCenter mediCenter) {
		this.mid = mediCenter.getMid();
		this.name = mediCenter.getName();
		this.email = mediCenter.getEmail();
		this.tp = mediCenter.getContact();
		this.prov = mediCenter.getProvince();
		this.dis = mediCenter.getDistrict();
		this.desc = mediCenter.getDisc();
		//this.admin = mediCenter.getAdmin();
	}

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Integer getProv() {
		return prov;
	}

	public void setProv(Integer prov) {
		this.prov = prov;
	}

	public Integer getDis() {
		return dis;
	}

	public void setDis(Integer dis) {
		this.dis = dis;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public UserDTO getAdmin() {
		return admin;
	}

	public void setAdmin(UserDTO admin) {
		this.admin = admin;
	}
	
	

}
