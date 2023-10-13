package ThreadExecutorFramework_daySeven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class FixedThreadPool_daySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService fixedPool = Executors.newFixedThreadPool(2);
		ThreadPoolExecutor pool = (ThreadPoolExecutor)fixedPool;
		fixedPool.submit(new Products());
		

	}

}
