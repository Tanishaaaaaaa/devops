package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entitlement")
public class DemoController {
	
	@Autowired
	EntitlementRepositery entitlementRepositery;

	@GetMapping("/sample")
	String sample() {
		StringBuilder quizQuestion = new StringBuilder();
		quizQuestion.append("Question: What is the capital of France?\n");
		quizQuestion.append("A. London\n");
		quizQuestion.append("B. Paris\n");
		quizQuestion.append("C. Berlin\n");
		quizQuestion.append("D. Madrid\n");

		return quizQuestion.toString();
	}
	@PostMapping("/add")
	EntitlementEntity add(@RequestBody EntitlementEntity entitlementEntity ) {
		return entitlementRepositery.save(entitlementEntity);
	}
	@GetMapping("/getAll")
	List<EntitlementEntity> getAll() {
		return entitlementRepositery.findAll();
	}
}
