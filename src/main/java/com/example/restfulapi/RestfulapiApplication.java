package com.example.restfulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@SpringBootApplication
public class RestfulapiApplication {

	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplateBuilder().build();
	}
	@Bean
	public Random createRandom() {
		return new Random();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(RestfulapiApplication.class, args);
	}

}
