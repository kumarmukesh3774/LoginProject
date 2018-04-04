package com.userlogin.microservices;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient(name="register-service",url="localhost:8050")

//@FeignClient(name="register-service")
@FeignClient(name="zuul-api-gateway")
@RibbonClient(name="register-service")
public interface RegisterServiceProxy {
	
	@PostMapping("/register-service/user/verification")
	public Boolean retrieveLoginResponse(@RequestBody LoginBean loginBean);

}
