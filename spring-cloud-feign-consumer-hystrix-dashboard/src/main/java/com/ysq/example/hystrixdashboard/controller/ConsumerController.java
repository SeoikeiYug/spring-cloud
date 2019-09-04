package com.ysq.example.hystrixdashboard.controller;

import com.ysq.example.hystrixdashboard.service.IndexClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired
	private IndexClientService indexClientService;

	@GetMapping("/index")
	public String index() {
		return indexClientService.consumer();
	}

}
