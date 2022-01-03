package com.github.hyagomv.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

	public HelloRepository() {
		return;
	}
	
	public void sayHello() {
		System.out.println("Hello Repository");
	}

}
