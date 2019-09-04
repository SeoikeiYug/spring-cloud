package com.ysq.example.hystrixdashboard.service;

import com.ysq.example.hystrixdashboard.factory.HystrixClientFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-provider", fallbackFactory = HystrixClientFallbackFactory.class)
public interface IndexClientService {

	@GetMapping("/")
	String consumer();

}
