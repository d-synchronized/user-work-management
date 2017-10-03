package com.threaddynamics.user.task.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	@Bean
	public RestTemplate producesRestTemplate(){
		return new RestTemplate();
	}

}
