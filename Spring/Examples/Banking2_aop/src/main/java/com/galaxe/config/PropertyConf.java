package com.galaxe.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//@PropertySource("classpath:config/myproperties.properties")
// there should not be any space present after the classpath
@PropertySource("classpath:loan.properties")
@Component
public class PropertyConf {

	@Value("${personal}")
	private float personal;
	
	@Value("${car}")
	private float car;
	
	@Value("${education}")
	private float education;
	
	@Value("${personalicici}")
	private float personalicici;
	
	public float getPersonalicici() {
		return personalicici;
	}
	public float getCaricici() {
		return caricici;
	}
	public float getEducationicici() {
		return educationicici;
	}

	@Value("${caricici}")
	private float caricici;
	
	@Value("${educationicici}")
	private float educationicici;

	@PostConstruct
	public void init() {
		System.out.println("initialized  properties");
	}
	public float getPersonal() {
		return personal;
	}

	public float getCar() {
		return car;
	}

	public float getEducation() {
		return education;
	}
	
	
}
