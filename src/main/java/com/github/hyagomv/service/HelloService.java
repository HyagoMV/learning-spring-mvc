package com.github.hyagomv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hyagomv.repository.HelloRepository;

@Service
public class HelloService {

	@Autowired
	private HelloRepository repository;
	
	public HelloService() {
		return;
	}
	
	public String sayHello() {
		System.out.println("Hello Service!");
		repository.sayHello();
		return "service";
	}
}
