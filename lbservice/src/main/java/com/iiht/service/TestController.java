package com.iiht.service;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;


@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	Environment environment;
	
	@GetMapping
	public String message() {
		String port = environment.getProperty("local.server.port");
		return "port no: " + port ;
	}

}
