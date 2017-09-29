package com.threaddynamics.user.task.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.threaddynamics.*")
public class UserTaskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserTaskServiceApplication.class, args);
	}

}
