package com.dns.dockch.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dns.dockch.dto.MedCenterDTO;
import com.dns.dockch.dto.UserDTO;
import com.dns.dockch.entity.Admin;
import com.dns.dockch.entity.MediCenter;
import com.dns.dockch.entity.User;
import com.dns.dockch.service.MediCenterService;
import com.dns.dockch.service.UserService;

@RestController
public class MediCenterController {

	private static final Logger LOG = LoggerFactory.getLogger(MediCenterController.class.getName());

	@Autowired
	private MediCenterService mediCenterService;

	@Autowired
	private UserService userService;

	@Autowired
	protected AuthenticationManager authenticationManager;

	@RequestMapping(value = "/medcenter", method = RequestMethod.POST)
	public String create(@RequestBody MedCenterDTO centerDTO,
			HttpServletRequest request) {

		MediCenter mc = new MediCenter(centerDTO);

		UserDTO adminDto = centerDTO.getAdmin();

		User admin = new User();
		admin.setEmail(adminDto.getEmail());
		admin.setPass(adminDto.getPass());
		admin.setFistName(adminDto.getFistName());
		admin.setLastName(adminDto.getLastName());
		admin.setContactNo(adminDto.getTp());

		Admin saveAdmin = (Admin) userService.createUser(admin);

		mc.setAdmin(saveAdmin);

		MediCenter savedMc = mediCenterService.createMediCenter(mc);

		authenticateUserAndSetSession(admin,request);

		return "success";
	}

	@RequestMapping(value = "/medcenter/{id}", method = RequestMethod.GET)
	public String read(@RequestBody Long id) {

		LOG.info("MEDI ID: " + id);

		return "success";
	}

	@RequestMapping("/medcenter")
	public List<MedCenterDTO> medCenters() {
		List<MedCenterDTO> medList = mediCenterService.getAllMedCenters();
		
		/*for (User user : patientList) {
			LOG.debug("userId:"+user.getUid()+" email:"+user.getEmail());
		}*/
		return medList;

	}
	private void authenticateUserAndSetSession(User user,
			HttpServletRequest request) {
		String username = user.getEmail();
		String password = user.getPass();
		
		LOG.info("*************************auto login start*******************"+username+"/"+password);
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
				username, password);

		// generate session if one doesn't exist
		request.getSession();

		token.setDetails(new WebAuthenticationDetails(request));
		Authentication authenticatedUser = authenticationManager
				.authenticate(token);

		SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
		
		LOG.info("*************************auto login end*******************");
	}

}
