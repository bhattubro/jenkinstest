package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/msg")
	public String helloWorld()
	{
		System.out.println("hey");
		return "hey world!";
	}
	

}
