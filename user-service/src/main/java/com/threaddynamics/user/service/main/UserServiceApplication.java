package com.threaddynamics.user.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.threaddynamics.*")
@EnableEurekaClient
public class UserServiceApplication {
	
	public static void main(String args[])
	{
		SpringApplication.run(UserServiceApplication.class,args);
	}
}
