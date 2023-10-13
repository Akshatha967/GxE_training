package ThreadPropertiesMethods_daySeven;

//isAlive
//daemon
//threadName
//threadGroup
//sync


/*getName, setname
 * getPriority, setPriority
 * getState
 * getThreadGroup
 * 
 * setDaemon, isDaemon
 * t.interrupt
 * isInterrupted
 * isAlive
 * t.stop ,


*/
class myRunbl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing runnable:");
	}
	
}

class AccessMeths {
	
	public void meth(Thread t)
	{
		System.out.println(t.getId()+" "+t.getName()+" ");
		System.out.println("Thread gropu name:"+t.getThreadGroup());
		System.out.println("Thread priority:"+t.getPriority());
		System.out.println("State of the thread is:"+t.getState());
	}
	
	public void setMeths(Thread t,String newname, int newPriority)
	{
		System.out.println("original name:"+t.getName());
		t.setName(newname);
		System.out.println("new name :"+t.getName());
		
		System.out.println("original priority:"+t.getPriority());
		t.setPriority(newPriority);
		System.out.println("new priority :"+t.getPriority());
	}
	
	public void checkStats(Thread t )
	{
		
		
		
		t.setDaemon(true);
		System.out.println("is daemon :"+t.isDaemon());
		t.interrupt();
		System.out.println("is interrupted :"+t.isInterrupted());
		
		t.stop();
		System.out.println("is alive :"+t.isAlive());
		
	}
	
	
}

public class ThreadConstructoreProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// different ways of thread creation
		Thread t1 = new Thread();
		Thread t2 = new Thread("thread2");
		
		myRunbl mr = new myRunbl();
		Thread t3 = new Thread(mr);
		
		Thread t4 = new Thread(mr,"thread4");
		
		
		ThreadGroup tg1 = new ThreadGroup("group1");
		Thread t5 = new Thread(tg1,mr);
		
		Thread t6 = new Thread(tg1,mr,"thread6");
		Thread t7 =  new Thread(tg1,"thread7");
		
		
		// properties and methods of threads
		AccessMeths am = new AccessMeths();
		am.meth(t6);
		am.setMeths(t6, "ThreadSixRenamed", 2);
		am.checkStats(t6);
		
		
		//static methods
		System.out.println(Thread.currentThread());
		System.out.println(Thread.holdsLock(Thread.currentThread()));
		System.out.println(Thread.interrupted());
		Thread.yield();
		
		System.out.println(Thread.currentThread());
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
