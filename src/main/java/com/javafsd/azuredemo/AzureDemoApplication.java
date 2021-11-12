package com.javafsd.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {
	@GetMapping("/")
	public String helloAzure() {
		return "Hello! Welcome to Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);

	}

}
