package ThreadSynchronization_daySeven;

 class Bank extends Thread{
	static int bankBal =1000;
	
	
	 public void run(int val)
	{
		this.bankBal-=val;
		System.out.println(this.bankBal);
	}
	 
	 synchronized public void run()
		{
			this.bankBal-=10;
			System.out.println(this.bankBal+" "+getName() );
		}
	 
	 public void registerATM() {
		 synchronized(this) {
			 
		 }
	 }
}
 
public class ThreadSynch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1 = new Bank();
		Bank b2 = new Bank();
		Bank b3 = new Bank();
		Bank b4 = new Bank();
		//Thread t1 = new Thread();
		b1.start();
		b2.start();
		b3.start();
		b4.start();
		
		//b2.run(200);
		
		//b1.run(500);
		
	}

}
