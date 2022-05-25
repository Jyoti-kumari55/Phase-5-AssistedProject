package com.example.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	@GetMapping("/welcome")
	public String welcome() {
		return "Deploying Tha Spring Boot REST API Application To the AWS";
	}

}
