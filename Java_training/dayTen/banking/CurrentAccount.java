package banking;

import java.io.IOException;

public class CurrentAccount extends Account {

	public CurrentAccount(Long accountNumber, String typeAccount) {
		super(accountNumber, typeAccount);
		// TODO Auto-generated constructor stub
	}

	// method name, number of para, type same, return type
	@Override
	public void withdraw(double  amount) {
		// TODO Auto-generated method stub
		System.out.println("amount of"+amount+"is debited in create account");
		
	}
	
	@Override
	protected void withdraw(float  amount,Long ac_number) {
		// TODO Auto-generated method stub
		super.withdraw(amount, ac_number);
		System.out.println("amount of"+amount+"is debited from"+ac_number);
	}
	
	@Override
	public void withdraw(double  amount,Long ac_number, double balance) {
		// TODO Auto-generated method stub
		System.out.println("amount of"+amount+"is debited from"+ac_number+" updated balance :"+(balance-amount));	
	}
	
	/*
	 * either don't declare exception for the method
	 * checked exception : checked at the compile time.
	 * unchechecked  : checked at the run time.
	 * throw : checks only those not checked using throws 
	 * throws in given first preference
	 */
	
	
	// throws IO gives error, and throws Exception gives error(parent of Arithmetic)
	@Override
	public void excptninOverridin1()  throws ArithmeticException  {
		
		try {
			int a=10;
			int b=0;
			int c = a/b;
			System.out.println();
		}catch(Exception e) {
			System.out.println("at child ame excptn "+e.getMessage());
		}
	}
	
	
	// can declare new Exceptions which are unchecked like arithmetic , not IOException
	@Override
	public void excptninOverridin2() throws ArithmeticException {
		super.excptninOverridin2();
		try {
			int a=0;
			int b=0;
			int c = a/b;
			System.out.println();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	// for throw as well : unchecked, lowerlevel excptn of parent class.
	// to get specific information from parent 
	@Override
	public void excptninOverridin3() {
		int age=0;
		if(age==50) {
			throw new ArithmeticException("age is zero");
		}
		else {
			System.out.println("age >0");
		}
	}
	
}
