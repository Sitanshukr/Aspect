package com.boot.aspect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.aspect.service.CountryFinder;

@RestController //ctrl + space --> for suggestions
public class InitialControllerClass {

	@Autowired
	public CountryFinder finder;
	
	@GetMapping("/")
	@ResponseBody
	public String findoutemployee() {
		return (String) finder.findCountryDetails();
		
	}
}
