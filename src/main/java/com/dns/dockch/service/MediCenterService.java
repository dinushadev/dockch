package com.dns.dockch.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scala.Array;

import com.dns.dockch.dao.IMediCenterDAO;
import com.dns.dockch.dto.MedCenterDTO;
import com.dns.dockch.entity.MediCenter;

@Service
public class MediCenterService {
	
	private static final Logger LOG = LoggerFactory.getLogger(MediCenterService.class);
	
	
	@Autowired
	private IMediCenterDAO mediCenterRepo;
	
	
	public MediCenter createMediCenter(MediCenter mediCenter) {
		
		MediCenter  saveMedi = mediCenterRepo.save(mediCenter);
		return saveMedi;
	}


	public List<MedCenterDTO> getAllMedCenters() {
		Iterable<MediCenter> list =mediCenterRepo.findAll();
		List<MedCenterDTO> medList = new ArrayList<>();
		
		for (MediCenter mediCenter : list) {
			MedCenterDTO centerDTO = new MedCenterDTO(mediCenter);
			medList.add(centerDTO);
			
		}
		return medList;
	}
	

}
