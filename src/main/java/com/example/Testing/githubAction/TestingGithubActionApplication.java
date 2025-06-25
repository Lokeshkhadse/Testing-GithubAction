package com.example.Testing.githubAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class TestingGithubActionApplication {

	@Getmapping("/get")
	public String function(){
		return "hiii";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestingGithubActionApplication.class, args);
	}

}
