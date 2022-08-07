package com.springboot.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {
	@RequestMapping("/hello")
	public String getMessage() {
		return "This is First Application";
	}

}
