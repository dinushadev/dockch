package com.dns.dockch.entity;

import java.io.Serializable;
import java.util.Collection;

import org.neo4j.cypher.internal.compiler.v2_1.planner.logical.steps.expand;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUser extends User implements UserDetails , Serializable{
	

	public SecurityUser(User user) {
		this.setEmail(user.getEmail());
		this.setUid(user.getUid());
		this.setFistName(user.getFistName());
		this.setLastName(user.getLastName());
		this.setPass(user.getPass());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		return this.getPass();
	}

	@Override
	public String getUsername() {
		return this.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
