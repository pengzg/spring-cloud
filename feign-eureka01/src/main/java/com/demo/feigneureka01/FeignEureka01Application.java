package com.demo.feigneureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class FeignEureka01Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignEureka01Application.class, args);
	}
}
