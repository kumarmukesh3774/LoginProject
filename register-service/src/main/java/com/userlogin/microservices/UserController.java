package com.userlogin.microservices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("register/user")
	public void register(@RequestBody User user) {
		userRepository.save(user);
		
	}
	
	@PostMapping("user/verification")
	public Boolean verifyUser(@RequestBody User user) {
		
		Optional<User> userDb=userRepository.findById(user.getUsername());
		if(userDb.isPresent() && userDb.get().getPassword().equals(user.getPassword())) {
			return true;
		}
		else
			return false;
	}

}
