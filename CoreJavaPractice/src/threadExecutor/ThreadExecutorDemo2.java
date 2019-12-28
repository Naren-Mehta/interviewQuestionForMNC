package threadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Perform Task "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ThreadExecutorDemo2 {
	public static void main(String[] args) {

		int count = Runtime.getRuntime().availableProcessors();
		System.out.println(count);
		
		ExecutorService service = Executors.newFixedThreadPool(100);
		
		for(int i=0;i<100;i++) {
			service.submit(new Task());
		}
		
		service.shutdown();
		
	}
}
