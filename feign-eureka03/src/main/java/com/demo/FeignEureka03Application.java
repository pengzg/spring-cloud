package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FeignEureka03Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignEureka03Application.class, args);
	}
}
