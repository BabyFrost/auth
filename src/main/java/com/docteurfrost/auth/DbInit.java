package com.docteurfrost.auth;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.docteurfrost.auth.model.UserDTO;
import com.docteurfrost.auth.service.JwtUserDetailsService;

@Component
public class DbInit {
	
	@Autowired
	JwtUserDetailsService userDetailsService;

	@PostConstruct
    private void postConstruct() {
		
		UserDTO user = new UserDTO();
		user.setUsername("javainuse");
		user.setPassword("password");
		userDetailsService.save(user);
		
	}
	
}
