package ThreadExecutorFramework_daySeven;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


class Sched extends Thread{
	int sum =0;
	public void run() {
	 try {
		 sum+=1000;
		this.sleep(1000);
		System.out.println(sum);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
public class ScheduledExecutorThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
		
		for(int i=0;i<4;i++)
			scheduledExecService.submit(new Sched());
	}

}
