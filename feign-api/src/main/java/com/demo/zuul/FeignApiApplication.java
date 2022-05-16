package com.demo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FeignApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApiApplication.class, args);
	}
}
