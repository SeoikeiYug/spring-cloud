package com.ysq.example.consumerhystrix.service;

import com.ysq.example.consumerhystrix.factory.HystrixClientFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-provider", fallbackFactory = HystrixClientFallbackFactory.class)
public interface IndexClientService {

	@GetMapping("/")
	String consumer();

}
