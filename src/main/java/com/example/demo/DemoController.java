package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entitlement")
public class DemoController {

	@GetMapping("/sample")
	String sample() {
		return "Hello";
	}
}
