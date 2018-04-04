package com.userlogin.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	private RegisterServiceProxy proxy;
	
	@PostMapping("login")
	public String login(@RequestBody LoginBean loginBean) {
		
		Boolean response= proxy.retrieveLoginResponse(loginBean);
		
		if(response) {
			return "WELCOME";
		}
		else
		return "INVALID USER";
	}
	
}
