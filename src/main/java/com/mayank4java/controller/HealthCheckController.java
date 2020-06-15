package com.mayank4java.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@RequestMapping("/sayHello/{firstName}")
	public String sayHello(@PathVariable("firstName") String name){
		
		return "Hello " + name+" !";
	}

	@RequestMapping("/ping")
	public String ping(){
		
		return "Ping successful";
	}
	
}
