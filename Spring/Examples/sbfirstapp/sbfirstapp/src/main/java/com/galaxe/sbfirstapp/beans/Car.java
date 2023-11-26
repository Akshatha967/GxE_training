package com.galaxe.sbfirstapp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Car {

	@Value("${model}")
	private String model;
	
	@Override 
	public String toString() {
		System.out.println("model: "+model);
		return model;
	}
	
	
}
