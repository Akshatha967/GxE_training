package com.galaxe.services.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.galaxe.config.PropertyConf;
import com.galaxe.services.PersonalLoanCalc;

//@Component("IciciloanCalc")
public class iciciLoanCal implements PersonalLoanCalc {

	//public double loanType;
	
	@PostConstruct
	public void init() {
		System.out.println("init method icici loan "+propertyconf);
	}
	
	@Autowired
	PropertyConf propertyconf ;
//	
	@Override
	public double calculteInterest(String  loanType) {
		// TODO Auto-generated method stub
		if(loanType.trim().equalsIgnoreCase("home")) {
			return propertyconf.getPersonalicici();
			//return 2.6;
		}
		else if(loanType.trim().equalsIgnoreCase("education")) {
			return propertyconf.getEducationicici();
			//return 3;
		}
		return 9;
	}
	
}
