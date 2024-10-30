package com.aws.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class AwsController {
	
	
	@GetMapping("/getname")
	public String getname(String name) {
		return "My name is " + name;
		
	}

}
