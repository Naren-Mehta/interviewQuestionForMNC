package threadExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable {

	int num;

	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {

		System.out.println(Thread.currentThread().getName() + " is responsible to get sum of " + num + " numbers");
		Integer sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}

		return sum;
	}

}

public class ThreadExecutorDemo3 {
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(5);

		for (int i = 5; i < 15; i++) {
			Future f = service.submit(new MyCallable(i % 10));
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("=============");

	}
}
