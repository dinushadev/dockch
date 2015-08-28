package com.dns.dockch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dns.dockch.dto.MedCenterDTO;
import com.dns.dockch.entity.MediCenter;
import com.dns.dockch.service.MediCenterService;

@RestController
public class MediCenterController {

	private static final Logger LOG = LoggerFactory.getLogger(MediCenterController.class.getName());

	@Autowired
	private MediCenterService mediCenterService;
	
	@RequestMapping(value="/medcenter",method= RequestMethod.POST)
	public String create(@RequestBody MedCenterDTO centerDTO) {
		
		MediCenter mc = new MediCenter(centerDTO);
		
		MediCenter savedMc =  mediCenterService.createMediCenter(mc);
		
		return "success";
	}
	
	
	@RequestMapping(value="/medcenter",method= RequestMethod.GET)
	public String read(@RequestBody Long id) {
		
		LOG.info("MEDI ID: "+id);
		
		return "success";
	}
	
	
	
}
