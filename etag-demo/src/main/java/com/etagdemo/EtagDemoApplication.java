package com.etagdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
public class EtagDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtagDemoApplication.class, args);
	}

	@Bean
	ShallowEtagHeaderFilter getShallowEtagHeaderFilter() {
		return new ShallowEtagHeaderFilter();
	}
}
