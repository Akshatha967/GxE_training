package ThreadCreation_daySeven;



class ImplementingRunabl implements Runnable 
{
	public void run() { 
		 for (int b = -10; b < 10; b++) 
			 System.out.println(b+"\n");
		} 
}


class Myrunnable implements Runnable
{
	public void run() { 
		 for (int b = -10; b < 20; b++) 
			 System.out.println(b+"\n");
		}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("thread starting...");
		
	} 
}
public class ThreadsinJava {

	public static void main(String[] args) {
		
		Thread thread = new Thread();
		thread.start();
		PrintToConsole pc = new PrintToConsole();
		pc.run();
		
		ImplementingRunabl ir = new ImplementingRunabl();
		Thread thread2 = new Thread(ir);
		thread2.start();
		
		Myrunnable r = new Myrunnable ();
		Thread t1 = new Thread ();
		Thread t2 = new Thread(r);
		
		System.out.println("thread t1 starting...");
		t1.start();
		t1.run();
		
		System.out.println("thread t2 starting...");
		t2.start();
		t2.run();
		
		System.out.println("r1 starting...");
		r.start();
		r.run();
		
		
		
		
		
		
		
		

	}
	

}
