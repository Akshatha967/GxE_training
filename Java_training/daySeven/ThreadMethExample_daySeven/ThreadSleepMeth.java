package ThreadMethExample_daySeven;

//sleep method of threads


public class ThreadSleepMeth extends Thread{

	ThreadSleepMeth(String str){
		super(str);
	}
	
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" "+getName());
			try {
				
				Thread.sleep((long)Math.random()*1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("done counting by"+getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleepMeth t = new ThreadSleepMeth("firstThread");
		t.start();
		
		new ThreadSleepMeth("secondthread").start();
		

	}

}
