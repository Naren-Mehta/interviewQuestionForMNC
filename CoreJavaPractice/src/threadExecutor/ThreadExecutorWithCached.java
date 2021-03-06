package threadExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTask implements Callable {

	int num;

	public MyTask(int num) {
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

public class ThreadExecutorWithCached {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();

		for (int i = 5; i < 15; i++) {
			Future f = service.submit(new MyTask(i % 10));
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
