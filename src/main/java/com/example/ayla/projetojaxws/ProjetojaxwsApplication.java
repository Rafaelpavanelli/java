package com.example.ayla.projetojaxws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.ayla")
public class ProjetojaxwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetojaxwsApplication.class, args);
	}

}
