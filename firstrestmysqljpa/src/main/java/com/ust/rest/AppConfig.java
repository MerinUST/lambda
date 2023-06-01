package com.ust.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
	@Autowired
	private EnvDetails envDetails;
	
	@Bean
	@Profile("dev")
	public EnvDetails devEnv() {
		System.out.println("Dev environment");
		System.out.println(envDetails);
		return envDetails;
	}
	@Bean
	@Profile("prod")
	public EnvDetails prodEnv() {
		System.out.println("prod environment");
		System.out.println(envDetails);
		return envDetails;
	}

}
