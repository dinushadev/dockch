package com.dns.dockch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dns.dockch.entity.SecurityUser;

@Controller
public class HomeWebController {

	private static final Logger LOG = LoggerFactory.getLogger(HomeWebController.class.getName());
	


	@RequestMapping("/")
    public String home(String name, Model model) {
		
		SecurityUser userDetails= null;
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
		         userDetails = (SecurityUser) auth.getPrincipal();
		         model.addAttribute("user", userDetails);
		         LOG.info(userDetails.getFistName()+":"+userDetails.getLastName()+": "+userDetails.getUsername());
		}else{
			model.addAttribute("user", auth);
		}
        return "home";
    }
	
	
	@RequestMapping("/login")
    public String login(String name, Model model) {
		
		return "login";
		
	}
	
	
	@RequestMapping("/docList")
    public String dockList(String name, Model model) {
		
		return "doclist";
		
	}
	
	
}
