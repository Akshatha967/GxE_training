package com.galaxe.test;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.galaxe.config.BeanConfiguration;
import com.galaxe.model.*;
import com.galaxe.services.BankServices;
import com.galaxe.services.impl.CanaraBank;
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		System.out.println("------");
		BankServices bankservice =(BankServices)factory.getBean("bankService"); // speficy the function to be called in autowired 
		BankServices bankserviceicici =(BankServices)factory.getBean("IcicibankService"); // speficy the function to be called in autowired 
		
		PersonalDetails pd = new PersonalDetails();
		LoanDetails ld = new LoanDetails();
		
		pd.setAge(10);
		pd.setEmail("aksh@g");
		pd.setName("akshatha");
		pd.setPhone(2233445566l);
		
		ld.setAmount(1000);
		ld.setLoanType("education");
		ld.setTenure(3);
		
		System.out.println("starting now");
		System.out.println(bankservice.processLoan(pd, ld));;
		System.out.println(bankserviceicici.processLoan(pd, ld));
		(( AnnotationConfigApplicationContext)factory).close();
		
	}

}
