package com.ysq.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaProvider1Application.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "hello world";
	}
}
