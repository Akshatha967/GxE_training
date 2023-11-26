package com.galaxe.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import com.galaxe.services.BankServices;
import com.galaxe.services.PersonalLoanCalc;
import com.galaxe.services.impl.CanaraBank;
import com.galaxe.services.impl.CanaraLoanCal;
import com.galaxe.services.impl.iciciBankService;
import com.galaxe.services.impl.iciciLoanCal;

@Configuration
@ComponentScan(basePackages={"com.galaxe"})
public class BeanConfiguration {

	static
	{
		System.out.println("config service");
	}
	@Bean
	//@Scope("prototype")
	public BankServices bankService() {
		System.out.println("canara config service");
		return new CanaraBank();
	}
	
	@Bean 
	//@Lazy
	public PersonalLoanCalc loanCalc() {
		System.out.println("canara loan config service");
		return new CanaraLoanCal();
	}
	
	@Bean
	public BankServices IcicibankService() {
		System.out.println("icici config service");
		return new iciciBankService();
	}
	
	@Bean 
	public PersonalLoanCalc IciciloanCalc() {
		System.out.println("iciciloan config service");
		return new iciciLoanCal();
	}
//	
//	@Bean
//	public PropertyConf propConf() {
//		return new PropertyConf();
//	}
	
}
