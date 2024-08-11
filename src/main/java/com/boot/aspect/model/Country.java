package com.boot.aspect.model;

import org.springframework.stereotype.Component;


@Component
public class Country {

	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
