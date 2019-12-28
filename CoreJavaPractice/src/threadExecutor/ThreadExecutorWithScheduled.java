package threadExecutor;

import java.awt.SecondaryLoop;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Runnable ");
	}

	
}
class MyTask1 implements Callable {

	int num;

	public MyTask1(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		System.out.println("==Test=="+Thread.currentThread().getName() + " is responsible to get sum of " + num + " numbers");
		Integer sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}

		return sum;
	}

}

public class ThreadExecutorWithScheduled {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(20000);
		service.schedule(new MyTask1(10), 15, TimeUnit.SECONDS);
		service.schedule(new MyTask1(20), 10, TimeUnit.SECONDS);
		
//		service.scheduleAtFixedRate(new MyRunnable(), 5, 10, TimeUnit.SECONDS);
//		service.scheduleWithFixedDelay(new MyRunnable(), 8, 10, TimeUnit.SECONDS);
		System.out.println("=============");
	}

}
