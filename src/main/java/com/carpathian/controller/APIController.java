package com.carpathian.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

	
	@RequestMapping("/")
	public String indexAPI() {
		return "index";
	}
	
	
}
