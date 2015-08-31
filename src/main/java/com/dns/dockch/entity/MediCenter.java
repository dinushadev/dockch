package com.dns.dockch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.dns.dockch.dto.MedCenterDTO;

@Entity(name = "medi_center")
public class MediCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mid;

	private String name;

	private String email;

	private String contact;

	private int district;

	private int province;

	private String city;

	private String disc;

	@OneToOne
	private User admin;

	private String logo;

	public MediCenter(MedCenterDTO mc) {
		this.name = mc.getName();
		this.mid = mc.getMid();
		this.email = mc.getEmail();
		this.contact = mc.getTp();
		this.disc = mc.getDesc();

	}

	public MediCenter() {

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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
