package com.threaddynamics.user.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.threaddynamics.*")
public class UserServiceApplication {
	
	public static void main(String args[])
	{
		SpringApplication.run(UserServiceApplication.class,args);
	}
}
