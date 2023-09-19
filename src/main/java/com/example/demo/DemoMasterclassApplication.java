package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoMasterclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMasterclassApplication.class, args);
	}

}
