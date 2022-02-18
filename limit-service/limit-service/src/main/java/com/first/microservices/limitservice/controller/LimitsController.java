package com.first.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.microservices.limitservice.bean.Limits;
import com.first.microservices.limitservice.config.ServiceConfig;

@RestController
public class LimitsController {
	
	@Autowired
	private ServiceConfig config;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(config.getMin(),config.getMax());
		
	}
	
}
