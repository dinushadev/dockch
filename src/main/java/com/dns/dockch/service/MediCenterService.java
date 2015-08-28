package com.dns.dockch.service;

import javax.sound.midi.InvalidMidiDataException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dns.dockch.dao.IMediCenterDAO;
import com.dns.dockch.entity.MediCenter;

@Service
public class MediCenterService {
	
	@Autowired
	private IMediCenterDAO mediCenterRepo;
	
	
	public MediCenter createMediCenter(MediCenter mediCenter) {
		
		MediCenter  saveMedi = mediCenterRepo.save(mediCenter);
		return saveMedi;
	}
	

}
