package com.hello.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/svc/v1/hello")
public class HelloController {
	
	@GetMapping("/get")
	public String sayHello() {
		return "Hello Microservices";
	}

}
