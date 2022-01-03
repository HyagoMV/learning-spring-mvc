package com.github.hyagomv.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public HelloService() {
		return;
	}
	
	public String sayHello() {
		System.out.println("Hello Service!");
		return "service";
	}
}
