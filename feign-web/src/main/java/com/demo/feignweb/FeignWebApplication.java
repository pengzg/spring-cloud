package com.demo.feignweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
@EnableFeignClients(basePackages={"com.demo"})
@ComponentScan("com.demo")
@EnableEurekaClient 
@SpringBootApplication
public class FeignWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignWebApplication.class, args);
	}
}
