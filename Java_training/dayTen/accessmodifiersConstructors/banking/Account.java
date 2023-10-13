package banking;

import java.util.HashMap;
public class Account {


	double  balance=0;
	Long accountNumber;
	String typeAccount;
	int countHistory=0;
	//public HashMap<Integer,Double> transactions = new HashMap<Integer,Double>();
	
//	public Account() {
//		System.out.println("No values are set");
//	}
	
	public Account(Long accountNumber, String typeAccount){
		this.accountNumber=accountNumber;
		this.typeAccount=typeAccount;
	}
	

	public void transfer(Account destAccount, double amount) {
		System.out.println("Account class : balance in source: "+this.balance +" in destination : "+destAccount.balance);
	}
	
	// total number of transactions
	public void history() {
		System.out.println("Account class : Total transactions: "+countHistory);
	}

	
	
	// withdraw overloading example
	public void withdraw(double  amount) {
		// TODO Auto-generated method stub
		System.out.println("Account class : amount of"+amount+"is debited in account");
	}
	
	void withdraw(float  amount,Long ac_number) {
		// TODO Auto-generated method stub
		System.out.println("Account class : amount of"+amount+"is debited from"+ac_number);
	}
	void withdraw(double  amount,Long ac_number, double balance) {
		// TODO Auto-generated method stub
		System.out.println("Account class : amount of"+amount+"is debited from"+ac_number+" updated balance :"+(balance-amount));	
	}

	//Excetions{
	public void excptninOverridin1() throws ArithmeticException {
		try {
			int a=0;
			int b=0;
			int c = a/b;
			System.out.println();
		}catch(Exception e) {
			System.out.println("Account class :"+e.getMessage());
		}
	}
	
	// when no excptn in parent class, child class can have unchecked excpetions declared
	public void excptninOverridin2()  {
		try {
			int a=0;
			int b=0;
			int c = a/b;
			System.out.println();
		}catch(Exception e) {
			System.out.println("Account class :"+e.getMessage());
		}
	}
	
	public void excptninOverridin3()  {
		int age=0;
		if(age==50) {
			throw new ArithmeticException("Account class : age is zero");
		}
		else {
			System.out.println("age >0");
		}
	}
	
	
	
	// deposit overloading example
	public void deposit(double  amount) {
		// TODO Auto-generated method stub
		countHistory++;
		System.out.println("Account class : amount of"+amount+"is credited");	
	}
	
	public void deposit(float  amount,Long ac_number) {
		// TODO Auto-generated method stub
		countHistory++;
		System.out.println("Account class : amount of"+amount+"is credited to"+ac_number);	
	}
	
	public void deposit(float  amount,Long ac_number,Double balance) {
		// TODO Auto-generated method stub
		countHistory++;
		System.out.println("Account class : amount of"+amount+"is credited to"+ac_number+" updated balance :"+(balance+amount));	
	}
}
