package com.github.hyagomv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.hyagomv.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService service;
	
	public HelloController() {
		return;
	}
	
	@RequestMapping("/hello")	
	public String sayHello() {
		System.out.println("Hello Controller!");
		return "hello";
	}
	
	@RequestMapping("/service")
	public String sayHelloService() {
		return service.sayHello();
	}
}
