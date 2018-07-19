package com.demo.feigneureka02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FeignEureka02Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignEureka02Application.class, args);
	}
}
