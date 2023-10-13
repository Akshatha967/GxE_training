package ThreadExecutorFramework_daySeven;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Products implements Runnable{
	int id;
	String name;
	ArrayList <Integer> alid = new ArrayList<Integer>();
	static int count=0;
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("calling run :"+ (++count));
	}
	
	
}
public class SingleThreadExecutorJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor= Executors.newSingleThreadExecutor();
		for(int i=0;i<10;i++)
		{
			
			System.out.println("executor:");
			executor.submit(new Products());
		}
		
		
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("direct thread:");
//			Thread t = new Thread(new Products());
//			t.start();
//		}

	}

}
