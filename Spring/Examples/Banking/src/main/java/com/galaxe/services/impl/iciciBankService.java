package com.galaxe.services.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.galaxe.model.LoanDetails;
import com.galaxe.model.PersonalDetails;
import com.galaxe.services.BankServices;
import com.galaxe.services.PersonalLoanCalc;

//@Service("IcicibankService")
//@Service
public class iciciBankService implements BankServices{

	
	@Autowired
	@Qualifier("IciciloanCalc")
	PersonalLoanCalc  cal;
	
	@PostConstruct
	public void init() {
		System.out.println("init method icici--0-0");
	}
	
	@Override
	public double processLoan(PersonalDetails personaldetals, LoanDetails loandetails) {
		double interest = cal.calculteInterest(loandetails.getLoanType());
		double amount = loandetails.getAmount()*loandetails.getTenure()*interest;
		
		return amount/100;
		// TODO Auto-generated method stub
		
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy be4");
	}
	


}

