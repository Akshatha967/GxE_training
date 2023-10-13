package ThreadLifeCycle_daySeven;

/* join(), join(ms)
 * start()
 * suspend()
 * resume()
 * stop()]
 */
class Counter extends Thread{
	
	Counter(String str)
	{
		super(str);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+getName());
		}
	}
	
}

class RevCounter extends Thread{
	
	RevCounter(String str)
	{
		super(str);
	}
	public void run() {
		for(int i=10;i>0;i--)
		{
			System.out.println(i+" "+getName());
		}
	}
	
}




public class ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Counter c1 = new Counter("counter1");
		Counter c2 = new Counter("counter2");
		c1.start();
		System.out.println("c1 alive : "+c1.isAlive()+" c2 alive: "+c2.isAlive());
		c1.join();
		// execute c2 after c1 completes
		System.out.println("c1 alive : "+c1.isAlive()+" c2 alive: "+c2.isAlive());
		c2.start();
		System.out.println("c1 alive : "+c1.isAlive()+" c2 alive: "+c2.isAlive());
		
		RevCounter rc1= new RevCounter("revCounter1");
		RevCounter rc2= new RevCounter("revCounter2");
		rc1.start();
		rc1.join(1000);
		rc2.start();
		
		
		RevCounter rc3= new RevCounter("revCounter3");	
		threadCycle(rc3);
		
		
	}
	
	synchronized public static void threadCycle(RevCounter t)
	{
		System.out.println("---executing synchronized life cycle function ---");
		t.start();
		System.out.println("start: "+t.getState());
		t.suspend();
		System.out.println("suspend "+t.getState());
		t.resume();
		System.out.println("resume "+ t.getState());
		t.stop();
		System.out.println("is alive after stop:"+t.isAlive());
		System.out.println("complted life cycle");
	}

}
