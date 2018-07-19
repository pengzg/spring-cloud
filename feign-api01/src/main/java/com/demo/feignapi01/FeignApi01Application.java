package com.demo.feignapi01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class FeignApi01Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignApi01Application.class, args);
	}
}
