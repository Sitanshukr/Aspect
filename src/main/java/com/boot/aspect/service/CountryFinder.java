package com.boot.aspect.service;

import org.springframework.stereotype.Service;

import com.boot.aspect.model.Country;
import com.google.gson.Gson;

@Service
public class CountryFinder {

	
	
	public String findCountryDetails() {
		
		//TODO: write simple logic to find the country details
		Country obj=new Country();
		obj.setName("Australia");
		return new Gson().toJson(obj);
		
	}
}
