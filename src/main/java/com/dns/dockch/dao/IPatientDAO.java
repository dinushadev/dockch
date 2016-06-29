package com.dns.dockch.dao;

import org.springframework.data.repository.CrudRepository;

import com.dns.dockch.entity.Patient;

public interface IPatientDAO extends CrudRepository<Patient, Long>{

}
