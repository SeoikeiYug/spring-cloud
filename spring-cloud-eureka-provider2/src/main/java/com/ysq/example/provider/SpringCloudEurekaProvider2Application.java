package com.ysq.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaProvider2Application.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "hello world";
	}
}
