package com.damon.auth.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "api-user")
public interface AccountServiceClient {
	
	@RequestMapping(value = "/user/api/v1/query", method = RequestMethod.GET)
	ResponseEntity<Object> getUser(@RequestParam("username") String username);

}
