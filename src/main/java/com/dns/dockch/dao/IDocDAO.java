package com.dns.dockch.dao;

import org.springframework.data.repository.CrudRepository;

import com.dns.dockch.entity.Doctor;

public interface IDocDAO extends CrudRepository<Doctor, Long>{

}
