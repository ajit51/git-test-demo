package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {
	
	@GetMapping
	public String getMessage() {
		return "Welcome to STS Tool.";
	}

}
