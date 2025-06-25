package com.example.Testing.githubAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestingGithubActionApplication {

	@GetMapping("/get")
	public String function(){
		return "hiii";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestingGithubActionApplication.class, args);
	}

}
