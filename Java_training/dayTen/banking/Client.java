package banking;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Client {


	String name;
	
	public Client(String name) {
		super();
		this.name = name;
	}

	public void deposit() {
		Account ac = new Account(123456L, "savings");
		
		//overloading in java
		ac.deposit(100f); // foat-> double works -> broadcasting
		ac.deposit(100f,123456L); // d-> f doesn't work as it is narrow casting
		ac.deposit(100f, 123456L, 1000d);
	}
	
	public void withdraw(){
		CurrentAccount ca = new CurrentAccount( 87878787L,"Current");
		ca.withdraw(123f, 87878787L);
		
	}
	
	
	public void transfer(Client c1, Client c2, double balance) {

		
	}
	
	public void Excptn() {
		CurrentAccount ca = new CurrentAccount(123456L, "savings");
		ca.excptninOverridin1();
		ca.excptninOverridin2();
		ca.excptninOverridin3();
	}
	
	
	public void interfaceEg() {
		

		Accounts salary1 = new SalaryAccount(123456l,"string",1290d);
//		SalaryAccount salary = new SalaryAccount(123456l,"string",1290d);
		System.out.println(salary1.history(0));
		salary1.deposit(100);
		salary1.withdraw(122f);
		
	}
	public void abstractClass() {
		
		Accounting salaryact = new SalaryAct();
		System.out.println(salaryact.deposit(123f));;
		System.out.println(salaryact.withdraw(456f));;
		System.out.println(salaryact.history(0));;
		System.out.println(salaryact.transfer(123L, 456L, 0));;
	}
}
	
