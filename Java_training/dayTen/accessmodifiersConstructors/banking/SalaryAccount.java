package banking;

import java.util.ArrayList;
import java.util.List;


//extends Account
public class SalaryAccount  implements Accounts{

	
	
	public SalaryAccount(Long accountNumber, String typeAccount,double salary) {
//		super(accountNumber, typeAccount);
//		this.balance=salary;
		// TODO Auto-generated constructor stub
	}


	public SalaryAccount() {
		// TODO Auto-generated constructor stub
	}
	public void Transaction() {
		//System.out.println(this.transactions);
		System.out.println("transacation completed");
	}

	public void balanceSalary() {
		System.out.println("This is the salary account method with 0 balance");
//		System.out.println("Current balance: "+this.balance);
	}

	
	/*
	 * parameters can be broadcasted
	 * same no. of params
	 * same modifier , as interface as signature
	 * 
	 */

	@Override
	public  float transfer(Long arc_act, Long targer_ac, float amount) {
		// TODO Auto-generated method stub
		
		return amount;
	}


	@Override
	public List<Float> history(int count) {
		// TODO Auto-generated method stub
		
		List<Float> lf = new ArrayList<Float>();
//		lf.addAll(count);
		return lf;
	}


	@Override
	public float withdraw(float amount) {
		// TODO Auto-generated method stub
		
		return amount;
	}


	@Override
	public float deposit(float amount) {
		// TODO Auto-generated method stub
		
		return amount;
	}
	
	

}
