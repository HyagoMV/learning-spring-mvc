package com.github.hyagomv.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.hyagomv.model.Hello;

@Repository
public class HelloRepository {

	@Autowired
	private Hello hello;
	
	public HelloRepository() {
		return;
	}
	
	public void sayHello() {
		System.out.println("Hello Repository");
	}
	
	public void sayHelloModel() {
		hello.setMsg("Hello World!");
		System.out.println(hello.getMsg());
	}

}
