package com.ysq.example.consumerhystrix.factory;

import com.ysq.example.consumerhystrix.service.IndexClientService;
import feign.hystrix.FallbackFactory;

public class HystrixClientFallbackFactory implements FallbackFactory<IndexClientService> {
	@Override
	public IndexClientService create(Throwable throwable) {
		return () -> "feign + hystrix, 提供者服务宕机";
	}
}
