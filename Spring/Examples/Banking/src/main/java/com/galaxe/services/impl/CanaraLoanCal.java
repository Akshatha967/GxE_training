package com.galaxe.services.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.galaxe.config.PropertyConf;
import com.galaxe.model.LoanDetails;
import com.galaxe.model.PersonalDetails;
import com.galaxe.services.PersonalLoanCalc;

//@Component
public class CanaraLoanCal implements PersonalLoanCalc {

	//public double loanType;
	
	@PostConstruct
	public void init() {
		System.out.println("init method canaraloan");
	}
	@Autowired	
	PropertyConf propertyconf ;
//	
	@Override
	public double calculteInterest(String  loanType) {
		// TODO Auto-generated method stub
		if(loanType.trim().equalsIgnoreCase("home")) {
			return propertyconf.getPersonal();
			//return 8;
		}
		else if(loanType.trim().equalsIgnoreCase("education")) {
			return propertyconf.getEducation();
			//return 10;
		}
		return 9;
	}
	
}
