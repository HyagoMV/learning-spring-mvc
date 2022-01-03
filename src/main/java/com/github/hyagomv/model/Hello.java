package com.github.hyagomv.model;

import org.springframework.stereotype.Component;

@Component
public class Hello {

	private String msg;

	public Hello() {
		return;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
