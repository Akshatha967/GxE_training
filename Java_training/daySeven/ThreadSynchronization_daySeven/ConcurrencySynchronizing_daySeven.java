package ThreadSynchronization_daySeven;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencySynchronizing_daySeven extends Thread {

	
	public void run(ConcurrentHashMap<Integer,String>  chm) {
		//System.out.println(chm);
		for(int i=0;i<chm.size();i++)
			System.out.println(	chm.get(i));
		
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<Integer,String>  chm = new ConcurrentHashMap<Integer,String> (10);
		
		for(int i=0;i<5;i++)
		{
			chm.put(i, "hello"+i);
		}
		
		
		ConcurrencySynchronizing_daySeven ds1 = new ConcurrencySynchronizing_daySeven();
		ConcurrencySynchronizing_daySeven ds2 = new ConcurrencySynchronizing_daySeven();
		
		ds1.start();
		ds2.start();
		ds1.run(chm);
		ds2.run(chm);
		
	}

}
