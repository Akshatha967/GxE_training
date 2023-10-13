package ThreadExecutorFramework_daySeven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadExecutors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executorService = Executors.newCachedThreadPool();
		 executorService.submit(new Products());
	}

}
