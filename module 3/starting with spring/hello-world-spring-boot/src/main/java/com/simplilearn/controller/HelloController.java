package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	// http://localhost:8080/hello
	//HTTP METHOD : GET ( default )
	//URI : /hello
	@GetMapping("/hello")
	public  String hello() {
		return "Hello, World!";
	}

}